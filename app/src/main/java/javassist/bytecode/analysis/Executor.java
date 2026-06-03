package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Executor.class */
public class Executor implements javassist.bytecode.Opcode {
    private final javassist.bytecode.ConstPool constPool;
    private final javassist.ClassPool classPool;
    private final javassist.bytecode.analysis.Type STRING_TYPE;
    private final javassist.bytecode.analysis.Type CLASS_TYPE;
    private final javassist.bytecode.analysis.Type THROWABLE_TYPE;
    private int lastPos;

    public Executor(javassist.ClassPool r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r6
            r0.constPool = r1
            r0 = r4
            r1 = r5
            r0.classPool = r1
            r0 = r4
            r1 = r4
            java.lang.String r2 = "java.lang.String"
            javassist.bytecode.analysis.Type r1 = r1.getType(r2)     // Catch: java.lang.Exception -> L2f
            r0.STRING_TYPE = r1     // Catch: java.lang.Exception -> L2f
            r0 = r4
            r1 = r4
            java.lang.String r2 = "java.lang.Class"
            javassist.bytecode.analysis.Type r1 = r1.getType(r2)     // Catch: java.lang.Exception -> L2f
            r0.CLASS_TYPE = r1     // Catch: java.lang.Exception -> L2f
            r0 = r4
            r1 = r4
            java.lang.String r2 = "java.lang.Throwable"
            javassist.bytecode.analysis.Type r1 = r1.getType(r2)     // Catch: java.lang.Exception -> L2f
            r0.THROWABLE_TYPE = r1     // Catch: java.lang.Exception -> L2f
            goto L39
        L2f:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L39:
            return
    }

