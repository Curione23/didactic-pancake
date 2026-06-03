package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/ClassWriter.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/ClassWriter.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/ClassWriter.class */
public class ClassWriter extends org.objectweb.asm.ClassVisitor {
    public static final int COMPUTE_MAXS = 1;
    public static final int COMPUTE_FRAMES = 2;
    static final byte[] a = null;
    org.objectweb.asm.ClassReader M;
    int b;
    int c;
    final org.objectweb.asm.ByteVector d;
    org.objectweb.asm.Item[] e;
    int f;
    final org.objectweb.asm.Item g;
    final org.objectweb.asm.Item h;
    final org.objectweb.asm.Item i;
    final org.objectweb.asm.Item j;
    org.objectweb.asm.Item[] H;
    private short G;
    private int k;
    private int l;
    java.lang.String I;
    private int m;
    private int n;
    private int o;
    private int[] p;
    private int q;
    private org.objectweb.asm.ByteVector r;
    private int s;
    private int t;
    private org.objectweb.asm.AnnotationWriter u;
    private org.objectweb.asm.AnnotationWriter v;
    private org.objectweb.asm.AnnotationWriter N;
    private org.objectweb.asm.AnnotationWriter O;
    private org.objectweb.asm.Attribute w;
    private int x;
    private org.objectweb.asm.ByteVector y;
    int z;
    org.objectweb.asm.ByteVector A;
    org.objectweb.asm.FieldWriter B;
    org.objectweb.asm.FieldWriter C;
    org.objectweb.asm.MethodWriter D;
    org.objectweb.asm.MethodWriter E;
    private boolean K;
    private boolean J;
    boolean L;

    public ClassWriter(int r7) {
            r6 = this;
            r0 = r6
            r1 = 327680(0x50000, float:4.59177E-40)
            r0.<init>(r1)
            r0 = r6
            r1 = 1
            r0.c = r1
            r0 = r6
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.d = r1
            r0 = r6
            r1 = 256(0x100, float:3.59E-43)
            org.objectweb.asm.Item[] r1 = new org.objectweb.asm.Item[r1]
            r0.e = r1
            r0 = r6
            r1 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            r2 = r6
            org.objectweb.asm.Item[] r2 = r2.e
            int r2 = r2.length
            double r2 = (double) r2
            double r1 = r1 * r2
            int r1 = (int) r1
            r0.f = r1
            r0 = r6
            org.objectweb.asm.Item r1 = new org.objectweb.asm.Item
            r2 = r1
            r2.<init>()
            r0.g = r1
            r0 = r6
            org.objectweb.asm.Item r1 = new org.objectweb.asm.Item
            r2 = r1
            r2.<init>()
            r0.h = r1
            r0 = r6
            org.objectweb.asm.Item r1 = new org.objectweb.asm.Item
            r2 = r1
            r2.<init>()
            r0.i = r1
            r0 = r6
            org.objectweb.asm.Item r1 = new org.objectweb.asm.Item
            r2 = r1
            r2.<init>()
            r0.j = r1
            r0 = r6
            r1 = r7
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L66
            r1 = 1
            goto L67
        L66:
            r1 = 0
        L67:
            r0.K = r1
            r0 = r6
            r1 = r7
            r2 = 2
            r1 = r1 & r2
            if (r1 == 0) goto L75
            r1 = 1
            goto L76
        L75:
            r1 = 0
        L76:
            r0.J = r1
            return
    }

