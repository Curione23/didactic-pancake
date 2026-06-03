package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/FieldWriter.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/FieldWriter.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/FieldWriter.class */
final class FieldWriter extends org.objectweb.asm.FieldVisitor {
    private final org.objectweb.asm.ClassWriter b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    private int g;
    private org.objectweb.asm.AnnotationWriter h;
    private org.objectweb.asm.AnnotationWriter i;
    private org.objectweb.asm.AnnotationWriter k;
    private org.objectweb.asm.AnnotationWriter l;
    private org.objectweb.asm.Attribute j;

    FieldWriter(org.objectweb.asm.ClassWriter r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
            r4 = this;
            r0 = r4
            r1 = 327680(0x50000, float:4.59177E-40)
            r0.<init>(r1)
            r0 = r5
            org.objectweb.asm.FieldWriter r0 = r0.B
            if (r0 != 0) goto L15
            r0 = r5
            r1 = r4
            r0.B = r1
            goto L1d
        L15:
            r0 = r5
            org.objectweb.asm.FieldWriter r0 = r0.C
            r1 = r4
            r0.fv = r1
        L1d:
            r0 = r5
            r1 = r4
            r0.C = r1
            r0 = r4
            r1 = r5
            r0.b = r1
            r0 = r4
            r1 = r6
            r0.c = r1
            r0 = r4
            r1 = r5
            r2 = r7
            int r1 = r1.newUTF8(r2)
            r0.d = r1
            r0 = r4
            r1 = r5
            r2 = r8
            int r1 = r1.newUTF8(r2)
            r0.e = r1
            r0 = r9
            if (r0 == 0) goto L4e
            r0 = r4
            r1 = r5
            r2 = r9
            int r1 = r1.newUTF8(r2)
            r0.f = r1
        L4e:
            r0 = r10
            if (r0 == 0) goto L60
            r0 = r4
            r1 = r5
            r2 = r10
            org.objectweb.asm.Item r1 = r1.a(r2)
            int r1 = r1.a
            r0.g = r1
        L60:
            return
    }