    public void execute(javassist.bytecode.MethodInfo r8, int r9, javassist.bytecode.CodeIterator r10, javassist.bytecode.analysis.Frame r11, javassist.bytecode.analysis.Subroutine r12) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r7
            r1 = r9
            r0.lastPos = r1
            r0 = r10
            r1 = r9
            int r0 = r0.byteAt(r1)
            r13 = r0
            r0 = r13
            switch(r0) {
                case 0: goto L344;
                case 1: goto L347;
                case 2: goto L352;
                case 3: goto L352;
                case 4: goto L352;
                case 5: goto L352;
                case 6: goto L352;
                case 7: goto L352;
                case 8: goto L352;
                case 9: goto L35d;
                case 10: goto L35d;
                case 11: goto L370;
                case 12: goto L370;
                case 13: goto L370;
                case 14: goto L37b;
                case 15: goto L37b;
                case 16: goto L38e;
                case 17: goto L38e;
                case 18: goto L399;
                case 19: goto L3a9;
                case 20: goto L3a9;
                case 21: goto L3b9;
                case 22: goto L3ce;
                case 23: goto L3e3;
                case 24: goto L3f8;
                case 25: goto L40d;
                case 26: goto L422;
                case 27: goto L422;
                case 28: goto L422;
                case 29: goto L422;
                case 30: goto L435;
                case 31: goto L435;
                case 32: goto L435;
                case 33: goto L435;
                case 34: goto L448;
                case 35: goto L448;
                case 36: goto L448;
                case 37: goto L448;
                case 38: goto L45b;
                case 39: goto L45b;
                case 40: goto L45b;
                case 41: goto L45b;
                case 42: goto L46e;
                case 43: goto L46e;
                case 44: goto L46e;
                case 45: goto L46e;
                case 46: goto L481;
                case 47: goto L48d;
                case 48: goto L499;
                case 49: goto L4a5;
                case 50: goto L4b1;
                case 51: goto L4bd;
                case 52: goto L4bd;
                case 53: goto L4bd;
                case 54: goto L4c9;
                case 55: goto L4de;
                case 56: goto L4f3;
                case 57: goto L508;
                case 58: goto L51d;
                case 59: goto L532;
                case 60: goto L532;
                case 61: goto L532;
                case 62: goto L532;
                case 63: goto L545;
                case 64: goto L545;
                case 65: goto L545;
                case 66: goto L545;
                case 67: goto L558;
                case 68: goto L558;
                case 69: goto L558;
                case 70: goto L558;
                case 71: goto L56b;
                case 72: goto L56b;
                case 73: goto L56b;
                case 74: goto L56b;
                case 75: goto L57e;
                case 76: goto L57e;
                case 77: goto L57e;
                case 78: goto L57e;
                case 79: goto L591;
                case 80: goto L59d;
                case 81: goto L5a9;
                case 82: goto L5b5;
                case 83: goto L5c1;
                case 84: goto L5cd;
                case 85: goto L5cd;
                case 86: goto L5cd;
                case 87: goto L5d9;
                case 88: goto L5ff;
                case 89: goto L60e;
                case 90: goto L645;
                case 91: goto L645;
                case 92: goto L6b2;
                case 93: goto L6d7;
                case 94: goto L6d7;
                case 95: goto L741;
                case 96: goto L78d;
                case 97: goto L799;
                case 98: goto L7a5;
                case 99: goto L7b1;
                case 100: goto L7bd;
                case 101: goto L7c9;
                case 102: goto L7d5;
                case 103: goto L7e1;
                case 104: goto L7ed;
                case 105: goto L7f9;
                case 106: goto L805;
                case 107: goto L811;
                case 108: goto L81d;
                case 109: goto L829;
                case 110: goto L835;
                case 111: goto L841;
                case 112: goto L84d;
                case 113: goto L859;
                case 114: goto L865;
                case 115: goto L871;
                case 116: goto L87d;
                case 117: goto L88d;
                case 118: goto L89d;
                case 119: goto L8ad;
                case 120: goto L8bd;
                case 121: goto L8c9;
                case 122: goto L8d5;
                case 123: goto L8e1;
                case 124: goto L8ed;
                case 125: goto L8f9;
                case 126: goto L905;
                case 127: goto L911;
                case 128: goto L91d;
                case 129: goto L929;
                case 130: goto L935;
                case 131: goto L941;
                case 132: goto L94d;
                case 133: goto L972;
                case 134: goto L98b;
                case 135: goto L9a4;
                case 136: goto L9bd;
                case 137: goto L9d6;
                case 138: goto L9ef;
                case 139: goto La08;
                case 140: goto La21;
                case 141: goto La3a;
                case 142: goto La53;
                case 143: goto La6c;
                case 144: goto La85;
                case 145: goto La9e;
                case 146: goto La9e;
                case 147: goto La9e;
                case 148: goto Laad;
                case 149: goto Lad2;
                case 150: goto Lad2;
                case 151: goto Laf7;
                case 152: goto Laf7;
                case 153: goto Lb1c;
                case 154: goto Lb1c;
                case 155: goto Lb1c;
                case 156: goto Lb1c;
                case 157: goto Lb1c;
                case 158: goto Lb1c;
                case 159: goto Lb2c;
                case 160: goto Lb2c;
                case 161: goto Lb2c;
                case 162: goto Lb2c;
                case 163: goto Lb2c;
                case 164: goto Lb2c;
                case 165: goto Lb49;
                case 166: goto Lb49;
                case 167: goto Lb66;
                case 168: goto Lb69;
                case 169: goto Lb74;
                case 170: goto Lb8a;
                case 171: goto Lb8a;
                case 172: goto Lb8a;
                case 173: goto Lb9a;
                case 174: goto Lbaa;
                case 175: goto Lbba;
                case 176: goto Lbca;
                case 177: goto Lbf5;
                case 178: goto Lbf8;
                case 179: goto Lc0a;
                case 180: goto Lc1c;
                case 181: goto Lc2e;
                case 182: goto Lc40;
                case 183: goto Lc40;
                case 184: goto Lc40;
                case 185: goto Lc52;
                case 186: goto Lc64;
                case 187: goto Lc76;
                case 188: goto Lc90;
                case 189: goto Lc9b;
                case 190: goto Lca6;
                case 191: goto Lcee;
                case 192: goto Lcff;
                case 193: goto Ld26;
                case 194: goto Ld3e;
                case 195: goto Ld3e;
                case 196: goto Ld4e;
                case 197: goto Ld5b;
                case 198: goto Ld66;
                case 199: goto Ld66;
                case 200: goto Ld76;
                case 201: goto Ld79;
                default: goto Ld81;
            }
        L344:
            goto Ld81
        L347:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            r0.push(r1)
            goto Ld81
        L352:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r0.push(r1)
            goto Ld81
        L35d:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r0.push(r1)
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            r0.push(r1)
            goto Ld81
        L370:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r0.push(r1)
            goto Ld81
        L37b:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r0.push(r1)
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            r0.push(r1)
            goto Ld81
        L38e:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r0.push(r1)
            goto Ld81
        L399:
            r0 = r7
            r1 = r10
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.byteAt(r2)
            r2 = r11
            r0.evalLDC(r1, r2)
            goto Ld81
        L3a9:
            r0 = r7
            r1 = r10
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            r2 = r11
            r0.evalLDC(r1, r2)
            goto Ld81
        L3b9:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L3ce:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L3e3:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L3f8:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L40d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L422:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r13
            r3 = 26
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L435:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r13
            r3 = 30
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L448:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r13
            r3 = 34
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L45b:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r13
            r3 = 38
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L46e:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r13
            r3 = 42
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalLoad(r1, r2, r3, r4)
            goto Ld81
        L481:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalArrayLoad(r1, r2)
            goto Ld81
        L48d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalArrayLoad(r1, r2)
            goto Ld81
        L499:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.evalArrayLoad(r1, r2)
            goto Ld81
        L4a5:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.evalArrayLoad(r1, r2)
            goto Ld81
        L4b1:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r11
            r0.evalArrayLoad(r1, r2)
            goto Ld81
        L4bd:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalArrayLoad(r1, r2)
            goto Ld81
        L4c9:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L4de:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L4f3:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L508:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L51d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L532:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r13
            r3 = 59
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L545:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r13
            r3 = 63
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L558:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r13
            r3 = 67
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L56b:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r13
            r3 = 71
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L57e:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r13
            r3 = 75
            int r2 = r2 - r3
            r3 = r11
            r4 = r12
            r0.evalStore(r1, r2, r3, r4)
            goto Ld81
        L591:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalArrayStore(r1, r2)
            goto Ld81
        L59d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalArrayStore(r1, r2)
            goto Ld81
        L5a9:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.evalArrayStore(r1, r2)
            goto Ld81
        L5b5:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.evalArrayStore(r1, r2)
            goto Ld81
        L5c1:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r11
            r0.evalArrayStore(r1, r2)
            goto Ld81
        L5cd:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalArrayStore(r1, r2)
            goto Ld81
        L5d9:
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.pop()
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            if (r0 != r1) goto Ld81
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "POP can not be used with a category 2 value, pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L5ff:
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.pop()
            goto Ld81
        L60e:
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.peek()
            r14 = r0
            r0 = r14
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            if (r0 != r1) goto L638
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "DUP can not be used with a category 2 value, pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L638:
            r0 = r11
            r1 = r11
            javassist.bytecode.analysis.Type r1 = r1.peek()
            r0.push(r1)
            goto Ld81
        L645:
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.peek()
            r14 = r0
            r0 = r14
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            if (r0 != r1) goto L66f
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "DUP can not be used with a category 2 value, pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L66f:
            r0 = r11
            int r0 = r0.getTopIndex()
            r15 = r0
            r0 = r15
            r1 = r13
            r2 = 90
            int r1 = r1 - r2
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            r16 = r0
            r0 = r11
            r1 = r14
            r0.push(r1)
        L689:
            r0 = r15
            r1 = r16
            if (r0 <= r1) goto L6a6
            r0 = r11
            r1 = r15
            r2 = r11
            r3 = r15
            r4 = 1
            int r3 = r3 - r4
            javassist.bytecode.analysis.Type r2 = r2.getStack(r3)
            r0.setStack(r1, r2)
            int r15 = r15 + (-1)
            goto L689
        L6a6:
            r0 = r11
            r1 = r16
            r2 = r14
            r0.setStack(r1, r2)
            goto Ld81
        L6b2:
            r0 = r11
            r1 = r11
            r2 = r11
            int r2 = r2.getTopIndex()
            r3 = 1
            int r2 = r2 - r3
            javassist.bytecode.analysis.Type r1 = r1.getStack(r2)
            r0.push(r1)
            r0 = r11
            r1 = r11
            r2 = r11
            int r2 = r2.getTopIndex()
            r3 = 1
            int r2 = r2 - r3
            javassist.bytecode.analysis.Type r1 = r1.getStack(r2)
            r0.push(r1)
            goto Ld81
        L6d7:
            r0 = r11
            int r0 = r0.getTopIndex()
            r14 = r0
            r0 = r14
            r1 = r13
            r2 = 93
            int r1 = r1 - r2
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            r15 = r0
            r0 = r11
            r1 = r11
            int r1 = r1.getTopIndex()
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.analysis.Type r0 = r0.getStack(r1)
            r16 = r0
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.peek()
            r17 = r0
            r0 = r11
            r1 = r16
            r0.push(r1)
            r0 = r11
            r1 = r17
            r0.push(r1)
        L70d:
            r0 = r14
            r1 = r15
            if (r0 <= r1) goto L72a
            r0 = r11
            r1 = r14
            r2 = r11
            r3 = r14
            r4 = 2
            int r3 = r3 - r4
            javassist.bytecode.analysis.Type r2 = r2.getStack(r3)
            r0.setStack(r1, r2)
            int r14 = r14 + (-1)
            goto L70d
        L72a:
            r0 = r11
            r1 = r15
            r2 = r17
            r0.setStack(r1, r2)
            r0 = r11
            r1 = r15
            r2 = 1
            int r1 = r1 - r2
            r2 = r16
            r0.setStack(r1, r2)
            goto Ld81
        L741:
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r14 = r0
            r0 = r11
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r15 = r0
            r0 = r14
            int r0 = r0.getSize()
            r1 = 2
            if (r0 == r1) goto L761
            r0 = r15
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L77c
        L761:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Swap can not be used with category 2 values, pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L77c:
            r0 = r11
            r1 = r14
            r0.push(r1)
            r0 = r11
            r1 = r15
            r0.push(r1)
            goto Ld81
        L78d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L799:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7a5:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7b1:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7bd:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7c9:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7d5:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7e1:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7ed:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L7f9:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L805:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L811:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L81d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L829:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L835:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L841:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L84d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L859:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L865:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L871:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L87d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePeek(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        L88d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePeek(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        L89d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePeek(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        L8ad:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePeek(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        L8bd:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalShift(r1, r2)
            goto Ld81
        L8c9:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalShift(r1, r2)
            goto Ld81
        L8d5:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalShift(r1, r2)
            goto Ld81
        L8e1:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalShift(r1, r2)
            goto Ld81
        L8ed:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalShift(r1, r2)
            goto Ld81
        L8f9:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalShift(r1, r2)
            goto Ld81
        L905:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L911:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L91d:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L929:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L935:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L941:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.evalBinaryMath(r1, r2)
            goto Ld81
        L94d:
            r0 = r10
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r14 = r0
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r3 = r14
            javassist.bytecode.analysis.Type r2 = r2.getLocal(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            r1 = r14
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.INTEGER
            r3 = r12
            r0.access(r1, r2, r3)
            goto Ld81
        L972:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        L98b:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        L9a4:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        L9bd:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        L9d6:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        L9ef:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        La08:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        La21:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        La3a:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        La53:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        La6c:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        La85:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r11
            r0.simplePush(r1, r2)
            goto Ld81
        La9e:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r11
            javassist.bytecode.analysis.Type r2 = r2.peek()
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Laad:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r0.push(r1)
            goto Ld81
        Lad2:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r0.push(r1)
            goto Ld81
        Laf7:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r0.push(r1)
            goto Ld81
        Lb1c:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lb2c:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lb49:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lb66:
            goto Ld81
        Lb69:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.RETURN_ADDRESS
            r0.push(r1)
            goto Ld81
        Lb74:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.RETURN_ADDRESS
            r2 = r11
            r3 = r10
            r4 = r9
            r5 = 1
            int r4 = r4 + r5
            int r3 = r3.byteAt(r4)
            javassist.bytecode.analysis.Type r2 = r2.getLocal(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lb8a:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lb9a:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lbaa:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lbba:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lbca:
            r0 = r8
            java.lang.String r0 = r0.getDescriptor()     // Catch: javassist.NotFoundException -> Lbe9
            r1 = r7
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.NotFoundException -> Lbe9
            javassist.CtClass r0 = javassist.bytecode.Descriptor.getReturnType(r0, r1)     // Catch: javassist.NotFoundException -> Lbe9
            r14 = r0
            r0 = r7
            r1 = r14
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.get(r1)     // Catch: javassist.NotFoundException -> Lbe9
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)     // Catch: javassist.NotFoundException -> Lbe9
            r0.verifyAssignable(r1, r2)     // Catch: javassist.NotFoundException -> Lbe9
            goto Ld81
        Lbe9:
            r14 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        Lbf5:
            goto Ld81
        Lbf8:
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            r3 = r11
            r0.evalGetField(r1, r2, r3)
            goto Ld81
        Lc0a:
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            r3 = r11
            r0.evalPutField(r1, r2, r3)
            goto Ld81
        Lc1c:
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            r3 = r11
            r0.evalGetField(r1, r2, r3)
            goto Ld81
        Lc2e:
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            r3 = r11
            r0.evalPutField(r1, r2, r3)
            goto Ld81
        Lc40:
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            r3 = r11
            r0.evalInvokeMethod(r1, r2, r3)
            goto Ld81
        Lc52:
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            r3 = r11
            r0.evalInvokeIntfMethod(r1, r2, r3)
            goto Ld81
        Lc64:
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            r3 = r11
            r0.evalInvokeDynamic(r1, r2, r3)
            goto Ld81
        Lc76:
            r0 = r11
            r1 = r7
            r2 = r7
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r10
            r4 = r9
            r5 = 1
            int r4 = r4 + r5
            int r3 = r3.u16bitAt(r4)
            java.lang.String r2 = r2.getClassInfo(r3)
            javassist.bytecode.analysis.Type r1 = r1.resolveClassInfo(r2)
            r0.push(r1)
            goto Ld81
        Lc90:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r0.evalNewArray(r1, r2, r3)
            goto Ld81
        Lc9b:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r0.evalNewObjectArray(r1, r2, r3)
            goto Ld81
        Lca6:
            r0 = r7
            r1 = r11
            javassist.bytecode.analysis.Type r0 = r0.simplePop(r1)
            r14 = r0
            r0 = r14
            boolean r0 = r0.isArray()
            if (r0 != 0) goto Lce3
            r0 = r14
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 == r1) goto Lce3
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Array length passed a non-array [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r14
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lce3:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r0.push(r1)
            goto Ld81
        Lcee:
            r0 = r7
            r1 = r7
            javassist.bytecode.analysis.Type r1 = r1.THROWABLE_TYPE
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Lcff:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r11
            r1 = r7
            r2 = r7
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r10
            r4 = r9
            r5 = 1
            int r4 = r4 + r5
            int r3 = r3.u16bitAt(r4)
            java.lang.String r2 = r2.getClassInfoByDescriptor(r3)
            javassist.bytecode.analysis.Type r1 = r1.typeFromDesc(r2)
            r0.push(r1)
            goto Ld81
        Ld26:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r0.push(r1)
            goto Ld81
        Ld3e:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Ld4e:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.evalWide(r1, r2, r3, r4)
            goto Ld81
        Ld5b:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r0.evalNewObjectArray(r1, r2, r3)
            goto Ld81
        Ld66:
            r0 = r7
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r7
            r3 = r11
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto Ld81
        Ld76:
            goto Ld81
        Ld79:
            r0 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.RETURN_ADDRESS
            r0.push(r1)
        Ld81:
            return
    }

    private javassist.bytecode.analysis.Type zeroExtend(javassist.bytecode.analysis.Type r4) {
            r3 = this;
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.SHORT
            if (r0 == r1) goto L1c
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.BYTE
            if (r0 == r1) goto L1c
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.CHAR
            if (r0 == r1) goto L1c
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.BOOLEAN
            if (r0 != r1) goto L20
        L1c:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.INTEGER
            return r0
        L20:
            r0 = r4
            return r0
    }

    private void evalArrayLoad(javassist.bytecode.analysis.Type r6, javassist.bytecode.analysis.Frame r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r8 = r0
            r0 = r7
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r9 = r0
            r0 = r9
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 != r1) goto L34
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r8
            r0.verifyAssignable(r1, r2)
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            if (r0 != r1) goto L2d
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            r2 = r7
            r0.simplePush(r1, r2)
            goto L33
        L2d:
            r0 = r5
            r1 = r6
            r2 = r7
            r0.simplePush(r1, r2)
        L33:
            return
        L34:
            r0 = r9
            javassist.bytecode.analysis.Type r0 = r0.getComponent()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L69
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Not an array! [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r5
            r1 = r10
            javassist.bytecode.analysis.Type r0 = r0.zeroExtend(r1)
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r10
            r0.verifyAssignable(r1, r2)
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r8
            r0.verifyAssignable(r1, r2)
            r0 = r5
            r1 = r10
            r2 = r7
            r0.simplePush(r1, r2)
            return
    }

    private void evalArrayStore(javassist.bytecode.analysis.Type r6, javassist.bytecode.analysis.Frame r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r7
            javassist.bytecode.analysis.Type r0 = r0.simplePop(r1)
            r8 = r0
            r0 = r7
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r9 = r0
            r0 = r7
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r10 = r0
            r0 = r10
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 != r1) goto L24
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r9
            r0.verifyAssignable(r1, r2)
            return
        L24:
            r0 = r10
            javassist.bytecode.analysis.Type r0 = r0.getComponent()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L59
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Not an array! [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r5
            r1 = r11
            javassist.bytecode.analysis.Type r0 = r0.zeroExtend(r1)
            r11 = r0
            r0 = r5
            r1 = r6
            r2 = r11
            r0.verifyAssignable(r1, r2)
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r9
            r0.verifyAssignable(r1, r2)
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            if (r0 != r1) goto L81
            r0 = r5
            r1 = r6
            r2 = r8
            r0.verifyAssignable(r1, r2)
            goto L88
        L81:
            r0 = r5
            r1 = r11
            r2 = r8
            r0.verifyAssignable(r1, r2)
        L88:
            return
    }

    private void evalBinaryMath(javassist.bytecode.analysis.Type r5, javassist.bytecode.analysis.Frame r6) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            r1 = r6
            javassist.bytecode.analysis.Type r0 = r0.simplePop(r1)
            r7 = r0
            r0 = r4
            r1 = r6
            javassist.bytecode.analysis.Type r0 = r0.simplePop(r1)
            r8 = r0
            r0 = r4
            r1 = r5
            r2 = r7
            r0.verifyAssignable(r1, r2)
            r0 = r4
            r1 = r5
            r2 = r8
            r0.verifyAssignable(r1, r2)
            r0 = r4
            r1 = r8
            r2 = r6
            r0.simplePush(r1, r2)
            return
    }

    private void evalGetField(int r6, int r7, javassist.bytecode.analysis.Frame r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            java.lang.String r0 = r0.getFieldrefType(r1)
            r9 = r0
            r0 = r5
            r1 = r5
            r2 = r9
            javassist.bytecode.analysis.Type r1 = r1.typeFromDesc(r2)
            javassist.bytecode.analysis.Type r0 = r0.zeroExtend(r1)
            r10 = r0
            r0 = r6
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L36
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            java.lang.String r1 = r1.getFieldrefClassName(r2)
            javassist.bytecode.analysis.Type r0 = r0.resolveClassInfo(r1)
            r11 = r0
            r0 = r5
            r1 = r11
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
        L36:
            r0 = r5
            r1 = r10
            r2 = r8
            r0.simplePush(r1, r2)
            return
    }

    private void evalInvokeIntfMethod(int r6, int r7, javassist.bytecode.analysis.Frame r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            java.lang.String r0 = r0.getInterfaceMethodrefType(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            javassist.bytecode.analysis.Type[] r0 = r0.paramTypesFromDesc(r1)
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
        L17:
            r0 = r11
            if (r0 <= 0) goto L34
            r0 = r5
            r1 = r5
            r2 = r10
            int r11 = r11 + (-1)
            r3 = r11
            r2 = r2[r3]
            javassist.bytecode.analysis.Type r1 = r1.zeroExtend(r2)
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto L17
        L34:
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            java.lang.String r0 = r0.getInterfaceMethodrefClassName(r1)
            r12 = r0
            r0 = r5
            r1 = r12
            javassist.bytecode.analysis.Type r0 = r0.resolveClassInfo(r1)
            r13 = r0
            r0 = r5
            r1 = r13
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r5
            r1 = r9
            javassist.bytecode.analysis.Type r0 = r0.returnTypeFromDesc(r1)
            r14 = r0
            r0 = r14
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.VOID
            if (r0 == r1) goto L6c
            r0 = r5
            r1 = r5
            r2 = r14
            javassist.bytecode.analysis.Type r1 = r1.zeroExtend(r2)
            r2 = r8
            r0.simplePush(r1, r2)
        L6c:
            return
    }

    private void evalInvokeMethod(int r6, int r7, javassist.bytecode.analysis.Frame r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            java.lang.String r0 = r0.getMethodrefType(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            javassist.bytecode.analysis.Type[] r0 = r0.paramTypesFromDesc(r1)
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
        L17:
            r0 = r11
            if (r0 <= 0) goto L34
            r0 = r5
            r1 = r5
            r2 = r10
            int r11 = r11 + (-1)
            r3 = r11
            r2 = r2[r3]
            javassist.bytecode.analysis.Type r1 = r1.zeroExtend(r2)
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto L17
        L34:
            r0 = r6
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto L54
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            java.lang.String r1 = r1.getMethodrefClassName(r2)
            javassist.bytecode.analysis.Type r0 = r0.resolveClassInfo(r1)
            r12 = r0
            r0 = r5
            r1 = r12
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
        L54:
            r0 = r5
            r1 = r9
            javassist.bytecode.analysis.Type r0 = r0.returnTypeFromDesc(r1)
            r12 = r0
            r0 = r12
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.VOID
            if (r0 == r1) goto L6f
            r0 = r5
            r1 = r5
            r2 = r12
            javassist.bytecode.analysis.Type r1 = r1.zeroExtend(r2)
            r2 = r8
            r0.simplePush(r1, r2)
        L6f:
            return
    }

    private void evalInvokeDynamic(int r6, int r7, javassist.bytecode.analysis.Frame r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            java.lang.String r0 = r0.getInvokeDynamicType(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            javassist.bytecode.analysis.Type[] r0 = r0.paramTypesFromDesc(r1)
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
        L17:
            r0 = r11
            if (r0 <= 0) goto L34
            r0 = r5
            r1 = r5
            r2 = r10
            int r11 = r11 + (-1)
            r3 = r11
            r2 = r2[r3]
            javassist.bytecode.analysis.Type r1 = r1.zeroExtend(r2)
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto L17
        L34:
            r0 = r5
            r1 = r9
            javassist.bytecode.analysis.Type r0 = r0.returnTypeFromDesc(r1)
            r12 = r0
            r0 = r12
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.VOID
            if (r0 == r1) goto L4f
            r0 = r5
            r1 = r5
            r2 = r12
            javassist.bytecode.analysis.Type r1 = r1.zeroExtend(r2)
            r2 = r8
            r0.simplePush(r1, r2)
        L4f:
            return
    }

    private void evalLDC(int r6, javassist.bytecode.analysis.Frame r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            int r0 = r0.getTag(r1)
            r8 = r0
            r0 = r8
            switch(r0) {
                case 3: goto L39;
                case 4: goto L41;
                case 5: goto L49;
                case 6: goto L51;
                case 7: goto L59;
                case 8: goto L30;
                default: goto L62;
            }
        L30:
            r0 = r5
            javassist.bytecode.analysis.Type r0 = r0.STRING_TYPE
            r9 = r0
            goto L8a
        L39:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.INTEGER
            r9 = r0
            goto L8a
        L41:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.FLOAT
            r9 = r0
            goto L8a
        L49:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.LONG
            r9 = r0
            goto L8a
        L51:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.DOUBLE
            r9 = r0
            goto L8a
        L59:
            r0 = r5
            javassist.bytecode.analysis.Type r0 = r0.CLASS_TYPE
            r9 = r0
            goto L8a
        L62:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad LDC [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L8a:
            r0 = r5
            r1 = r9
            r2 = r7
            r0.simplePush(r1, r2)
            return
    }

    private void evalLoad(javassist.bytecode.analysis.Type r6, int r7, javassist.bytecode.analysis.Frame r8, javassist.bytecode.analysis.Subroutine r9) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r8
            r1 = r7
            javassist.bytecode.analysis.Type r0 = r0.getLocal(r1)
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r10
            r0.verifyAssignable(r1, r2)
            r0 = r5
            r1 = r10
            r2 = r8
            r0.simplePush(r1, r2)
            r0 = r5
            r1 = r7
            r2 = r10
            r3 = r9
            r0.access(r1, r2, r3)
            return
    }

    private void evalNewArray(int r6, javassist.bytecode.CodeIterator r7, javassist.bytecode.analysis.Frame r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = 0
            r9 = r0
            r0 = r7
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r10 = r0
            r0 = r10
            switch(r0) {
                case 4: goto L48;
                case 5: goto L54;
                case 6: goto L90;
                case 7: goto L9c;
                case 8: goto L60;
                case 9: goto L6c;
                case 10: goto L78;
                case 11: goto L84;
                default: goto La8;
            }
        L48:
            r0 = r5
            java.lang.String r1 = "boolean[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        L54:
            r0 = r5
            java.lang.String r1 = "char[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        L60:
            r0 = r5
            java.lang.String r1 = "byte[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        L6c:
            r0 = r5
            java.lang.String r1 = "short[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        L78:
            r0 = r5
            java.lang.String r1 = "int[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        L84:
            r0 = r5
            java.lang.String r1 = "long[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        L90:
            r0 = r5
            java.lang.String r1 = "float[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        L9c:
            r0 = r5
            java.lang.String r1 = "double[]"
            javassist.bytecode.analysis.Type r0 = r0.getType(r1)
            r9 = r0
            goto Lce
        La8:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid array type [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lce:
            r0 = r8
            r1 = r9
            r0.push(r1)
            return
    }

    private void evalNewObjectArray(int r7, javassist.bytecode.CodeIterator r8, javassist.bytecode.analysis.Frame r9) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r8
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)
            java.lang.String r1 = r1.getClassInfo(r2)
            javassist.bytecode.analysis.Type r0 = r0.resolveClassInfo(r1)
            r10 = r0
            r0 = r10
            javassist.CtClass r0 = r0.getCtClass()
            java.lang.String r0 = r0.getName()
            r11 = r0
            r0 = r8
            r1 = r7
            int r0 = r0.byteAt(r1)
            r12 = r0
            r0 = r12
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L39
            r0 = r8
            r1 = r7
            r2 = 3
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r13 = r0
            goto L53
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = 1
            r13 = r0
        L53:
            r0 = r13
            int r13 = r13 + (-1)
            if (r0 <= 0) goto L6a
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r6
            r3 = r9
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            goto L53
        L6a:
            r0 = r6
            r1 = r6
            r2 = r11
            javassist.bytecode.analysis.Type r1 = r1.getType(r2)
            r2 = r9
            r0.simplePush(r1, r2)
            return
    }

    private void evalPutField(int r6, int r7, javassist.bytecode.analysis.Frame r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            java.lang.String r0 = r0.getFieldrefType(r1)
            r9 = r0
            r0 = r5
            r1 = r5
            r2 = r9
            javassist.bytecode.analysis.Type r1 = r1.typeFromDesc(r2)
            javassist.bytecode.analysis.Type r0 = r0.zeroExtend(r1)
            r10 = r0
            r0 = r5
            r1 = r10
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
            r0 = r6
            r1 = 181(0xb5, float:2.54E-43)
            if (r0 != r1) goto L41
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            java.lang.String r1 = r1.getFieldrefClassName(r2)
            javassist.bytecode.analysis.Type r0 = r0.resolveClassInfo(r1)
            r11 = r0
            r0 = r5
            r1 = r11
            r2 = r5
            r3 = r8
            javassist.bytecode.analysis.Type r2 = r2.simplePop(r3)
            r0.verifyAssignable(r1, r2)
        L41:
            return
    }

    private void evalShift(javassist.bytecode.analysis.Type r5, javassist.bytecode.analysis.Frame r6) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            r1 = r6
            javassist.bytecode.analysis.Type r0 = r0.simplePop(r1)
            r7 = r0
            r0 = r4
            r1 = r6
            javassist.bytecode.analysis.Type r0 = r0.simplePop(r1)
            r8 = r0
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r7
            r0.verifyAssignable(r1, r2)
            r0 = r4
            r1 = r5
            r2 = r8
            r0.verifyAssignable(r1, r2)
            r0 = r4
            r1 = r8
            r2 = r6
            r0.simplePush(r1, r2)
            return
    }

    private void evalStore(javassist.bytecode.analysis.Type r6, int r7, javassist.bytecode.analysis.Frame r8, javassist.bytecode.analysis.Subroutine r9) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r8
            javassist.bytecode.analysis.Type r0 = r0.simplePop(r1)
            r10 = r0
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            if (r0 != r1) goto L16
            r0 = r10
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.RETURN_ADDRESS
            if (r0 == r1) goto L1d
        L16:
            r0 = r5
            r1 = r6
            r2 = r10
            r0.verifyAssignable(r1, r2)
        L1d:
            r0 = r5
            r1 = r7
            r2 = r10
            r3 = r8
            r0.simpleSetLocal(r1, r2, r3)
            r0 = r5
            r1 = r7
            r2 = r10
            r3 = r9
            r0.access(r1, r2, r3)
            return
    }

    private void evalWide(int r7, javassist.bytecode.CodeIterator r8, javassist.bytecode.analysis.Frame r9, javassist.bytecode.analysis.Subroutine r10) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r11 = r0
            r0 = r8
            r1 = r7
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r12 = r0
            r0 = r11
            switch(r0) {
                case 21: goto L80;
                case 22: goto L8f;
                case 23: goto L9e;
                case 24: goto Lad;
                case 25: goto Lbc;
                case 54: goto Lcb;
                case 55: goto Lda;
                case 56: goto Le9;
                case 57: goto Lf8;
                case 58: goto L107;
                case 132: goto L116;
                case 169: goto L126;
                default: goto L136;
            }
        L80:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalLoad(r1, r2, r3, r4)
            goto L15c
        L8f:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalLoad(r1, r2, r3, r4)
            goto L15c
        L9e:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalLoad(r1, r2, r3, r4)
            goto L15c
        Lad:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalLoad(r1, r2, r3, r4)
            goto L15c
        Lbc:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalLoad(r1, r2, r3, r4)
            goto L15c
        Lcb:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalStore(r1, r2, r3, r4)
            goto L15c
        Lda:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.LONG
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalStore(r1, r2, r3, r4)
            goto L15c
        Le9:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.FLOAT
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalStore(r1, r2, r3, r4)
            goto L15c
        Lf8:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.DOUBLE
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalStore(r1, r2, r3, r4)
            goto L15c
        L107:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r12
            r3 = r9
            r4 = r10
            r0.evalStore(r1, r2, r3, r4)
            goto L15c
        L116:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.INTEGER
            r2 = r9
            r3 = r12
            javassist.bytecode.analysis.Type r2 = r2.getLocal(r3)
            r0.verifyAssignable(r1, r2)
            goto L15c
        L126:
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.RETURN_ADDRESS
            r2 = r9
            r3 = r12
            javassist.bytecode.analysis.Type r2 = r2.getLocal(r3)
            r0.verifyAssignable(r1, r2)
            goto L15c
        L136:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid WIDE operand [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L15c:
            return
    }

    private javassist.bytecode.analysis.Type getType(java.lang.String r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> Lc
            r1 = r6
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> Lc
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.get(r0)     // Catch: javassist.NotFoundException -> Lc
            return r0
        Lc:
            r7 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not find class [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private javassist.bytecode.analysis.Type[] paramTypesFromDesc(java.lang.String r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.NotFoundException -> Le
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)     // Catch: javassist.NotFoundException -> Le
            r7 = r0
            goto L3a
        Le:
            r8 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not find class in descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = r7
            if (r0 != 0) goto L66
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not obtain parameters for descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r7
            int r0 = r0.length
            javassist.bytecode.analysis.Type[] r0 = new javassist.bytecode.analysis.Type[r0]
            r8 = r0
            r0 = 0
            r9 = r0
        L6f:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L87
            r0 = r8
            r1 = r9
            r2 = r7
            r3 = r9
            r2 = r2[r3]
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.get(r2)
            r0[r1] = r2
            int r9 = r9 + 1
            goto L6f
        L87:
            r0 = r8
            return r0
    }

    private javassist.bytecode.analysis.Type returnTypeFromDesc(java.lang.String r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.NotFoundException -> Le
            javassist.CtClass r0 = javassist.bytecode.Descriptor.getReturnType(r0, r1)     // Catch: javassist.NotFoundException -> Le
            r7 = r0
            goto L3a
        Le:
            r8 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not find class in descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = r7
            if (r0 != 0) goto L66
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not obtain return type for descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r7
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.get(r0)
            return r0
    }

    private javassist.bytecode.analysis.Type simplePeek(javassist.bytecode.analysis.Frame r5) {
            r4 = this;
            r0 = r5
            javassist.bytecode.analysis.Type r0 = r0.peek()
            r6 = r0
            r0 = r6
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            if (r0 != r1) goto L19
            r0 = r5
            r1 = r5
            int r1 = r1.getTopIndex()
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.analysis.Type r0 = r0.getStack(r1)
            goto L1a
        L19:
            r0 = r6
        L1a:
            return r0
    }

    private javassist.bytecode.analysis.Type simplePop(javassist.bytecode.analysis.Frame r4) {
            r3 = this;
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.pop()
            r5 = r0
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            if (r0 != r1) goto L13
            r0 = r4
            javassist.bytecode.analysis.Type r0 = r0.pop()
            goto L14
        L13:
            r0 = r5
        L14:
            return r0
    }

    private void simplePush(javassist.bytecode.analysis.Type r4, javassist.bytecode.analysis.Frame r5) {
            r3 = this;
            r0 = r5
            r1 = r4
            r0.push(r1)
            r0 = r4
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L14
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            r0.push(r1)
        L14:
            return
    }

    private void access(int r5, javassist.bytecode.analysis.Type r6, javassist.bytecode.analysis.Subroutine r7) {
            r4 = this;
            r0 = r7
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r7
            r1 = r5
            r0.access(r1)
            r0 = r6
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L19
            r0 = r7
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0.access(r1)
        L19:
            return
    }

    private void simpleSetLocal(int r5, javassist.bytecode.analysis.Type r6, javassist.bytecode.analysis.Frame r7) {
            r4 = this;
            r0 = r7
            r1 = r5
            r2 = r6
            r0.setLocal(r1, r2)
            r0 = r6
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L18
            r0 = r7
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.TOP
            r0.setLocal(r1, r2)
        L18:
            return
    }

    private javassist.bytecode.analysis.Type resolveClassInfo(java.lang.String r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)     // Catch: javassist.NotFoundException -> L24
            r1 = 91
            if (r0 != r1) goto L18
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.NotFoundException -> L24
            javassist.CtClass r0 = javassist.bytecode.Descriptor.toCtClass(r0, r1)     // Catch: javassist.NotFoundException -> L24
            r7 = r0
            goto L21
        L18:
            r0 = r5
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> L24
            r1 = r6
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L24
            r7 = r0
        L21:
            goto L50
        L24:
            r8 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not find class in descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L50:
            r0 = r7
            if (r0 != 0) goto L7c
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not obtain type for descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L7c:
            r0 = r7
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.get(r0)
            return r0
    }

    private javassist.bytecode.analysis.Type typeFromDesc(java.lang.String r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.NotFoundException -> Le
            javassist.CtClass r0 = javassist.bytecode.Descriptor.toCtClass(r0, r1)     // Catch: javassist.NotFoundException -> Le
            r7 = r0
            goto L3a
        Le:
            r8 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not find class in descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = r7
            if (r0 != 0) goto L66
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Could not obtain type for descriptor [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r7
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.get(r0)
            return r0
    }

    private void verifyAssignable(javassist.bytecode.analysis.Type r6, javassist.bytecode.analysis.Type r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r6
            r1 = r7
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L41
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Expected type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " Got: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.lastPos
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L41:
            return
    }
}