    public ClassWriter(org.objectweb.asm.ClassReader r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = r3
            r0.a(r1)
            r0 = r3
            r1 = r4
            r0.M = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visit(int r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r0.b = r1
            r0 = r6
            r1 = r8
            r0.k = r1
            r0 = r6
            r1 = r6
            r2 = r9
            int r1 = r1.newClass(r2)
            r0.l = r1
            r0 = r6
            r1 = r9
            r0.I = r1
            r0 = r10
            if (r0 == 0) goto L27
            r0 = r6
            r1 = r6
            r2 = r10
            int r1 = r1.newUTF8(r2)
            r0.m = r1
        L27:
            r0 = r6
            r1 = r11
            if (r1 != 0) goto L31
            r1 = 0
            goto L37
        L31:
            r1 = r6
            r2 = r11
            int r1 = r1.newClass(r2)
        L37:
            r0.n = r1
            r0 = r12
            if (r0 == 0) goto L78
            r0 = r12
            int r0 = r0.length
            if (r0 <= 0) goto L78
            r0 = r6
            r1 = r12
            int r1 = r1.length
            r0.o = r1
            r0 = r6
            r1 = r6
            int r1 = r1.o
            int[] r1 = new int[r1]
            r0.p = r1
            r0 = 0
            r13 = r0
        L59:
            r0 = r13
            r1 = r6
            int r1 = r1.o
            if (r0 >= r1) goto L78
            r0 = r6
            int[] r0 = r0.p
            r1 = r13
            r2 = r6
            r3 = r12
            r4 = r13
            r3 = r3[r4]
            int r2 = r2.newClass(r3)
            r0[r1] = r2
            int r13 = r13 + 1
            goto L59
        L78:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitSource(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = r7
            if (r0 == 0) goto Ld
            r0 = r6
            r1 = r6
            r2 = r7
            int r1 = r1.newUTF8(r2)
            r0.q = r1
        Ld:
            r0 = r8
            if (r0 == 0) goto L23
            r0 = r6
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r2 = r8
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            org.objectweb.asm.ByteVector r1 = r1.c(r2, r3, r4)
            r0.r = r1
        L23:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitOuterClass(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r6
            int r1 = r1.newClass(r2)
            r0.s = r1
            r0 = r7
            if (r0 == 0) goto L1b
            r0 = r8
            if (r0 == 0) goto L1b
            r0 = r5
            r1 = r5
            r2 = r7
            r3 = r8
            int r1 = r1.newNameType(r2, r3)
            r0.t = r1
        L1b:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r9, boolean r10) {
            r8 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = r8
            r2 = r9
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r8
            r3 = 1
            r4 = r11
            r5 = r11
            r6 = 2
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L3a
            r0 = r12
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.u
            r0.g = r1
            r0 = r8
            r1 = r12
            r0.u = r1
            goto L49
        L3a:
            r0 = r12
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.v
            r0.g = r1
            r0 = r8
            r1 = r12
            r0.v = r1
        L49:
            r0 = r12
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r10, org.objectweb.asm.TypePath r11, java.lang.String r12, boolean r13) {
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
            r2 = r12
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r9
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
            if (r0 == 0) goto L4c
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.N
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.N = r1
            goto L5b
        L4c:
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.O
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.O = r1
        L5b:
            r0 = r15
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.w
            r0.a = r1
            r0 = r3
            r1 = r4
            r0.w = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitInnerClass(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.y
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.y = r1
        L12:
            r0 = r4
            r1 = r5
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r9
            int r0 = r0.c
            if (r0 != 0) goto L75
            r0 = r4
            r1 = r0
            int r1 = r1.x
            r2 = 1
            int r1 = r1 + r2
            r0.x = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.y
            r1 = r9
            int r1 = r1.a
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.y
            r1 = r6
            if (r1 != 0) goto L44
            r1 = 0
            goto L49
        L44:
            r1 = r4
            r2 = r6
            int r1 = r1.newClass(r2)
        L49:
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.y
            r1 = r7
            if (r1 != 0) goto L59
            r1 = 0
            goto L5e
        L59:
            r1 = r4
            r2 = r7
            int r1 = r1.newUTF8(r2)
        L5e:
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.y
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r4
            int r1 = r1.x
            r0.c = r1
        L75:
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.FieldVisitor visitField(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Object r14) {
            r9 = this;
            org.objectweb.asm.FieldWriter r0 = new org.objectweb.asm.FieldWriter
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final org.objectweb.asm.MethodVisitor visitMethod(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String[] r16) {
            r11 = this;
            org.objectweb.asm.MethodWriter r0 = new org.objectweb.asm.MethodWriter
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r11
            boolean r8 = r8.K
            r9 = r11
            boolean r9 = r9.J
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public final void visitEnd() {
            r1 = this;
            return
    }

    public byte[] toByteArray() {
            r8 = this;
            r0 = r8
            int r0 = r0.c
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 <= r1) goto L13
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Class file too large!"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = 24
            r1 = 2
            r2 = r8
            int r2 = r2.o
            int r1 = r1 * r2
            int r0 = r0 + r1
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r8
            org.objectweb.asm.FieldWriter r0 = r0.B
            r11 = r0
        L24:
            r0 = r11
            if (r0 == 0) goto L3d
            int r10 = r10 + 1
            r0 = r9
            r1 = r11
            int r1 = r1.a()
            int r0 = r0 + r1
            r9 = r0
            r0 = r11
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            org.objectweb.asm.FieldWriter r0 = (org.objectweb.asm.FieldWriter) r0
            r11 = r0
            goto L24
        L3d:
            r0 = 0
            r12 = r0
            r0 = r8
            org.objectweb.asm.MethodWriter r0 = r0.D
            r13 = r0
        L46:
            r0 = r13
            if (r0 == 0) goto L63
            int r12 = r12 + 1
            r0 = r9
            r1 = r13
            int r1 = r1.a()
            int r0 = r0 + r1
            r9 = r0
            r0 = r13
            org.objectweb.asm.MethodVisitor r0 = r0.mv
            org.objectweb.asm.MethodWriter r0 = (org.objectweb.asm.MethodWriter) r0
            r13 = r0
            goto L46
        L63:
            r0 = 0
            r14 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.A
            if (r0 == 0) goto L84
            int r14 = r14 + 1
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.A
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            java.lang.String r1 = "BootstrapMethods"
            int r0 = r0.newUTF8(r1)
        L84:
            r0 = r8
            int r0 = r0.m
            if (r0 == 0) goto L99
            int r14 = r14 + 1
            int r9 = r9 + 8
            r0 = r8
            java.lang.String r1 = "Signature"
            int r0 = r0.newUTF8(r1)
        L99:
            r0 = r8
            int r0 = r0.q
            if (r0 == 0) goto Lae
            int r14 = r14 + 1
            int r9 = r9 + 8
            r0 = r8
            java.lang.String r1 = "SourceFile"
            int r0 = r0.newUTF8(r1)
        Lae:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            if (r0 == 0) goto Lcd
            int r14 = r14 + 1
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r2 = 6
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            java.lang.String r1 = "SourceDebugExtension"
            int r0 = r0.newUTF8(r1)
        Lcd:
            r0 = r8
            int r0 = r0.s
            if (r0 == 0) goto Le1
            int r14 = r14 + 1
            int r9 = r9 + 10
            r0 = r8
            java.lang.String r1 = "EnclosingMethod"
            int r0 = r0.newUTF8(r1)
        Le1:
            r0 = r8
            int r0 = r0.k
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto Lf8
            int r14 = r14 + 1
            int r9 = r9 + 6
            r0 = r8
            java.lang.String r1 = "Deprecated"
            int r0 = r0.newUTF8(r1)
        Lf8:
            r0 = r8
            int r0 = r0.k
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L127
            r0 = r8
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto L119
            r0 = r8
            int r0 = r0.k
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L127
        L119:
            int r14 = r14 + 1
            int r9 = r9 + 6
            r0 = r8
            java.lang.String r1 = "Synthetic"
            int r0 = r0.newUTF8(r1)
        L127:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.y
            if (r0 == 0) goto L145
            int r14 = r14 + 1
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.y
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            java.lang.String r1 = "InnerClasses"
            int r0 = r0.newUTF8(r1)
        L145:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.u
            if (r0 == 0) goto L163
            int r14 = r14 + 1
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.u
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            int r0 = r0.newUTF8(r1)
        L163:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.v
            if (r0 == 0) goto L181
            int r14 = r14 + 1
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.v
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            int r0 = r0.newUTF8(r1)
        L181:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.N
            if (r0 == 0) goto L19f
            int r14 = r14 + 1
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.N
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            java.lang.String r1 = "RuntimeVisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
        L19f:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.O
            if (r0 == 0) goto L1bd
            int r14 = r14 + 1
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.O
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            java.lang.String r1 = "RuntimeInvisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
        L1bd:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.w
            if (r0 == 0) goto L1df
            r0 = r14
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.w
            int r1 = r1.a()
            int r0 = r0 + r1
            r14 = r0
            r0 = r9
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.w
            r2 = r8
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            int r1 = r1.a(r2, r3, r4, r5, r6)
            int r0 = r0 + r1
            r9 = r0
        L1df:
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.d
            int r1 = r1.b
            int r0 = r0 + r1
            r9 = r0
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.b
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r15
            r1 = r8
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.d
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.d
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = 393216(0x60000, float:5.51013E-40)
            r1 = r8
            int r1 = r1.k
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            r2 = 64
            int r1 = r1 / r2
            r0 = r0 | r1
            r16 = r0
            r0 = r15
            r1 = r8
            int r1 = r1.k
            r2 = r16
            r3 = -1
            r2 = r2 ^ r3
            r1 = r1 & r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.l
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.n
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r15
            r1 = r8
            int r1 = r1.o
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r17 = r0
        L257:
            r0 = r17
            r1 = r8
            int r1 = r1.o
            if (r0 >= r1) goto L273
            r0 = r15
            r1 = r8
            int[] r1 = r1.p
            r2 = r17
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r17 = r17 + 1
            goto L257
        L273:
            r0 = r15
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.FieldWriter r0 = r0.B
            r11 = r0
        L27f:
            r0 = r11
            if (r0 == 0) goto L294
            r0 = r11
            r1 = r15
            r0.a(r1)
            r0 = r11
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            org.objectweb.asm.FieldWriter r0 = (org.objectweb.asm.FieldWriter) r0
            r11 = r0
            goto L27f
        L294:
            r0 = r15
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.MethodWriter r0 = r0.D
            r13 = r0
        L2a2:
            r0 = r13
            if (r0 == 0) goto L2bb
            r0 = r13
            r1 = r15
            r0.a(r1)
            r0 = r13
            org.objectweb.asm.MethodVisitor r0 = r0.mv
            org.objectweb.asm.MethodWriter r0 = (org.objectweb.asm.MethodWriter) r0
            r13 = r0
            goto L2a2
        L2bb:
            r0 = r15
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.A
            if (r0 == 0) goto L301
            r0 = r15
            r1 = r8
            java.lang.String r2 = "BootstrapMethods"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r15
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.A
            int r1 = r1.b
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.z
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r15
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.A
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.A
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L301:
            r0 = r8
            int r0 = r0.m
            if (r0 == 0) goto L320
            r0 = r15
            r1 = r8
            java.lang.String r2 = "Signature"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.m
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L320:
            r0 = r8
            int r0 = r0.q
            if (r0 == 0) goto L33f
            r0 = r15
            r1 = r8
            java.lang.String r2 = "SourceFile"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.q
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L33f:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            if (r0 == 0) goto L371
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            r17 = r0
            r0 = r15
            r1 = r8
            java.lang.String r2 = "SourceDebugExtension"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r17
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r15
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            byte[] r1 = r1.a
            r2 = 0
            r3 = r17
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L371:
            r0 = r8
            int r0 = r0.s
            if (r0 == 0) goto L399
            r0 = r15
            r1 = r8
            java.lang.String r2 = "EnclosingMethod"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 4
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r15
            r1 = r8
            int r1 = r1.s
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.t
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L399:
            r0 = r8
            int r0 = r0.k
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L3b3
            r0 = r15
            r1 = r8
            java.lang.String r2 = "Deprecated"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L3b3:
            r0 = r8
            int r0 = r0.k
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L3e5
            r0 = r8
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto L3d4
            r0 = r8
            int r0 = r0.k
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L3e5
        L3d4:
            r0 = r15
            r1 = r8
            java.lang.String r2 = "Synthetic"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L3e5:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.y
            if (r0 == 0) goto L423
            r0 = r15
            r1 = r8
            java.lang.String r2 = "InnerClasses"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r15
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.y
            int r1 = r1.b
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.x
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r15
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.y
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.y
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L423:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.u
            if (r0 == 0) goto L43f
            r0 = r15
            r1 = r8
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.u
            r1 = r15
            r0.a(r1)
        L43f:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.v
            if (r0 == 0) goto L45b
            r0 = r15
            r1 = r8
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.v
            r1 = r15
            r0.a(r1)
        L45b:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.N
            if (r0 == 0) goto L477
            r0 = r15
            r1 = r8
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.N
            r1 = r15
            r0.a(r1)
        L477:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.O
            if (r0 == 0) goto L493
            r0 = r15
            r1 = r8
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.O
            r1 = r15
            r0.a(r1)
        L493:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.w
            if (r0 == 0) goto L4a8
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.w
            r1 = r8
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = r15
            r0.a(r1, r2, r3, r4, r5, r6)
        L4a8:
            r0 = r8
            boolean r0 = r0.L
            if (r0 == 0) goto L50b
            r0 = r8
            r1 = 0
            r0.u = r1
            r0 = r8
            r1 = 0
            r0.v = r1
            r0 = r8
            r1 = 0
            r0.w = r1
            r0 = r8
            r1 = 0
            r0.x = r1
            r0 = r8
            r1 = 0
            r0.y = r1
            r0 = r8
            r1 = 0
            r0.z = r1
            r0 = r8
            r1 = 0
            r0.A = r1
            r0 = r8
            r1 = 0
            r0.B = r1
            r0 = r8
            r1 = 0
            r0.C = r1
            r0 = r8
            r1 = 0
            r0.D = r1
            r0 = r8
            r1 = 0
            r0.E = r1
            r0 = r8
            r1 = 0
            r0.K = r1
            r0 = r8
            r1 = 1
            r0.J = r1
            r0 = r8
            r1 = 0
            r0.L = r1
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r15
            byte[] r2 = r2.a
            r1.<init>(r2)
            r1 = r8
            r2 = 4
            r0.accept(r1, r2)
            r0 = r8
            byte[] r0 = r0.toByteArray()
            return r0
        L50b:
            r0 = r15
            byte[] r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(java.lang.Object r8) {
            r7 = this;
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L15
            r0 = r8
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        L15:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L2a
            r0 = r8
            java.lang.Byte r0 = (java.lang.Byte) r0
            int r0 = r0.intValue()
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        L2a:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto L3f
            r0 = r8
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        L3f:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 == 0) goto L54
            r0 = r8
            java.lang.Short r0 = (java.lang.Short) r0
            int r0 = r0.intValue()
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        L54:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L71
            r0 = r8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        L71:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L86
            r0 = r8
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        L86:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto L9b
            r0 = r8
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        L9b:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto Lb0
            r0 = r8
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r9 = r0
            r0 = r7
            r1 = r9
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        Lb0:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto Lc0
            r0 = r7
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            org.objectweb.asm.Item r0 = r0.b(r1)
            return r0
        Lc0:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto Lf8
            r0 = r8
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            r9 = r0
            r0 = r9
            int r0 = r0.getSort()
            r10 = r0
            r0 = r10
            r1 = 10
            if (r0 != r1) goto Le0
            r0 = r7
            r1 = r9
            java.lang.String r1 = r1.getInternalName()
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        Le0:
            r0 = r10
            r1 = 11
            if (r0 != r1) goto Lef
            r0 = r7
            r1 = r9
            java.lang.String r1 = r1.getDescriptor()
            org.objectweb.asm.Item r0 = r0.c(r1)
            return r0
        Lef:
            r0 = r7
            r1 = r9
            java.lang.String r1 = r1.getDescriptor()
            org.objectweb.asm.Item r0 = r0.a(r1)
            return r0
        Lf8:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 == 0) goto L11d
            r0 = r8
            org.objectweb.asm.Handle r0 = (org.objectweb.asm.Handle) r0
            r9 = r0
            r0 = r7
            r1 = r9
            int r1 = r1.a
            r2 = r9
            java.lang.String r2 = r2.b
            r3 = r9
            java.lang.String r3 = r3.c
            r4 = r9
            java.lang.String r4 = r4.d
            r5 = r9
            boolean r5 = r5.e
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3, r4, r5)
            return r0
        L11d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "value "
            java.lang.StringBuffer r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuffer r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public int newConst(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.Item r0 = r0.a(r1)
            int r0 = r0.a
            return r0
    }

    public int newUTF8(java.lang.String r8) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.g
            r1 = 1
            r2 = r8
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L41
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 1
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putUTF8(r1)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.g
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.b(r1)
        L41:
            r0 = r9
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(java.lang.String r8) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = 7
            r2 = r8
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.h
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L44
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 7
            r2 = r7
            r3 = r8
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.h
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.b(r1)
        L44:
            r0 = r9
            return r0
    }

    public int newClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.Item r0 = r0.a(r1)
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item c(java.lang.String r8) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = 16
            r2 = r8
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.h
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L44
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 16
            r2 = r7
            r3 = r8
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.h
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.b(r1)
        L44:
            r0 = r9
            return r0
    }

    public int newMethodType(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.Item r0 = r0.c(r1)
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            r9 = this;
            r0 = r9
            org.objectweb.asm.Item r0 = r0.j
            r1 = 20
            r2 = r10
            int r1 = r1 + r2
            r2 = r11
            r3 = r12
            r4 = r13
            r0.a(r1, r2, r3, r4)
            r0 = r9
            r1 = r9
            org.objectweb.asm.Item r1 = r1.j
            org.objectweb.asm.Item r0 = r0.a(r1)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L64
            r0 = r10
            r1 = 4
            if (r0 > r1) goto L35
            r0 = r9
            r1 = 15
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            int r3 = r3.newField(r4, r5, r6)
            r0.b(r1, r2, r3)
            goto L46
        L35:
            r0 = r9
            r1 = 15
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            int r3 = r3.newMethod(r4, r5, r6, r7)
            r0.b(r1, r2, r3)
        L46:
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r9
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r9
            org.objectweb.asm.Item r3 = r3.j
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r9
            r1 = r15
            r0.b(r1)
        L64:
            r0 = r15
            return r0
    }

    public int newHandle(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = 9
            if (r5 != r6) goto L10
            r5 = 1
            goto L11
        L10:
            r5 = 0
        L11:
            int r0 = r0.newHandle(r1, r2, r3, r4, r5)
            return r0
    }

    public int newHandle(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3, r4, r5)
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(java.lang.String r9, java.lang.String r10, org.objectweb.asm.Handle r11, java.lang.Object... r12) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.A
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L19
            r0 = r8
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r2 = r1; r1 = r0; r0 = r2; 
            r1.A = r2
            r13 = r0
        L19:
            r0 = r13
            int r0 = r0.b
            r14 = r0
            r0 = r11
            int r0 = r0.hashCode()
            r15 = r0
            r0 = r13
            r1 = r8
            r2 = r11
            int r2 = r2.a
            r3 = r11
            java.lang.String r3 = r3.b
            r4 = r11
            java.lang.String r4 = r4.c
            r5 = r11
            java.lang.String r5 = r5.d
            r6 = r11
            boolean r6 = r6.isInterface()
            int r1 = r1.newHandle(r2, r3, r4, r5, r6)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r12
            int r0 = r0.length
            r16 = r0
            r0 = r13
            r1 = r16
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r17 = r0
        L54:
            r0 = r17
            r1 = r16
            if (r0 >= r1) goto L7e
            r0 = r12
            r1 = r17
            r0 = r0[r1]
            r18 = r0
            r0 = r15
            r1 = r18
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            r15 = r0
            r0 = r13
            r1 = r8
            r2 = r18
            int r1 = r1.newConst(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r17 = r17 + 1
            goto L54
        L7e:
            r0 = r13
            byte[] r0 = r0.a
            r17 = r0
            r0 = 2
            r1 = r16
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 << r1
            r18 = r0
            r0 = r15
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r15 = r0
            r0 = r8
            org.objectweb.asm.Item[] r0 = r0.e
            r1 = r15
            r2 = r8
            org.objectweb.asm.Item[] r2 = r2.e
            int r2 = r2.length
            int r1 = r1 % r2
            r0 = r0[r1]
            r19 = r0
        La3:
            r0 = r19
            if (r0 == 0) goto Lfd
            r0 = r19
            int r0 = r0.b
            r1 = 33
            if (r0 != r1) goto Lbc
            r0 = r19
            int r0 = r0.j
            r1 = r15
            if (r0 == r1) goto Lc6
        Lbc:
            r0 = r19
            org.objectweb.asm.Item r0 = r0.k
            r19 = r0
            goto La3
        Lc6:
            r0 = r19
            int r0 = r0.c
            r20 = r0
            r0 = 0
            r21 = r0
        Ld0:
            r0 = r21
            r1 = r18
            if (r0 >= r1) goto Lfa
            r0 = r17
            r1 = r14
            r2 = r21
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = r17
            r2 = r20
            r3 = r21
            int r2 = r2 + r3
            r1 = r1[r2]
            if (r0 == r1) goto Lf4
            r0 = r19
            org.objectweb.asm.Item r0 = r0.k
            r19 = r0
            goto La3
        Lf4:
            int r21 = r21 + 1
            goto Ld0
        Lfa:
            goto Lfd
        Lfd:
            r0 = r19
            if (r0 == 0) goto L113
            r0 = r19
            int r0 = r0.a
            r20 = r0
            r0 = r13
            r1 = r14
            r0.b = r1
            goto L13a
        L113:
            r0 = r8
            r1 = r0
            int r1 = r1.z
            r2 = r1; r1 = r0; r0 = r2; 
            r3 = 1
            int r2 = r2 + r3
            r1.z = r2
            r20 = r0
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r20
            r1.<init>(r2)
            r19 = r0
            r0 = r19
            r1 = r14
            r2 = r15
            r0.a(r1, r2)
            r0 = r8
            r1 = r19
            r0.b(r1)
        L13a:
            r0 = r8
            org.objectweb.asm.Item r0 = r0.i
            r1 = r9
            r2 = r10
            r3 = r20
            r0.a(r1, r2, r3)
            r0 = r8
            r1 = r8
            org.objectweb.asm.Item r1 = r1.i
            org.objectweb.asm.Item r0 = r0.a(r1)
            r19 = r0
            r0 = r19
            if (r0 != 0) goto L180
            r0 = r8
            r1 = 18
            r2 = r20
            r3 = r8
            r4 = r9
            r5 = r10
            int r3 = r3.newNameType(r4, r5)
            r0.a(r1, r2, r3)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r8
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r8
            org.objectweb.asm.Item r3 = r3.i
            r1.<init>(r2, r3)
            r19 = r0
            r0 = r8
            r1 = r19
            r0.b(r1)
        L180:
            r0 = r19
            return r0
    }

    public int newInvokeDynamic(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3, r4)
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.i
            r1 = 9
            r2 = r8
            r3 = r9
            r4 = r10
            r0.a(r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.i
            org.objectweb.asm.Item r0 = r0.a(r1)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L4a
            r0 = r7
            r1 = 9
            r2 = r7
            r3 = r8
            int r2 = r2.newClass(r3)
            r3 = r7
            r4 = r9
            r5 = r10
            int r3 = r3.newNameType(r4, r5)
            r0.a(r1, r2, r3)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.i
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r7
            r1 = r11
            r0.b(r1)
        L4a:
            r0 = r11
            return r0
    }

    public int newField(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3)
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r0 = r11
            if (r0 == 0) goto La
            r0 = 11
            goto Lc
        La:
            r0 = 10
        Lc:
            r12 = r0
            r0 = r7
            org.objectweb.asm.Item r0 = r0.i
            r1 = r12
            r2 = r8
            r3 = r9
            r4 = r10
            r0.a(r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.i
            org.objectweb.asm.Item r0 = r0.a(r1)
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L58
            r0 = r7
            r1 = r12
            r2 = r7
            r3 = r8
            int r2 = r2.newClass(r3)
            r3 = r7
            r4 = r9
            r5 = r10
            int r3 = r3.newNameType(r4, r5)
            r0.a(r1, r2, r3)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.i
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r7
            r1 = r13
            r0.b(r1)
        L58:
            r0 = r13
            return r0
    }

    public int newMethod(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3, r4)
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(int r8) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.g
            r1 = r8
            r0.a(r1)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L3e
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 3
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.g
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.b(r1)
        L3e:
            r0 = r9
            return r0
    }

    org.objectweb.asm.Item a(float r8) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.g
            r1 = r8
            r0.a(r1)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L44
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 4
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r7
            org.objectweb.asm.Item r1 = r1.g
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.g
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.b(r1)
        L44:
            r0 = r9
            return r0
    }

    org.objectweb.asm.Item a(long r6) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.Item r0 = r0.g
            r1 = r6
            r0.a(r1)
            r0 = r5
            r1 = r5
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.a(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L41
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 5
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putLong(r1)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r5
            int r2 = r2.c
            r3 = r5
            org.objectweb.asm.Item r3 = r3.g
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r5
            r1 = r0
            int r1 = r1.c
            r2 = 2
            int r1 = r1 + r2
            r0.c = r1
            r0 = r5
            r1 = r8
            r0.b(r1)
        L41:
            r0 = r8
            return r0
    }

    org.objectweb.asm.Item a(double r6) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.Item r0 = r0.g
            r1 = r6
            r0.a(r1)
            r0 = r5
            r1 = r5
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.a(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L48
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 6
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            org.objectweb.asm.Item r1 = r1.g
            long r1 = r1.d
            org.objectweb.asm.ByteVector r0 = r0.putLong(r1)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r5
            int r2 = r2.c
            r3 = r5
            org.objectweb.asm.Item r3 = r3.g
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r5
            r1 = r0
            int r1 = r1.c
            r2 = 2
            int r1 = r1 + r2
            r0.c = r1
            r0 = r5
            r1 = r8
            r0.b(r1)
        L48:
            r0 = r8
            return r0
    }

    private org.objectweb.asm.Item b(java.lang.String r8) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = 8
            r2 = r8
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.h
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L44
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = 8
            r2 = r7
            r3 = r8
            int r2 = r2.newUTF8(r3)
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.h
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r7
            r1 = r9
            r0.b(r1)
        L44:
            r0 = r9
            return r0
    }

