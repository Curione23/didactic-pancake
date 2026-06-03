package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AnnotationsAttribute.class */
public class AnnotationsAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String visibleTag = "RuntimeVisibleAnnotations";
    public static final java.lang.String invisibleTag = "RuntimeInvisibleAnnotations";

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AnnotationsAttribute$Copier.class */
    static class Copier extends javassist.bytecode.AnnotationsAttribute.Walker {
        java.io.ByteArrayOutputStream output;
        javassist.bytecode.annotation.AnnotationsWriter writer;
        javassist.bytecode.ConstPool srcPool;
        javassist.bytecode.ConstPool destPool;
        java.util.Map<java.lang.String, java.lang.String> classnames;

        Copier(byte[] r8, javassist.bytecode.ConstPool r9, javassist.bytecode.ConstPool r10, java.util.Map<java.lang.String, java.lang.String> r11) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = 1
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        Copier(byte[] r7, javassist.bytecode.ConstPool r8, javassist.bytecode.ConstPool r9, java.util.Map<java.lang.String, java.lang.String> r10, boolean r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r0.<init>(r1)
                r0 = r6
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
                r2 = r1
                r2.<init>()
                r0.output = r1
                r0 = r11
                if (r0 == 0) goto L25
                r0 = r6
                javassist.bytecode.annotation.AnnotationsWriter r1 = new javassist.bytecode.annotation.AnnotationsWriter
                r2 = r1
                r3 = r6
                java.io.ByteArrayOutputStream r3 = r3.output
                r4 = r9
                r2.<init>(r3, r4)
                r0.writer = r1
            L25:
                r0 = r6
                r1 = r8
                r0.srcPool = r1
                r0 = r6
                r1 = r9
                r0.destPool = r1
                r0 = r6
                r1 = r10
                r0.classnames = r1
                return
        }

        byte[] close() throws java.io.IOException {
                r2 = this;
                r0 = r2
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r0.close()
                r0 = r2
                java.io.ByteArrayOutputStream r0 = r0.output
                byte[] r0 = r0.toByteArray()
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void parameters(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r5
                r0.numParameters(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                super.parameters(r1, r2)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotationArray(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r6
                r0.numAnnotations(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                int r0 = super.annotationArray(r1, r2)
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotation(int r6, int r7, int r8) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r5
                r2 = r7
                int r1 = r1.copyType(r2)
                r2 = r8
                r0.annotation(r1, r2)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.annotation(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int memberValuePair(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r4
                r2 = r6
                int r1 = r1.copy(r2)
                r0.memberValuePair(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                int r0 = super.memberValuePair(r1, r2)
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void constValueMember(int r6, int r7) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r6
                r2 = r5
                r3 = r7
                int r2 = r2.copy(r3)
                r0.constValueIndex(r1, r2)
                r0 = r5
                r1 = r6
                r2 = r7
                super.constValueMember(r1, r2)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void enumMemberValue(int r6, int r7, int r8) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r5
                r2 = r7
                int r1 = r1.copyType(r2)
                r2 = r5
                r3 = r8
                int r2 = r2.copy(r3)
                r0.enumConstValue(r1, r2)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                super.enumMemberValue(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void classMemberValue(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r4
                r2 = r6
                int r1 = r1.copyType(r2)
                r0.classInfoIndex(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                super.classMemberValue(r1, r2)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotationMemberValue(int r4) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r0.annotationValue()
                r0 = r3
                r1 = r4
                int r0 = super.annotationMemberValue(r1)
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int arrayMemberValue(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                javassist.bytecode.annotation.AnnotationsWriter r0 = r0.writer
                r1 = r6
                r0.arrayValue(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                int r0 = super.arrayMemberValue(r1, r2)
                return r0
        }

        int copy(int r6) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ConstPool r0 = r0.srcPool
                r1 = r6
                r2 = r5
                javassist.bytecode.ConstPool r2 = r2.destPool
                r3 = r5
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.classnames
                int r0 = r0.copy(r1, r2, r3)
                return r0
        }

        int copyType(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.ConstPool r0 = r0.srcPool
                r1 = r4
                java.lang.String r0 = r0.getUtf8Info(r1)
                r5 = r0
                r0 = r5
                r1 = r3
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.classnames
                java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
                r6 = r0
                r0 = r3
                javassist.bytecode.ConstPool r0 = r0.destPool
                r1 = r6
                int r0 = r0.addUtf8Info(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AnnotationsAttribute$Parser.class */
    static class Parser extends javassist.bytecode.AnnotationsAttribute.Walker {
        javassist.bytecode.ConstPool pool;
        javassist.bytecode.annotation.Annotation[][] allParams;
        javassist.bytecode.annotation.Annotation[] allAnno;
        javassist.bytecode.annotation.Annotation currentAnno;
        javassist.bytecode.annotation.MemberValue currentMember;

        Parser(byte[] r4, javassist.bytecode.ConstPool r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.pool = r1
                return
        }

        javassist.bytecode.annotation.Annotation[][] parseParameters() throws java.lang.Exception {
                r2 = this;
                r0 = r2
                r0.parameters()
                r0 = r2
                javassist.bytecode.annotation.Annotation[][] r0 = r0.allParams
                return r0
        }

        javassist.bytecode.annotation.Annotation[] parseAnnotations() throws java.lang.Exception {
                r2 = this;
                r0 = r2
                r0.annotationArray()
                r0 = r2
                javassist.bytecode.annotation.Annotation[] r0 = r0.allAnno
                return r0
        }

        javassist.bytecode.annotation.MemberValue parseMemberValue() throws java.lang.Exception {
                r3 = this;
                r0 = r3
                r1 = 0
                int r0 = r0.memberValue(r1)
                r0 = r3
                javassist.bytecode.annotation.MemberValue r0 = r0.currentMember
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void parameters(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r5
                javassist.bytecode.annotation.Annotation[] r0 = new javassist.bytecode.annotation.Annotation[r0]
                r7 = r0
                r0 = 0
                r8 = r0
            L8:
                r0 = r8
                r1 = r5
                if (r0 >= r1) goto L22
                r0 = r4
                r1 = r6
                int r0 = r0.annotationArray(r1)
                r6 = r0
                r0 = r7
                r1 = r8
                r2 = r4
                javassist.bytecode.annotation.Annotation[] r2 = r2.allAnno
                r0[r1] = r2
                int r8 = r8 + 1
                goto L8
            L22:
                r0 = r4
                r1 = r7
                r0.allParams = r1
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotationArray(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r6
                javassist.bytecode.annotation.Annotation[] r0 = new javassist.bytecode.annotation.Annotation[r0]
                r7 = r0
                r0 = 0
                r8 = r0
            L8:
                r0 = r8
                r1 = r6
                if (r0 >= r1) goto L22
                r0 = r4
                r1 = r5
                int r0 = r0.annotation(r1)
                r5 = r0
                r0 = r7
                r1 = r8
                r2 = r4
                javassist.bytecode.annotation.Annotation r2 = r2.currentAnno
                r0[r1] = r2
                int r8 = r8 + 1
                goto L8
            L22:
                r0 = r4
                r1 = r7
                r0.allAnno = r1
                r0 = r5
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotation(int r7, int r8, int r9) throws java.lang.Exception {
                r6 = this;
                r0 = r6
                javassist.bytecode.annotation.Annotation r1 = new javassist.bytecode.annotation.Annotation
                r2 = r1
                r3 = r8
                r4 = r6
                javassist.bytecode.ConstPool r4 = r4.pool
                r2.<init>(r3, r4)
                r0.currentAnno = r1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                int r0 = super.annotation(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int memberValuePair(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                int r0 = super.memberValuePair(r1, r2)
                r5 = r0
                r0 = r4
                javassist.bytecode.annotation.Annotation r0 = r0.currentAnno
                r1 = r6
                r2 = r4
                javassist.bytecode.annotation.MemberValue r2 = r2.currentMember
                r0.addMemberValue(r1, r2)
                r0 = r5
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void constValueMember(int r6, int r7) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                javassist.bytecode.ConstPool r0 = r0.pool
                r9 = r0
                r0 = r6
                switch(r0) {
                    case 66: goto L58;
                    case 67: goto L66;
                    case 68: goto L74;
                    case 70: goto L82;
                    case 73: goto L90;
                    case 74: goto L9e;
                    case 83: goto Lac;
                    case 90: goto Lba;
                    case 115: goto Lc8;
                    default: goto Ld6;
                }
            L58:
                javassist.bytecode.annotation.ByteMemberValue r0 = new javassist.bytecode.annotation.ByteMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            L66:
                javassist.bytecode.annotation.CharMemberValue r0 = new javassist.bytecode.annotation.CharMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            L74:
                javassist.bytecode.annotation.DoubleMemberValue r0 = new javassist.bytecode.annotation.DoubleMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            L82:
                javassist.bytecode.annotation.FloatMemberValue r0 = new javassist.bytecode.annotation.FloatMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            L90:
                javassist.bytecode.annotation.IntegerMemberValue r0 = new javassist.bytecode.annotation.IntegerMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            L9e:
                javassist.bytecode.annotation.LongMemberValue r0 = new javassist.bytecode.annotation.LongMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            Lac:
                javassist.bytecode.annotation.ShortMemberValue r0 = new javassist.bytecode.annotation.ShortMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            Lba:
                javassist.bytecode.annotation.BooleanMemberValue r0 = new javassist.bytecode.annotation.BooleanMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            Lc8:
                javassist.bytecode.annotation.StringMemberValue r0 = new javassist.bytecode.annotation.StringMemberValue
                r1 = r0
                r2 = r7
                r3 = r9
                r1.<init>(r2, r3)
                r8 = r0
                goto Lf1
            Ld6:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "unknown tag:"
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r6
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            Lf1:
                r0 = r5
                r1 = r8
                r0.currentMember = r1
                r0 = r5
                r1 = r6
                r2 = r7
                super.constValueMember(r1, r2)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void enumMemberValue(int r8, int r9, int r10) throws java.lang.Exception {
                r7 = this;
                r0 = r7
                javassist.bytecode.annotation.EnumMemberValue r1 = new javassist.bytecode.annotation.EnumMemberValue
                r2 = r1
                r3 = r9
                r4 = r10
                r5 = r7
                javassist.bytecode.ConstPool r5 = r5.pool
                r2.<init>(r3, r4, r5)
                r0.currentMember = r1
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                super.enumMemberValue(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void classMemberValue(int r7, int r8) throws java.lang.Exception {
                r6 = this;
                r0 = r6
                javassist.bytecode.annotation.ClassMemberValue r1 = new javassist.bytecode.annotation.ClassMemberValue
                r2 = r1
                r3 = r8
                r4 = r6
                javassist.bytecode.ConstPool r4 = r4.pool
                r2.<init>(r3, r4)
                r0.currentMember = r1
                r0 = r6
                r1 = r7
                r2 = r8
                super.classMemberValue(r1, r2)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotationMemberValue(int r7) throws java.lang.Exception {
                r6 = this;
                r0 = r6
                javassist.bytecode.annotation.Annotation r0 = r0.currentAnno
                r8 = r0
                r0 = r6
                r1 = r7
                int r0 = super.annotationMemberValue(r1)
                r7 = r0
                r0 = r6
                javassist.bytecode.annotation.AnnotationMemberValue r1 = new javassist.bytecode.annotation.AnnotationMemberValue
                r2 = r1
                r3 = r6
                javassist.bytecode.annotation.Annotation r3 = r3.currentAnno
                r4 = r6
                javassist.bytecode.ConstPool r4 = r4.pool
                r2.<init>(r3, r4)
                r0.currentMember = r1
                r0 = r6
                r1 = r8
                r0.currentAnno = r1
                r0 = r7
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int arrayMemberValue(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                javassist.bytecode.annotation.ArrayMemberValue r0 = new javassist.bytecode.annotation.ArrayMemberValue
                r1 = r0
                r2 = r4
                javassist.bytecode.ConstPool r2 = r2.pool
                r1.<init>(r2)
                r7 = r0
                r0 = r6
                javassist.bytecode.annotation.MemberValue[] r0 = new javassist.bytecode.annotation.MemberValue[r0]
                r8 = r0
                r0 = 0
                r9 = r0
            L15:
                r0 = r9
                r1 = r6
                if (r0 >= r1) goto L30
                r0 = r4
                r1 = r5
                int r0 = r0.memberValue(r1)
                r5 = r0
                r0 = r8
                r1 = r9
                r2 = r4
                javassist.bytecode.annotation.MemberValue r2 = r2.currentMember
                r0[r1] = r2
                int r9 = r9 + 1
                goto L15
            L30:
                r0 = r7
                r1 = r8
                r0.setValue(r1)
                r0 = r4
                r1 = r7
                r0.currentMember = r1
                r0 = r5
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AnnotationsAttribute$Renamer.class */
    static class Renamer extends javassist.bytecode.AnnotationsAttribute.Walker {
        javassist.bytecode.ConstPool cpool;
        java.util.Map<java.lang.String, java.lang.String> classnames;

        Renamer(byte[] r4, javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.cpool = r1
                r0 = r3
                r1 = r6
                r0.classnames = r1
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        int annotation(int r6, int r7, int r8) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = 4
                int r1 = r1 - r2
                r2 = r7
                r0.renameType(r1, r2)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.annotation(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void enumMemberValue(int r6, int r7, int r8) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                r2 = r7
                r0.renameType(r1, r2)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                super.enumMemberValue(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.AnnotationsAttribute.Walker
        void classMemberValue(int r5, int r6) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                r2 = r6
                r0.renameType(r1, r2)
                r0 = r4
                r1 = r5
                r2 = r6
                super.classMemberValue(r1, r2)
                return
        }

        private void renameType(int r5, int r6) {
                r4 = this;
                r0 = r4
                javassist.bytecode.ConstPool r0 = r0.cpool
                r1 = r6
                java.lang.String r0 = r0.getUtf8Info(r1)
                r7 = r0
                r0 = r7
                r1 = r4
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.classnames
                java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
                r8 = r0
                r0 = r7
                r1 = r8
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L31
                r0 = r4
                javassist.bytecode.ConstPool r0 = r0.cpool
                r1 = r8
                int r0 = r0.addUtf8Info(r1)
                r9 = r0
                r0 = r9
                r1 = r4
                byte[] r1 = r1.info
                r2 = r5
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            L31:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AnnotationsAttribute$Walker.class */
    static class Walker {
        byte[] info;

        Walker(byte[] r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.info = r1
                return
        }

        final void parameters() throws java.lang.Exception {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.info
                r1 = 0
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r5 = r0
                r0 = r4
                r1 = r5
                r2 = 1
                r0.parameters(r1, r2)
                return
        }

        void parameters(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = 0
                r6 = r0
            L2:
                r0 = r6
                r1 = r4
                if (r0 >= r1) goto L13
                r0 = r3
                r1 = r5
                int r0 = r0.annotationArray(r1)
                r5 = r0
                int r6 = r6 + 1
                goto L2
            L13:
                return
        }

        final void annotationArray() throws java.lang.Exception {
                r3 = this;
                r0 = r3
                r1 = 0
                int r0 = r0.annotationArray(r1)
                return
        }

        final int annotationArray(int r5) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r6 = r0
                r0 = r4
                r1 = r5
                r2 = 2
                int r1 = r1 + r2
                r2 = r6
                int r0 = r0.annotationArray(r1, r2)
                return r0
        }

        int annotationArray(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = 0
                r6 = r0
            L2:
                r0 = r6
                r1 = r5
                if (r0 >= r1) goto L13
                r0 = r3
                r1 = r4
                int r0 = r0.annotation(r1)
                r4 = r0
                int r6 = r6 + 1
                goto L2
            L13:
                r0 = r4
                return r0
        }

        final int annotation(int r6) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r7 = r0
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 2
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r8 = r0
                r0 = r5
                r1 = r6
                r2 = 4
                int r1 = r1 + r2
                r2 = r7
                r3 = r8
                int r0 = r0.annotation(r1, r2, r3)
                return r0
        }

        int annotation(int r4, int r5, int r6) throws java.lang.Exception {
                r3 = this;
                r0 = 0
                r7 = r0
            L3:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L15
                r0 = r3
                r1 = r4
                int r0 = r0.memberValuePair(r1)
                r4 = r0
                int r7 = r7 + 1
                goto L3
            L15:
                r0 = r4
                return r0
        }

        final int memberValuePair(int r5) throws java.lang.Exception {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r6 = r0
                r0 = r4
                r1 = r5
                r2 = 2
                int r1 = r1 + r2
                r2 = r6
                int r0 = r0.memberValuePair(r1, r2)
                return r0
        }

        int memberValuePair(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                r1 = r4
                int r0 = r0.memberValue(r1)
                return r0
        }

        final int memberValue(int r6) throws java.lang.Exception {
                r5 = this;
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r7 = r0
                r0 = r7
                r1 = 101(0x65, float:1.42E-43)
                if (r0 != r1) goto L34
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r8 = r0
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 3
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r5
                r1 = r6
                r2 = r8
                r3 = r9
                r0.enumMemberValue(r1, r2, r3)
                r0 = r6
                r1 = 5
                int r0 = r0 + r1
                return r0
            L34:
                r0 = r7
                r1 = 99
                if (r0 != r1) goto L4f
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r8 = r0
                r0 = r5
                r1 = r6
                r2 = r8
                r0.classMemberValue(r1, r2)
                r0 = r6
                r1 = 3
                int r0 = r0 + r1
                return r0
            L4f:
                r0 = r7
                r1 = 64
                if (r0 != r1) goto L5d
                r0 = r5
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                int r0 = r0.annotationMemberValue(r1)
                return r0
            L5d:
                r0 = r7
                r1 = 91
                if (r0 != r1) goto L77
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r8 = r0
                r0 = r5
                r1 = r6
                r2 = 3
                int r1 = r1 + r2
                r2 = r8
                int r0 = r0.arrayMemberValue(r1, r2)
                return r0
            L77:
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r8 = r0
                r0 = r5
                r1 = r7
                r2 = r8
                r0.constValueMember(r1, r2)
                r0 = r6
                r1 = 3
                int r0 = r0 + r1
                return r0
        }

        void constValueMember(int r2, int r3) throws java.lang.Exception {
                r1 = this;
                return
        }

        void enumMemberValue(int r2, int r3, int r4) throws java.lang.Exception {
                r1 = this;
                return
        }

        void classMemberValue(int r2, int r3) throws java.lang.Exception {
                r1 = this;
                return
        }

        int annotationMemberValue(int r4) throws java.lang.Exception {
                r3 = this;
                r0 = r3
                r1 = r4
                int r0 = r0.annotation(r1)
                return r0
        }

        int arrayMemberValue(int r4, int r5) throws java.lang.Exception {
                r3 = this;
                r0 = 0
                r6 = r0
            L2:
                r0 = r6
                r1 = r5
                if (r0 >= r1) goto L13
                r0 = r3
                r1 = r4
                int r0 = r0.memberValue(r1)
                r4 = r0
                int r6 = r6 + 1
                goto L2
            L13:
                r0 = r4
                return r0
        }
    }

    public AnnotationsAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7, byte[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public AnnotationsAttribute(javassist.bytecode.ConstPool r9, java.lang.String r10) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = 2
            byte[] r3 = new byte[r3]
            r4 = r3
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 0
            r4[r5] = r6
            r0.<init>(r1, r2, r3)
            return
    }

    AnnotationsAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
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
            javassist.bytecode.AnnotationsAttribute$Copier r0 = new javassist.bytecode.AnnotationsAttribute$Copier
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
            javassist.bytecode.AnnotationsAttribute r0 = new javassist.bytecode.AnnotationsAttribute     // Catch: java.lang.Exception -> L27
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

    public javassist.bytecode.annotation.Annotation getAnnotation(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r5 = r0
            r0 = 0
            r6 = r0
        L7:
            r0 = r6
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L24
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            java.lang.String r0 = r0.getTypeName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            return r0
        L1e:
            int r6 = r6 + 1
            goto L7
        L24:
            r0 = 0
            return r0
    }

    public void addAnnotation(javassist.bytecode.annotation.Annotation r7) {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.getTypeName()
            r8 = r0
            r0 = r6
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r9 = r0
            r0 = 0
            r10 = r0
        Ld:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L33
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.getTypeName()
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            r0 = r9
            r1 = r10
            r2 = r7
            r0[r1] = r2
            r0 = r6
            r1 = r9
            r0.setAnnotations(r1)
            return
        L2d:
            int r10 = r10 + 1
            goto Ld
        L33:
            r0 = r9
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            javassist.bytecode.annotation.Annotation[] r0 = new javassist.bytecode.annotation.Annotation[r0]
            r10 = r0
            r0 = r9
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r9
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r9
            int r1 = r1.length
            r2 = r7
            r0[r1] = r2
            r0 = r6
            r1 = r10
            r0.setAnnotations(r1)
            return
    }

    public boolean removeAnnotation(java.lang.String r8) {
            r7 = this;
            r0 = r7
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r9 = r0
            r0 = 0
            r10 = r0
        L7:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L52
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.getTypeName()
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            r0 = r9
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            javassist.bytecode.annotation.Annotation[] r0 = new javassist.bytecode.annotation.Annotation[r0]
            r11 = r0
            r0 = r9
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r10
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r9
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L44
            r0 = r9
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r2 = r11
            r3 = r10
            r4 = r9
            int r4 = r4.length
            r5 = r10
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L44:
            r0 = r7
            r1 = r11
            r0.setAnnotations(r1)
            r0 = 1
            return r0
        L4c:
            int r10 = r10 + 1
            goto L7
        L52:
            r0 = 0
            return r0
    }

    public javassist.bytecode.annotation.Annotation[] getAnnotations() {
            r5 = this;
            javassist.bytecode.AnnotationsAttribute$Parser r0 = new javassist.bytecode.AnnotationsAttribute$Parser     // Catch: java.lang.Exception -> L13
            r1 = r0
            r2 = r5
            byte[] r2 = r2.info     // Catch: java.lang.Exception -> L13
            r3 = r5
            javassist.bytecode.ConstPool r3 = r3.constPool     // Catch: java.lang.Exception -> L13
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L13
            javassist.bytecode.annotation.Annotation[] r0 = r0.parseAnnotations()     // Catch: java.lang.Exception -> L13
            return r0
        L13:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    public void setAnnotations(javassist.bytecode.annotation.Annotation[] r6) {
            r5 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r7 = r0
            javassist.bytecode.annotation.AnnotationsWriter r0 = new javassist.bytecode.annotation.AnnotationsWriter
            r1 = r0
            r2 = r7
            r3 = r5
            javassist.bytecode.ConstPool r3 = r3.constPool
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r6
            int r0 = r0.length     // Catch: java.io.IOException -> L3e
            r9 = r0
            r0 = r8
            r1 = r9
            r0.numAnnotations(r1)     // Catch: java.io.IOException -> L3e
            r0 = 0
            r10 = r0
        L22:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L37
            r0 = r6
            r1 = r10
            r0 = r0[r1]     // Catch: java.io.IOException -> L3e
            r1 = r8
            r0.write(r1)     // Catch: java.io.IOException -> L3e
            int r10 = r10 + 1
            goto L22
        L37:
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L3e
            goto L4a
        L3e:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L4a:
            r0 = r5
            r1 = r7
            byte[] r1 = r1.toByteArray()
            r0.set(r1)
            return
    }

    public void setAnnotation(javassist.bytecode.annotation.Annotation r7) {
            r6 = this;
            r0 = r6
            r1 = 1
            javassist.bytecode.annotation.Annotation[] r1 = new javassist.bytecode.annotation.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            r0.setAnnotations(r1)
            return
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
            javassist.bytecode.AnnotationsAttribute$Renamer r0 = new javassist.bytecode.AnnotationsAttribute$Renamer
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

    public java.lang.String toString() {
            r4 = this;
            r0 = r4
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 0
            r7 = r0
        Lf:
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L33
            r0 = r6
            r1 = r5
            r2 = r7
            int r7 = r7 + 1
            r1 = r1[r2]
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 == r1) goto Lf
            r0 = r6
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf
        L33:
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }
}
