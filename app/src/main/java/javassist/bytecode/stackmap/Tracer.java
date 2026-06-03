package javassist.bytecode.stackmap;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/Tracer.class */
public abstract class Tracer implements javassist.bytecode.stackmap.TypeTag {
    protected javassist.ClassPool classPool;
    protected javassist.bytecode.ConstPool cpool;
    protected java.lang.String returnType;
    protected int stackTop;
    protected javassist.bytecode.stackmap.TypeData[] stackTypes;
    protected javassist.bytecode.stackmap.TypeData[] localsTypes;

    public Tracer(javassist.ClassPool r4, javassist.bytecode.ConstPool r5, int r6, int r7, java.lang.String r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.classPool = r1
            r0 = r3
            r1 = r5
            r0.cpool = r1
            r0 = r3
            r1 = r8
            r0.returnType = r1
            r0 = r3
            r1 = 0
            r0.stackTop = r1
            r0 = r3
            r1 = r6
            javassist.bytecode.stackmap.TypeData[] r1 = javassist.bytecode.stackmap.TypeData.make(r1)
            r0.stackTypes = r1
            r0 = r3
            r1 = r7
            javassist.bytecode.stackmap.TypeData[] r1 = javassist.bytecode.stackmap.TypeData.make(r1)
            r0.localsTypes = r1
            return
    }

    public Tracer(javassist.bytecode.stackmap.Tracer r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            javassist.ClassPool r1 = r1.classPool
            r0.classPool = r1
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.cpool
            r0.cpool = r1
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.returnType
            r0.returnType = r1
            r0 = r3
            r1 = r4
            int r1 = r1.stackTop
            r0.stackTop = r1
            r0 = r3
            r1 = r4
            javassist.bytecode.stackmap.TypeData[] r1 = r1.stackTypes
            int r1 = r1.length
            javassist.bytecode.stackmap.TypeData[] r1 = javassist.bytecode.stackmap.TypeData.make(r1)
            r0.stackTypes = r1
            r0 = r3
            r1 = r4
            javassist.bytecode.stackmap.TypeData[] r1 = r1.localsTypes
            int r1 = r1.length
            javassist.bytecode.stackmap.TypeData[] r1 = javassist.bytecode.stackmap.TypeData.make(r1)
            r0.localsTypes = r1
            return
    }

