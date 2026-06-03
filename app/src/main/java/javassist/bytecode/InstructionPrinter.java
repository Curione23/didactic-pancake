package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/InstructionPrinter.class */
public class InstructionPrinter implements javassist.bytecode.Opcode {
    private static final java.lang.String[] opcodes = null;
    private final java.io.PrintStream stream;

    public InstructionPrinter(java.io.PrintStream r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.stream = r1
            return
    }

    public static void print(javassist.CtMethod r4, java.io.PrintStream r5) {
            javassist.bytecode.InstructionPrinter r0 = new javassist.bytecode.InstructionPrinter
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r1 = r4
            r0.print(r1)
            return
    }

    public void print(javassist.CtMethod r7) {
            r6 = this;
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
            if (r0 != 0) goto L16
            return
        L16:
            r0 = r10
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r11 = r0
        L1d:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L64
            r0 = r11
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> L2f
            r12 = r0
            goto L3b
        L2f:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L3b:
            r0 = r6
            java.io.PrintStream r0 = r0.stream
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            r3 = r12
            r4 = r9
            java.lang.String r2 = instructionString(r2, r3, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            goto L1d
        L64:
            return
    }

    public static java.lang.String instructionString(javassist.bytecode.CodeIterator r6, int r7, javassist.bytecode.ConstPool r8) {
            r0 = r6
            r1 = r7
            int r0 = r0.byteAt(r1)
            r9 = r0
            r0 = r9
            java.lang.String[] r1 = javassist.bytecode.InstructionPrinter.opcodes
            int r1 = r1.length
            if (r0 > r1) goto L12
            r0 = r9
            if (r0 >= 0) goto L36
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid opcode, opcode: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " pos: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L36:
            java.lang.String[] r0 = javassist.bytecode.InstructionPrinter.opcodes
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r9
            switch(r0) {
                case 16: goto L334;
                case 17: goto L353;
                case 18: goto L372;
                case 19: goto L395;
                case 20: goto L395;
                case 21: goto L3b8;
                case 22: goto L3b8;
                case 23: goto L3b8;
                case 24: goto L3b8;
                case 25: goto L3b8;
                case 26: goto L5ac;
                case 27: goto L5ac;
                case 28: goto L5ac;
                case 29: goto L5ac;
                case 30: goto L5ac;
                case 31: goto L5ac;
                case 32: goto L5ac;
                case 33: goto L5ac;
                case 34: goto L5ac;
                case 35: goto L5ac;
                case 36: goto L5ac;
                case 37: goto L5ac;
                case 38: goto L5ac;
                case 39: goto L5ac;
                case 40: goto L5ac;
                case 41: goto L5ac;
                case 42: goto L5ac;
                case 43: goto L5ac;
                case 44: goto L5ac;
                case 45: goto L5ac;
                case 46: goto L5ac;
                case 47: goto L5ac;
                case 48: goto L5ac;
                case 49: goto L5ac;
                case 50: goto L5ac;
                case 51: goto L5ac;
                case 52: goto L5ac;
                case 53: goto L5ac;
                case 54: goto L3b8;
                case 55: goto L3b8;
                case 56: goto L3b8;
                case 57: goto L3b8;
                case 58: goto L3b8;
                case 59: goto L5ac;
                case 60: goto L5ac;
                case 61: goto L5ac;
                case 62: goto L5ac;
                case 63: goto L5ac;
                case 64: goto L5ac;
                case 65: goto L5ac;
                case 66: goto L5ac;
                case 67: goto L5ac;
                case 68: goto L5ac;
                case 69: goto L5ac;
                case 70: goto L5ac;
                case 71: goto L5ac;
                case 72: goto L5ac;
                case 73: goto L5ac;
                case 74: goto L5ac;
                case 75: goto L5ac;
                case 76: goto L5ac;
                case 77: goto L5ac;
                case 78: goto L5ac;
                case 79: goto L5ac;
                case 80: goto L5ac;
                case 81: goto L5ac;
                case 82: goto L5ac;
                case 83: goto L5ac;
                case 84: goto L5ac;
                case 85: goto L5ac;
                case 86: goto L5ac;
                case 87: goto L5ac;
                case 88: goto L5ac;
                case 89: goto L5ac;
                case 90: goto L5ac;
                case 91: goto L5ac;
                case 92: goto L5ac;
                case 93: goto L5ac;
                case 94: goto L5ac;
                case 95: goto L5ac;
                case 96: goto L5ac;
                case 97: goto L5ac;
                case 98: goto L5ac;
                case 99: goto L5ac;
                case 100: goto L5ac;
                case 101: goto L5ac;
                case 102: goto L5ac;
                case 103: goto L5ac;
                case 104: goto L5ac;
                case 105: goto L5ac;
                case 106: goto L5ac;
                case 107: goto L5ac;
                case 108: goto L5ac;
                case 109: goto L5ac;
                case 110: goto L5ac;
                case 111: goto L5ac;
                case 112: goto L5ac;
                case 113: goto L5ac;
                case 114: goto L5ac;
                case 115: goto L5ac;
                case 116: goto L5ac;
                case 117: goto L5ac;
                case 118: goto L5ac;
                case 119: goto L5ac;
                case 120: goto L5ac;
                case 121: goto L5ac;
                case 122: goto L5ac;
                case 123: goto L5ac;
                case 124: goto L5ac;
                case 125: goto L5ac;
                case 126: goto L5ac;
                case 127: goto L5ac;
                case 128: goto L5ac;
                case 129: goto L5ac;
                case 130: goto L5ac;
                case 131: goto L5ac;
                case 132: goto L3f8;
                case 133: goto L5ac;
                case 134: goto L5ac;
                case 135: goto L5ac;
                case 136: goto L5ac;
                case 137: goto L5ac;
                case 138: goto L5ac;
                case 139: goto L5ac;
                case 140: goto L5ac;
                case 141: goto L5ac;
                case 142: goto L5ac;
                case 143: goto L5ac;
                case 144: goto L5ac;
                case 145: goto L5ac;
                case 146: goto L5ac;
                case 147: goto L5ac;
                case 148: goto L5ac;
                case 149: goto L5ac;
                case 150: goto L5ac;
                case 151: goto L5ac;
                case 152: goto L5ac;
                case 153: goto L3d7;
                case 154: goto L3d7;
                case 155: goto L3d7;
                case 156: goto L3d7;
                case 157: goto L3d7;
                case 158: goto L3d7;
                case 159: goto L3d7;
                case 160: goto L3d7;
                case 161: goto L3d7;
                case 162: goto L3d7;
                case 163: goto L3d7;
                case 164: goto L3d7;
                case 165: goto L3d7;
                case 166: goto L3d7;
                case 167: goto L426;
                case 168: goto L426;
                case 169: goto L447;
                case 170: goto L466;
                case 171: goto L46c;
                case 172: goto L5ac;
                case 173: goto L5ac;
                case 174: goto L5ac;
                case 175: goto L5ac;
                case 176: goto L5ac;
                case 177: goto L5ac;
                case 178: goto L472;
                case 179: goto L472;
                case 180: goto L472;
                case 181: goto L472;
                case 182: goto L495;
                case 183: goto L495;
                case 184: goto L495;
                case 185: goto L4b8;
                case 186: goto L4db;
                case 187: goto L4fa;
                case 188: goto L51d;
                case 189: goto L53f;
                case 190: goto L5ac;
                case 191: goto L5ac;
                case 192: goto L53f;
                case 193: goto L5ac;
                case 194: goto L5ac;
                case 195: goto L5ac;
                case 196: goto L562;
                case 197: goto L568;
                case 198: goto L3d7;
                case 199: goto L3d7;
                case 200: goto L58b;
                case 201: goto L58b;
                default: goto L5ac;
            }
        L334:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.byteAt(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L353:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s16bitAt(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L372:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            java.lang.String r1 = ldc(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L395:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = ldc(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.byteAt(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3d7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s16bitAt(r2)
            r2 = r7
            int r1 = r1 + r2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3f8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.byteAt(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.signedByteAt(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L426:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s16bitAt(r2)
            r2 = r7
            int r1 = r1 + r2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L447:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.byteAt(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L466:
            r0 = r6
            r1 = r7
            java.lang.String r0 = tableSwitch(r0, r1)
            return r0
        L46c:
            r0 = r6
            r1 = r7
            java.lang.String r0 = lookupSwitch(r0, r1)
            return r0
        L472:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = fieldInfo(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L495:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = methodInfo(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = interfaceMethodInfo(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4fa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = classInfo(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L51d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.byteAt(r2)
            java.lang.String r1 = arrayInfo(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L53f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = classInfo(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L562:
            r0 = r6
            r1 = r7
            java.lang.String r0 = wide(r0, r1)
            return r0
        L568:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = classInfo(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L58b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s32bitAt(r2)
            r2 = r7
            int r1 = r1 + r2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L5ac:
            r0 = r10
            return r0
    }

    private static java.lang.String wide(javassist.bytecode.CodeIterator r4, int r5) {
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r7 = r0
            r0 = r6
            switch(r0) {
                case 21: goto L7c;
                case 22: goto L7c;
                case 23: goto L7c;
                case 24: goto L7c;
                case 25: goto L7c;
                case 54: goto L7c;
                case 55: goto L7c;
                case 56: goto L7c;
                case 57: goto L7c;
                case 58: goto L7c;
                case 132: goto L7c;
                case 169: goto L7c;
                default: goto L98;
            }
        L7c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String[] r1 = javassist.bytecode.InstructionPrinter.opcodes
            r2 = r6
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L98:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Invalid WIDE operand"
            r1.<init>(r2)
            throw r0
    }

    private static java.lang.String arrayInfo(int r4) {
            r0 = r4
            switch(r0) {
                case 4: goto L30;
                case 5: goto L33;
                case 6: goto L42;
                case 7: goto L45;
                case 8: goto L36;
                case 9: goto L39;
                case 10: goto L3c;
                case 11: goto L3f;
                default: goto L48;
            }
        L30:
            java.lang.String r0 = "boolean"
            return r0
        L33:
            java.lang.String r0 = "char"
            return r0
        L36:
            java.lang.String r0 = "byte"
            return r0
        L39:
            java.lang.String r0 = "short"
            return r0
        L3c:
            java.lang.String r0 = "int"
            return r0
        L3f:
            java.lang.String r0 = "long"
            return r0
        L42:
            java.lang.String r0 = "float"
            return r0
        L45:
            java.lang.String r0 = "double"
            return r0
        L48:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Invalid array type"
            r1.<init>(r2)
            throw r0
    }

    private static java.lang.String classInfo(javassist.bytecode.ConstPool r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = Class "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getClassInfo(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String interfaceMethodInfo(javassist.bytecode.ConstPool r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = Method "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getInterfaceMethodrefClassName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getInterfaceMethodrefName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getInterfaceMethodrefType(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String methodInfo(javassist.bytecode.ConstPool r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = Method "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getMethodrefClassName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getMethodrefName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getMethodrefType(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String fieldInfo(javassist.bytecode.ConstPool r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = Field "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getFieldrefClassName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getFieldrefName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.getFieldrefType(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String lookupSwitch(javassist.bytecode.CodeIterator r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "lookupswitch {\n"
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            java.lang.String r1 = "\t\tdefault: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r5
            r3 = r8
            int r2 = r2.s32bitAt(r3)
            int r1 = r1 + r2
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            int r8 = r8 + 4
            r1 = r8
            int r0 = r0.s32bitAt(r1)
            r9 = r0
            r0 = r9
            r1 = 8
            int r0 = r0 * r1
            int r8 = r8 + 4
            r1 = r8
            int r0 = r0 + r1
            r10 = r0
        L3d:
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto L76
            r0 = r5
            r1 = r8
            int r0 = r0.s32bitAt(r1)
            r11 = r0
            r0 = r5
            r1 = r8
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.s32bitAt(r1)
            r1 = r6
            int r0 = r0 + r1
            r12 = r0
            r0 = r7
            java.lang.String r1 = "\t\t"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            int r8 = r8 + 8
            goto L3d
        L76:
            r0 = r7
            r1 = r7
            int r1 = r1.length()
            r2 = 1
            int r1 = r1 - r2
            r2 = 125(0x7d, float:1.75E-43)
            r0.setCharAt(r1, r2)
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String tableSwitch(javassist.bytecode.CodeIterator r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "tableswitch {\n"
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            java.lang.String r1 = "\t\tdefault: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r5
            r3 = r8
            int r2 = r2.s32bitAt(r3)
            int r1 = r1 + r2
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            int r8 = r8 + 4
            r1 = r8
            int r0 = r0.s32bitAt(r1)
            r9 = r0
            r0 = r5
            int r8 = r8 + 4
            r1 = r8
            int r0 = r0.s32bitAt(r1)
            r10 = r0
            r0 = r10
            r1 = r9
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r1 = 4
            int r0 = r0 * r1
            int r8 = r8 + 4
            r1 = r8
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            r12 = r0
        L4f:
            r0 = r8
            r1 = r11
            if (r0 >= r1) goto L82
            r0 = r5
            r1 = r8
            int r0 = r0.s32bitAt(r1)
            r1 = r6
            int r0 = r0 + r1
            r13 = r0
            r0 = r7
            java.lang.String r1 = "\t\t"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 10
            java.lang.StringBuilder r0 = r0.append(r1)
            int r8 = r8 + 4
            int r12 = r12 + 1
            goto L4f
        L82:
            r0 = r7
            r1 = r7
            int r1 = r1.length()
            r2 = 1
            int r1 = r1 - r2
            r2 = 125(0x7d, float:1.75E-43)
            r0.setCharAt(r1, r2)
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String ldc(javassist.bytecode.ConstPool r5, int r6) {
            r0 = r5
            r1 = r6
            int r0 = r0.getTag(r1)
            r7 = r0
            r0 = r7
            switch(r0) {
                case 3: goto L52;
                case 4: goto L73;
                case 5: goto L94;
                case 6: goto Lb6;
                case 7: goto Ld8;
                case 8: goto L2c;
                default: goto Lde;
            }
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r6
            java.lang.String r1 = r1.getStringInfo(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L52:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = int "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r6
            int r1 = r1.getIntegerInfo(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L73:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = float "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r6
            float r1 = r1.getFloatInfo(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L94:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = long "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r6
            long r1 = r1.getLongInfo(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Lb6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " = double "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r6
            double r1 = r1.getDoubleInfo(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Ld8:
            r0 = r5
            r1 = r6
            java.lang.String r0 = classInfo(r0, r1)
            return r0
        Lde:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad LDC: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static {
            java.lang.String[] r0 = javassist.bytecode.Mnemonic.OPCODE
            javassist.bytecode.InstructionPrinter.opcodes = r0
            return
    }
}
