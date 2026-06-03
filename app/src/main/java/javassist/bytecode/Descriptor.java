package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/Descriptor.class */
public class Descriptor {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/Descriptor$Iterator.class */
    public static class Iterator {
        private java.lang.String desc;
        private int index;
        private int curPos;
        private boolean param;

        public Iterator(java.lang.String r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r0.desc = r1
                r0 = r5
                r1 = r5
                r2 = 0
                r3 = r2; r2 = r1; r1 = r3; 
                r2.curPos = r3
                r0.index = r1
                r0 = r5
                r1 = 0
                r0.param = r1
                return
        }

        public boolean hasNext() {
                r3 = this;
                r0 = r3
                int r0 = r0.index
                r1 = r3
                java.lang.String r1 = r1.desc
                int r1 = r1.length()
                if (r0 >= r1) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        public boolean isParameter() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.param
                return r0
        }

        public char currentChar() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.desc
                r1 = r3
                int r1 = r1.curPos
                char r0 = r0.charAt(r1)
                return r0
        }

        public boolean is2byte() {
                r3 = this;
                r0 = r3
                char r0 = r0.currentChar()
                r4 = r0
                r0 = r4
                r1 = 68
                if (r0 == r1) goto L11
                r0 = r4
                r1 = 74
                if (r0 != r1) goto L15
            L11:
                r0 = 1
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
        }

        public int next() {
                r4 = this;
                r0 = r4
                int r0 = r0.index
                r5 = r0
                r0 = r4
                java.lang.String r0 = r0.desc
                r1 = r5
                char r0 = r0.charAt(r1)
                r6 = r0
                r0 = r6
                r1 = 40
                if (r0 != r1) goto L2f
                r0 = r4
                r1 = r0
                int r1 = r1.index
                r2 = 1
                int r1 = r1 + r2
                r0.index = r1
                r0 = r4
                java.lang.String r0 = r0.desc
                int r5 = r5 + 1
                r1 = r5
                char r0 = r0.charAt(r1)
                r6 = r0
                r0 = r4
                r1 = 1
                r0.param = r1
            L2f:
                r0 = r6
                r1 = 41
                if (r0 != r1) goto L50
                r0 = r4
                r1 = r0
                int r1 = r1.index
                r2 = 1
                int r1 = r1 + r2
                r0.index = r1
                r0 = r4
                java.lang.String r0 = r0.desc
                int r5 = r5 + 1
                r1 = r5
                char r0 = r0.charAt(r1)
                r6 = r0
                r0 = r4
                r1 = 0
                r0.param = r1
            L50:
                r0 = r6
                r1 = 91
                if (r0 != r1) goto L65
                r0 = r4
                java.lang.String r0 = r0.desc
                int r5 = r5 + 1
                r1 = r5
                char r0 = r0.charAt(r1)
                r6 = r0
                goto L50
            L65:
                r0 = r6
                r1 = 76
                if (r0 != r1) goto L86
                r0 = r4
                java.lang.String r0 = r0.desc
                r1 = 59
                r2 = r5
                int r0 = r0.indexOf(r1, r2)
                r1 = 1
                int r0 = r0 + r1
                r5 = r0
                r0 = r5
                if (r0 > 0) goto L89
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r1 = r0
                java.lang.String r2 = "bad descriptor"
                r1.<init>(r2)
                throw r0
            L86:
                int r5 = r5 + 1
            L89:
                r0 = r4
                r1 = r4
                int r1 = r1.index
                r0.curPos = r1
                r0 = r4
                r1 = r5
                r0.index = r1
                r0 = r4
                int r0 = r0.curPos
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/Descriptor$PrettyPrinter.class */
    static class PrettyPrinter {
        PrettyPrinter() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static java.lang.String toString(java.lang.String r4) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r4
                r1 = 0
                char r0 = r0.charAt(r1)
                r1 = 40
                if (r0 != r1) goto L45
                r0 = 1
                r6 = r0
                r0 = r5
                r1 = 40
                java.lang.StringBuilder r0 = r0.append(r1)
            L1b:
                r0 = r4
                r1 = r6
                char r0 = r0.charAt(r1)
                r1 = 41
                if (r0 == r1) goto L3b
                r0 = r6
                r1 = 1
                if (r0 <= r1) goto L31
                r0 = r5
                r1 = 44
                java.lang.StringBuilder r0 = r0.append(r1)
            L31:
                r0 = r5
                r1 = r6
                r2 = r4
                int r0 = readType(r0, r1, r2)
                r6 = r0
                goto L1b
            L3b:
                r0 = r5
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L4c
            L45:
                r0 = r5
                r1 = 0
                r2 = r4
                int r0 = readType(r0, r1, r2)
            L4c:
                r0 = r5
                java.lang.String r0 = r0.toString()
                return r0
        }

        static int readType(java.lang.StringBuilder r3, int r4, java.lang.String r5) {
                r0 = r5
                r1 = r4
                char r0 = r0.charAt(r1)
                r6 = r0
                r0 = 0
                r7 = r0
            L9:
                r0 = r6
                r1 = 91
                if (r0 != r1) goto L1e
                int r7 = r7 + 1
                r0 = r5
                int r4 = r4 + 1
                r1 = r4
                char r0 = r0.charAt(r1)
                r6 = r0
                goto L9
            L1e:
                r0 = r6
                r1 = 76
                if (r0 != r1) goto L48
            L24:
                r0 = r5
                int r4 = r4 + 1
                r1 = r4
                char r0 = r0.charAt(r1)
                r6 = r0
                r0 = r6
                r1 = 59
                if (r0 != r1) goto L36
                goto L58
            L36:
                r0 = r6
                r1 = 47
                if (r0 != r1) goto L3f
                r0 = 46
                r6 = r0
            L3f:
                r0 = r3
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L24
            L48:
                r0 = r6
                javassist.CtClass r0 = javassist.bytecode.Descriptor.toPrimitiveClass(r0)
                r8 = r0
                r0 = r3
                r1 = r8
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
            L58:
                r0 = r7
                int r7 = r7 + (-1)
                if (r0 <= 0) goto L6a
                r0 = r3
                java.lang.String r1 = "[]"
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L58
            L6a:
                r0 = r4
                r1 = 1
                int r0 = r0 + r1
                return r0
        }
    }