    protected int doOpcode(int r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            r1 = r6
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L3b
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r8 = r0
            r0 = r8
            r1 = 54
            if (r0 >= r1) goto L16
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.doOpcode0_53(r1, r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L3b
            return r0
        L16:
            r0 = r8
            r1 = 96
            if (r0 >= r1) goto L24
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.doOpcode54_95(r1, r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L3b
            return r0
        L24:
            r0 = r8
            r1 = 148(0x94, float:2.07E-43)
            if (r0 >= r1) goto L33
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.doOpcode96_147(r1, r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L3b
            return r0
        L33:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.doOpcode148_201(r1, r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L3b
            return r0
        L3b:
            r8 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "inconsistent stack height "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
    }

    protected void visitBranch(int r2, byte[] r3, int r4) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    protected void visitGoto(int r2, byte[] r3, int r4) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    protected void visitReturn(int r2, byte[] r3) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    protected void visitThrow(int r2, byte[] r3) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    protected void visitTableSwitch(int r2, byte[] r3, int r4, int r5, int r6) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    protected void visitLookupSwitch(int r2, byte[] r3, int r4, int r5, int r6) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    protected void visitJSR(int r2, byte[] r3) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    protected void visitRET(int r2, byte[] r3) throws javassist.bytecode.BadBytecode {
            r1 = this;
            return
    }

    private int doOpcode0_53(int r7, byte[] r8, int r9) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r11 = r0
            r0 = r9
            switch(r0) {
                case 0: goto Lec;
                case 1: goto Lef;
                case 2: goto L107;
                case 3: goto L107;
                case 4: goto L107;
                case 5: goto L107;
                case 6: goto L107;
                case 7: goto L107;
                case 8: goto L107;
                case 9: goto L11b;
                case 10: goto L11b;
                case 11: goto L140;
                case 12: goto L140;
                case 13: goto L140;
                case 14: goto L154;
                case 15: goto L154;
                case 16: goto L179;
                case 17: goto L179;
                case 18: goto L196;
                case 19: goto L1a5;
                case 20: goto L1a5;
                case 21: goto L1b2;
                case 22: goto L1bc;
                case 23: goto L1c6;
                case 24: goto L1d0;
                case 25: goto L1da;
                case 26: goto L1e8;
                case 27: goto L1e8;
                case 28: goto L1e8;
                case 29: goto L1e8;
                case 30: goto L1fc;
                case 31: goto L1fc;
                case 32: goto L1fc;
                case 33: goto L1fc;
                case 34: goto L221;
                case 35: goto L221;
                case 36: goto L221;
                case 37: goto L221;
                case 38: goto L235;
                case 39: goto L235;
                case 40: goto L235;
                case 41: goto L235;
                case 42: goto L25a;
                case 43: goto L25a;
                case 44: goto L25a;
                case 45: goto L25a;
                case 46: goto L278;
                case 47: goto L28e;
                case 48: goto L2a9;
                case 49: goto L2bf;
                case 50: goto L2da;
                case 51: goto L2fd;
                case 52: goto L2fd;
                case 53: goto L2fd;
                default: goto L313;
            }
        Lec:
            goto L31d
        Lef:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$NullType r2 = new javassist.bytecode.stackmap.TypeData$NullType
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            goto L31d
        L107:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L31d
        L11b:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L31d
        L140:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto L31d
        L154:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L31d
        L179:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            r0 = r9
            r1 = 17
            if (r0 != r1) goto L194
            r0 = 3
            goto L195
        L194:
            r0 = 2
        L195:
            return r0
        L196:
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0.doLDC(r1)
            r0 = 2
            return r0
        L1a5:
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = javassist.bytecode.ByteArray.readU16bit(r1, r2)
            r0.doLDC(r1)
            r0 = 3
            return r0
        L1b2:
            r0 = r6
            javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.Tracer.INTEGER
            r2 = r8
            r3 = r7
            int r0 = r0.doXLOAD(r1, r2, r3)
            return r0
        L1bc:
            r0 = r6
            javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.Tracer.LONG
            r2 = r8
            r3 = r7
            int r0 = r0.doXLOAD(r1, r2, r3)
            return r0
        L1c6:
            r0 = r6
            javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.Tracer.FLOAT
            r2 = r8
            r3 = r7
            int r0 = r0.doXLOAD(r1, r2, r3)
            return r0
        L1d0:
            r0 = r6
            javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r2 = r8
            r3 = r7
            int r0 = r0.doXLOAD(r1, r2, r3)
            return r0
        L1da:
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r0 = r0.doALOAD(r1)
            return r0
        L1e8:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L31d
        L1fc:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L31d
        L221:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto L31d
        L235:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L31d
        L25a:
            r0 = r9
            r1 = 42
            int r0 = r0 - r1
            r10 = r0
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            r2 = r6
            javassist.bytecode.stackmap.TypeData[] r2 = r2.localsTypes
            r3 = r10
            r2 = r2[r3]
            r0[r1] = r2
            goto L31d
        L278:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L31d
        L28e:
            r0 = r11
            r1 = r6
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r11
            r1 = r6
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L31d
        L2a9:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto L31d
        L2bf:
            r0 = r11
            r1 = r6
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r11
            r1 = r6
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L31d
        L2da:
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r2 = r1; r1 = r0; r0 = r2; 
            r1.stackTop = r2
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r11
            r1 = r12
            r2 = r13
            javassist.bytecode.stackmap.TypeData r2 = javassist.bytecode.stackmap.TypeData.ArrayElement.make(r2)
            r0[r1] = r2
            goto L31d
        L2fd:
            r0 = r11
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L31d
        L313:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "fatal"
            r1.<init>(r2)
            throw r0
        L31d:
            r0 = 1
            return r0
    }

    private void doLDC(int r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r8 = r0
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r7
            int r0 = r0.getTag(r1)
            r9 = r0
            r0 = r9
            r1 = 8
            if (r0 != r1) goto L2d
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            java.lang.String r4 = "java.lang.String"
            r3.<init>(r4)
            r0[r1] = r2
            goto L101
        L2d:
            r0 = r9
            r1 = 3
            if (r0 != r1) goto L45
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L101
        L45:
            r0 = r9
            r1 = 4
            if (r0 != r1) goto L5d
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto L101
        L5d:
            r0 = r9
            r1 = 5
            if (r0 != r1) goto L85
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L101
        L85:
            r0 = r9
            r1 = 6
            if (r0 != r1) goto Lae
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            goto L101
        Lae:
            r0 = r9
            r1 = 7
            if (r0 != r1) goto Lcd
            r0 = r8
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            java.lang.String r4 = "java.lang.Class"
            r3.<init>(r4)
            r0[r1] = r2
            goto L101
        Lcd:
            r0 = r9
            r1 = 17
            if (r0 != r1) goto Le6
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r7
            java.lang.String r0 = r0.getDynamicType(r1)
            r10 = r0
            r0 = r6
            r1 = r10
            r0.pushMemberType(r1)
            goto L101
        Le6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad LDC: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L101:
            return
    }

    private int doXLOAD(javassist.bytecode.stackmap.TypeData r5, byte[] r6, int r7) {
            r4 = this;
            r0 = r6
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r8 = r0
            r0 = r4
            r1 = r8
            r2 = r5
            int r0 = r0.doXLOAD(r1, r2)
            return r0
    }

    private int doXLOAD(int r7, javassist.bytecode.stackmap.TypeData r8) {
            r6 = this;
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            r2 = r8
            r0[r1] = r2
            r0 = r8
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L2b
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
        L2b:
            r0 = 2
            return r0
    }

    private int doALOAD(int r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            r2 = r6
            javassist.bytecode.stackmap.TypeData[] r2 = r2.localsTypes
            r3 = r7
            r2 = r2[r3]
            r0[r1] = r2
            r0 = 2
            return r0
    }

    private int doOpcode54_95(int r7, byte[] r8, int r9) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r9
            switch(r0) {
                case 54: goto Lb8;
                case 55: goto Lc2;
                case 56: goto Lcc;
                case 57: goto Ld6;
                case 58: goto Le0;
                case 59: goto Lee;
                case 60: goto Lee;
                case 61: goto Lee;
                case 62: goto Lee;
                case 63: goto L10b;
                case 64: goto L10b;
                case 65: goto L10b;
                case 66: goto L10b;
                case 67: goto L134;
                case 68: goto L134;
                case 69: goto L134;
                case 70: goto L134;
                case 71: goto L151;
                case 72: goto L151;
                case 73: goto L151;
                case 74: goto L151;
                case 75: goto L17a;
                case 76: goto L17a;
                case 77: goto L17a;
                case 78: goto L17a;
                case 79: goto L18a;
                case 80: goto L18a;
                case 81: goto L18a;
                case 82: goto L18a;
                case 83: goto L1a7;
                case 84: goto L1d1;
                case 85: goto L1d1;
                case 86: goto L1d1;
                case 87: goto L1de;
                case 88: goto L1eb;
                case 89: goto L1f8;
                case 90: goto L219;
                case 91: goto L219;
                case 92: goto L24a;
                case 93: goto L25d;
                case 94: goto L25d;
                case 95: goto L2a3;
                default: goto L2d2;
            }
        Lb8:
            r0 = r6
            r1 = r7
            r2 = r8
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.INTEGER
            int r0 = r0.doXSTORE(r1, r2, r3)
            return r0
        Lc2:
            r0 = r6
            r1 = r7
            r2 = r8
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.LONG
            int r0 = r0.doXSTORE(r1, r2, r3)
            return r0
        Lcc:
            r0 = r6
            r1 = r7
            r2 = r8
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.FLOAT
            int r0 = r0.doXSTORE(r1, r2, r3)
            return r0
        Ld6:
            r0 = r6
            r1 = r7
            r2 = r8
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.DOUBLE
            int r0 = r0.doXSTORE(r1, r2, r3)
            return r0
        Le0:
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r0 = r0.doASTORE(r1)
            return r0
        Lee:
            r0 = r9
            r1 = 59
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r10
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L10b:
            r0 = r9
            r1 = 63
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r10
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L134:
            r0 = r9
            r1 = 67
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r10
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L151:
            r0 = r9
            r1 = 71
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r10
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L17a:
            r0 = r9
            r1 = 75
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            r1 = r10
            int r0 = r0.doASTORE(r1)
            goto L2dc
        L18a:
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = r9
            r3 = 80
            if (r2 == r3) goto L19b
            r2 = r9
            r3 = 82
            if (r2 != r3) goto L19f
        L19b:
            r2 = 4
            goto L1a0
        L19f:
            r2 = 3
        L1a0:
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L1a7:
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            int r1 = r1.stackTop
            r2 = 3
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r6
            javassist.bytecode.stackmap.TypeData[] r1 = r1.stackTypes
            r2 = r6
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r2 = r6
            javassist.ClassPool r2 = r2.classPool
            javassist.bytecode.stackmap.TypeData.ArrayElement.aastore(r0, r1, r2)
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 3
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L1d1:
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 3
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L1de:
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L1eb:
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L2dc
        L1f8:
            r0 = r6
            int r0 = r0.stackTop
            r10 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r10
            r2 = r6
            javassist.bytecode.stackmap.TypeData[] r2 = r2.stackTypes
            r3 = r10
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r6
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L2dc
        L219:
            r0 = r9
            r1 = 90
            int r0 = r0 - r1
            r1 = 2
            int r0 = r0 + r1
            r10 = r0
            r0 = r6
            r1 = 1
            r2 = r10
            r0.doDUP_XX(r1, r2)
            r0 = r6
            int r0 = r0.stackTop
            r11 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r11
            r2 = r10
            int r1 = r1 - r2
            r2 = r6
            javassist.bytecode.stackmap.TypeData[] r2 = r2.stackTypes
            r3 = r11
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r6
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L2dc
        L24a:
            r0 = r6
            r1 = 2
            r2 = 2
            r0.doDUP_XX(r1, r2)
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L2dc
        L25d:
            r0 = r9
            r1 = 93
            int r0 = r0 - r1
            r1 = 3
            int r0 = r0 + r1
            r10 = r0
            r0 = r6
            r1 = 2
            r2 = r10
            r0.doDUP_XX(r1, r2)
            r0 = r6
            int r0 = r0.stackTop
            r11 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r11
            r2 = r10
            int r1 = r1 - r2
            r2 = r6
            javassist.bytecode.stackmap.TypeData[] r2 = r2.stackTypes
            r3 = r11
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r11
            r2 = r10
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            javassist.bytecode.stackmap.TypeData[] r2 = r2.stackTypes
            r3 = r11
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r6
            r1 = r11
            r2 = 2
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L2dc
        L2a3:
            r0 = r6
            int r0 = r0.stackTop
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r10
            r2 = r6
            javassist.bytecode.stackmap.TypeData[] r2 = r2.stackTypes
            r3 = r10
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r10
            r2 = 1
            int r1 = r1 - r2
            r2 = r11
            r0[r1] = r2
            goto L2dc
        L2d2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "fatal"
            r1.<init>(r2)
            throw r0
        L2dc:
            r0 = 1
            return r0
    }

    private int doXSTORE(int r5, byte[] r6, javassist.bytecode.stackmap.TypeData r7) {
            r4 = this;
            r0 = r6
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r8 = r0
            r0 = r4
            r1 = r8
            r2 = r7
            int r0 = r0.doXSTORE(r1, r2)
            return r0
    }

    private int doXSTORE(int r5, javassist.bytecode.stackmap.TypeData r6) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r5
            r2 = r6
            r0[r1] = r2
            r0 = r6
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L2d
            r0 = r4
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
        L2d:
            r0 = 2
            return r0
    }

    private int doASTORE(int r6) {
            r5 = this;
            r0 = r5
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r6
            r2 = r5
            javassist.bytecode.stackmap.TypeData[] r2 = r2.stackTypes
            r3 = r5
            int r3 = r3.stackTop
            r2 = r2[r3]
            r0[r1] = r2
            r0 = 2
            return r0
    }

    private void doDUP_XX(int r6, int r7) {
            r5 = this;
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r8 = r0
            r0 = r5
            int r0 = r0.stackTop
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r9
            r1 = r7
            int r0 = r0 - r1
            r10 = r0
        L13:
            r0 = r9
            r1 = r10
            if (r0 <= r1) goto L2a
            r0 = r8
            r1 = r9
            r2 = r6
            int r1 = r1 + r2
            r2 = r8
            r3 = r9
            r2 = r2[r3]
            r0[r1] = r2
            int r9 = r9 + (-1)
            goto L13
        L2a:
            return
    }

    private int doOpcode96_147(int r6, byte[] r7, int r8) {
            r5 = this;
            r0 = r8
            r1 = 131(0x83, float:1.84E-43)
            if (r0 > r1) goto L17
            r0 = r5
            r1 = r0
            int r1 = r1.stackTop
            int[] r2 = javassist.bytecode.Opcode.STACK_GROW
            r3 = r8
            r2 = r2[r3]
            int r1 = r1 + r2
            r0.stackTop = r1
            r0 = 1
            return r0
        L17:
            r0 = r8
            switch(r0) {
                case 132: goto L68;
                case 133: goto L6a;
                case 134: goto L91;
                case 135: goto La2;
                case 136: goto Lc9;
                case 137: goto Le1;
                case 138: goto Lf9;
                case 139: goto L10a;
                case 140: goto L11b;
                case 141: goto L142;
                case 142: goto L169;
                case 143: goto L181;
                case 144: goto L192;
                case 145: goto L1aa;
                case 146: goto L1aa;
                case 147: goto L1aa;
                default: goto L1ad;
            }
        L68:
            r0 = 3
            return r0
        L6a:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r5
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L1b7
        L91:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto L1b7
        La2:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r5
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L1b7
        Lc9:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L1b7
        Le1:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto L1b7
        Lf9:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            goto L1b7
        L10a:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L1b7
        L11b:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r5
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L1b7
        L142:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r5
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 + r2
            r0.stackTop = r1
            goto L1b7
        L169:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L1b7
        L181:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            goto L1b7
        L192:
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto L1b7
        L1aa:
            goto L1b7
        L1ad:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "fatal"
            r1.<init>(r2)
            throw r0
        L1b7:
            r0 = 1
            return r0
    }

    private int doOpcode148_201(int r10, byte[] r11, int r12) throws javassist.bytecode.BadBytecode {
            r9 = this;
            r0 = r12
            switch(r0) {
                case 148: goto Le8;
                case 149: goto L103;
                case 150: goto L103;
                case 151: goto L11b;
                case 152: goto L11b;
                case 153: goto L136;
                case 154: goto L136;
                case 155: goto L136;
                case 156: goto L136;
                case 157: goto L136;
                case 158: goto L136;
                case 159: goto L14f;
                case 160: goto L14f;
                case 161: goto L14f;
                case 162: goto L14f;
                case 163: goto L14f;
                case 164: goto L14f;
                case 165: goto L14f;
                case 166: goto L14f;
                case 167: goto L168;
                case 168: goto L177;
                case 169: goto L17f;
                case 170: goto L187;
                case 171: goto L1d6;
                case 172: goto L212;
                case 173: goto L225;
                case 174: goto L238;
                case 175: goto L24b;
                case 176: goto L25e;
                case 177: goto L282;
                case 178: goto L28b;
                case 179: goto L293;
                case 180: goto L29b;
                case 181: goto L2a3;
                case 182: goto L2ab;
                case 183: goto L2ab;
                case 184: goto L2b3;
                case 185: goto L2bb;
                case 186: goto L2c2;
                case 187: goto L2c9;
                case 188: goto L2f5;
                case 189: goto L2fc;
                case 190: goto L36c;
                case 191: goto L391;
                case 192: goto L3b4;
                case 193: goto L3f4;
                case 194: goto L404;
                case 195: goto L404;
                case 196: goto L411;
                case 197: goto L418;
                case 198: goto L41f;
                case 199: goto L41f;
                case 200: goto L438;
                case 201: goto L447;
                default: goto L44f;
            }
        Le8:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            int r1 = r1.stackTop
            r2 = 4
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 3
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L44f
        L103:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L44f
        L11b:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            int r1 = r1.stackTop
            r2 = 4
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 3
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L44f
        L136:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r11
            r4 = r10
            r5 = 1
            int r4 = r4 + r5
            int r3 = javassist.bytecode.ByteArray.readS16bit(r3, r4)
            r0.visitBranch(r1, r2, r3)
            r0 = 3
            return r0
        L14f:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r11
            r4 = r10
            r5 = 1
            int r4 = r4 + r5
            int r3 = javassist.bytecode.ByteArray.readS16bit(r3, r4)
            r0.visitBranch(r1, r2, r3)
            r0 = 3
            return r0
        L168:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r11
            r4 = r10
            r5 = 1
            int r4 = r4 + r5
            int r3 = javassist.bytecode.ByteArray.readS16bit(r3, r4)
            r0.visitGoto(r1, r2, r3)
            r0 = 3
            return r0
        L177:
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitJSR(r1, r2)
            r0 = 3
            return r0
        L17f:
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitRET(r1, r2)
            r0 = 2
            return r0
        L187:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r10
            r1 = -4
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 + r1
            r13 = r0
            r0 = r11
            r1 = r13
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r14 = r0
            r0 = r11
            r1 = r13
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r15 = r0
            r0 = r15
            r1 = r14
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r16 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r16
            r4 = r13
            r5 = 8
            int r4 = r4 + r5
            r5 = r11
            r6 = r13
            r7 = 4
            int r6 = r6 - r7
            int r5 = javassist.bytecode.ByteArray.read32bit(r5, r6)
            r0.visitTableSwitch(r1, r2, r3, r4, r5)
            r0 = r16
            r1 = 4
            int r0 = r0 * r1
            r1 = 16
            int r0 = r0 + r1
            r1 = r10
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            return r0
        L1d6:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r10
            r1 = -4
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 + r1
            r13 = r0
            r0 = r11
            r1 = r13
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r14 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r14
            r4 = r13
            r5 = 4
            int r4 = r4 + r5
            r5 = r11
            r6 = r13
            r7 = 4
            int r6 = r6 - r7
            int r5 = javassist.bytecode.ByteArray.read32bit(r5, r6)
            r0.visitLookupSwitch(r1, r2, r3, r4, r5)
            r0 = r14
            r1 = 8
            int r0 = r0 * r1
            r1 = 12
            int r0 = r0 + r1
            r1 = r10
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            return r0
        L212:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitReturn(r1, r2)
            goto L44f
        L225:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitReturn(r1, r2)
            goto L44f
        L238:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitReturn(r1, r2)
            goto L44f
        L24b:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitReturn(r1, r2)
            goto L44f
        L25e:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r0 = r0[r1]
            r1 = r9
            java.lang.String r1 = r1.returnType
            r2 = r9
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitReturn(r1, r2)
            goto L44f
        L282:
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitReturn(r1, r2)
            goto L44f
        L28b:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = 0
            int r0 = r0.doGetField(r1, r2, r3)
            return r0
        L293:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = 0
            int r0 = r0.doPutField(r1, r2, r3)
            return r0
        L29b:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = 1
            int r0 = r0.doGetField(r1, r2, r3)
            return r0
        L2a3:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = 1
            int r0 = r0.doPutField(r1, r2, r3)
            return r0
        L2ab:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = 1
            int r0 = r0.doInvokeMethod(r1, r2, r3)
            return r0
        L2b3:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = 0
            int r0 = r0.doInvokeMethod(r1, r2, r3)
            return r0
        L2bb:
            r0 = r9
            r1 = r10
            r2 = r11
            int r0 = r0.doInvokeIntfMethod(r1, r2)
            return r0
        L2c2:
            r0 = r9
            r1 = r10
            r2 = r11
            int r0 = r0.doInvokeDynamic(r1, r2)
            return r0
        L2c9:
            r0 = r11
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r13 = r0
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            r2 = r1
            int r2 = r2.stackTop
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.stackTop = r3
            javassist.bytecode.stackmap.TypeData$UninitData r2 = new javassist.bytecode.stackmap.TypeData$UninitData
            r3 = r2
            r4 = r10
            r5 = r9
            javassist.bytecode.ConstPool r5 = r5.cpool
            r6 = r13
            java.lang.String r5 = r5.getClassInfo(r6)
            r3.<init>(r4, r5)
            r0[r1] = r2
            r0 = 3
            return r0
        L2f5:
            r0 = r9
            r1 = r10
            r2 = r11
            int r0 = r0.doNEWARRAY(r1, r2)
            return r0
        L2fc:
            r0 = r11
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r13 = r0
            r0 = r9
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r13
            java.lang.String r0 = r0.getClassInfo(r1)
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            r14 = r0
            r0 = r14
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L33b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14 = r0
            goto L356
        L33b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "[L"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14 = r0
        L356:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r14
            r3.<init>(r4)
            r0[r1] = r2
            r0 = 3
            return r0
        L36c:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            java.lang.String r1 = "[Ljava.lang.Object;"
            r2 = r9
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            goto L44f
        L391:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r0 = r0[r1]
            java.lang.String r1 = "java.lang.Throwable"
            r2 = r9
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitThrow(r1, r2)
            goto L44f
        L3b4:
            r0 = r11
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r13 = r0
            r0 = r9
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r13
            java.lang.String r0 = r0.getClassInfo(r1)
            r14 = r0
            r0 = r14
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L3de
            r0 = r14
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            r14 = r0
        L3de:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r14
            r3.<init>(r4)
            r0[r1] = r2
            r0 = 3
            return r0
        L3f4:
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
            r0 = 3
            return r0
        L404:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L44f
        L411:
            r0 = r9
            r1 = r10
            r2 = r11
            int r0 = r0.doWIDE(r1, r2)
            return r0
        L418:
            r0 = r9
            r1 = r10
            r2 = r11
            int r0 = r0.doMultiANewArray(r1, r2)
            return r0
        L41f:
            r0 = r9
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r11
            r4 = r10
            r5 = 1
            int r4 = r4 + r5
            int r3 = javassist.bytecode.ByteArray.readS16bit(r3, r4)
            r0.visitBranch(r1, r2, r3)
            r0 = 3
            return r0
        L438:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r11
            r4 = r10
            r5 = 1
            int r4 = r4 + r5
            int r3 = javassist.bytecode.ByteArray.read32bit(r3, r4)
            r0.visitGoto(r1, r2, r3)
            r0 = 5
            return r0
        L447:
            r0 = r9
            r1 = r10
            r2 = r11
            r0.visitJSR(r1, r2)
            r0 = 5
            return r0
        L44f:
            r0 = 1
            return r0
    }

    private int doWIDE(int r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r8 = r0
            r0 = r8
            switch(r0) {
                case 21: goto L74;
                case 22: goto L80;
                case 23: goto L8c;
                case 24: goto L98;
                case 25: goto La4;
                case 54: goto Lb7;
                case 55: goto Lc3;
                case 56: goto Lcf;
                case 57: goto Ldb;
                case 58: goto Le7;
                case 132: goto Lfa;
                case 169: goto Lfd;
                default: goto L106;
            }
        L74:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0.doWIDE_XLOAD(r1, r2, r3)
            goto L122
        L80:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.LONG
            r0.doWIDE_XLOAD(r1, r2, r3)
            goto L122
        L8c:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0.doWIDE_XLOAD(r1, r2, r3)
            goto L122
        L98:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0.doWIDE_XLOAD(r1, r2, r3)
            goto L122
        La4:
            r0 = r7
            r1 = r6
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r9 = r0
            r0 = r5
            r1 = r9
            int r0 = r0.doALOAD(r1)
            goto L122
        Lb7:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0.doWIDE_STORE(r1, r2, r3)
            goto L122
        Lc3:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.LONG
            r0.doWIDE_STORE(r1, r2, r3)
            goto L122
        Lcf:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0.doWIDE_STORE(r1, r2, r3)
            goto L122
        Ldb:
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.TypeData$BasicType r3 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0.doWIDE_STORE(r1, r2, r3)
            goto L122
        Le7:
            r0 = r7
            r1 = r6
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r9 = r0
            r0 = r5
            r1 = r9
            int r0 = r0.doASTORE(r1)
            goto L122
        Lfa:
            r0 = 6
            return r0
        Lfd:
            r0 = r5
            r1 = r6
            r2 = r7
            r0.visitRET(r1, r2)
            goto L122
        L106:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad WIDE instruction: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L122:
            r0 = 4
            return r0
    }

    private void doWIDE_XLOAD(int r5, byte[] r6, javassist.bytecode.stackmap.TypeData r7) {
            r4 = this;
            r0 = r6
            r1 = r5
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r8 = r0
            r0 = r4
            r1 = r8
            r2 = r7
            int r0 = r0.doXLOAD(r1, r2)
            return
    }

    private void doWIDE_STORE(int r5, byte[] r6, javassist.bytecode.stackmap.TypeData r7) {
            r4 = this;
            r0 = r6
            r1 = r5
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r8 = r0
            r0 = r4
            r1 = r8
            r2 = r7
            int r0 = r0.doXSTORE(r1, r2)
            return
    }

    private int doPutField(int r5, byte[] r6, boolean r7) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r6
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r8 = r0
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r8
            java.lang.String r0 = r0.getFieldrefType(r1)
            r9 = r0
            r0 = r4
            r1 = r0
            int r1 = r1.stackTop
            r2 = r9
            int r2 = javassist.bytecode.Descriptor.dataSize(r2)
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r9
            r1 = 0
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            r1 = 76
            if (r0 != r1) goto L4a
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r4
            int r1 = r1.stackTop
            r0 = r0[r1]
            r1 = r9
            r2 = 0
            java.lang.String r1 = getFieldClassName(r1, r2)
            r2 = r4
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
            goto L63
        L4a:
            r0 = r10
            r1 = 91
            if (r0 != r1) goto L63
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r4
            int r1 = r1.stackTop
            r0 = r0[r1]
            r1 = r9
            r2 = r4
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
        L63:
            r0 = r4
            r1 = r7
            r2 = r8
            r0.setFieldTarget(r1, r2)
            r0 = 3
            return r0
    }

