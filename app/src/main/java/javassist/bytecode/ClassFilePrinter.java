package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassFilePrinter.class */
public class ClassFilePrinter {
    public ClassFilePrinter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void print(javassist.bytecode.ClassFile r6) {
            r0 = r6
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = r1
            java.io.PrintStream r3 = java.lang.System.out
            r4 = 1
            r2.<init>(r3, r4)
            print(r0, r1)
            return
    }

    public static void print(javassist.bytecode.ClassFile r5, java.io.PrintWriter r6) {
            r0 = r5
            int r0 = r0.getAccessFlags()
            r1 = -33
            r0 = r0 & r1
            int r0 = javassist.bytecode.AccessFlag.toModifier(r0)
            r7 = r0
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "major: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            int r2 = r2.major
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", minor: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            int r2 = r2.minor
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " modifiers: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            int r2 = r2.getAccessFlags()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r7
            java.lang.String r2 = javassist.Modifier.toString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " class "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " extends "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.String r2 = r2.getSuperclass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            java.lang.String[] r0 = r0.getInterfaces()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lb6
            r0 = r8
            int r0 = r0.length
            if (r0 <= 0) goto Lb6
            r0 = r6
            java.lang.String r1 = "    implements "
            r0.print(r1)
            r0 = r6
            r1 = r8
            r2 = 0
            r1 = r1[r2]
            r0.print(r1)
            r0 = 1
            r9 = r0
        L8b:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto Lb2
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            r3 = r9
            r2 = r2[r3]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            int r9 = r9 + 1
            goto L8b
        Lb2:
            r0 = r6
            r0.println()
        Lb6:
            r0 = r6
            r0.println()
            r0 = r5
            java.util.List r0 = r0.getFields()
            r9 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        Lc9:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L127
            r0 = r10
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r11 = r0
            r0 = r11
            int r0 = r0.getAccessFlags()
            r12 = r0
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r12
            int r2 = javassist.bytecode.AccessFlag.toModifier(r2)
            java.lang.String r2 = javassist.Modifier.toString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\t"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.String r2 = r2.getDescriptor()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r11
            java.util.List r0 = r0.getAttributes()
            r1 = r6
            r2 = 102(0x66, float:1.43E-43)
            printAttributes(r0, r1, r2)
            goto Lc9
        L127:
            r0 = r6
            r0.println()
            r0 = r5
            java.util.List r0 = r0.getMethods()
            r10 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L13a:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L19c
            r0 = r11
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r12 = r0
            r0 = r12
            int r0 = r0.getAccessFlags()
            r13 = r0
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r13
            int r2 = javassist.bytecode.AccessFlag.toModifier(r2)
            java.lang.String r2 = javassist.Modifier.toString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\t"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.String r2 = r2.getDescriptor()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r12
            java.util.List r0 = r0.getAttributes()
            r1 = r6
            r2 = 109(0x6d, float:1.53E-43)
            printAttributes(r0, r1, r2)
            r0 = r6
            r0.println()
            goto L13a
        L19c:
            r0 = r6
            r0.println()
            r0 = r5
            java.util.List r0 = r0.getAttributes()
            r1 = r6
            r2 = 99
            printAttributes(r0, r1, r2)
            return
    }

