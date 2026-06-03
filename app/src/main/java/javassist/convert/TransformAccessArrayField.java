package javassist.convert;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/convert/TransformAccessArrayField.class */
public final class TransformAccessArrayField extends javassist.convert.Transformer {
    private final java.lang.String methodClassname;
    private final javassist.CodeConverter.ArrayAccessReplacementMethodNames names;
    private javassist.bytecode.analysis.Frame[] frames;
    private int offset;

    public TransformAccessArrayField(javassist.convert.Transformer r4, java.lang.String r5, javassist.CodeConverter.ArrayAccessReplacementMethodNames r6) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.methodClassname = r1
            r0 = r3
            r1 = r6
            r0.names = r1
            return
    }

    @Override // javassist.convert.Transformer
    public void initialize(javassist.bytecode.ConstPool r9, javassist.CtClass r10, javassist.bytecode.MethodInfo r11) throws javassist.CannotCompileException {
            r8 = this;
            r0 = r11
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r12 = r0
        L9:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Ld6
            r0 = r12
            int r0 = r0.next()     // Catch: java.lang.Exception -> Lca
            r13 = r0
            r0 = r12
            r1 = r13
            int r0 = r0.byteAt(r1)     // Catch: java.lang.Exception -> Lca
            r14 = r0
            r0 = r14
            r1 = 50
            if (r0 != r1) goto L2e
            r0 = r8
            r1 = r10
            r2 = r11
            r0.initFrames(r1, r2)     // Catch: java.lang.Exception -> Lca
        L2e:
            r0 = r14
            r1 = 50
            if (r0 == r1) goto L66
            r0 = r14
            r1 = 51
            if (r0 == r1) goto L66
            r0 = r14
            r1 = 52
            if (r0 == r1) goto L66
            r0 = r14
            r1 = 49
            if (r0 == r1) goto L66
            r0 = r14
            r1 = 48
            if (r0 == r1) goto L66
            r0 = r14
            r1 = 46
            if (r0 == r1) goto L66
            r0 = r14
            r1 = 47
            if (r0 == r1) goto L66
            r0 = r14
            r1 = 53
            if (r0 != r1) goto L7c
        L66:
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r8
            r6 = r14
            java.lang.String r5 = r5.getLoadReplacementSignature(r6)     // Catch: java.lang.Exception -> Lca
            int r0 = r0.replace(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Lca
            r13 = r0
            goto Lc7
        L7c:
            r0 = r14
            r1 = 83
            if (r0 == r1) goto Lb4
            r0 = r14
            r1 = 84
            if (r0 == r1) goto Lb4
            r0 = r14
            r1 = 85
            if (r0 == r1) goto Lb4
            r0 = r14
            r1 = 82
            if (r0 == r1) goto Lb4
            r0 = r14
            r1 = 81
            if (r0 == r1) goto Lb4
            r0 = r14
            r1 = 79
            if (r0 == r1) goto Lb4
            r0 = r14
            r1 = 80
            if (r0 == r1) goto Lb4
            r0 = r14
            r1 = 86
            if (r0 != r1) goto Lc7
        Lb4:
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r8
            r6 = r14
            java.lang.String r5 = r5.getStoreReplacementSignature(r6)     // Catch: java.lang.Exception -> Lca
            int r0 = r0.replace(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Lca
            r13 = r0
        Lc7:
            goto L9
        Lca:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        Ld6:
            return
    }

    @Override // javassist.convert.Transformer
    public void clean() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.frames = r1
            r0 = r3
            r1 = -1
            r0.offset = r1
            return
    }

    @Override // javassist.convert.Transformer
    public int transform(javassist.CtClass r3, int r4, javassist.bytecode.CodeIterator r5, javassist.bytecode.ConstPool r6) throws javassist.bytecode.BadBytecode {
            r2 = this;
            r0 = r4
            return r0
    }

    private javassist.bytecode.analysis.Frame getFrame(int r5) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r5
            r2 = r4
            int r2 = r2.offset
            int r1 = r1 - r2
            r0 = r0[r1]
            return r0
    }

    private void initFrames(javassist.CtClass r6, javassist.bytecode.MethodInfo r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            if (r0 != 0) goto L1c
            r0 = r5
            javassist.bytecode.analysis.Analyzer r1 = new javassist.bytecode.analysis.Analyzer
            r2 = r1
            r2.<init>()
            r2 = r6
            r3 = r7
            javassist.bytecode.analysis.Frame[] r1 = r1.analyze(r2, r3)
            r0.frames = r1
            r0 = r5
            r1 = 0
            r0.offset = r1
        L1c:
            return
    }

    private int updatePos(int r5, int r6) {
            r4 = this;
            r0 = r4
            int r0 = r0.offset
            r1 = -1
            if (r0 <= r1) goto L12
            r0 = r4
            r1 = r0
            int r1 = r1.offset
            r2 = r6
            int r1 = r1 + r2
            r0.offset = r1
        L12:
            r0 = r5
            r1 = r6
            int r0 = r0 + r1
            return r0
    }

    private java.lang.String getTopType(int r4) throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.analysis.Frame r0 = r0.getFrame(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r5
            javassist.bytecode.analysis.Type r0 = r0.peek()
            javassist.CtClass r0 = r0.getCtClass()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1f
            r0 = r6
            java.lang.String r0 = javassist.bytecode.Descriptor.toJvmName(r0)
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    private int replace(javassist.bytecode.ConstPool r6, javassist.bytecode.CodeIterator r7, int r8, int r9, java.lang.String r10) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = 0
            r11 = r0
            r0 = r5
            r1 = r9
            java.lang.String r0 = r0.getMethodName(r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto La5
            r0 = r9
            r1 = 50
            if (r0 != r1) goto L35
            r0 = r5
            r1 = r7
            int r1 = r1.lookAhead()
            java.lang.String r0 = r0.getTopType(r1)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L28
            r0 = r8
            return r0
        L28:
            java.lang.String r0 = "java/lang/Object"
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            r11 = r0
        L35:
            r0 = r7
            r1 = 0
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r7
            r1 = r8
            r2 = r11
            if (r2 == 0) goto L46
            r2 = 5
            goto L47
        L46:
            r2 = 2
        L47:
            r3 = 0
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            r13 = r0
            r0 = r13
            int r0 = r0.position
            r8 = r0
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.methodClassname
            int r0 = r0.addClassInfo(r1)
            r14 = r0
            r0 = r6
            r1 = r14
            r2 = r12
            r3 = r10
            int r0 = r0.addMethodrefInfo(r1, r2, r3)
            r15 = r0
            r0 = r7
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r8
            r0.writeByte(r1, r2)
            r0 = r7
            r1 = r15
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
            r0 = r11
            if (r0 == 0) goto L9a
            r0 = r6
            r1 = r11
            int r0 = r0.addClassInfo(r1)
            r16 = r0
            r0 = r7
            r1 = 192(0xc0, float:2.69E-43)
            r2 = r8
            r3 = 3
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            r0 = r7
            r1 = r16
            r2 = r8
            r3 = 4
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        L9a:
            r0 = r5
            r1 = r8
            r2 = r13
            int r2 = r2.length
            int r0 = r0.updatePos(r1, r2)
            r8 = r0
        La5:
            r0 = r8
            return r0
    }

    private java.lang.String getMethodName(int r4) {
            r3 = this;
            r0 = 0
            r5 = r0
            r0 = r4
            switch(r0) {
                case 46: goto Lf5;
                case 47: goto L10f;
                case 48: goto Le8;
                case 49: goto Ldb;
                case 50: goto Lb4;
                case 51: goto Lc1;
                case 52: goto Lce;
                case 53: goto L102;
                case 54: goto L181;
                case 55: goto L181;
                case 56: goto L181;
                case 57: goto L181;
                case 58: goto L181;
                case 59: goto L181;
                case 60: goto L181;
                case 61: goto L181;
                case 62: goto L181;
                case 63: goto L181;
                case 64: goto L181;
                case 65: goto L181;
                case 66: goto L181;
                case 67: goto L181;
                case 68: goto L181;
                case 69: goto L181;
                case 70: goto L181;
                case 71: goto L181;
                case 72: goto L181;
                case 73: goto L181;
                case 74: goto L181;
                case 75: goto L181;
                case 76: goto L181;
                case 77: goto L181;
                case 78: goto L181;
                case 79: goto L15d;
                case 80: goto L177;
                case 81: goto L150;
                case 82: goto L143;
                case 83: goto L11c;
                case 84: goto L129;
                case 85: goto L136;
                case 86: goto L16a;
                default: goto L181;
            }
        Lb4:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.objectRead()
            r5 = r0
            goto L181
        Lc1:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.byteOrBooleanRead()
            r5 = r0
            goto L181
        Lce:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.charRead()
            r5 = r0
            goto L181
        Ldb:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.doubleRead()
            r5 = r0
            goto L181
        Le8:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.floatRead()
            r5 = r0
            goto L181
        Lf5:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.intRead()
            r5 = r0
            goto L181
        L102:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.shortRead()
            r5 = r0
            goto L181
        L10f:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.longRead()
            r5 = r0
            goto L181
        L11c:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.objectWrite()
            r5 = r0
            goto L181
        L129:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.byteOrBooleanWrite()
            r5 = r0
            goto L181
        L136:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.charWrite()
            r5 = r0
            goto L181
        L143:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.doubleWrite()
            r5 = r0
            goto L181
        L150:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.floatWrite()
            r5 = r0
            goto L181
        L15d:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.intWrite()
            r5 = r0
            goto L181
        L16a:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.shortWrite()
            r5 = r0
            goto L181
        L177:
            r0 = r3
            javassist.CodeConverter$ArrayAccessReplacementMethodNames r0 = r0.names
            java.lang.String r0 = r0.longWrite()
            r5 = r0
        L181:
            java.lang.String r0 = ""
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18c
            r0 = 0
            r5 = r0
        L18c:
            r0 = r5
            return r0
    }

    private java.lang.String getLoadReplacementSignature(int r5) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r5
            switch(r0) {
                case 46: goto L3f;
                case 47: goto L45;
                case 48: goto L3c;
                case 49: goto L39;
                case 50: goto L30;
                case 51: goto L33;
                case 52: goto L36;
                case 53: goto L42;
                default: goto L48;
            }
        L30:
            java.lang.String r0 = "(Ljava/lang/Object;I)Ljava/lang/Object;"
            return r0
        L33:
            java.lang.String r0 = "(Ljava/lang/Object;I)B"
            return r0
        L36:
            java.lang.String r0 = "(Ljava/lang/Object;I)C"
            return r0
        L39:
            java.lang.String r0 = "(Ljava/lang/Object;I)D"
            return r0
        L3c:
            java.lang.String r0 = "(Ljava/lang/Object;I)F"
            return r0
        L3f:
            java.lang.String r0 = "(Ljava/lang/Object;I)I"
            return r0
        L42:
            java.lang.String r0 = "(Ljava/lang/Object;I)S"
            return r0
        L45:
            java.lang.String r0 = "(Ljava/lang/Object;I)J"
            return r0
        L48:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    private java.lang.String getStoreReplacementSignature(int r5) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r5
            switch(r0) {
                case 79: goto L3f;
                case 80: goto L45;
                case 81: goto L3c;
                case 82: goto L39;
                case 83: goto L30;
                case 84: goto L33;
                case 85: goto L36;
                case 86: goto L42;
                default: goto L48;
            }
        L30:
            java.lang.String r0 = "(Ljava/lang/Object;ILjava/lang/Object;)V"
            return r0
        L33:
            java.lang.String r0 = "(Ljava/lang/Object;IB)V"
            return r0
        L36:
            java.lang.String r0 = "(Ljava/lang/Object;IC)V"
            return r0
        L39:
            java.lang.String r0 = "(Ljava/lang/Object;ID)V"
            return r0
        L3c:
            java.lang.String r0 = "(Ljava/lang/Object;IF)V"
            return r0
        L3f:
            java.lang.String r0 = "(Ljava/lang/Object;II)V"
            return r0
        L42:
            java.lang.String r0 = "(Ljava/lang/Object;IS)V"
            return r0
        L45:
            java.lang.String r0 = "(Ljava/lang/Object;IJ)V"
            return r0
        L48:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }
}