    public int newNameType(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.Item r0 = r0.a(r1, r2)
            int r0 = r0.a
            return r0
    }

    org.objectweb.asm.Item a(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = 12
            r2 = r8
            r3 = r9
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.h
            org.objectweb.asm.Item r0 = r0.a(r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L45
            r0 = r7
            r1 = 12
            r2 = r7
            r3 = r8
            int r2 = r2.newUTF8(r3)
            r3 = r7
            r4 = r9
            int r3 = r3.newUTF8(r4)
            r0.a(r1, r2, r3)
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r7
            r3 = r2
            int r3 = r3.c
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            r3 = r7
            org.objectweb.asm.Item r3 = r3.h
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r7
            r1 = r10
            r0.b(r1)
        L45:
            r0 = r10
            return r0
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    int m7563c(java.lang.String r7) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.Item r0 = r0.g
            r1 = 30
            r2 = r7
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r6
            r1 = r6
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.a(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L22
            r0 = r6
            r1 = r6
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.c(r1)
            r8 = r0
        L22:
            r0 = r8
            int r0 = r0.a
            return r0
    }

    int a(java.lang.String r6, int r7) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.Item r0 = r0.g
            r1 = 31
            r0.b = r1
            r0 = r5
            org.objectweb.asm.Item r0 = r0.g
            r1 = r7
            r0.c = r1
            r0 = r5
            org.objectweb.asm.Item r0 = r0.g
            r1 = r6
            r0.g = r1
            r0 = r5
            org.objectweb.asm.Item r0 = r0.g
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 31
            r3 = r6
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            r3 = r7
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            r0 = r5
            r1 = r5
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.a(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L42
            r0 = r5
            r1 = r5
            org.objectweb.asm.Item r1 = r1.g
            org.objectweb.asm.Item r0 = r0.c(r1)
            r8 = r0
        L42:
            r0 = r8
            int r0 = r0.a
            return r0
    }

    private org.objectweb.asm.Item c(org.objectweb.asm.Item r7) {
            r6 = this;
            r0 = r6
            r1 = r0
            short r1 = r1.G
            r2 = 1
            int r1 = r1 + r2
            short r1 = (short) r1
            r0.G = r1
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r6
            short r2 = r2.G
            r3 = r6
            org.objectweb.asm.Item r3 = r3.g
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.b(r1)
            r0 = r6
            org.objectweb.asm.Item[] r0 = r0.H
            if (r0 != 0) goto L30
            r0 = r6
            r1 = 16
            org.objectweb.asm.Item[] r1 = new org.objectweb.asm.Item[r1]
            r0.H = r1
        L30:
            r0 = r6
            short r0 = r0.G
            r1 = r6
            org.objectweb.asm.Item[] r1 = r1.H
            int r1 = r1.length
            if (r0 != r1) goto L5b
            r0 = 2
            r1 = r6
            org.objectweb.asm.Item[] r1 = r1.H
            int r1 = r1.length
            int r0 = r0 * r1
            org.objectweb.asm.Item[] r0 = new org.objectweb.asm.Item[r0]
            r9 = r0
            r0 = r6
            org.objectweb.asm.Item[] r0 = r0.H
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r6
            org.objectweb.asm.Item[] r4 = r4.H
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.H = r1
        L5b:
            r0 = r6
            org.objectweb.asm.Item[] r0 = r0.H
            r1 = r6
            short r1 = r1.G
            r2 = r8
            r0[r1] = r2
            r0 = r8
            return r0
    }

    int a(int r8, int r9) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = 32
            r0.b = r1
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = r8
            long r1 = (long) r1
            r2 = r9
            long r2 = (long) r2
            r3 = 32
            long r2 = r2 << r3
            long r1 = r1 | r2
            r0.d = r1
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 32
            r3 = r8
            int r2 = r2 + r3
            r3 = r9
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            r0 = r7
            r1 = r7
            org.objectweb.asm.Item r1 = r1.h
            org.objectweb.asm.Item r0 = r0.a(r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L70
            r0 = r7
            org.objectweb.asm.Item[] r0 = r0.H
            r1 = r8
            r0 = r0[r1]
            java.lang.String r0 = r0.g
            r11 = r0
            r0 = r7
            org.objectweb.asm.Item[] r0 = r0.H
            r1 = r9
            r0 = r0[r1]
            java.lang.String r0 = r0.g
            r12 = r0
            r0 = r7
            org.objectweb.asm.Item r0 = r0.h
            r1 = r7
            r2 = r7
            r3 = r11
            r4 = r12
            java.lang.String r2 = r2.getCommonSuperClass(r3, r4)
            int r1 = r1.m7563c(r2)
            r0.c = r1
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = 0
            r3 = r7
            org.objectweb.asm.Item r3 = r3.h
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r7
            r1 = r10
            r0.b(r1)
        L70:
            r0 = r10
            int r0 = r0.c
            return r0
    }

    protected java.lang.String getCommonSuperClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r9 = r0
            r0 = r5
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Exception -> L2b
            r1 = 0
            r2 = r9
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.Exception -> L2b
            r7 = r0
            r0 = r6
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Exception -> L2b
            r1 = 0
            r2 = r9
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.Exception -> L2b
            r8 = r0
            goto L3a
        L2b:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = r7
            r1 = r8
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L45
            r0 = r5
            return r0
        L45:
            r0 = r8
            r1 = r7
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L50
            r0 = r6
            return r0
        L50:
            r0 = r7
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L5f
            r0 = r8
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L63
        L5f:
            java.lang.String r0 = "java/lang/Object"
            return r0
        L63:
            r0 = r7
            java.lang.Class r0 = r0.getSuperclass()
            r7 = r0
            r0 = r7
            r1 = r8
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L63
            r0 = r7
            java.lang.String r0 = r0.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    private org.objectweb.asm.Item a(org.objectweb.asm.Item r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.Item[] r0 = r0.e
            r1 = r5
            int r1 = r1.j
            r2 = r4
            org.objectweb.asm.Item[] r2 = r2.e
            int r2 = r2.length
            int r1 = r1 % r2
            r0 = r0[r1]
            r6 = r0
        L10:
            r0 = r6
            if (r0 == 0) goto L2f
            r0 = r6
            int r0 = r0.b
            r1 = r5
            int r1 = r1.b
            if (r0 != r1) goto L27
            r0 = r5
            r1 = r6
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L2f
        L27:
            r0 = r6
            org.objectweb.asm.Item r0 = r0.k
            r6 = r0
            goto L10
        L2f:
            r0 = r6
            return r0
    }

    private void b(org.objectweb.asm.Item r7) {
            r6 = this;
            r0 = r6
            int r0 = r0.c
            r1 = r6
            short r1 = r1.G
            int r0 = r0 + r1
            r1 = r6
            int r1 = r1.f
            if (r0 <= r1) goto L7b
            r0 = r6
            org.objectweb.asm.Item[] r0 = r0.e
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = 2
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            org.objectweb.asm.Item[] r0 = new org.objectweb.asm.Item[r0]
            r10 = r0
            r0 = r8
            r1 = 1
            int r0 = r0 - r1
            r11 = r0
        L27:
            r0 = r11
            if (r0 < 0) goto L6a
            r0 = r6
            org.objectweb.asm.Item[] r0 = r0.e
            r1 = r11
            r0 = r0[r1]
            r12 = r0
        L35:
            r0 = r12
            if (r0 == 0) goto L64
            r0 = r12
            int r0 = r0.j
            r1 = r10
            int r1 = r1.length
            int r0 = r0 % r1
            r13 = r0
            r0 = r12
            org.objectweb.asm.Item r0 = r0.k
            r14 = r0
            r0 = r12
            r1 = r10
            r2 = r13
            r1 = r1[r2]
            r0.k = r1
            r0 = r10
            r1 = r13
            r2 = r12
            r0[r1] = r2
            r0 = r14
            r12 = r0
            goto L35
        L64:
            int r11 = r11 + (-1)
            goto L27
        L6a:
            r0 = r6
            r1 = r10
            r0.e = r1
            r0 = r6
            r1 = r9
            double r1 = (double) r1
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r1 = r1 * r2
            int r1 = (int) r1
            r0.f = r1
        L7b:
            r0 = r7
            int r0 = r0.j
            r1 = r6
            org.objectweb.asm.Item[] r1 = r1.e
            int r1 = r1.length
            int r0 = r0 % r1
            r8 = r0
            r0 = r7
            r1 = r6
            org.objectweb.asm.Item[] r1 = r1.e
            r2 = r8
            r1 = r1[r2]
            r0.k = r1
            r0 = r6
            org.objectweb.asm.Item[] r0 = r0.e
            r1 = r8
            r2 = r7
            r0[r1] = r2
            return
    }

    private void a(int r5, int r6, int r7) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = r5
            r2 = r6
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    private void b(int r5, int r6, int r7) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = r5
            r2 = r6
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    static {
            _clinit_()
            r0 = 220(0xdc, float:3.08E-43)
            byte[] r0 = new byte[r0]
            r6 = r0
            java.lang.String r0 = "AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ"
            r7 = r0
            r0 = 0
            r5 = r0
        Le:
            r0 = r5
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L26
            r0 = r6
            r1 = r5
            r2 = r7
            r3 = r5
            char r2 = r2.charAt(r3)
            r3 = 65
            int r2 = r2 - r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r5 = r5 + 1
            goto Le
        L26:
            r0 = r6
            org.objectweb.asm.ClassWriter.a = r0
            return
    }

    static void _clinit_() {
            return
    }
}