    private int doGetField(int r5, byte[] r6, boolean r7) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r6
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r8 = r0
            r0 = r4
            r1 = r7
            r2 = r8
            r0.setFieldTarget(r1, r2)
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r8
            java.lang.String r0 = r0.getFieldrefType(r1)
            r9 = r0
            r0 = r4
            r1 = r9
            r0.pushMemberType(r1)
            r0 = 3
            return r0
    }

    private void setFieldTarget(boolean r6, int r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L25
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r7
            java.lang.String r0 = r0.getFieldrefClassName(r1)
            r8 = r0
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r0 = r0[r1]
            r1 = r8
            r2 = r5
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
        L25:
            return
    }

    private int doNEWARRAY(int r7, byte[] r8) {
            r6 = this;
            r0 = r6
            int r0 = r0.stackTop
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 4: goto L40;
                case 5: goto L48;
                case 6: goto L50;
                case 7: goto L58;
                case 8: goto L60;
                case 9: goto L68;
                case 10: goto L70;
                case 11: goto L78;
                default: goto L80;
            }
        L40:
            java.lang.String r0 = "[Z"
            r10 = r0
            goto L8b
        L48:
            java.lang.String r0 = "[C"
            r10 = r0
            goto L8b
        L50:
            java.lang.String r0 = "[F"
            r10 = r0
            goto L8b
        L58:
            java.lang.String r0 = "[D"
            r10 = r0
            goto L8b
        L60:
            java.lang.String r0 = "[B"
            r10 = r0
            goto L8b
        L68:
            java.lang.String r0 = "[S"
            r10 = r0
            goto L8b
        L70:
            java.lang.String r0 = "[I"
            r10 = r0
            goto L8b
        L78:
            java.lang.String r0 = "[J"
            r10 = r0
            goto L8b
        L80:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "bad newarray"
            r1.<init>(r2)
            throw r0
        L8b:
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r9
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r10
            r3.<init>(r4)
            r0[r1] = r2
            r0 = 2
            return r0
    }

    private int doMultiANewArray(int r7, byte[] r8) {
            r6 = this;
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 3
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r10 = r0
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = r10
            r3 = 1
            int r2 = r2 - r3
            int r1 = r1 - r2
            r0.stackTop = r1
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r9
            java.lang.String r0 = r0.getClassInfo(r1)
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            r11 = r0
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r11
            r3.<init>(r4)
            r0[r1] = r2
            r0 = 4
            return r0
    }

    private int doInvokeMethod(int r6, byte[] r7, boolean r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r9 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r9
            java.lang.String r0 = r0.getMethodrefType(r1)
            r10 = r0
            r0 = r5
            r1 = r10
            r2 = 1
            r0.checkParamTypes(r1, r2)
            r0 = r8
            if (r0 == 0) goto L7e
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r9
            java.lang.String r0 = r0.getMethodrefClassName(r1)
            r11 = r0
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.UninitTypeVar
            if (r0 == 0) goto L5d
            r0 = r12
            boolean r0 = r0.isUninit()
            if (r0 == 0) goto L5d
            r0 = r5
            r1 = r12
            r2 = r12
            javassist.bytecode.stackmap.TypeData$UninitTypeVar r2 = (javassist.bytecode.stackmap.TypeData.UninitTypeVar) r2
            int r2 = r2.offset()
            r0.constructorCalled(r1, r2)
            goto L73
        L5d:
            r0 = r12
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.UninitData
            if (r0 == 0) goto L73
            r0 = r5
            r1 = r12
            r2 = r12
            javassist.bytecode.stackmap.TypeData$UninitData r2 = (javassist.bytecode.stackmap.TypeData.UninitData) r2
            int r2 = r2.offset()
            r0.constructorCalled(r1, r2)
        L73:
            r0 = r12
            r1 = r11
            r2 = r5
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
        L7e:
            r0 = r5
            r1 = r10
            r0.pushMemberType(r1)
            r0 = 3
            return r0
    }

    private void constructorCalled(javassist.bytecode.stackmap.TypeData r4, int r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            r0.constructorCalled(r1)
            r0 = 0
            r6 = r0
        L7:
            r0 = r6
            r1 = r3
            int r1 = r1.stackTop
            if (r0 >= r1) goto L1f
            r0 = r3
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            r0 = r0[r1]
            r1 = r5
            r0.constructorCalled(r1)
            int r6 = r6 + 1
            goto L7
        L1f:
            r0 = 0
            r6 = r0
        L21:
            r0 = r6
            r1 = r3
            javassist.bytecode.stackmap.TypeData[] r1 = r1.localsTypes
            int r1 = r1.length
            if (r0 >= r1) goto L3a
            r0 = r3
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r6
            r0 = r0[r1]
            r1 = r5
            r0.constructorCalled(r1)
            int r6 = r6 + 1
            goto L21
        L3a:
            return
    }

    private int doInvokeIntfMethod(int r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r8 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r8
            java.lang.String r0 = r0.getInterfaceMethodrefType(r1)
            r9 = r0
            r0 = r5
            r1 = r9
            r2 = 1
            r0.checkParamTypes(r1, r2)
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r8
            java.lang.String r0 = r0.getInterfaceMethodrefClassName(r1)
            r10 = r0
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r5
            r2 = r1
            int r2 = r2.stackTop
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.stackTop = r3
            r0 = r0[r1]
            r1 = r10
            r2 = r5
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
            r0 = r5
            r1 = r9
            r0.pushMemberType(r1)
            r0 = 5
            return r0
    }

    private int doInvokeDynamic(int r5, byte[] r6) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r6
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r7 = r0
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r7
            java.lang.String r0 = r0.getInvokeDynamicType(r1)
            r8 = r0
            r0 = r4
            r1 = r8
            r2 = 1
            r0.checkParamTypes(r1, r2)
            r0 = r4
            r1 = r8
            r0.pushMemberType(r1)
            r0 = 5
            return r0
    }

    private void pushMemberType(java.lang.String r8) {
            r7 = this;
            r0 = 0
            r9 = r0
            r0 = r8
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 != r1) goto L36
            r0 = r8
            r1 = 41
            int r0 = r0.indexOf(r1)
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = 1
            if (r0 >= r1) goto L36
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad descriptor: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L36:
            r0 = r7
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r10 = r0
            r0 = r7
            int r0 = r0.stackTop
            r11 = r0
            r0 = r8
            r1 = r9
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 68: goto Lcb;
                case 70: goto Lc1;
                case 74: goto La6;
                case 76: goto L93;
                case 86: goto Le6;
                case 91: goto L80;
                default: goto Le7;
            }
        L80:
            r0 = r10
            r1 = r11
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r8
            r5 = r9
            java.lang.String r4 = r4.substring(r5)
            r3.<init>(r4)
            r0[r1] = r2
            goto Lee
        L93:
            r0 = r10
            r1 = r11
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r8
            r5 = r9
            java.lang.String r4 = getFieldClassName(r4, r5)
            r3.<init>(r4)
            r0[r1] = r2
            goto Lee
        La6:
            r0 = r10
            r1 = r11
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.LONG
            r0[r1] = r2
            r0 = r10
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r7
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 + r2
            r0.stackTop = r1
            return
        Lc1:
            r0 = r10
            r1 = r11
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.FLOAT
            r0[r1] = r2
            goto Lee
        Lcb:
            r0 = r10
            r1 = r11
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.DOUBLE
            r0[r1] = r2
            r0 = r10
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.TOP
            r0[r1] = r2
            r0 = r7
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 + r2
            r0.stackTop = r1
            return
        Le6:
            return
        Le7:
            r0 = r10
            r1 = r11
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.Tracer.INTEGER
            r0[r1] = r2
        Lee:
            r0 = r7
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 + r2
            r0.stackTop = r1
            return
    }

    private static java.lang.String getFieldClassName(java.lang.String r5, int r6) {
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r5
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    private void checkParamTypes(java.lang.String r7, int r8) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r7
            r1 = r8
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 41
            if (r0 != r1) goto Ld
            return
        Ld:
            r0 = r8
            r10 = r0
            r0 = 0
            r11 = r0
        L13:
            r0 = r9
            r1 = 91
            if (r0 != r1) goto L29
            r0 = 1
            r11 = r0
            r0 = r7
            int r10 = r10 + 1
            r1 = r10
            char r0 = r0.charAt(r1)
            r9 = r0
            goto L13
        L29:
            r0 = r9
            r1 = 76
            if (r0 != r1) goto L4b
            r0 = r7
            r1 = 59
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            if (r0 > 0) goto L4e
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "bad descriptor"
            r1.<init>(r2)
            throw r0
        L4b:
            int r10 = r10 + 1
        L4e:
            r0 = r6
            r1 = r7
            r2 = r10
            r0.checkParamTypes(r1, r2)
            r0 = r11
            if (r0 != 0) goto L73
            r0 = r9
            r1 = 74
            if (r0 == r1) goto L66
            r0 = r9
            r1 = 68
            if (r0 != r1) goto L73
        L66:
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 2
            int r1 = r1 - r2
            r0.stackTop = r1
            goto L7d
        L73:
            r0 = r6
            r1 = r0
            int r1 = r1.stackTop
            r2 = 1
            int r1 = r1 - r2
            r0.stackTop = r1
        L7d:
            r0 = r11
            if (r0 == 0) goto L9c
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            int r1 = r1.stackTop
            r0 = r0[r1]
            r1 = r7
            r2 = r8
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            r2 = r6
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
            goto Lc4
        L9c:
            r0 = r9
            r1 = 76
            if (r0 != r1) goto Lc4
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r6
            int r1 = r1.stackTop
            r0 = r0[r1]
            r1 = r7
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r3 = r10
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)
            r2 = r6
            javassist.ClassPool r2 = r2.classPool
            r0.setType(r1, r2)
        Lc4:
            return
    }
}
