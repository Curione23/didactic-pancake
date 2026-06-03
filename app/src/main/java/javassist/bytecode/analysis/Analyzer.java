package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Analyzer.class */
public class Analyzer implements javassist.bytecode.Opcode {
    private final javassist.bytecode.analysis.SubroutineScanner scanner;
    private javassist.CtClass clazz;
    private javassist.bytecode.analysis.Analyzer.ExceptionInfo[] exceptions;
    private javassist.bytecode.analysis.Frame[] frames;
    private javassist.bytecode.analysis.Subroutine[] subroutines;

    /* JADX INFO: renamed from: javassist.bytecode.analysis.Analyzer$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Analyzer$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Analyzer$ExceptionInfo.class */
    private static class ExceptionInfo {
        private int end;
        private int handler;
        private int start;
        private javassist.bytecode.analysis.Type type;

        private ExceptionInfo(int r4, int r5, int r6, javassist.bytecode.analysis.Type r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.start = r1
                r0 = r3
                r1 = r5
                r0.end = r1
                r0 = r3
                r1 = r6
                r0.handler = r1
                r0 = r3
                r1 = r7
                r0.type = r1
                return
        }

        /* synthetic */ ExceptionInfo(int r7, int r8, int r9, javassist.bytecode.analysis.Type r10, javassist.bytecode.analysis.Analyzer.AnonymousClass1 r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                return
        }

        static /* synthetic */ int access$100(javassist.bytecode.analysis.Analyzer.ExceptionInfo r2) {
                r0 = r2
                int r0 = r0.start
                return r0
        }

        static /* synthetic */ int access$200(javassist.bytecode.analysis.Analyzer.ExceptionInfo r2) {
                r0 = r2
                int r0 = r0.end
                return r0
        }

        static /* synthetic */ javassist.bytecode.analysis.Type access$300(javassist.bytecode.analysis.Analyzer.ExceptionInfo r2) {
                r0 = r2
                javassist.bytecode.analysis.Type r0 = r0.type
                return r0
        }

        static /* synthetic */ int access$400(javassist.bytecode.analysis.Analyzer.ExceptionInfo r2) {
                r0 = r2
                int r0 = r0.handler
                return r0
        }
    }

