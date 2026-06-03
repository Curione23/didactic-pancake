package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/Compiler.class */
public class Compiler {
    public Compiler() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r3) throws java.lang.Exception {
            r0 = r3
            int r0 = r0.length
            if (r0 != 0) goto Lc
            java.io.PrintStream r0 = java.lang.System.err
            help(r0)
            return
        Lc:
            r0 = r3
            int r0 = r0.length
            javassist.tools.reflect.CompiledClass[] r0 = new javassist.tools.reflect.CompiledClass[r0]
            r4 = r0
            r0 = r3
            r1 = r4
            int r0 = parse(r0, r1)
            r5 = r0
            r0 = r5
            r1 = 1
            if (r0 >= r1) goto L26
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "bad parameter."
            r0.println(r1)
            return
        L26:
            r0 = r4
            r1 = r5
            processClasses(r0, r1)
            return
    }

    private static void processClasses(javassist.tools.reflect.CompiledClass[] r6, int r7) throws java.lang.Exception {
            javassist.tools.reflect.Reflection r0 = new javassist.tools.reflect.Reflection
            r1 = r0
            r1.<init>()
            r8 = r0
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()
            r9 = r0
            r0 = r8
            r1 = r9
            r0.start(r1)
            r0 = 0
            r10 = r0
        L14:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto Lf8
            r0 = r9
            r1 = r6
            r2 = r10
            r1 = r1[r2]
            java.lang.String r1 = r1.classname
            javassist.CtClass r0 = r0.get(r1)
            r11 = r0
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.metaobject
            if (r0 != 0) goto L3b
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.classobject
            if (r0 == 0) goto Ld5
        L3b:
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.metaobject
            if (r0 != 0) goto L4c
            java.lang.String r0 = "javassist.tools.reflect.Metaobject"
            r12 = r0
            goto L55
        L4c:
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.metaobject
            r12 = r0
        L55:
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.classobject
            if (r0 != 0) goto L66
            java.lang.String r0 = "javassist.tools.reflect.ClassMetaobject"
            r13 = r0
            goto L6f
        L66:
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.classobject
            r13 = r0
        L6f:
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r12
            javassist.CtClass r2 = r2.get(r3)
            r3 = r9
            r4 = r13
            javassist.CtClass r3 = r3.get(r4)
            boolean r0 = r0.makeReflective(r1, r2, r3)
            if (r0 != 0) goto La6
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Warning: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is reflective.  It was not changed."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        La6:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r11
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            goto Lf2
        Ld5:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r11
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": not reflective"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        Lf2:
            int r10 = r10 + 1
            goto L14
        Lf8:
            r0 = 0
            r10 = r0
        Lfb:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L121
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r10
            r2 = r2[r3]
            java.lang.String r2 = r2.classname
            r0.onLoad(r1, r2)
            r0 = r9
            r1 = r6
            r2 = r10
            r1 = r1[r2]
            java.lang.String r1 = r1.classname
            javassist.CtClass r0 = r0.get(r1)
            r0.writeFile()
            int r10 = r10 + 1
            goto Lfb
        L121:
            return
    }

    private static int parse(java.lang.String[] r4, javassist.tools.reflect.CompiledClass[] r5) {
            r0 = -1
            r6 = r0
            r0 = 0
            r7 = r0
        L4:
            r0 = r7
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L94
            r0 = r4
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            java.lang.String r1 = "-m"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r6
            if (r0 < 0) goto L25
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r1 = r4
            int r1 = r1.length
            if (r0 <= r1) goto L27
        L25:
            r0 = -1
            return r0
        L27:
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = r4
            int r7 = r7 + 1
            r2 = r7
            r1 = r1[r2]
            r0.metaobject = r1
            goto L8e
        L36:
            r0 = r8
            java.lang.String r1 = "-c"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5d
            r0 = r6
            if (r0 < 0) goto L4c
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r1 = r4
            int r1 = r1.length
            if (r0 <= r1) goto L4e
        L4c:
            r0 = -1
            return r0
        L4e:
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = r4
            int r7 = r7 + 1
            r2 = r7
            r1 = r1[r2]
            r0.classobject = r1
            goto L8e
        L5d:
            r0 = r8
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 45
            if (r0 != r1) goto L6a
            r0 = -1
            return r0
        L6a:
            javassist.tools.reflect.CompiledClass r0 = new javassist.tools.reflect.CompiledClass
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r8
            r0.classname = r1
            r0 = r9
            r1 = 0
            r0.metaobject = r1
            r0 = r9
            r1 = 0
            r0.classobject = r1
            r0 = r5
            int r6 = r6 + 1
            r1 = r6
            r2 = r9
            r0[r1] = r2
        L8e:
            int r7 = r7 + 1
            goto L4
        L94:
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            return r0
    }

    private static void help(java.io.PrintStream r3) {
            r0 = r3
            java.lang.String r1 = "Usage: java javassist.tools.reflect.Compiler"
            r0.println(r1)
            r0 = r3
            java.lang.String r1 = "            (<class> [-m <metaobject>] [-c <class metaobject>])+"
            r0.println(r1)
            return
    }
}
