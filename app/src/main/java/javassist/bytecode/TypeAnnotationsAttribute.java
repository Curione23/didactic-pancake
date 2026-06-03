package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/TypeAnnotationsAttribute.class */
public class TypeAnnotationsAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String visibleTag = "RuntimeVisibleTypeAnnotations";
    public static final java.lang.String invisibleTag = "RuntimeInvisibleTypeAnnotations";

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/TypeAnnotationsAttribute$Copier.class */
    static class Copier extends javassist.bytecode.AnnotationsAttribute.Copier {
        javassist.bytecode.TypeAnnotationsAttribute.SubCopier sub;

        Copier(byte[] r10, javassist.bytecode.ConstPool r11, javassist.bytecode.ConstPool r12, java.util.Map<java.lang.String, java.lang.String> r13) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = new javassist.bytecode.annotation.TypeAnnotationsWriter
                r1 = r0
                r2 = r9
                java.io.ByteArrayOutputStream r2 = r2.output
                r3 = r12
                r1.<init>(r2, r3)
                r14 = r0
                r0 = r9
                r1 = r14
                r0.writer = r1
                r0 = r9
                javassist.bytecode.TypeAnnotationsAttribute$SubCopier r1 = new javassist.bytecode.TypeAnnotationsAttribute$SubCopier
                r2 = r1
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r2.<init>(r3, r4, r5, r6, r7)
                r0.sub = r1
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Copier, javassist.bytecode.AnnotationsAttribute.Walker
        int annotationArray(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r6
                r0.numAnnotations(r1)
                r0 = 0
                r7 = r0
            La:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L3d
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r8 = r0
                r0 = r4
                javassist.bytecode.TypeAnnotationsAttribute$SubCopier r0 = r0.sub
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                r2 = r8
                int r0 = r0.targetInfo(r1, r2)
                r5 = r0
                r0 = r4
                javassist.bytecode.TypeAnnotationsAttribute$SubCopier r0 = r0.sub
                r1 = r5
                int r0 = r0.typePath(r1)
                r5 = r0
                r0 = r4
                r1 = r5
                int r0 = r0.annotation(r1)
                r5 = r0
                int r7 = r7 + 1
                goto La
            L3d:
                r0 = r5
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/TypeAnnotationsAttribute$Renamer.class */
    static class Renamer extends javassist.bytecode.AnnotationsAttribute.Renamer {
        javassist.bytecode.TypeAnnotationsAttribute.SubWalker sub;

        Renamer(byte[] r6, javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3)
                r0 = r5
                javassist.bytecode.TypeAnnotationsAttribute$SubWalker r1 = new javassist.bytecode.TypeAnnotationsAttribute$SubWalker
                r2 = r1
                r3 = r6
                r2.<init>(r3)
                r0.sub = r1
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotationArray(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = 0
                r7 = r0
            L2:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L35
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r8 = r0
                r0 = r4
                javassist.bytecode.TypeAnnotationsAttribute$SubWalker r0 = r0.sub
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                r2 = r8
                int r0 = r0.targetInfo(r1, r2)
                r5 = r0
                r0 = r4
                javassist.bytecode.TypeAnnotationsAttribute$SubWalker r0 = r0.sub
                r1 = r5
                int r0 = r0.typePath(r1)
                r5 = r0
                r0 = r4
                r1 = r5
                int r0 = r0.annotation(r1)
                r5 = r0
                int r7 = r7 + 1
                goto L2
            L35:
                r0 = r5
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/TypeAnnotationsAttribute$SubCopier.class */
    static class SubCopier extends javassist.bytecode.TypeAnnotationsAttribute.SubWalker {
        javassist.bytecode.ConstPool srcPool;
        javassist.bytecode.ConstPool destPool;
        java.util.Map<java.lang.String, java.lang.String> classnames;
        javassist.bytecode.annotation.TypeAnnotationsWriter writer;

        SubCopier(byte[] r4, javassist.bytecode.ConstPool r5, javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7, javassist.bytecode.annotation.TypeAnnotationsWriter r8) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.srcPool = r1
                r0 = r3
                r1 = r6
                r0.destPool = r1
                r0 = r3
                r1 = r7
                r0.classnames = r1
                r0 = r3
                r1 = r8
                r0.writer = r1
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void typeParameterTarget(int r5, int r6, int r7) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r6
                r2 = r7
                r0.typeParameterTarget(r1, r2)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void supertypeTarget(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r5
                r0.supertypeTarget(r1)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void typeParameterBoundTarget(int r6, int r7, int r8, int r9) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r7
                r2 = r8
                r3 = r9
                r0.typeParameterBoundTarget(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void emptyTarget(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r5
                r0.emptyTarget(r1)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void formalParameterTarget(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r5
                r0.formalParameterTarget(r1)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void throwsTarget(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r5
                r0.throwsTarget(r1)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        int localvarTarget(int r6, int r7, int r8) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r7
                r2 = r8
                r0.localVarTarget(r1, r2)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.localvarTarget(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void localvarTarget(int r6, int r7, int r8, int r9, int r10) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r8
                r2 = r9
                r3 = r10
                r0.localVarTargetTable(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void catchTarget(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r5
                r0.catchTarget(r1)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void offsetTarget(int r5, int r6, int r7) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r6
                r2 = r7
                r0.offsetTarget(r1, r2)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void typeArgumentTarget(int r6, int r7, int r8, int r9) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r7
                r2 = r8
                r3 = r9
                r0.typeArgumentTarget(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        int typePath(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r6
                r0.typePath(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                int r0 = super.typePath(r1, r2)
                return r0
        }

        @Override // javassist.bytecode.TypeAnnotationsAttribute.SubWalker
        void typePath(int r5, int r6, int r7) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.TypeAnnotationsWriter r0 = r0.writer
                r1 = r6
                r2 = r7
                r0.typePathPath(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/TypeAnnotationsAttribute$SubWalker.class */
    static class SubWalker {
        byte[] info;

        SubWalker(byte[] r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.info = r1
                return
        }

        final int targetInfo(int r7, int r8) throws java.lang.Exception {
                r6 = this;
                r0 = r8
                switch(r0) {
                    case 0: goto L140;
                    case 1: goto L140;
                    case 2: goto L21d;
                    case 3: goto L21d;
                    case 4: goto L21d;
                    case 5: goto L21d;
                    case 6: goto L21d;
                    case 7: goto L21d;
                    case 8: goto L21d;
                    case 9: goto L21d;
                    case 10: goto L21d;
                    case 11: goto L21d;
                    case 12: goto L21d;
                    case 13: goto L21d;
                    case 14: goto L21d;
                    case 15: goto L21d;
                    case 16: goto L156;
                    case 17: goto L169;
                    case 18: goto L169;
                    case 19: goto L18f;
                    case 20: goto L18f;
                    case 21: goto L18f;
                    case 22: goto L197;
                    case 23: goto L1ac;
                    case 24: goto L21d;
                    case 25: goto L21d;
                    case 26: goto L21d;
                    case 27: goto L21d;
                    case 28: goto L21d;
                    case 29: goto L21d;
                    case 30: goto L21d;
                    case 31: goto L21d;
                    case 32: goto L21d;
                    case 33: goto L21d;
                    case 34: goto L21d;
                    case 35: goto L21d;
                    case 36: goto L21d;
                    case 37: goto L21d;
                    case 38: goto L21d;
                    case 39: goto L21d;
                    case 40: goto L21d;
                    case 41: goto L21d;
                    case 42: goto L21d;
                    case 43: goto L21d;
                    case 44: goto L21d;
                    case 45: goto L21d;
                    case 46: goto L21d;
                    case 47: goto L21d;
                    case 48: goto L21d;
                    case 49: goto L21d;
                    case 50: goto L21d;
                    case 51: goto L21d;
                    case 52: goto L21d;
                    case 53: goto L21d;
                    case 54: goto L21d;
                    case 55: goto L21d;
                    case 56: goto L21d;
                    case 57: goto L21d;
                    case 58: goto L21d;
                    case 59: goto L21d;
                    case 60: goto L21d;
                    case 61: goto L21d;
                    case 62: goto L21d;
                    case 63: goto L21d;
                    case 64: goto L1bf;
                    case 65: goto L1bf;
                    case 66: goto L1d2;
                    case 67: goto L1e5;
                    case 68: goto L1e5;
                    case 69: goto L1e5;
                    case 70: goto L1e5;
                    case 71: goto L1f9;
                    case 72: goto L1f9;
                    case 73: goto L1f9;
                    case 74: goto L1f9;
                    case 75: goto L1f9;
                    default: goto L21d;
                }
            L140:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r9 = r0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r0.typeParameterTarget(r1, r2, r3)
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                return r0
            L156:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r6
                r1 = r7
                r2 = r9
                r0.supertypeTarget(r1, r2)
                r0 = r7
                r1 = 2
                int r0 = r0 + r1
                return r0
            L169:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r9 = r0
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r10 = r0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.typeParameterBoundTarget(r1, r2, r3, r4)
                r0 = r7
                r1 = 2
                int r0 = r0 + r1
                return r0
            L18f:
                r0 = r6
                r1 = r7
                r2 = r8
                r0.emptyTarget(r1, r2)
                r0 = r7
                return r0
            L197:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r9 = r0
                r0 = r6
                r1 = r7
                r2 = r9
                r0.formalParameterTarget(r1, r2)
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                return r0
            L1ac:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r6
                r1 = r7
                r2 = r9
                r0.throwsTarget(r1, r2)
                r0 = r7
                r1 = 2
                int r0 = r0 + r1
                return r0
            L1bf:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r6
                r1 = r7
                r2 = 2
                int r1 = r1 + r2
                r2 = r8
                r3 = r9
                int r0 = r0.localvarTarget(r1, r2, r3)
                return r0
            L1d2:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r6
                r1 = r7
                r2 = r9
                r0.catchTarget(r1, r2)
                r0 = r7
                r1 = 2
                int r0 = r0 + r1
                return r0
            L1e5:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r0.offsetTarget(r1, r2, r3)
                r0 = r7
                r1 = 2
                int r0 = r0 + r1
                return r0
            L1f9:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 2
                int r1 = r1 + r2
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r10 = r0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.typeArgumentTarget(r1, r2, r3, r4)
                r0 = r7
                r1 = 3
                int r0 = r0 + r1
                return r0
            L21d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "invalid target type: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r8
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }

        void typeParameterTarget(int r2, int r3, int r4) throws java.lang.Exception {
                r1 = this;
                return
        }

        void supertypeTarget(int r2, int r3) throws java.lang.Exception {
                r1 = this;
                return
        }

        void typeParameterBoundTarget(int r2, int r3, int r4, int r5) throws java.lang.Exception {
                r1 = this;
                return
        }

        void emptyTarget(int r2, int r3) throws java.lang.Exception {
                r1 = this;
                return
        }

        void formalParameterTarget(int r2, int r3) throws java.lang.Exception {
                r1 = this;
                return
        }

        void throwsTarget(int r2, int r3) throws java.lang.Exception {
                r1 = this;
                return
        }

        int localvarTarget(int r8, int r9, int r10) throws java.lang.Exception {
                r7 = this;
                r0 = 0
                r11 = r0
            L3:
                r0 = r11
                r1 = r10
                if (r0 >= r1) goto L40
                r0 = r7
                byte[] r0 = r0.info
                r1 = r8
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r12 = r0
                r0 = r7
                byte[] r0 = r0.info
                r1 = r8
                r2 = 2
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r13 = r0
                r0 = r7
                byte[] r0 = r0.info
                r1 = r8
                r2 = 4
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r14 = r0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r12
                r4 = r13
                r5 = r14
                r0.localvarTarget(r1, r2, r3, r4, r5)
                int r8 = r8 + 6
                int r11 = r11 + 1
                goto L3
            L40:
                r0 = r8
                return r0
        }

        void localvarTarget(int r2, int r3, int r4, int r5, int r6) throws java.lang.Exception {
                r1 = this;
                return
        }

        void catchTarget(int r2, int r3) throws java.lang.Exception {
                r1 = this;
                return
        }

        void offsetTarget(int r2, int r3, int r4) throws java.lang.Exception {
                r1 = this;
                return
        }

        void typeArgumentTarget(int r2, int r3, int r4, int r5) throws java.lang.Exception {
                r1 = this;
                return
        }

        final int typePath(int r5) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                int r5 = r5 + 1
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r6 = r0
                r0 = r4
                r1 = r5
                r2 = r6
                int r0 = r0.typePath(r1, r2)
                return r0
        }

        int typePath(int r6, int r7) throws java.lang.Exception {
                r5 = this;
                r0 = 0
                r8 = r0
            L2:
                r0 = r8
                r1 = r7
                if (r0 >= r1) goto L33
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r9 = r0
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r10 = r0
                r0 = r5
                r1 = r6
                r2 = r9
                r3 = r10
                r0.typePath(r1, r2, r3)
                int r6 = r6 + 2
                int r8 = r8 + 1
                goto L2
            L33:
                r0 = r6
                return r0
        }

        void typePath(int r2, int r3, int r4) throws java.lang.Exception {
                r1 = this;
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/TypeAnnotationsAttribute$TAWalker.class */
    static class TAWalker extends javassist.bytecode.AnnotationsAttribute.Walker {
        javassist.bytecode.TypeAnnotationsAttribute.SubWalker subWalker;

        TAWalker(byte[] r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.<init>(r1)
                r0 = r5
                javassist.bytecode.TypeAnnotationsAttribute$SubWalker r1 = new javassist.bytecode.TypeAnnotationsAttribute$SubWalker
                r2 = r1
                r3 = r6
                r2.<init>(r3)
                r0.subWalker = r1
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotationArray(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = 0
                r7 = r0
            L2:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L35
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r8 = r0
                r0 = r4
                javassist.bytecode.TypeAnnotationsAttribute$SubWalker r0 = r0.subWalker
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                r2 = r8
                int r0 = r0.targetInfo(r1, r2)
                r5 = r0
                r0 = r4
                javassist.bytecode.TypeAnnotationsAttribute$SubWalker r0 = r0.subWalker
                r1 = r5
                int r0 = r0.typePath(r1)
                r5 = r0
                r0 = r4
                r1 = r5
                int r0 = r0.annotation(r1)
                r5 = r0
                int r7 = r7 + 1
                goto L2
            L35:
                r0 = r5
                return r0
        }
    }

    public TypeAnnotationsAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7, byte[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    TypeAnnotationsAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public int numAnnotations() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r7 = this;
            javassist.bytecode.TypeAnnotationsAttribute$Copier r0 = new javassist.bytecode.TypeAnnotationsAttribute$Copier
            r1 = r0
            r2 = r7
            byte[] r2 = r2.info
            r3 = r7
            javassist.bytecode.ConstPool r3 = r3.constPool
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            r10 = r0
            r0 = r10
            r0.annotationArray()     // Catch: java.lang.Exception -> L27
            javassist.bytecode.TypeAnnotationsAttribute r0 = new javassist.bytecode.TypeAnnotationsAttribute     // Catch: java.lang.Exception -> L27
            r1 = r0
            r2 = r8
            r3 = r7
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L27
            r4 = r10
            byte[] r4 = r4.close()     // Catch: java.lang.Exception -> L27
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Exception -> L27
            return r0
        L27:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            r1 = r7
            r0.renameClass(r1)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.util.Map<java.lang.String, java.lang.String> r7) {
            r6 = this;
            javassist.bytecode.TypeAnnotationsAttribute$Renamer r0 = new javassist.bytecode.TypeAnnotationsAttribute$Renamer
            r1 = r0
            r2 = r6
            byte[] r2 = r2.info
            r3 = r6
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r7
            r1.<init>(r2, r3, r4)
            r8 = r0
            r0 = r8
            r0.annotationArray()     // Catch: java.lang.Exception -> L18
            goto L22
        L18:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L22:
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    void getRefClasses(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.renameClass(r1)
            return
    }
}