    static void printAttributes(java.util.List<javassist.bytecode.AttributeInfo> r4, java.io.PrintWriter r5, char r6) {
            r0 = r4
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Lc:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1fc
            r0 = r7
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof javassist.bytecode.CodeAttribute
            if (r0 == 0) goto Lb0
            r0 = r8
            javassist.bytecode.CodeAttribute r0 = (javassist.bytecode.CodeAttribute) r0
            r9 = r0
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "attribute: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "max stack "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            int r2 = r2.getMaxStack()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", max locals "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            int r2 = r2.getMaxLocals()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            javassist.bytecode.ExceptionTable r2 = r2.getExceptionTable()
            int r2 = r2.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " catch blocks"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            java.lang.String r1 = "<code attribute begin>"
            r0.println(r1)
            r0 = r9
            java.util.List r0 = r0.getAttributes()
            r1 = r5
            r2 = r6
            printAttributes(r0, r1, r2)
            r0 = r5
            java.lang.String r1 = "<code attribute end>"
            r0.println(r1)
            goto L1f9
        Lb0:
            r0 = r8
            boolean r0 = r0 instanceof javassist.bytecode.AnnotationsAttribute
            if (r0 == 0) goto Ld6
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "annnotation: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            goto L1f9
        Ld6:
            r0 = r8
            boolean r0 = r0 instanceof javassist.bytecode.ParameterAnnotationsAttribute
            if (r0 == 0) goto Lfc
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "parameter annnotations: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            goto L1f9
        Lfc:
            r0 = r8
            boolean r0 = r0 instanceof javassist.bytecode.StackMapTable
            if (r0 == 0) goto L11c
            r0 = r5
            java.lang.String r1 = "<stack map table begin>"
            r0.println(r1)
            r0 = r8
            javassist.bytecode.StackMapTable r0 = (javassist.bytecode.StackMapTable) r0
            r1 = r5
            javassist.bytecode.StackMapTable.Printer.print(r0, r1)
            r0 = r5
            java.lang.String r1 = "<stack map table end>"
            r0.println(r1)
            goto L1f9
        L11c:
            r0 = r8
            boolean r0 = r0 instanceof javassist.bytecode.StackMap
            if (r0 == 0) goto L13c
            r0 = r5
            java.lang.String r1 = "<stack map begin>"
            r0.println(r1)
            r0 = r8
            javassist.bytecode.StackMap r0 = (javassist.bytecode.StackMap) r0
            r1 = r5
            r0.print(r1)
            r0 = r5
            java.lang.String r1 = "<stack map end>"
            r0.println(r1)
            goto L1f9
        L13c:
            r0 = r8
            boolean r0 = r0 instanceof javassist.bytecode.SignatureAttribute
            if (r0 == 0) goto L1c0
            r0 = r8
            javassist.bytecode.SignatureAttribute r0 = (javassist.bytecode.SignatureAttribute) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getSignature()
            r10 = r0
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "signature: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r6
            r1 = 99
            if (r0 != r1) goto L17d
            r0 = r10
            javassist.bytecode.SignatureAttribute$ClassSignature r0 = javassist.bytecode.SignatureAttribute.toClassSignature(r0)     // Catch: javassist.bytecode.BadBytecode -> L1b5
            java.lang.String r0 = r0.toString()     // Catch: javassist.bytecode.BadBytecode -> L1b5
            r11 = r0
            goto L19a
        L17d:
            r0 = r6
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 != r1) goto L190
            r0 = r10
            javassist.bytecode.SignatureAttribute$MethodSignature r0 = javassist.bytecode.SignatureAttribute.toMethodSignature(r0)     // Catch: javassist.bytecode.BadBytecode -> L1b5
            java.lang.String r0 = r0.toString()     // Catch: javassist.bytecode.BadBytecode -> L1b5
            r11 = r0
            goto L19a
        L190:
            r0 = r10
            javassist.bytecode.SignatureAttribute$ObjectType r0 = javassist.bytecode.SignatureAttribute.toFieldSignature(r0)     // Catch: javassist.bytecode.BadBytecode -> L1b5
            java.lang.String r0 = r0.toString()     // Catch: javassist.bytecode.BadBytecode -> L1b5
            r11 = r0
        L19a:
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: javassist.bytecode.BadBytecode -> L1b5
            r2 = r1
            r2.<init>()     // Catch: javassist.bytecode.BadBytecode -> L1b5
            java.lang.String r2 = "           "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: javassist.bytecode.BadBytecode -> L1b5
            r2 = r11
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: javassist.bytecode.BadBytecode -> L1b5
            java.lang.String r1 = r1.toString()     // Catch: javassist.bytecode.BadBytecode -> L1b5
            r0.println(r1)     // Catch: javassist.bytecode.BadBytecode -> L1b5
            goto L1bd
        L1b5:
            r11 = move-exception
            r0 = r5
            java.lang.String r1 = "           syntax error"
            r0.println(r1)
        L1bd:
            goto L1f9
        L1c0:
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "attribute: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            byte[] r2 = r2.get()
            int r2 = r2.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " byte): "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L1f9:
            goto Lc
        L1fc:
            return
    }
}
