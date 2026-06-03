package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/AnnotationWriter.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/AnnotationWriter.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/AnnotationWriter.class */
final class AnnotationWriter extends org.objectweb.asm.AnnotationVisitor {
    private final org.objectweb.asm.ClassWriter a;
    private int b;
    private final boolean c;
    private final org.objectweb.asm.ByteVector d;
    private final org.objectweb.asm.ByteVector e;
    private final int f;
    org.objectweb.asm.AnnotationWriter g;
    org.objectweb.asm.AnnotationWriter h;

    AnnotationWriter(org.objectweb.asm.ClassWriter r4, boolean r5, org.objectweb.asm.ByteVector r6, org.objectweb.asm.ByteVector r7, int r8) {
            r3 = this;
            r0 = r3
            r1 = 327680(0x50000, float:4.59177E-40)
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.a = r1
            r0 = r3
            r1 = r5
            r0.c = r1
            r0 = r3
            r1 = r6
            r0.d = r1
            r0 = r3
            r1 = r7
            r0.e = r1
            r0 = r3
            r1 = r8
            r0.f = r1
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(java.lang.String r7, java.lang.Object r8) {
            r6 = this;
            r0 = r6
            r1 = r0
            int r1 = r1.b
            r2 = 1
            int r1 = r1 + r2
            r0.b = r1
            r0 = r6
            boolean r0 = r0.c
            if (r0 == 0) goto L21
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = r6
            org.objectweb.asm.ClassWriter r1 = r1.a
            r2 = r7
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L40
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 115(0x73, float:1.61E-43)
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L356
        L40:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L65
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 66
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r8
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L356
        L65:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L94
            r0 = r8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7a
            r0 = 1
            goto L7b
        L7a:
            r0 = 0
        L7b:
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 90
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L356
        L94:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto Lb9
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 67
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r8
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L356
        Lb9:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 == 0) goto Lde
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 83
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r8
            java.lang.Short r3 = (java.lang.Short) r3
            short r3 = r3.shortValue()
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L356
        Lde:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L100
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 99
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r8
            org.objectweb.asm.Type r3 = (org.objectweb.asm.Type) r3
            java.lang.String r3 = r3.getDescriptor()
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L356
        L100:
            r0 = r8
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L146
            r0 = r8
            byte[] r0 = (byte[]) r0
            byte[] r0 = (byte[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L11e:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L143
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 66
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            r3 = r3[r4]
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L11e
        L143:
            goto L356
        L146:
            r0 = r8
            boolean r0 = r0 instanceof boolean[]
            if (r0 == 0) goto L194
            r0 = r8
            boolean[] r0 = (boolean[]) r0
            boolean[] r0 = (boolean[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L164:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L191
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 90
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            r3 = r3[r4]
            if (r3 == 0) goto L180
            r3 = 1
            goto L181
        L180:
            r3 = 0
        L181:
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L164
        L191:
            goto L356
        L194:
            r0 = r8
            boolean r0 = r0 instanceof short[]
            if (r0 == 0) goto L1da
            r0 = r8
            short[] r0 = (short[]) r0
            short[] r0 = (short[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L1b2:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L1d7
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 83
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            short r3 = r3[r4]
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L1b2
        L1d7:
            goto L356
        L1da:
            r0 = r8
            boolean r0 = r0 instanceof char[]
            if (r0 == 0) goto L220
            r0 = r8
            char[] r0 = (char[]) r0
            char[] r0 = (char[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L1f8:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L21d
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 67
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            char r3 = r3[r4]
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L1f8
        L21d:
            goto L356
        L220:
            r0 = r8
            boolean r0 = r0 instanceof int[]
            if (r0 == 0) goto L266
            r0 = r8
            int[] r0 = (int[]) r0
            int[] r0 = (int[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L23e:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L263
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 73
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            r3 = r3[r4]
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L23e
        L263:
            goto L356
        L266:
            r0 = r8
            boolean r0 = r0 instanceof long[]
            if (r0 == 0) goto L2ac
            r0 = r8
            long[] r0 = (long[]) r0
            long[] r0 = (long[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L284:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L2a9
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 74
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            r3 = r3[r4]
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L284
        L2a9:
            goto L356
        L2ac:
            r0 = r8
            boolean r0 = r0 instanceof float[]
            if (r0 == 0) goto L2f2
            r0 = r8
            float[] r0 = (float[]) r0
            float[] r0 = (float[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L2ca:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L2ef
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 70
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            r3 = r3[r4]
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L2ca
        L2ef:
            goto L356
        L2f2:
            r0 = r8
            boolean r0 = r0 instanceof double[]
            if (r0 == 0) goto L338
            r0 = r8
            double[] r0 = (double[]) r0
            double[] r0 = (double[]) r0
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = r9
            int r2 = r2.length
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = 0
            r10 = r0
        L310:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L335
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 68
            r2 = r6
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r9
            r4 = r10
            r3 = r3[r4]
            org.objectweb.asm.Item r2 = r2.a(r3)
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            int r10 = r10 + 1
            goto L310
        L335:
            goto L356
        L338:
            r0 = r6
            org.objectweb.asm.ClassWriter r0 = r0.a
            r1 = r8
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.d
            java.lang.String r1 = ".s.IFJDCS"
            r2 = r9
            int r2 = r2.b
            char r1 = r1.charAt(r2)
            r2 = r9
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
        L356:
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r0
            int r1 = r1.b
            r2 = 1
            int r1 = r1 + r2
            r0.b = r1
            r0 = r5
            boolean r0 = r0.c
            if (r0 == 0) goto L21
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = r5
            org.objectweb.asm.ClassWriter r1 = r1.a
            r2 = r6
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 101(0x65, float:1.42E-43)
            r2 = r5
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r7
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r1 = r5
            org.objectweb.asm.ClassWriter r1 = r1.a
            r2 = r8
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r10, java.lang.String r11) {
            r9 = this;
            r0 = r9
            r1 = r0
            int r1 = r1.b
            r2 = 1
            int r1 = r1 + r2
            r0.b = r1
            r0 = r9
            boolean r0 = r0.c
            if (r0 == 0) goto L21
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.a
            r2 = r10
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 64
            r2 = r9
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = r11
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r9
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = 1
            r4 = r9
            org.objectweb.asm.ByteVector r4 = r4.d
            r5 = r9
            org.objectweb.asm.ByteVector r5 = r5.d
            r6 = r9
            org.objectweb.asm.ByteVector r6 = r6.d
            int r6 = r6.b
            r7 = 2
            int r6 = r6 - r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String r10) {
            r9 = this;
            r0 = r9
            r1 = r0
            int r1 = r1.b
            r2 = 1
            int r1 = r1 + r2
            r0.b = r1
            r0 = r9
            boolean r0 = r0.c
            if (r0 == 0) goto L21
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.a
            r2 = r10
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L21:
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 91
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r9
            org.objectweb.asm.ClassWriter r2 = r2.a
            r3 = 0
            r4 = r9
            org.objectweb.asm.ByteVector r4 = r4.d
            r5 = r9
            org.objectweb.asm.ByteVector r5 = r5.d
            r6 = r9
            org.objectweb.asm.ByteVector r6 = r6.d
            int r6 = r6.b
            r7 = 2
            int r6 = r6 - r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
            r5 = this;
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.e
            if (r0 == 0) goto L2a
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.e
            byte[] r0 = r0.a
            r6 = r0
            r0 = r6
            r1 = r5
            int r1 = r1.f
            r2 = r5
            int r2 = r2.b
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r5
            int r1 = r1.f
            r2 = 1
            int r1 = r1 + r2
            r2 = r5
            int r2 = r2.b
            byte r2 = (byte) r2
            r0[r1] = r2
        L2a:
            return
    }

    int a() {
            r3 = this;
            r0 = 0
            r4 = r0
            r0 = r3
            r5 = r0
        L4:
            r0 = r5
            if (r0 == 0) goto L1a
            r0 = r4
            r1 = r5
            org.objectweb.asm.ByteVector r1 = r1.d
            int r1 = r1.b
            int r0 = r0 + r1
            r4 = r0
            r0 = r5
            org.objectweb.asm.AnnotationWriter r0 = r0.g
            r5 = r0
            goto L4
        L1a:
            r0 = r4
            return r0
    }

    void a(org.objectweb.asm.ByteVector r6) {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = 2
            r8 = r0
            r0 = r5
            r9 = r0
            r0 = 0
            r10 = r0
        La:
            r0 = r9
            if (r0 == 0) goto L37
            int r7 = r7 + 1
            r0 = r8
            r1 = r9
            org.objectweb.asm.ByteVector r1 = r1.d
            int r1 = r1.b
            int r0 = r0 + r1
            r8 = r0
            r0 = r9
            r0.visitEnd()
            r0 = r9
            r1 = r10
            r0.h = r1
            r0 = r9
            r10 = r0
            r0 = r9
            org.objectweb.asm.AnnotationWriter r0 = r0.g
            r9 = r0
            goto La
        L37:
            r0 = r6
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r6
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r10
            r9 = r0
        L47:
            r0 = r9
            if (r0 == 0) goto L6c
            r0 = r6
            r1 = r9
            org.objectweb.asm.ByteVector r1 = r1.d
            byte[] r1 = r1.a
            r2 = 0
            r3 = r9
            org.objectweb.asm.ByteVector r3 = r3.d
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r9
            org.objectweb.asm.AnnotationWriter r0 = r0.h
            r9 = r0
            goto L47
        L6c:
            return
    }

    static void a(org.objectweb.asm.AnnotationWriter[] r5, int r6, org.objectweb.asm.ByteVector r7) {
            r0 = 1
            r1 = 2
            r2 = r5
            int r2 = r2.length
            r3 = r6
            int r2 = r2 - r3
            int r1 = r1 * r2
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r9 = r0
        Lc:
            r0 = r9
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L2e
            r0 = r8
            r1 = r5
            r2 = r9
            r1 = r1[r2]
            if (r1 != 0) goto L1f
            r1 = 0
            goto L26
        L1f:
            r1 = r5
            r2 = r9
            r1 = r1[r2]
            int r1 = r1.a()
        L26:
            int r0 = r0 + r1
            r8 = r0
            int r9 = r9 + 1
            goto Lc
        L2e:
            r0 = r7
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r5
            int r1 = r1.length
            r2 = r6
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r6
            r9 = r0
        L3e:
            r0 = r9
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto La9
            r0 = r5
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
        L51:
            r0 = r10
            if (r0 == 0) goto L73
            int r12 = r12 + 1
            r0 = r10
            r0.visitEnd()
            r0 = r10
            r1 = r11
            r0.h = r1
            r0 = r10
            r11 = r0
            r0 = r10
            org.objectweb.asm.AnnotationWriter r0 = r0.g
            r10 = r0
            goto L51
        L73:
            r0 = r7
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r11
            r10 = r0
        L7e:
            r0 = r10
            if (r0 == 0) goto La3
            r0 = r7
            r1 = r10
            org.objectweb.asm.ByteVector r1 = r1.d
            byte[] r1 = r1.a
            r2 = 0
            r3 = r10
            org.objectweb.asm.ByteVector r3 = r3.d
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r10
            org.objectweb.asm.AnnotationWriter r0 = r0.h
            r10 = r0
            goto L7e
        La3:
            int r9 = r9 + 1
            goto L3e
        La9:
            return
    }

    static void a(int r5, org.objectweb.asm.TypePath r6, org.objectweb.asm.ByteVector r7) {
            r0 = r5
            r1 = 24
            int r0 = r0 >>> r1
            switch(r0) {
                case 0: goto L68;
                case 1: goto L68;
                case 19: goto L74;
                case 20: goto L74;
                case 21: goto L74;
                case 22: goto L68;
                case 71: goto L80;
                case 72: goto L80;
                case 73: goto L80;
                case 74: goto L80;
                case 75: goto L80;
                default: goto L89;
            }
        L68:
            r0 = r7
            r1 = r5
            r2 = 16
            int r1 = r1 >>> r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L99
        L74:
            r0 = r7
            r1 = r5
            r2 = 24
            int r1 = r1 >>> r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L99
        L80:
            r0 = r7
            r1 = r5
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            goto L99
        L89:
            r0 = r7
            r1 = r5
            r2 = 24
            int r1 = r1 >>> r2
            r2 = r5
            r3 = 16776960(0xffff00, float:2.3509528E-38)
            r2 = r2 & r3
            r3 = 8
            int r2 = r2 >> r3
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
        L99:
            r0 = r6
            if (r0 != 0) goto La6
            r0 = r7
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto Lc2
        La6:
            r0 = r6
            byte[] r0 = r0.a
            r1 = r6
            int r1 = r1.b
            r0 = r0[r1]
            r1 = 2
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r7
            r1 = r6
            byte[] r1 = r1.a
            r2 = r6
            int r2 = r2.b
            r3 = r8
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        Lc2:
            return
    }
}