    public Analyzer() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            javassist.bytecode.analysis.SubroutineScanner r1 = new javassist.bytecode.analysis.SubroutineScanner
            r2 = r1
            r2.<init>()
            r0.scanner = r1
            return
    }

    public javassist.bytecode.analysis.Frame[] analyze(javassist.CtClass r8, javassist.bytecode.MethodInfo r9) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.clazz = r1
            r0 = r9
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r10
            int r0 = r0.getMaxLocals()
            r11 = r0
            r0 = r10
            int r0 = r0.getMaxStack()
            r12 = r0
            r0 = r10
            int r0 = r0.getCodeLength()
            r13 = r0
            r0 = r10
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r14 = r0
            javassist.bytecode.analysis.IntQueue r0 = new javassist.bytecode.analysis.IntQueue
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r7
            r1 = r7
            r2 = r9
            javassist.bytecode.analysis.Analyzer$ExceptionInfo[] r1 = r1.buildExceptionInfo(r2)
            r0.exceptions = r1
            r0 = r7
            r1 = r7
            javassist.bytecode.analysis.SubroutineScanner r1 = r1.scanner
            r2 = r9
            javassist.bytecode.analysis.Subroutine[] r1 = r1.scan(r2)
            r0.subroutines = r1
            javassist.bytecode.analysis.Executor r0 = new javassist.bytecode.analysis.Executor
            r1 = r0
            r2 = r8
            javassist.ClassPool r2 = r2.getClassPool()
            r3 = r9
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r7
            r1 = r13
            javassist.bytecode.analysis.Frame[] r1 = new javassist.bytecode.analysis.Frame[r1]
            r0.frames = r1
            r0 = r7
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r14
            int r1 = r1.lookAhead()
            r2 = r7
            r3 = r9
            r4 = r11
            r5 = r12
            javassist.bytecode.analysis.Frame r2 = r2.firstFrame(r3, r4, r5)
            r0[r1] = r2
            r0 = r15
            r1 = r14
            int r1 = r1.next()
            r0.add(r1)
        L7d:
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L93
            r0 = r7
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r16
            r0.analyzeNextEntry(r1, r2, r3, r4)
            goto L7d
        L93:
            r0 = r7
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            return r0
    }

    public javassist.bytecode.analysis.Frame[] analyze(javassist.CtMethod r5) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            r2 = r5
            javassist.bytecode.MethodInfo r2 = r2.getMethodInfo2()
            javassist.bytecode.analysis.Frame[] r0 = r0.analyze(r1, r2)
            return r0
    }

    private void analyzeNextEntry(javassist.bytecode.MethodInfo r10, javassist.bytecode.CodeIterator r11, javassist.bytecode.analysis.IntQueue r12, javassist.bytecode.analysis.Executor r13) throws javassist.bytecode.BadBytecode {
            r9 = this;
            r0 = r12
            int r0 = r0.take()
            r14 = r0
            r0 = r11
            r1 = r14
            r0.move(r1)
            r0 = r11
            int r0 = r0.next()
            r0 = r9
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r14
            r0 = r0[r1]
            javassist.bytecode.analysis.Frame r0 = r0.copy()
            r15 = r0
            r0 = r9
            javassist.bytecode.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r14
            r0 = r0[r1]
            r16 = r0
            r0 = r13
            r1 = r10
            r2 = r14
            r3 = r11
            r4 = r15
            r5 = r16
            r0.execute(r1, r2, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L36
            goto L63
        L36:
            r17 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r17
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "[pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r14
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r17
            r1.<init>(r2, r3)
            throw r0
        L63:
            r0 = r11
            r1 = r14
            int r0 = r0.byteAt(r1)
            r17 = r0
            r0 = r17
            r1 = 170(0xaa, float:2.38E-43)
            if (r0 != r1) goto L80
            r0 = r9
            r1 = r12
            r2 = r14
            r3 = r11
            r4 = r15
            r0.mergeTableSwitch(r1, r2, r3, r4)
            goto L123
        L80:
            r0 = r17
            r1 = 171(0xab, float:2.4E-43)
            if (r0 != r1) goto L95
            r0 = r9
            r1 = r12
            r2 = r14
            r3 = r11
            r4 = r15
            r0.mergeLookupSwitch(r1, r2, r3, r4)
            goto L123
        L95:
            r0 = r17
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 != r1) goto Lac
            r0 = r9
            r1 = r12
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r0.mergeRet(r1, r2, r3, r4, r5)
            goto L123
        Lac:
            r0 = r17
            boolean r0 = javassist.bytecode.analysis.Util.isJumpInstruction(r0)
            if (r0 == 0) goto L105
            r0 = r14
            r1 = r11
            int r0 = javassist.bytecode.analysis.Util.getJumpTarget(r0, r1)
            r18 = r0
            r0 = r17
            boolean r0 = javassist.bytecode.analysis.Util.isJsr(r0)
            if (r0 == 0) goto Le3
            r0 = r9
            r1 = r12
            r2 = r9
            javassist.bytecode.analysis.Frame[] r2 = r2.frames
            r3 = r14
            r2 = r2[r3]
            r3 = r9
            javassist.bytecode.analysis.Subroutine[] r3 = r3.subroutines
            r4 = r18
            r3 = r3[r4]
            r4 = r14
            r5 = r9
            r6 = r11
            r7 = r14
            int r5 = r5.lookAhead(r6, r7)
            r0.mergeJsr(r1, r2, r3, r4, r5)
            goto Lf9
        Le3:
            r0 = r17
            boolean r0 = javassist.bytecode.analysis.Util.isGoto(r0)
            if (r0 != 0) goto Lf9
            r0 = r9
            r1 = r12
            r2 = r15
            r3 = r9
            r4 = r11
            r5 = r14
            int r3 = r3.lookAhead(r4, r5)
            r0.merge(r1, r2, r3)
        Lf9:
            r0 = r9
            r1 = r12
            r2 = r15
            r3 = r18
            r0.merge(r1, r2, r3)
            goto L123
        L105:
            r0 = r17
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 == r1) goto L123
            r0 = r17
            boolean r0 = javassist.bytecode.analysis.Util.isReturn(r0)
            if (r0 != 0) goto L123
            r0 = r9
            r1 = r12
            r2 = r15
            r3 = r9
            r4 = r11
            r5 = r14
            int r3 = r3.lookAhead(r4, r5)
            r0.merge(r1, r2, r3)
        L123:
            r0 = r9
            r1 = r12
            r2 = r10
            r3 = r14
            r4 = r15
            r0.mergeExceptionHandlers(r1, r2, r3, r4)
            return
    }

    private javassist.bytecode.analysis.Analyzer.ExceptionInfo[] buildExceptionInfo(javassist.bytecode.MethodInfo r11) {
            r10 = this;
            r0 = r11
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r12 = r0
            r0 = r10
            javassist.CtClass r0 = r0.clazz
            javassist.ClassPool r0 = r0.getClassPool()
            r13 = r0
            r0 = r11
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()
            r14 = r0
            r0 = r14
            int r0 = r0.size()
            javassist.bytecode.analysis.Analyzer$ExceptionInfo[] r0 = new javassist.bytecode.analysis.Analyzer.ExceptionInfo[r0]
            r15 = r0
            r0 = 0
            r16 = r0
        L23:
            r0 = r16
            r1 = r14
            int r1 = r1.size()
            if (r0 >= r1) goto L8c
            r0 = r14
            r1 = r16
            int r0 = r0.catchType(r1)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L41
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.THROWABLE     // Catch: javassist.NotFoundException -> L53
            goto L4e
        L41:
            r0 = r13
            r1 = r12
            r2 = r17
            java.lang.String r1 = r1.getClassInfo(r2)     // Catch: javassist.NotFoundException -> L53
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L53
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.get(r0)     // Catch: javassist.NotFoundException -> L53
        L4e:
            r18 = r0
            goto L62
        L53:
            r19 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r19
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r15
            r1 = r16
            javassist.bytecode.analysis.Analyzer$ExceptionInfo r2 = new javassist.bytecode.analysis.Analyzer$ExceptionInfo
            r3 = r2
            r4 = r14
            r5 = r16
            int r4 = r4.startPc(r5)
            r5 = r14
            r6 = r16
            int r5 = r5.endPc(r6)
            r6 = r14
            r7 = r16
            int r6 = r6.handlerPc(r7)
            r7 = r18
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r0[r1] = r2
            int r16 = r16 + 1
            goto L23
        L8c:
            r0 = r15
            return r0
    }

    private javassist.bytecode.analysis.Frame firstFrame(javassist.bytecode.MethodInfo r6, int r7, int r8) {
            r5 = this;
            r0 = 0
            r9 = r0
            javassist.bytecode.analysis.Frame r0 = new javassist.bytecode.analysis.Frame
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r6
            int r0 = r0.getAccessFlags()
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L29
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r5
            javassist.CtClass r2 = r2.clazz
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.get(r2)
            r0.setLocal(r1, r2)
        L29:
            r0 = r6
            java.lang.String r0 = r0.getDescriptor()     // Catch: javassist.NotFoundException -> L3c
            r1 = r5
            javassist.CtClass r1 = r1.clazz     // Catch: javassist.NotFoundException -> L3c
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.NotFoundException -> L3c
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)     // Catch: javassist.NotFoundException -> L3c
            r11 = r0
            goto L48
        L3c:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L48:
            r0 = 0
            r12 = r0
        L4b:
            r0 = r12
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L89
            r0 = r5
            r1 = r11
            r2 = r12
            r1 = r1[r2]
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.get(r1)
            javassist.bytecode.analysis.Type r0 = r0.zeroExtend(r1)
            r13 = r0
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r13
            r0.setLocal(r1, r2)
            r0 = r13
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L83
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.TOP
            r0.setLocal(r1, r2)
        L83:
            int r12 = r12 + 1
            goto L4b
        L89:
            r0 = r10
            return r0
    }

    private int getNext(javassist.bytecode.CodeIterator r4, int r5, int r6) throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r4
            r1 = r5
            r0.move(r1)
            r0 = r4
            int r0 = r0.next()
            r0 = r4
            int r0 = r0.lookAhead()
            r7 = r0
            r0 = r4
            r1 = r6
            r0.move(r1)
            r0 = r4
            int r0 = r0.next()
            r0 = r7
            return r0
    }

    private int lookAhead(javassist.bytecode.CodeIterator r6, int r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L28
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Execution falls off end! [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L28:
            r0 = r6
            int r0 = r0.lookAhead()
            return r0
    }

    private void merge(javassist.bytecode.analysis.IntQueue r5, javassist.bytecode.analysis.Frame r6, int r7) {
            r4 = this;
            r0 = r4
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L1d
            r0 = r4
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r7
            r2 = r6
            javassist.bytecode.analysis.Frame r2 = r2.copy()
            r0[r1] = r2
            r0 = 1
            r9 = r0
            goto L25
        L1d:
            r0 = r8
            r1 = r6
            boolean r0 = r0.merge(r1)
            r9 = r0
        L25:
            r0 = r9
            if (r0 == 0) goto L2f
            r0 = r5
            r1 = r7
            r0.add(r1)
        L2f:
            return
    }

    private void mergeExceptionHandlers(javassist.bytecode.analysis.IntQueue r6, javassist.bytecode.MethodInfo r7, int r8, javassist.bytecode.analysis.Frame r9) {
            r5 = this;
            r0 = 0
            r10 = r0
        L3:
            r0 = r10
            r1 = r5
            javassist.bytecode.analysis.Analyzer$ExceptionInfo[] r1 = r1.exceptions
            int r1 = r1.length
            if (r0 >= r1) goto L50
            r0 = r5
            javassist.bytecode.analysis.Analyzer$ExceptionInfo[] r0 = r0.exceptions
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r8
            r1 = r11
            int r1 = javassist.bytecode.analysis.Analyzer.ExceptionInfo.access$100(r1)
            if (r0 < r1) goto L4a
            r0 = r8
            r1 = r11
            int r1 = javassist.bytecode.analysis.Analyzer.ExceptionInfo.access$200(r1)
            if (r0 >= r1) goto L4a
            r0 = r9
            javassist.bytecode.analysis.Frame r0 = r0.copy()
            r12 = r0
            r0 = r12
            r0.clearStack()
            r0 = r12
            r1 = r11
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Analyzer.ExceptionInfo.access$300(r1)
            r0.push(r1)
            r0 = r5
            r1 = r6
            r2 = r12
            r3 = r11
            int r3 = javassist.bytecode.analysis.Analyzer.ExceptionInfo.access$400(r3)
            r0.merge(r1, r2, r3)
        L4a:
            int r10 = r10 + 1
            goto L3
        L50:
            return
    }

    private void mergeJsr(javassist.bytecode.analysis.IntQueue r6, javassist.bytecode.analysis.Frame r7, javassist.bytecode.analysis.Subroutine r8, int r9, int r10) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r8
            if (r0 != 0) goto L26
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "No subroutine at jsr target! [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L26:
            r0 = r5
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r11
            if (r0 != 0) goto L4b
            r0 = r5
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r10
            r2 = r7
            javassist.bytecode.analysis.Frame r2 = r2.copy()
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            r11 = r0
            r0 = 1
            r12 = r0
            goto Lb2
        L4b:
            r0 = 0
            r13 = r0
        L4e:
            r0 = r13
            r1 = r7
            int r1 = r1.localsLength()
            if (r0 >= r1) goto Lb2
            r0 = r8
            r1 = r13
            boolean r0 = r0.isAccessed(r1)
            if (r0 != 0) goto Lac
            r0 = r11
            r1 = r13
            javassist.bytecode.analysis.Type r0 = r0.getLocal(r1)
            r14 = r0
            r0 = r7
            r1 = r13
            javassist.bytecode.analysis.Type r0 = r0.getLocal(r1)
            r15 = r0
            r0 = r14
            if (r0 != 0) goto L85
            r0 = r11
            r1 = r13
            r2 = r15
            r0.setLocal(r1, r2)
            r0 = 1
            r12 = r0
            goto Lac
        L85:
            r0 = r14
            r1 = r15
            javassist.bytecode.analysis.Type r0 = r0.merge(r1)
            r15 = r0
            r0 = r11
            r1 = r13
            r2 = r15
            r0.setLocal(r1, r2)
            r0 = r15
            r1 = r14
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La9
            r0 = r15
            boolean r0 = r0.popChanged()
            if (r0 == 0) goto Lac
        La9:
            r0 = 1
            r12 = r0
        Lac:
            int r13 = r13 + 1
            goto L4e
        Lb2:
            r0 = r11
            boolean r0 = r0.isJsrMerged()
            if (r0 != 0) goto Lc3
            r0 = r11
            r1 = 1
            r0.setJsrMerged(r1)
            r0 = 1
            r12 = r0
        Lc3:
            r0 = r12
            if (r0 == 0) goto Ld6
            r0 = r11
            boolean r0 = r0.isRetMerged()
            if (r0 == 0) goto Ld6
            r0 = r6
            r1 = r10
            r0.add(r1)
        Ld6:
            return
    }

    private void mergeLookupSwitch(javassist.bytecode.analysis.IntQueue r8, int r9, javassist.bytecode.CodeIterator r10, javassist.bytecode.analysis.Frame r11) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r9
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r9
            r4 = r10
            r5 = r12
            int r4 = r4.s32bitAt(r5)
            int r3 = r3 + r4
            r0.merge(r1, r2, r3)
            r0 = r10
            int r12 = r12 + 4
            r1 = r12
            int r0 = r0.s32bitAt(r1)
            r13 = r0
            r0 = r13
            r1 = 8
            int r0 = r0 * r1
            int r12 = r12 + 4
            r1 = r12
            int r0 = r0 + r1
            r14 = r0
            int r12 = r12 + 4
        L32:
            r0 = r12
            r1 = r14
            if (r0 >= r1) goto L52
            r0 = r10
            r1 = r12
            int r0 = r0.s32bitAt(r1)
            r1 = r9
            int r0 = r0 + r1
            r15 = r0
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r15
            r0.merge(r1, r2, r3)
            int r12 = r12 + 8
            goto L32
        L52:
            return
    }

    private void mergeRet(javassist.bytecode.analysis.IntQueue r6, javassist.bytecode.CodeIterator r7, int r8, javassist.bytecode.analysis.Frame r9, javassist.bytecode.analysis.Subroutine r10) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r10
            if (r0 != 0) goto L26
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Ret on no subroutine! [pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L26:
            r0 = r10
            java.util.Collection r0 = r0.callers()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L32:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lf8
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12 = r0
            r0 = r5
            r1 = r7
            r2 = r12
            r3 = r8
            int r0 = r0.getNext(r1, r2, r3)
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r5
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r13
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L7b
            r0 = r5
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r13
            r2 = r9
            javassist.bytecode.analysis.Frame r2 = r2.copyStack()
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            r15 = r0
            r0 = 1
            r14 = r0
            goto L84
        L7b:
            r0 = r15
            r1 = r9
            boolean r0 = r0.mergeStack(r1)
            r14 = r0
        L84:
            r0 = r10
            java.util.Collection r0 = r0.accessed()
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        L90:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Ld1
            r0 = r16
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r17 = r0
            r0 = r15
            r1 = r17
            javassist.bytecode.analysis.Type r0 = r0.getLocal(r1)
            r18 = r0
            r0 = r9
            r1 = r17
            javassist.bytecode.analysis.Type r0 = r0.getLocal(r1)
            r19 = r0
            r0 = r18
            r1 = r19
            if (r0 == r1) goto Lce
            r0 = r15
            r1 = r17
            r2 = r19
            r0.setLocal(r1, r2)
            r0 = 1
            r14 = r0
        Lce:
            goto L90
        Ld1:
            r0 = r15
            boolean r0 = r0.isRetMerged()
            if (r0 != 0) goto Le2
            r0 = r15
            r1 = 1
            r0.setRetMerged(r1)
            r0 = 1
            r14 = r0
        Le2:
            r0 = r14
            if (r0 == 0) goto Lf5
            r0 = r15
            boolean r0 = r0.isJsrMerged()
            if (r0 == 0) goto Lf5
            r0 = r6
            r1 = r13
            r0.add(r1)
        Lf5:
            goto L32
        Lf8:
            return
    }

    private void mergeTableSwitch(javassist.bytecode.analysis.IntQueue r8, int r9, javassist.bytecode.CodeIterator r10, javassist.bytecode.analysis.Frame r11) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r9
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r9
            r4 = r10
            r5 = r12
            int r4 = r4.s32bitAt(r5)
            int r3 = r3 + r4
            r0.merge(r1, r2, r3)
            r0 = r10
            int r12 = r12 + 4
            r1 = r12
            int r0 = r0.s32bitAt(r1)
            r13 = r0
            r0 = r10
            int r12 = r12 + 4
            r1 = r12
            int r0 = r0.s32bitAt(r1)
            r14 = r0
            r0 = r14
            r1 = r13
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r1 = 4
            int r0 = r0 * r1
            int r12 = r12 + 4
            r1 = r12
            int r0 = r0 + r1
            r15 = r0
        L3e:
            r0 = r12
            r1 = r15
            if (r0 >= r1) goto L5e
            r0 = r10
            r1 = r12
            int r0 = r0.s32bitAt(r1)
            r1 = r9
            int r0 = r0 + r1
            r16 = r0
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r16
            r0.merge(r1, r2, r3)
            int r12 = r12 + 4
            goto L3e
        L5e:
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
}
