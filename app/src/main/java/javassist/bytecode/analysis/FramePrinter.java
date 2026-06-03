package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/FramePrinter.class */
public final class FramePrinter {
    private final java.io.PrintStream stream;

    public FramePrinter(java.io.PrintStream r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.stream = r1
            return
    }

    public static void print(javassist.CtClass r4, java.io.PrintStream r5) {
            javassist.bytecode.analysis.FramePrinter r0 = new javassist.bytecode.analysis.FramePrinter
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r1 = r4
            r0.print(r1)
            return
    }

    public void print(javassist.CtClass r5) {
            r4 = this;
            r0 = r5
            javassist.CtMethod[] r0 = r0.getDeclaredMethods()
            r6 = r0
            r0 = 0
            r7 = r0
        L7:
            r0 = r7
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L1a
            r0 = r4
            r1 = r6
            r2 = r7
            r1 = r1[r2]
            r0.print(r1)
            int r7 = r7 + 1
            goto L7
        L1a:
            return
    }

    private java.lang.String getMethodString(javassist.CtMethod r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: javassist.NotFoundException -> L3f
            r1 = r0
            r1.<init>()     // Catch: javassist.NotFoundException -> L3f
            r1 = r5
            int r1 = r1.getModifiers()     // Catch: javassist.NotFoundException -> L3f
            java.lang.String r1 = javassist.Modifier.toString(r1)     // Catch: javassist.NotFoundException -> L3f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L3f
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L3f
            r1 = r5
            javassist.CtClass r1 = r1.getReturnType()     // Catch: javassist.NotFoundException -> L3f
            java.lang.String r1 = r1.getName()     // Catch: javassist.NotFoundException -> L3f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L3f
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L3f
            r1 = r5
            java.lang.String r1 = r1.getName()     // Catch: javassist.NotFoundException -> L3f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L3f
            r1 = r5
            java.lang.String r1 = r1.getSignature()     // Catch: javassist.NotFoundException -> L3f
            java.lang.String r1 = javassist.bytecode.Descriptor.toString(r1)     // Catch: javassist.NotFoundException -> L3f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L3f
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L3f
            java.lang.String r0 = r0.toString()     // Catch: javassist.NotFoundException -> L3f
            return r0
        L3f:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    public void print(javassist.CtMethod r7) {
            r6 = this;
            r0 = r6
            java.io.PrintStream r0 = r0.stream
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            r3 = r7
            java.lang.String r2 = r2.getMethodString(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r8 = r0
            r0 = r8
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r9 = r0
            r0 = r8
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L34
            return
        L34:
            javassist.bytecode.analysis.Analyzer r0 = new javassist.bytecode.analysis.Analyzer     // Catch: javassist.bytecode.BadBytecode -> L48
            r1 = r0
            r1.<init>()     // Catch: javassist.bytecode.BadBytecode -> L48
            r1 = r7
            javassist.CtClass r1 = r1.getDeclaringClass()     // Catch: javassist.bytecode.BadBytecode -> L48
            r2 = r8
            javassist.bytecode.analysis.Frame[] r0 = r0.analyze(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L48
            r11 = r0
            goto L54
        L48:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L54:
            r0 = r10
            int r0 = r0.getCodeLength()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            r12 = r0
            r0 = r10
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r13 = r0
        L68:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Le3
            r0 = r13
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> L7a
            r14 = r0
            goto L86
        L7a:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        L86:
            r0 = r6
            java.io.PrintStream r0 = r0.stream
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            r3 = r14
            r4 = r9
            java.lang.String r2 = javassist.bytecode.InstructionPrinter.instructionString(r2, r3, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r6
            r1 = r12
            r2 = 3
            int r1 = r1 + r2
            r0.addSpacing(r1)
            r0 = r11
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            if (r0 != 0) goto Lcc
            r0 = r6
            java.io.PrintStream r0 = r0.stream
            java.lang.String r1 = "--DEAD CODE--"
            r0.println(r1)
            goto L68
        Lcc:
            r0 = r6
            r1 = r15
            r0.printStack(r1)
            r0 = r6
            r1 = r12
            r2 = 3
            int r1 = r1 + r2
            r0.addSpacing(r1)
            r0 = r6
            r1 = r15
            r0.printLocals(r1)
            goto L68
        Le3:
            return
    }

    private void printStack(javassist.bytecode.analysis.Frame r4) {
            r3 = this;
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            java.lang.String r1 = "stack ["
            r0.print(r1)
            r0 = r4
            int r0 = r0.getTopIndex()
            r5 = r0
            r0 = 0
            r6 = r0
        L10:
            r0 = r6
            r1 = r5
            if (r0 > r1) goto L38
            r0 = r6
            if (r0 <= 0) goto L22
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            java.lang.String r1 = ", "
            r0.print(r1)
        L22:
            r0 = r4
            r1 = r6
            javassist.bytecode.analysis.Type r0 = r0.getStack(r1)
            r7 = r0
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            r1 = r7
            r0.print(r1)
            int r6 = r6 + 1
            goto L10
        L38:
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            java.lang.String r1 = "]"
            r0.println(r1)
            return
    }

    private void printLocals(javassist.bytecode.analysis.Frame r4) {
            r3 = this;
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            java.lang.String r1 = "locals ["
            r0.print(r1)
            r0 = r4
            int r0 = r0.localsLength()
            r5 = r0
            r0 = 0
            r6 = r0
        L10:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L45
            r0 = r6
            if (r0 <= 0) goto L22
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            java.lang.String r1 = ", "
            r0.print(r1)
        L22:
            r0 = r4
            r1 = r6
            javassist.bytecode.analysis.Type r0 = r0.getLocal(r1)
            r7 = r0
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            r1 = r7
            if (r1 != 0) goto L37
            java.lang.String r1 = "empty"
            goto L3c
        L37:
            r1 = r7
            java.lang.String r1 = r1.toString()
        L3c:
            r0.print(r1)
            int r6 = r6 + 1
            goto L10
        L45:
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            java.lang.String r1 = "]"
            r0.println(r1)
            return
    }

    private void addSpacing(int r4) {
            r3 = this;
        L0:
            r0 = r4
            int r4 = r4 + (-1)
            if (r0 <= 0) goto L13
            r0 = r3
            java.io.PrintStream r0 = r0.stream
            r1 = 32
            r0.print(r1)
            goto L0
        L13:
            return
    }
}