    @Override // org.objectweb.asm.FieldVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r9, boolean r10) {
            r8 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r9
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 1
            r4 = r11
            r5 = r11
            r6 = 2
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L40
            r0 = r12
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.h
            r0.g = r1
            r0 = r8
            r1 = r12
            r0.h = r1
            goto L4f
        L40:
            r0 = r12
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.i
            r0.g = r1
            r0 = r8
            r1 = r12
            r0.i = r1
        L4f:
            r0 = r12
            return r0
    }

    @Override // org.objectweb.asm.FieldVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r10, org.objectweb.asm.TypePath r11, java.lang.String r12, boolean r13) {
            r9 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r10
            r1 = r11
            r2 = r14
            org.objectweb.asm.AnnotationWriter.a(r0, r1, r2)
            r0 = r14
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r12
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r9
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 1
            r4 = r14
            r5 = r14
            r6 = r14
            int r6 = r6.b
            r7 = 2
            int r6 = r6 - r7
            r1.<init>(r2, r3, r4, r5, r6)
            r15 = r0
            r0 = r13
            if (r0 == 0) goto L52
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.k
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.k = r1
            goto L61
        L52:
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.l
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.l = r1
        L61:
            r0 = r15
            return r0
    }

    @Override // org.objectweb.asm.FieldVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.j
            r0.a = r1
            r0 = r3
            r1 = r4
            r0.j = r1
            return
    }

    @Override // org.objectweb.asm.FieldVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    int a() {
            r8 = this;
            r0 = 8
            r9 = r0
            r0 = r8
            int r0 = r0.g
            if (r0 == 0) goto L17
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "ConstantValue"
            int r0 = r0.newUTF8(r1)
            int r9 = r9 + 8
        L17:
            r0 = r8
            int r0 = r0.c
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L48
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto L3b
            r0 = r8
            int r0 = r0.c
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L48
        L3b:
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Synthetic"
            int r0 = r0.newUTF8(r1)
            int r9 = r9 + 6
        L48:
            r0 = r8
            int r0 = r0.c
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L5f
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Deprecated"
            int r0 = r0.newUTF8(r1)
            int r9 = r9 + 6
        L5f:
            r0 = r8
            int r0 = r0.f
            if (r0 == 0) goto L73
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Signature"
            int r0 = r0.newUTF8(r1)
            int r9 = r9 + 8
        L73:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.h
            if (r0 == 0) goto L91
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.h
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L91:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.i
            if (r0 == 0) goto Laf
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.i
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Laf:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.k
            if (r0 == 0) goto Lcd
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeVisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.k
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Lcd:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.l
            if (r0 == 0) goto Leb
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeInvisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.l
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Leb:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.j
            if (r0 == 0) goto L104
            r0 = r9
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.j
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            int r1 = r1.a(r2, r3, r4, r5, r6)
            int r0 = r0 + r1
            r9 = r0
        L104:
            r0 = r9
            return r0
    }

    void a(org.objectweb.asm.ByteVector r9) {
            r8 = this;
            r0 = 64
            r10 = r0
            r0 = 393216(0x60000, float:5.51013E-40)
            r1 = r8
            int r1 = r1.c
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            r2 = 64
            int r1 = r1 / r2
            r0 = r0 | r1
            r11 = r0
            r0 = r9
            r1 = r8
            int r1 = r1.c
            r2 = r11
            r3 = -1
            r2 = r2 ^ r3
            r1 = r1 & r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.d
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.e
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r12 = r0
            r0 = r8
            int r0 = r0.g
            if (r0 == 0) goto L39
            int r12 = r12 + 1
        L39:
            r0 = r8
            int r0 = r0.c
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L60
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto L5d
            r0 = r8
            int r0 = r0.c
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L60
        L5d:
            int r12 = r12 + 1
        L60:
            r0 = r8
            int r0 = r0.c
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L6d
            int r12 = r12 + 1
        L6d:
            r0 = r8
            int r0 = r0.f
            if (r0 == 0) goto L77
            int r12 = r12 + 1
        L77:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.h
            if (r0 == 0) goto L81
            int r12 = r12 + 1
        L81:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.i
            if (r0 == 0) goto L8b
            int r12 = r12 + 1
        L8b:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.k
            if (r0 == 0) goto L95
            int r12 = r12 + 1
        L95:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.l
            if (r0 == 0) goto L9f
            int r12 = r12 + 1
        L9f:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.j
            if (r0 == 0) goto Lb2
            r0 = r12
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.j
            int r1 = r1.a()
            int r0 = r0 + r1
            r12 = r0
        Lb2:
            r0 = r9
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            int r0 = r0.g
            if (r0 == 0) goto Ldb
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "ConstantValue"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.g
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        Ldb:
            r0 = r8
            int r0 = r0.c
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L111
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto Lff
            r0 = r8
            int r0 = r0.c
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L111
        Lff:
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Synthetic"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L111:
            r0 = r8
            int r0 = r0.c
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L12d
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Deprecated"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L12d:
            r0 = r8
            int r0 = r0.f
            if (r0 == 0) goto L14f
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Signature"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.f
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L14f:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.h
            if (r0 == 0) goto L16c
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.h
            r1 = r9
            r0.a(r1)
        L16c:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.i
            if (r0 == 0) goto L189
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.i
            r1 = r9
            r0.a(r1)
        L189:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.k
            if (r0 == 0) goto L1a6
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.k
            r1 = r9
            r0.a(r1)
        L1a6:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.l
            if (r0 == 0) goto L1c3
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.l
            r1 = r9
            r0.a(r1)
        L1c3:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.j
            if (r0 == 0) goto L1da
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.j
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = r9
            r0.a(r1, r2, r3, r4, r5, r6)
        L1da:
            return
    }
}