    public Descriptor() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String toJvmName(java.lang.String r4) {
            r0 = r4
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static java.lang.String toJavaName(java.lang.String r4) {
            r0 = r4
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static java.lang.String toJvmName(javassist.CtClass r2) {
            r0 = r2
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lc
            r0 = r2
            java.lang.String r0 = of(r0)
            return r0
        Lc:
            r0 = r2
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = toJvmName(r0)
            return r0
    }

    public static java.lang.String toClassName(java.lang.String r5) {
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r8 = r0
        La:
            r0 = r8
            r1 = 91
            if (r0 != r1) goto L1f
            int r6 = r6 + 1
            r0 = r5
            int r7 = r7 + 1
            r1 = r7
            char r0 = r0.charAt(r1)
            r8 = r0
            goto La
        L1f:
            r0 = r8
            r1 = 76
            if (r0 != r1) goto L47
            r0 = r5
            r1 = 59
            r2 = r7
            int r7 = r7 + 1
            int r0 = r0.indexOf(r1, r2)
            r10 = r0
            r0 = r5
            r1 = r7
            r2 = r10
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            r9 = r0
            r0 = r10
            r7 = r0
            goto Ld7
        L47:
            r0 = r8
            r1 = 86
            if (r0 != r1) goto L54
            java.lang.String r0 = "void"
            r9 = r0
            goto Ld7
        L54:
            r0 = r8
            r1 = 73
            if (r0 != r1) goto L61
            java.lang.String r0 = "int"
            r9 = r0
            goto Ld7
        L61:
            r0 = r8
            r1 = 66
            if (r0 != r1) goto L6e
            java.lang.String r0 = "byte"
            r9 = r0
            goto Ld7
        L6e:
            r0 = r8
            r1 = 74
            if (r0 != r1) goto L7b
            java.lang.String r0 = "long"
            r9 = r0
            goto Ld7
        L7b:
            r0 = r8
            r1 = 68
            if (r0 != r1) goto L88
            java.lang.String r0 = "double"
            r9 = r0
            goto Ld7
        L88:
            r0 = r8
            r1 = 70
            if (r0 != r1) goto L95
            java.lang.String r0 = "float"
            r9 = r0
            goto Ld7
        L95:
            r0 = r8
            r1 = 67
            if (r0 != r1) goto La2
            java.lang.String r0 = "char"
            r9 = r0
            goto Ld7
        La2:
            r0 = r8
            r1 = 83
            if (r0 != r1) goto Laf
            java.lang.String r0 = "short"
            r9 = r0
            goto Ld7
        Laf:
            r0 = r8
            r1 = 90
            if (r0 != r1) goto Lbc
            java.lang.String r0 = "boolean"
            r9 = r0
            goto Ld7
        Lbc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad descriptor: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Ld7:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r1 = r5
            int r1 = r1.length()
            if (r0 == r1) goto Lfc
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "multiple descriptors?: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lfc:
            r0 = r6
            if (r0 != 0) goto L103
            r0 = r9
            return r0
        L103:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r10 = r0
        L10e:
            r0 = r10
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + (-1)
            r0 = r6
            if (r0 > 0) goto L10e
            r0 = r10
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String of(java.lang.String r3) {
            r0 = r3
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "V"
            return r0
        Lc:
            r0 = r3
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            java.lang.String r0 = "I"
            return r0
        L18:
            r0 = r3
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = "B"
            return r0
        L24:
            r0 = r3
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            java.lang.String r0 = "J"
            return r0
        L30:
            r0 = r3
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "D"
            return r0
        L3c:
            r0 = r3
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            java.lang.String r0 = "F"
            return r0
        L48:
            r0 = r3
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            java.lang.String r0 = "C"
            return r0
        L54:
            r0 = r3
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L60
            java.lang.String r0 = "S"
            return r0
        L60:
            r0 = r3
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6c
            java.lang.String r0 = "Z"
            return r0
        L6c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "L"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = toJvmName(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String rename(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = r5
            r1 = r6
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto La
            r0 = r5
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        L18:
            r0 = r5
            r1 = 76
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
            r0 = r11
            if (r0 >= 0) goto L2a
            goto L92
        L2a:
            r0 = r5
            r1 = r6
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            boolean r0 = r0.startsWith(r1, r2)
            if (r0 == 0) goto L7a
            r0 = r5
            r1 = r11
            r2 = r6
            int r2 = r2.length()
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 != r1) goto L7a
            r0 = r8
            r1 = r5
            r2 = r9
            r3 = r11
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r11
            r1 = r6
            int r1 = r1.length()
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 + r1
            r1 = r0
            r10 = r1
            r9 = r0
            goto L8f
        L7a:
            r0 = r5
            r1 = 59
            r2 = r11
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = 1
            if (r0 >= r1) goto L8f
            goto L92
        L8f:
            goto L18
        L92:
            r0 = r9
            if (r0 != 0) goto L99
            r0 = r5
            return r0
        L99:
            r0 = r5
            int r0 = r0.length()
            r11 = r0
            r0 = r9
            r1 = r11
            if (r0 >= r1) goto Lb3
            r0 = r8
            r1 = r5
            r2 = r9
            r3 = r11
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb3:
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String rename(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r0 = r6
            if (r0 != 0) goto L6
            r0 = r5
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
        L13:
            r0 = r5
            r1 = 76
            r2 = r9
            int r0 = r0.indexOf(r1, r2)
            r10 = r0
            r0 = r10
            if (r0 >= 0) goto L25
            goto L82
        L25:
            r0 = r5
            r1 = 59
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
            r0 = r11
            if (r0 >= 0) goto L37
            goto L82
        L37:
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r5
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r2 = r11
            java.lang.String r0 = r0.substring(r1, r2)
            r12 = r0
            r0 = r6
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7f
            r0 = r7
            r1 = r5
            r2 = r8
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r8 = r0
        L7f:
            goto L13
        L82:
            r0 = r8
            if (r0 != 0) goto L88
            r0 = r5
            return r0
        L88:
            r0 = r5
            int r0 = r0.length()
            r10 = r0
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto La0
            r0 = r7
            r1 = r5
            r2 = r8
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
        La0:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String of(javassist.CtClass r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            toDescriptor(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static void toDescriptor(java.lang.StringBuilder r6, javassist.CtClass r7) {
            r0 = r7
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L43
            r0 = r6
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r7
            javassist.CtClass r1 = r1.getComponentType()     // Catch: javassist.NotFoundException -> L19
            toDescriptor(r0, r1)     // Catch: javassist.NotFoundException -> L19
            goto L79
        L19:
            r8 = move-exception
            r0 = r6
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r6
            r1 = r9
            r2 = 0
            r3 = r9
            int r3 = r3.length()
            r4 = 2
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r1 = toJvmName(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L79
        L43:
            r0 = r7
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L5b
            r0 = r7
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r8 = r0
            r0 = r6
            r1 = r8
            char r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L79
        L5b:
            r0 = r6
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.getName()
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
        L79:
            return
    }

    public static java.lang.String ofConstructor(javassist.CtClass[] r3) {
            javassist.CtClass r0 = javassist.CtClass.voidType
            r1 = r3
            java.lang.String r0 = ofMethod(r0, r1)
            return r0
    }

    public static java.lang.String ofMethod(javassist.CtClass r4, javassist.CtClass[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            if (r0 == 0) goto L2d
            r0 = r5
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L19:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L2d
            r0 = r6
            r1 = r5
            r2 = r8
            r1 = r1[r2]
            toDescriptor(r0, r1)
            int r8 = r8 + 1
            goto L19
        L2d:
            r0 = r6
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            if (r0 == 0) goto L3d
            r0 = r6
            r1 = r4
            toDescriptor(r0, r1)
        L3d:
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String ofParameters(javassist.CtClass[] r3) {
            r0 = 0
            r1 = r3
            java.lang.String r0 = ofMethod(r0, r1)
            return r0
    }

    public static java.lang.String appendParameter(java.lang.String r5, java.lang.String r6) {
            r0 = r6
            r1 = 41
            int r0 = r0.indexOf(r1)
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto Ld
            r0 = r6
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r6
            r2 = 0
            r3 = r7
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r5
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r6
            r2 = r7
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String insertParameter(java.lang.String r5, java.lang.String r6) {
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 == r1) goto Lc
            r0 = r6
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "(L"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String appendParameter(javassist.CtClass r5, java.lang.String r6) {
            r0 = r6
            r1 = 41
            int r0 = r0.indexOf(r1)
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto Ld
            r0 = r6
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r6
            r2 = 0
            r3 = r7
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r5
            toDescriptor(r0, r1)
            r0 = r8
            r1 = r6
            r2 = r7
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String insertParameter(javassist.CtClass r4, java.lang.String r5) {
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 == r1) goto Lc
            r0 = r5
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = of(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String changeReturnType(java.lang.String r6, java.lang.String r7) {
            r0 = r7
            r1 = 41
            int r0 = r0.indexOf(r1)
            r8 = r0
            r0 = r8
            if (r0 >= 0) goto Ld
            r0 = r7
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = 1
            int r3 = r3 + r4
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = r6
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static javassist.CtClass[] getParameterTypes(java.lang.String r6, javassist.ClassPool r7) throws javassist.NotFoundException {
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r6
            int r0 = numOfParameters(r0)
            r8 = r0
            r0 = r8
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 1
            r11 = r0
        L1c:
            r0 = r7
            r1 = r6
            r2 = r11
            r3 = r9
            r4 = r10
            int r10 = r10 + 1
            int r0 = toCtClass(r0, r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            if (r0 > 0) goto L1c
            r0 = r9
            return r0
    }

    public static boolean eqParamTypes(java.lang.String r4, java.lang.String r5) {
            r0 = r4
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 0
            r6 = r0
        Le:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            char r1 = r1.charAt(r2)
            if (r0 == r1) goto L1f
            r0 = 0
            return r0
        L1f:
            r0 = r7
            r1 = 41
            if (r0 != r1) goto L27
            r0 = 1
            return r0
        L27:
            int r6 = r6 + 1
            goto Le
    }

    public static java.lang.String getParamDescriptor(java.lang.String r5) {
            r0 = r5
            r1 = 0
            r2 = r5
            r3 = 41
            int r2 = r2.indexOf(r3)
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public static javassist.CtClass getReturnType(java.lang.String r6, javassist.ClassPool r7) throws javassist.NotFoundException {
            r0 = r6
            r1 = 41
            int r0 = r0.indexOf(r1)
            r8 = r0
            r0 = r8
            if (r0 >= 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = 1
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r9 = r0
            r0 = r7
            r1 = r6
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r3 = r9
            r4 = 0
            int r0 = toCtClass(r0, r1, r2, r3, r4)
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public static int numOfParameters(java.lang.String r4) {
            r0 = 0
            r5 = r0
            r0 = 1
            r6 = r0
        L4:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 41
            if (r0 != r1) goto L13
            goto L4c
        L13:
            r0 = r7
            r1 = 91
            if (r0 != r1) goto L25
            r0 = r4
            int r6 = r6 + 1
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            goto L13
        L25:
            r0 = r7
            r1 = 76
            if (r0 != r1) goto L43
            r0 = r4
            r1 = 59
            r2 = r6
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            if (r0 > 0) goto L46
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "bad descriptor"
            r1.<init>(r2)
            throw r0
        L43:
            int r6 = r6 + 1
        L46:
            int r5 = r5 + 1
            goto L4
        L4c:
            r0 = r5
            return r0
    }

    public static javassist.CtClass toCtClass(java.lang.String r6, javassist.ClassPool r7) throws javassist.NotFoundException {
            r0 = 1
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = 0
            r3 = r8
            r4 = 0
            int r0 = toCtClass(r0, r1, r2, r3, r4)
            r9 = r0
            r0 = r9
            if (r0 < 0) goto L16
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            return r0
        L16:
            r0 = r7
            r1 = r6
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    private static int toCtClass(javassist.ClassPool r5, java.lang.String r6, int r7, javassist.CtClass[] r8, int r9) throws javassist.NotFoundException {
            r0 = 0
            r12 = r0
            r0 = r6
            r1 = r7
            char r0 = r0.charAt(r1)
            r13 = r0
        La:
            r0 = r13
            r1 = 91
            if (r0 != r1) goto L21
            int r12 = r12 + 1
            r0 = r6
            int r7 = r7 + 1
            r1 = r7
            char r0 = r0.charAt(r1)
            r13 = r0
            goto La
        L21:
            r0 = r13
            r1 = 76
            if (r0 != r1) goto L4a
            r0 = r6
            r1 = 59
            int r7 = r7 + 1
            r2 = r7
            int r0 = r0.indexOf(r1, r2)
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = r10
            int r10 = r10 + 1
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            r11 = r0
            goto L72
        L4a:
            r0 = r13
            javassist.CtClass r0 = toPrimitiveClass(r0)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L58
            r0 = -1
            return r0
        L58:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r12
            if (r0 != 0) goto L6b
            r0 = r8
            r1 = r9
            r2 = r14
            r0[r1] = r2
            r0 = r10
            return r0
        L6b:
            r0 = r14
            java.lang.String r0 = r0.getName()
            r11 = r0
        L72:
            r0 = r12
            if (r0 <= 0) goto L9c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r14 = r0
        L82:
            r0 = r12
            int r12 = r12 + (-1)
            if (r0 <= 0) goto L95
            r0 = r14
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L82
        L95:
            r0 = r14
            java.lang.String r0 = r0.toString()
            r11 = r0
        L9c:
            r0 = r8
            r1 = r9
            r2 = r5
            r3 = r11
            javassist.CtClass r2 = r2.get(r3)
            r0[r1] = r2
            r0 = r10
            return r0
    }

    static javassist.CtClass toPrimitiveClass(char r2) {
            r0 = 0
            r3 = r0
            r0 = r2
            switch(r0) {
                case 66: goto L82;
                case 67: goto L7b;
                case 68: goto La5;
                case 69: goto Lb0;
                case 70: goto L9e;
                case 71: goto Lb0;
                case 72: goto Lb0;
                case 73: goto L90;
                case 74: goto L97;
                case 75: goto Lb0;
                case 76: goto Lb0;
                case 77: goto Lb0;
                case 78: goto Lb0;
                case 79: goto Lb0;
                case 80: goto Lb0;
                case 81: goto Lb0;
                case 82: goto Lb0;
                case 83: goto L89;
                case 84: goto Lb0;
                case 85: goto Lb0;
                case 86: goto Lac;
                case 87: goto Lb0;
                case 88: goto Lb0;
                case 89: goto Lb0;
                case 90: goto L74;
                default: goto Lb0;
            }
        L74:
            javassist.CtClass r0 = javassist.CtClass.booleanType
            r3 = r0
            goto Lb0
        L7b:
            javassist.CtClass r0 = javassist.CtClass.charType
            r3 = r0
            goto Lb0
        L82:
            javassist.CtClass r0 = javassist.CtClass.byteType
            r3 = r0
            goto Lb0
        L89:
            javassist.CtClass r0 = javassist.CtClass.shortType
            r3 = r0
            goto Lb0
        L90:
            javassist.CtClass r0 = javassist.CtClass.intType
            r3 = r0
            goto Lb0
        L97:
            javassist.CtClass r0 = javassist.CtClass.longType
            r3 = r0
            goto Lb0
        L9e:
            javassist.CtClass r0 = javassist.CtClass.floatType
            r3 = r0
            goto Lb0
        La5:
            javassist.CtClass r0 = javassist.CtClass.doubleType
            r3 = r0
            goto Lb0
        Lac:
            javassist.CtClass r0 = javassist.CtClass.voidType
            r3 = r0
        Lb0:
            r0 = r3
            return r0
    }

    public static int arrayDimension(java.lang.String r3) {
            r0 = 0
            r4 = r0
        L2:
            r0 = r3
            r1 = r4
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L12
            int r4 = r4 + 1
            goto L2
        L12:
            r0 = r4
            return r0
    }

    public static java.lang.String toArrayComponent(java.lang.String r3, int r4) {
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    public static int dataSize(java.lang.String r3) {
            r0 = r3
            r1 = 1
            int r0 = dataSize(r0, r1)
            return r0
    }

    public static int paramSize(java.lang.String r3) {
            r0 = r3
            r1 = 0
            int r0 = dataSize(r0, r1)
            int r0 = -r0
            return r0
    }

    private static int dataSize(java.lang.String r4, boolean r5) {
            r0 = 0
            r6 = r0
            r0 = r4
            r1 = 0
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 40
            if (r0 != r1) goto L84
            r0 = 1
            r8 = r0
        L11:
            r0 = r4
            r1 = r8
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 41
            if (r0 != r1) goto L2a
            r0 = r4
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r7 = r0
            goto L84
        L2a:
            r0 = 0
            r9 = r0
        L2d:
            r0 = r7
            r1 = 91
            if (r0 != r1) goto L43
            r0 = 1
            r9 = r0
            r0 = r4
            int r8 = r8 + 1
            r1 = r8
            char r0 = r0.charAt(r1)
            r7 = r0
            goto L2d
        L43:
            r0 = r7
            r1 = 76
            if (r0 != r1) goto L64
            r0 = r4
            r1 = 59
            r2 = r8
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            if (r0 > 0) goto L67
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "bad descriptor"
            r1.<init>(r2)
            throw r0
        L64:
            int r8 = r8 + 1
        L67:
            r0 = r9
            if (r0 != 0) goto L7e
            r0 = r7
            r1 = 74
            if (r0 == r1) goto L78
            r0 = r7
            r1 = 68
            if (r0 != r1) goto L7e
        L78:
            int r6 = r6 + (-2)
            goto L81
        L7e:
            int r6 = r6 + (-1)
        L81:
            goto L11
        L84:
            r0 = r5
            if (r0 == 0) goto La3
            r0 = r7
            r1 = 74
            if (r0 == r1) goto L94
            r0 = r7
            r1 = 68
            if (r0 != r1) goto L9a
        L94:
            int r6 = r6 + 2
            goto La3
        L9a:
            r0 = r7
            r1 = 86
            if (r0 == r1) goto La3
            int r6 = r6 + 1
        La3:
            r0 = r6
            return r0
    }

    public static java.lang.String toString(java.lang.String r2) {
            r0 = r2
            java.lang.String r0 = javassist.bytecode.Descriptor.PrettyPrinter.toString(r0)
            return r0
    }
}
