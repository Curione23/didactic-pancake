package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/MethodWriter.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/MethodWriter.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/MethodWriter.class */
class MethodWriter extends org.objectweb.asm.MethodVisitor {
    final org.objectweb.asm.ClassWriter b;
    private int c;
    private final int d;
    private final int e;
    private final java.lang.String f;
    java.lang.String g;
    int h;
    int i;
    int j;
    int[] k;
    private org.objectweb.asm.ByteVector l;
    private org.objectweb.asm.AnnotationWriter m;
    private org.objectweb.asm.AnnotationWriter n;
    private org.objectweb.asm.AnnotationWriter U;
    private org.objectweb.asm.AnnotationWriter V;
    private org.objectweb.asm.AnnotationWriter[] o;
    private org.objectweb.asm.AnnotationWriter[] p;
    private int S;
    private org.objectweb.asm.Attribute q;
    private org.objectweb.asm.ByteVector r;
    private int s;
    private int t;
    private int T;
    private int u;
    private org.objectweb.asm.ByteVector v;
    private int w;
    private int[] x;
    private int[] z;
    private int A;
    private org.objectweb.asm.Handler B;
    private org.objectweb.asm.Handler C;
    private int Z;
    private org.objectweb.asm.ByteVector $;
    private int D;
    private org.objectweb.asm.ByteVector E;
    private int F;
    private org.objectweb.asm.ByteVector G;
    private int H;
    private org.objectweb.asm.ByteVector I;
    private int Y;
    private org.objectweb.asm.AnnotationWriter W;
    private org.objectweb.asm.AnnotationWriter X;
    private org.objectweb.asm.Attribute J;
    private boolean K;
    private int L;
    private final int M;
    private org.objectweb.asm.Label N;
    private org.objectweb.asm.Label O;
    private org.objectweb.asm.Label P;
    private int Q;
    private int R;

    MethodWriter(org.objectweb.asm.ClassWriter r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12, boolean r13, boolean r14) {
            r6 = this;
            r0 = r6
            r1 = 327680(0x50000, float:4.59177E-40)
            r0.<init>(r1)
            r0 = r6
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.r = r1
            r0 = r7
            org.objectweb.asm.MethodWriter r0 = r0.D
            if (r0 != 0) goto L20
            r0 = r7
            r1 = r6
            r0.D = r1
            goto L28
        L20:
            r0 = r7
            org.objectweb.asm.MethodWriter r0 = r0.E
            r1 = r6
            r0.mv = r1
        L28:
            r0 = r7
            r1 = r6
            r0.E = r1
            r0 = r6
            r1 = r7
            r0.b = r1
            r0 = r6
            r1 = r8
            r0.c = r1
            java.lang.String r0 = "<init>"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            r0 = r6
            r1 = r0
            int r1 = r1.c
            r2 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r2
            r0.c = r1
        L4b:
            r0 = r6
            r1 = r7
            r2 = r9
            int r1 = r1.newUTF8(r2)
            r0.d = r1
            r0 = r6
            r1 = r7
            r2 = r10
            int r1 = r1.newUTF8(r2)
            r0.e = r1
            r0 = r6
            r1 = r10
            r0.f = r1
            r0 = r6
            r1 = r11
            r0.g = r1
            r0 = r12
            if (r0 == 0) goto La8
            r0 = r12
            int r0 = r0.length
            if (r0 <= 0) goto La8
            r0 = r6
            r1 = r12
            int r1 = r1.length
            r0.j = r1
            r0 = r6
            r1 = r6
            int r1 = r1.j
            int[] r1 = new int[r1]
            r0.k = r1
            r0 = 0
            r15 = r0
        L89:
            r0 = r15
            r1 = r6
            int r1 = r1.j
            if (r0 >= r1) goto La8
            r0 = r6
            int[] r0 = r0.k
            r1 = r15
            r2 = r7
            r3 = r12
            r4 = r15
            r3 = r3[r4]
            int r2 = r2.newClass(r3)
            r0[r1] = r2
            int r15 = r15 + 1
            goto L89
        La8:
            r0 = r6
            r1 = r14
            if (r1 == 0) goto Lb2
            r1 = 0
            goto Lbc
        Lb2:
            r1 = r13
            if (r1 == 0) goto Lbb
            r1 = 1
            goto Lbc
        Lbb:
            r1 = 2
        Lbc:
            r0.M = r1
            r0 = r13
            if (r0 != 0) goto Lc9
            r0 = r14
            if (r0 == 0) goto L10b
        Lc9:
            r0 = r6
            java.lang.String r0 = r0.f
            int r0 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r1 = 2
            int r0 = r0 >> r1
            r15 = r0
            r0 = r8
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lde
            int r15 = r15 + (-1)
        Lde:
            r0 = r6
            r1 = r15
            r0.t = r1
            r0 = r6
            r1 = r15
            r0.T = r1
            r0 = r6
            org.objectweb.asm.Label r1 = new org.objectweb.asm.Label
            r2 = r1
            r2.<init>()
            r0.N = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.N
            r1 = r0
            int r1 = r1.a
            r2 = 8
            r1 = r1 | r2
            r0.a = r1
            r0 = r6
            r1 = r6
            org.objectweb.asm.Label r1 = r1.N
            r0.visitLabel(r1)
        L10b:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.$
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.$ = r1
        L12:
            r0 = r4
            r1 = r0
            int r1 = r1.Z
            r2 = 1
            int r1 = r1 + r2
            r0.Z = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.$
            r1 = r5
            if (r1 != 0) goto L28
            r1 = 0
            goto L30
        L28:
            r1 = r4
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r5
            int r1 = r1.newUTF8(r2)
        L30:
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
            r8 = this;
            r0 = r8
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.l = r1
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 0
            r4 = r8
            org.objectweb.asm.ByteVector r4 = r4.l
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
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
            org.objectweb.asm.AnnotationWriter r1 = r1.m
            r0.g = r1
            r0 = r8
            r1 = r12
            r0.m = r1
            goto L4f
        L40:
            r0 = r12
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.n
            r0.g = r1
            r0 = r8
            r1 = r12
            r0.n = r1
        L4f:
            r0 = r12
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
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
            org.objectweb.asm.AnnotationWriter r1 = r1.U
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.U = r1
            goto L61
        L52:
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.V
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.V = r1
        L61:
            r0 = r15
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int r9, java.lang.String r10, boolean r11) {
            r8 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r12 = r0
            java.lang.String r0 = "Ljava/lang/Synthetic;"
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            r0 = r8
            r1 = r8
            int r1 = r1.S
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r0.S = r1
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 0
            r4 = r12
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L32:
            r0 = r12
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r10
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 1
            r4 = r12
            r5 = r12
            r6 = 2
            r1.<init>(r2, r3, r4, r5, r6)
            r13 = r0
            r0 = r11
            if (r0 == 0) goto L87
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.o
            if (r0 != 0) goto L71
            r0 = r8
            r1 = r8
            java.lang.String r1 = r1.f
            org.objectweb.asm.Type[] r1 = org.objectweb.asm.Type.getArgumentTypes(r1)
            int r1 = r1.length
            org.objectweb.asm.AnnotationWriter[] r1 = new org.objectweb.asm.AnnotationWriter[r1]
            r0.o = r1
        L71:
            r0 = r13
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.o
            r2 = r9
            r1 = r1[r2]
            r0.g = r1
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.o
            r1 = r9
            r2 = r13
            r0[r1] = r2
            goto Lb0
        L87:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.p
            if (r0 != 0) goto L9d
            r0 = r8
            r1 = r8
            java.lang.String r1 = r1.f
            org.objectweb.asm.Type[] r1 = org.objectweb.asm.Type.getArgumentTypes(r1)
            int r1 = r1.length
            org.objectweb.asm.AnnotationWriter[] r1 = new org.objectweb.asm.AnnotationWriter[r1]
            r0.p = r1
        L9d:
            r0 = r13
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.p
            r2 = r9
            r1 = r1[r2]
            r0.g = r1
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.p
            r1 = r9
            r2 = r13
            r0[r1] = r2
        Lb0:
            r0 = r13
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0.isCodeAttribute()
            if (r0 == 0) goto L17
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.J
            r0.a = r1
            r0 = r3
            r1 = r4
            r0.J = r1
            goto L24
        L17:
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.q
            r0.a = r1
            r0 = r3
            r1 = r4
            r0.q = r1
        L24:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
            r1 = this;
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int r9, int r10, java.lang.Object[] r11, int r12, java.lang.Object[] r13) {
            r8 = this;
            r0 = r8
            int r0 = r0.M
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L12a
            r0 = r8
            int[] r0 = r0.x
            if (r0 != 0) goto L18
            r0 = r8
            r0.f()
        L18:
            r0 = r8
            r1 = r10
            r0.T = r1
            r0 = r8
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r2 = r10
            r3 = r12
            int r0 = r0.a(r1, r2, r3)
            r14 = r0
            r0 = 0
            r15 = r0
        L30:
            r0 = r15
            r1 = r10
            if (r0 >= r1) goto La5
            r0 = r11
            r1 = r15
            r0 = r0[r1]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L5e
            r0 = r8
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = 24117248(0x1700000, float:4.4081038E-38)
            r3 = r8
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r11
            r5 = r15
            r4 = r4[r5]
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r3.m7563c(r4)
            r2 = r2 | r3
            r0[r1] = r2
            goto L9f
        L5e:
            r0 = r11
            r1 = r15
            r0 = r0[r1]
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L7f
            r0 = r8
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = r11
            r3 = r15
            r2 = r2[r3]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            goto L9f
        L7f:
            r0 = r8
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            r3 = r8
            org.objectweb.asm.ClassWriter r3 = r3.b
            java.lang.String r4 = ""
            r5 = r11
            r6 = r15
            r5 = r5[r6]
            org.objectweb.asm.Label r5 = (org.objectweb.asm.Label) r5
            int r5 = r5.c
            int r3 = r3.a(r4, r5)
            r2 = r2 | r3
            r0[r1] = r2
        L9f:
            int r15 = r15 + 1
            goto L30
        La5:
            r0 = 0
            r15 = r0
        La8:
            r0 = r15
            r1 = r12
            if (r0 >= r1) goto L123
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto Ld9
            r0 = r8
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = 24117248(0x1700000, float:4.4081038E-38)
            r3 = r8
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r13
            r5 = r15
            r4 = r4[r5]
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r3.m7563c(r4)
            r2 = r2 | r3
            r0[r1] = r2
            goto L11d
        Ld9:
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto Lfc
            r0 = r8
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = r13
            r3 = r15
            r2 = r2[r3]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            goto L11d
        Lfc:
            r0 = r8
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            r3 = r8
            org.objectweb.asm.ClassWriter r3 = r3.b
            java.lang.String r4 = ""
            r5 = r13
            r6 = r15
            r5 = r5[r6]
            org.objectweb.asm.Label r5 = (org.objectweb.asm.Label) r5
            int r5 = r5.c
            int r3 = r3.a(r4, r5)
            r2 = r2 | r3
            r0[r1] = r2
        L11d:
            int r15 = r15 + 1
            goto La8
        L123:
            r0 = r8
            r0.b()
            goto L2a6
        L12a:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            if (r0 != 0) goto L148
            r0 = r8
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.v = r1
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            r14 = r0
            goto L16b
        L148:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            r1 = r8
            int r1 = r1.w
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            r14 = r0
            r0 = r14
            if (r0 >= 0) goto L16b
            r0 = r9
            r1 = 3
            if (r0 != r1) goto L163
            return
        L163:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L16b:
            r0 = r9
            switch(r0) {
                case 0: goto L190;
                case 1: goto L1e6;
                case 2: goto L21c;
                case 3: goto L23b;
                case 4: goto L262;
                default: goto L291;
            }
        L190:
            r0 = r8
            r1 = r10
            r0.T = r1
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 255(0xff, float:3.57E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r15 = r0
        L1ac:
            r0 = r15
            r1 = r10
            if (r0 >= r1) goto L1c0
            r0 = r8
            r1 = r11
            r2 = r15
            r1 = r1[r2]
            r0.a(r1)
            int r15 = r15 + 1
            goto L1ac
        L1c0:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r15 = r0
        L1cd:
            r0 = r15
            r1 = r12
            if (r0 >= r1) goto L1e3
            r0 = r8
            r1 = r13
            r2 = r15
            r1 = r1[r2]
            r0.a(r1)
            int r15 = r15 + 1
            goto L1cd
        L1e3:
            goto L291
        L1e6:
            r0 = r8
            r1 = r0
            int r1 = r1.T
            r2 = r10
            int r1 = r1 + r2
            r0.T = r1
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r10
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r15 = r0
        L205:
            r0 = r15
            r1 = r10
            if (r0 >= r1) goto L219
            r0 = r8
            r1 = r11
            r2 = r15
            r1 = r1[r2]
            r0.a(r1)
            int r15 = r15 + 1
            goto L205
        L219:
            goto L291
        L21c:
            r0 = r8
            r1 = r0
            int r1 = r1.T
            r2 = r10
            int r1 = r1 - r2
            r0.T = r1
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r10
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L291
        L23b:
            r0 = r14
            r1 = 64
            if (r0 >= r1) goto L24f
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L291
        L24f:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 251(0xfb, float:3.52E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L291
        L262:
            r0 = r14
            r1 = 64
            if (r0 >= r1) goto L279
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 64
            r2 = r14
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L289
        L279:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 247(0xf7, float:3.46E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L289:
            r0 = r8
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            r0.a(r1)
        L291:
            r0 = r8
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.w = r1
            r0 = r8
            r1 = r0
            int r1 = r1.u
            r2 = 1
            int r1 = r1 + r2
            r0.u = r1
        L2a6:
            r0 = r8
            r1 = r8
            int r1 = r1.s
            r2 = r12
            int r1 = java.lang.Math.max(r1, r2)
            r0.s = r1
            r0 = r8
            r1 = r8
            int r1 = r1.t
            r2 = r8
            int r2 = r2.T
            int r1 = java.lang.Math.max(r1, r2)
            r0.t = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L69
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L33
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            goto L50
        L33:
            r0 = r6
            int r0 = r0.Q
            int[] r1 = org.objectweb.asm.Frame.a
            r2 = r7
            r1 = r1[r2]
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto L4b
            r0 = r6
            r1 = r8
            r0.R = r1
        L4b:
            r0 = r6
            r1 = r8
            r0.Q = r1
        L50:
            r0 = r7
            r1 = 172(0xac, float:2.41E-43)
            if (r0 < r1) goto L5e
            r0 = r7
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 <= r1) goto L65
        L5e:
            r0 = r7
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 != r1) goto L69
        L65:
            r0 = r6
            r0.e()
        L69:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L4a
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L2a
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            goto L4a
        L2a:
            r0 = r7
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 == r1) goto L4a
            r0 = r6
            int r0 = r0.Q
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto L45
            r0 = r6
            r1 = r9
            r0.R = r1
        L45:
            r0 = r6
            r1 = r9
            r0.Q = r1
        L4a:
            r0 = r7
            r1 = 17
            if (r0 != r1) goto L5d
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L67
        L5d:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
        L67:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L6f
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L2a
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            goto L6f
        L2a:
            r0 = r7
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 != r1) goto L52
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            r1 = r0
            int r1 = r1.a
            r2 = 256(0x100, float:3.59E-43)
            r1 = r1 | r2
            r0.a = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            r1 = r6
            int r1 = r1.Q
            r0.f = r1
            r0 = r6
            r0.e()
            goto L6f
        L52:
            r0 = r6
            int r0 = r0.Q
            int[] r1 = org.objectweb.asm.Frame.a
            r2 = r7
            r1 = r1[r2]
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto L6a
            r0 = r6
            r1 = r9
            r0.R = r1
        L6a:
            r0 = r6
            r1 = r9
            r0.Q = r1
        L6f:
            r0 = r6
            int r0 = r0.M
            r1 = 2
            if (r0 == r1) goto La7
            r0 = r7
            r1 = 22
            if (r0 == r1) goto L8f
            r0 = r7
            r1 = 24
            if (r0 == r1) goto L8f
            r0 = r7
            r1 = 55
            if (r0 == r1) goto L8f
            r0 = r7
            r1 = 57
            if (r0 != r1) goto L96
        L8f:
            r0 = r8
            r1 = 2
            int r0 = r0 + r1
            r9 = r0
            goto L9a
        L96:
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
        L9a:
            r0 = r9
            r1 = r6
            int r1 = r1.t
            if (r0 <= r1) goto La7
            r0 = r6
            r1 = r9
            r0.t = r1
        La7:
            r0 = r8
            r1 = 4
            if (r0 >= r1) goto Le0
            r0 = r7
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 == r1) goto Le0
            r0 = r7
            r1 = 54
            if (r0 >= r1) goto Lc8
            r0 = 26
            r1 = r7
            r2 = 21
            int r1 = r1 - r2
            r2 = 2
            int r1 = r1 << r2
            int r0 = r0 + r1
            r1 = r8
            int r0 = r0 + r1
            r9 = r0
            goto Ld4
        Lc8:
            r0 = 59
            r1 = r7
            r2 = 54
            int r1 = r1 - r2
            r2 = 2
            int r1 = r1 << r2
            int r0 = r0 + r1
            r1 = r8
            int r0 = r0 + r1
            r9 = r0
        Ld4:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L104
        Le0:
            r0 = r8
            r1 = 256(0x100, float:3.59E-43)
            if (r0 < r1) goto Lfa
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 196(0xc4, float:2.75E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto L104
        Lfa:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
        L104:
            r0 = r7
            r1 = 54
            if (r0 < r1) goto L123
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L123
            r0 = r6
            int r0 = r0.A
            if (r0 <= 0) goto L123
            r0 = r6
            org.objectweb.asm.Label r1 = new org.objectweb.asm.Label
            r2 = r1
            r2.<init>()
            r0.visitLabel(r1)
        L123:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r7, java.lang.String r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r8
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L60
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L3c
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r7
            r2 = r6
            org.objectweb.asm.ByteVector r2 = r2.r
            int r2 = r2.b
            r3 = r6
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r9
            r0.a(r1, r2, r3, r4)
            goto L60
        L3c:
            r0 = r7
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L60
            r0 = r6
            int r0 = r0.Q
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto L5a
            r0 = r6
            r1 = r10
            r0.R = r1
        L5a:
            r0 = r6
            r1 = r10
            r0.Q = r1
        L60:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            r2 = r9
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r8
            r2 = r9
            r3 = r10
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3)
            r11 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto Le9
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L3b
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r7
            r2 = 0
            r3 = r6
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r11
            r0.a(r1, r2, r3, r4)
            goto Le9
        L3b:
            r0 = r10
            r1 = 0
            char r0 = r0.charAt(r1)
            r13 = r0
            r0 = r7
            switch(r0) {
                case 178: goto L60;
                case 179: goto L7d;
                case 180: goto L9b;
                default: goto Lb8;
            }
        L60:
            r0 = r6
            int r0 = r0.Q
            r1 = r13
            r2 = 68
            if (r1 == r2) goto L72
            r1 = r13
            r2 = 74
            if (r1 != r2) goto L76
        L72:
            r1 = 2
            goto L77
        L76:
            r1 = 1
        L77:
            int r0 = r0 + r1
            r12 = r0
            goto Ld4
        L7d:
            r0 = r6
            int r0 = r0.Q
            r1 = r13
            r2 = 68
            if (r1 == r2) goto L8f
            r1 = r13
            r2 = 74
            if (r1 != r2) goto L94
        L8f:
            r1 = -2
            goto L95
        L94:
            r1 = -1
        L95:
            int r0 = r0 + r1
            r12 = r0
            goto Ld4
        L9b:
            r0 = r6
            int r0 = r0.Q
            r1 = r13
            r2 = 68
            if (r1 == r2) goto Lad
            r1 = r13
            r2 = 74
            if (r1 != r2) goto Lb1
        Lad:
            r1 = 1
            goto Lb2
        Lb1:
            r1 = 0
        Lb2:
            int r0 = r0 + r1
            r12 = r0
            goto Ld4
        Lb8:
            r0 = r6
            int r0 = r0.Q
            r1 = r13
            r2 = 68
            if (r1 == r2) goto Lca
            r1 = r13
            r2 = 74
            if (r1 != r2) goto Lcf
        Lca:
            r1 = -3
            goto Ld1
        Lcf:
            r1 = -2
        Ld1:
            int r0 = r0 + r1
            r12 = r0
        Ld4:
            r0 = r12
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto Le3
            r0 = r6
            r1 = r12
            r0.R = r1
        Le3:
            r0 = r6
            r1 = r12
            r0.Q = r1
        Le9:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            r2 = r11
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3, r4)
            r12 = r0
            r0 = r12
            int r0 = r0.c
            r13 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L98
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L44
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r7
            r2 = 0
            r3 = r6
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r12
            r0.a(r1, r2, r3, r4)
            goto L98
        L44:
            r0 = r13
            if (r0 != 0) goto L57
            r0 = r10
            int r0 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r13 = r0
            r0 = r12
            r1 = r13
            r0.c = r1
        L57:
            r0 = r7
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 != r1) goto L73
            r0 = r6
            int r0 = r0.Q
            r1 = r13
            r2 = 2
            int r1 = r1 >> r2
            int r0 = r0 - r1
            r1 = r13
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 + r1
            r14 = r0
            goto L83
        L73:
            r0 = r6
            int r0 = r0.Q
            r1 = r13
            r2 = 2
            int r1 = r1 >> r2
            int r0 = r0 - r1
            r1 = r13
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 + r1
            r14 = r0
        L83:
            r0 = r14
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto L92
            r0 = r6
            r1 = r14
            r0.R = r1
        L92:
            r0 = r6
            r1 = r14
            r0.Q = r1
        L98:
            r0 = r7
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto Lcd
            r0 = r13
            if (r0 != 0) goto Lb2
            r0 = r10
            int r0 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r13 = r0
            r0 = r12
            r1 = r13
            r0.c = r1
        Lb2:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 185(0xb9, float:2.59E-43)
            r2 = r12
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r1 = r13
            r2 = 2
            int r1 = r1 >> r2
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
            goto Ldb
        Lcd:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            r2 = r12
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
        Ldb:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.Item r0 = r0.a(r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            int r0 = r0.c
            r12 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L7e
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L45
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = 186(0xba, float:2.6E-43)
            r2 = 0
            r3 = r6
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r11
            r0.a(r1, r2, r3, r4)
            goto L7e
        L45:
            r0 = r12
            if (r0 != 0) goto L57
            r0 = r8
            int r0 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r12 = r0
            r0 = r11
            r1 = r12
            r0.c = r1
        L57:
            r0 = r6
            int r0 = r0.Q
            r1 = r12
            r2 = 2
            int r1 = r1 >> r2
            int r0 = r0 - r1
            r1 = r12
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto L78
            r0 = r6
            r1 = r13
            r0.R = r1
        L78:
            r0 = r6
            r1 = r13
            r0.Q = r1
        L7e:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 186(0xba, float:2.6E-43)
            r2 = r11
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r7, org.objectweb.asm.Label r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = 0
            r9 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto Lb3
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L4f
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r8
            org.objectweb.asm.Label r0 = r0.a()
            r1 = r0
            int r1 = r1.a
            r2 = 16
            r1 = r1 | r2
            r0.a = r1
            r0 = r6
            r1 = 0
            r2 = r8
            r0.a(r1, r2)
            r0 = r7
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto Lb3
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r9 = r0
            goto Lb3
        L4f:
            r0 = r7
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L9c
            r0 = r8
            int r0 = r0.a
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L77
            r0 = r8
            r1 = r0
            int r1 = r1.a
            r2 = 512(0x200, float:7.17E-43)
            r1 = r1 | r2
            r0.a = r1
            r0 = r6
            r1 = r0
            int r1 = r1.L
            r2 = 1
            int r1 = r1 + r2
            r0.L = r1
        L77:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            r1 = r0
            int r1 = r1.a
            r2 = 128(0x80, float:1.8E-43)
            r1 = r1 | r2
            r0.a = r1
            r0 = r6
            r1 = r6
            int r1 = r1.Q
            r2 = 1
            int r1 = r1 + r2
            r2 = r8
            r0.a(r1, r2)
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r9 = r0
            goto Lb3
        L9c:
            r0 = r6
            r1 = r0
            int r1 = r1.Q
            int[] r2 = org.objectweb.asm.Frame.a
            r3 = r7
            r2 = r2[r3]
            int r1 = r1 + r2
            r0.Q = r1
            r0 = r6
            r1 = r6
            int r1 = r1.Q
            r2 = r8
            r0.a(r1, r2)
        Lb3:
            r0 = r8
            int r0 = r0.a
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L14e
            r0 = r8
            int r0 = r0.c
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            int r0 = r0 - r1
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 >= r1) goto L14e
            r0 = r7
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 != r1) goto Le3
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 200(0xc8, float:2.8E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L138
        Le3:
            r0 = r7
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto Lf8
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 201(0xc9, float:2.82E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L138
        Lf8:
            r0 = r9
            if (r0 == 0) goto L107
            r0 = r9
            r1 = r0
            int r1 = r1.a
            r2 = 16
            r1 = r1 | r2
            r0.a = r1
        L107:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            r2 = 166(0xa6, float:2.33E-43)
            if (r1 > r2) goto L11c
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r2 = 1
            r1 = r1 ^ r2
            r2 = 1
            int r1 = r1 - r2
            goto L11f
        L11c:
            r1 = r7
            r2 = 1
            r1 = r1 ^ r2
        L11f:
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 200(0xc8, float:2.8E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
        L138:
            r0 = r8
            r1 = r6
            r2 = r6
            org.objectweb.asm.ByteVector r2 = r2.r
            r3 = r6
            org.objectweb.asm.ByteVector r3 = r3.r
            int r3 = r3.b
            r4 = 1
            int r3 = r3 - r4
            r4 = 1
            r0.a(r1, r2, r3, r4)
            goto L16a
        L14e:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r8
            r1 = r6
            r2 = r6
            org.objectweb.asm.ByteVector r2 = r2.r
            r3 = r6
            org.objectweb.asm.ByteVector r3 = r3.r
            int r3 = r3.b
            r4 = 1
            int r3 = r3 - r4
            r4 = 0
            r0.a(r1, r2, r3, r4)
        L16a:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L185
            r0 = r9
            if (r0 == 0) goto L17a
            r0 = r6
            r1 = r9
            r0.visitLabel(r1)
        L17a:
            r0 = r7
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 != r1) goto L185
            r0 = r6
            r0.e()
        L185:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label r8) {
            r7 = this;
            r0 = r7
            r1 = r0
            boolean r1 = r1.K
            r2 = r8
            r3 = r7
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.r
            int r4 = r4.b
            r5 = r7
            org.objectweb.asm.ByteVector r5 = r5.r
            byte[] r5 = r5.a
            boolean r2 = r2.a(r3, r4, r5)
            r1 = r1 | r2
            r0.K = r1
            r0 = r8
            int r0 = r0.a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L26
            return
        L26:
            r0 = r7
            int r0 = r0.M
            if (r0 != 0) goto Ld2
            r0 = r7
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L67
            r0 = r8
            int r0 = r0.c
            r1 = r7
            org.objectweb.asm.Label r1 = r1.P
            int r1 = r1.c
            if (r0 != r1) goto L61
            r0 = r7
            org.objectweb.asm.Label r0 = r0.P
            r1 = r0
            int r1 = r1.a
            r2 = r8
            int r2 = r2.a
            r3 = 16
            r2 = r2 & r3
            r1 = r1 | r2
            r0.a = r1
            r0 = r8
            r1 = r7
            org.objectweb.asm.Label r1 = r1.P
            org.objectweb.asm.Frame r1 = r1.h
            r0.h = r1
            return
        L61:
            r0 = r7
            r1 = 0
            r2 = r8
            r0.a(r1, r2)
        L67:
            r0 = r7
            r1 = r8
            r0.P = r1
            r0 = r8
            org.objectweb.asm.Frame r0 = r0.h
            if (r0 != 0) goto L86
            r0 = r8
            org.objectweb.asm.Frame r1 = new org.objectweb.asm.Frame
            r2 = r1
            r2.<init>()
            r0.h = r1
            r0 = r8
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r8
            r0.b = r1
        L86:
            r0 = r7
            org.objectweb.asm.Label r0 = r0.O
            if (r0 == 0) goto Lca
            r0 = r8
            int r0 = r0.c
            r1 = r7
            org.objectweb.asm.Label r1 = r1.O
            int r1 = r1.c
            if (r0 != r1) goto Lc2
            r0 = r7
            org.objectweb.asm.Label r0 = r0.O
            r1 = r0
            int r1 = r1.a
            r2 = r8
            int r2 = r2.a
            r3 = 16
            r2 = r2 & r3
            r1 = r1 | r2
            r0.a = r1
            r0 = r8
            r1 = r7
            org.objectweb.asm.Label r1 = r1.O
            org.objectweb.asm.Frame r1 = r1.h
            r0.h = r1
            r0 = r7
            r1 = r7
            org.objectweb.asm.Label r1 = r1.O
            r0.P = r1
            return
        Lc2:
            r0 = r7
            org.objectweb.asm.Label r0 = r0.O
            r1 = r8
            r0.i = r1
        Lca:
            r0 = r7
            r1 = r8
            r0.O = r1
            goto L118
        Ld2:
            r0 = r7
            int r0 = r0.M
            r1 = 1
            if (r0 != r1) goto L118
            r0 = r7
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto Lf5
            r0 = r7
            org.objectweb.asm.Label r0 = r0.P
            r1 = r7
            int r1 = r1.R
            r0.g = r1
            r0 = r7
            r1 = r7
            int r1 = r1.Q
            r2 = r8
            r0.a(r1, r2)
        Lf5:
            r0 = r7
            r1 = r8
            r0.P = r1
            r0 = r7
            r1 = 0
            r0.Q = r1
            r0 = r7
            r1 = 0
            r0.R = r1
            r0 = r7
            org.objectweb.asm.Label r0 = r0.O
            if (r0 == 0) goto L113
            r0 = r7
            org.objectweb.asm.Label r0 = r0.O
            r1 = r8
            r0.i = r1
        L113:
            r0 = r7
            r1 = r8
            r0.O = r1
        L118:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r7
            org.objectweb.asm.Item r0 = r0.a(r1)
            r8 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L6b
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L37
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = 18
            r2 = 0
            r3 = r6
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r8
            r0.a(r1, r2, r3, r4)
            goto L6b
        L37:
            r0 = r8
            int r0 = r0.b
            r1 = 5
            if (r0 == r1) goto L48
            r0 = r8
            int r0 = r0.b
            r1 = 6
            if (r0 != r1) goto L52
        L48:
            r0 = r6
            int r0 = r0.Q
            r1 = 2
            int r0 = r0 + r1
            r9 = r0
            goto L59
        L52:
            r0 = r6
            int r0 = r0.Q
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
        L59:
            r0 = r9
            r1 = r6
            int r1 = r1.R
            if (r0 <= r1) goto L66
            r0 = r6
            r1 = r9
            r0.R = r1
        L66:
            r0 = r6
            r1 = r9
            r0.Q = r1
        L6b:
            r0 = r8
            int r0 = r0.a
            r9 = r0
            r0 = r8
            int r0 = r0.b
            r1 = 5
            if (r0 == r1) goto L81
            r0 = r8
            int r0 = r0.b
            r1 = 6
            if (r0 != r1) goto L8f
        L81:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 20
            r2 = r9
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto Laf
        L8f:
            r0 = r9
            r1 = 256(0x100, float:3.59E-43)
            if (r0 < r1) goto La4
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 19
            r2 = r9
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            goto Laf
        La4:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 18
            r2 = r9
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
        Laf:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L29
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L29
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = 132(0x84, float:1.85E-43)
            r2 = r7
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
        L29:
            r0 = r6
            int r0 = r0.M
            r1 = 2
            if (r0 == r1) goto L42
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r6
            int r1 = r1.t
            if (r0 <= r1) goto L42
            r0 = r6
            r1 = r9
            r0.t = r1
        L42:
            r0 = r7
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L55
            r0 = r8
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L55
            r0 = r8
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r0 >= r1) goto L6e
        L55:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 196(0xc4, float:2.75E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = 132(0x84, float:1.85E-43)
            r2 = r7
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L7e
        L6e:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 132(0x84, float:1.85E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
        L7e:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int r8, int r9, org.objectweb.asm.Label r10, org.objectweb.asm.Label... r11) {
            r7 = this;
            r0 = r7
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            r12 = r0
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 170(0xaa, float:2.38E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 0
            r2 = 0
            r3 = 4
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.r
            int r4 = r4.b
            r5 = 4
            int r4 = r4 % r5
            int r3 = r3 - r4
            r4 = 4
            int r3 = r3 % r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r10
            r1 = r7
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.r
            r3 = r12
            r4 = 1
            r0.a(r1, r2, r3, r4)
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = 0
            r13 = r0
        L52:
            r0 = r13
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L70
            r0 = r11
            r1 = r13
            r0 = r0[r1]
            r1 = r7
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.r
            r3 = r12
            r4 = 1
            r0.a(r1, r2, r3, r4)
            int r13 = r13 + 1
            goto L52
        L70:
            r0 = r7
            r1 = r10
            r2 = r11
            r0.a(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label r8, int[] r9, org.objectweb.asm.Label[] r10) {
            r7 = this;
            r0 = r7
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            r11 = r0
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 171(0xab, float:2.4E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 0
            r2 = 0
            r3 = 4
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.r
            int r4 = r4.b
            r5 = 4
            int r4 = r4 % r5
            int r3 = r3 - r4
            r4 = 4
            int r3 = r3 % r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r8
            r1 = r7
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.r
            r3 = r11
            r4 = 1
            r0.a(r1, r2, r3, r4)
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r10
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = 0
            r12 = r0
        L4f:
            r0 = r12
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L77
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = r9
            r2 = r12
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r1 = r7
            r2 = r7
            org.objectweb.asm.ByteVector r2 = r2.r
            r3 = r11
            r4 = 1
            r0.a(r1, r2, r3, r4)
            int r12 = r12 + 1
            goto L4f
        L77:
            r0 = r7
            r1 = r8
            r2 = r10
            r0.a(r1, r2)
            return
    }

    private void a(org.objectweb.asm.Label r7, org.objectweb.asm.Label[] r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L8b
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L5b
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = 171(0xab, float:2.4E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            r0 = r6
            r1 = 0
            r2 = r7
            r0.a(r1, r2)
            r0 = r7
            org.objectweb.asm.Label r0 = r0.a()
            r1 = r0
            int r1 = r1.a
            r2 = 16
            r1 = r1 | r2
            r0.a = r1
            r0 = 0
            r9 = r0
        L34:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L58
            r0 = r6
            r1 = 0
            r2 = r8
            r3 = r9
            r2 = r2[r3]
            r0.a(r1, r2)
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            org.objectweb.asm.Label r0 = r0.a()
            r1 = r0
            int r1 = r1.a
            r2 = 16
            r1 = r1 | r2
            r0.a = r1
            int r9 = r9 + 1
            goto L34
        L58:
            goto L87
        L5b:
            r0 = r6
            r1 = r0
            int r1 = r1.Q
            r2 = 1
            int r1 = r1 - r2
            r0.Q = r1
            r0 = r6
            r1 = r6
            int r1 = r1.Q
            r2 = r7
            r0.a(r1, r2)
            r0 = 0
            r9 = r0
        L70:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L87
            r0 = r6
            r1 = r6
            int r1 = r1.Q
            r2 = r8
            r3 = r9
            r2 = r2[r3]
            r0.a(r1, r2)
            int r9 = r9 + 1
            goto L70
        L87:
            r0 = r6
            r0.e()
        L8b:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            r0.Y = r1
            r0 = r6
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r7
            org.objectweb.asm.Item r0 = r0.a(r1)
            r9 = r0
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            if (r0 == 0) goto L44
            r0 = r6
            int r0 = r0.M
            if (r0 != 0) goto L38
            r0 = r6
            org.objectweb.asm.Label r0 = r0.P
            org.objectweb.asm.Frame r0 = r0.h
            r1 = 197(0xc5, float:2.76E-43)
            r2 = r8
            r3 = r6
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r9
            r0.a(r1, r2, r3, r4)
            goto L44
        L38:
            r0 = r6
            r1 = r0
            int r1 = r1.Q
            r2 = 1
            r3 = r8
            int r2 = r2 - r3
            int r1 = r1 + r2
            r0.Q = r1
        L44:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.r
            r1 = 197(0xc5, float:2.76E-43)
            r2 = r9
            int r2 = r2.a
            org.objectweb.asm.ByteVector r0 = r0.b(r1, r2)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int r10, org.objectweb.asm.TypePath r11, java.lang.String r12, boolean r13) {
            r9 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r10
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            r1 = r9
            int r1 = r1.Y
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r10 = r0
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
            if (r0 == 0) goto L5f
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.W
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.W = r1
            goto L6e
        L5f:
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.X
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.X = r1
        L6e:
            r0 = r15
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label r5, org.objectweb.asm.Label r6, org.objectweb.asm.Label r7, java.lang.String r8) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.A
            r2 = 1
            int r1 = r1 + r2
            r0.A = r1
            org.objectweb.asm.Handler r0 = new org.objectweb.asm.Handler
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r5
            r0.a = r1
            r0 = r9
            r1 = r6
            r0.b = r1
            r0 = r9
            r1 = r7
            r0.c = r1
            r0 = r9
            r1 = r8
            r0.d = r1
            r0 = r9
            r1 = r8
            if (r1 == 0) goto L3f
            r1 = r4
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r8
            int r1 = r1.newClass(r2)
            goto L40
        L3f:
            r1 = 0
        L40:
            r0.e = r1
            r0 = r4
            org.objectweb.asm.Handler r0 = r0.C
            if (r0 != 0) goto L53
            r0 = r4
            r1 = r9
            r0.B = r1
            goto L5c
        L53:
            r0 = r4
            org.objectweb.asm.Handler r0 = r0.C
            r1 = r9
            r0.f = r1
        L5c:
            r0 = r4
            r1 = r9
            r0.C = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int r10, org.objectweb.asm.TypePath r11, java.lang.String r12, boolean r13) {
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
            org.objectweb.asm.AnnotationWriter r1 = r1.W
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.W = r1
            goto L61
        L52:
            r0 = r15
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.X
            r0.g = r1
            r0 = r9
            r1 = r15
            r0.X = r1
        L61:
            r0 = r15
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r5, java.lang.String r6, java.lang.String r7, org.objectweb.asm.Label r8, org.objectweb.asm.Label r9, int r10) {
            r4 = this;
            r0 = r7
            if (r0 == 0) goto L56
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.G
            if (r0 != 0) goto L16
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.G = r1
        L16:
            r0 = r4
            r1 = r0
            int r1 = r1.F
            r2 = 1
            int r1 = r1 + r2
            r0.F = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.G
            r1 = r8
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r9
            int r1 = r1.c
            r2 = r8
            int r2 = r2.c
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r5
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r7
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L56:
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.E
            if (r0 != 0) goto L68
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.E = r1
        L68:
            r0 = r4
            r1 = r0
            int r1 = r1.D
            r2 = 1
            int r1 = r1 + r2
            r0.D = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.E
            r1 = r8
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r9
            int r1 = r1.c
            r2 = r8
            int r2 = r2.c
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r5
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r6
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            int r0 = r0.M
            r1 = 2
            if (r0 == r1) goto Lde
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = 74
            if (r1 == r2) goto Lc7
            r1 = r11
            r2 = 68
            if (r1 != r2) goto Lcb
        Lc7:
            r1 = 2
            goto Lcc
        Lcb:
            r1 = 1
        Lcc:
            int r0 = r0 + r1
            r12 = r0
            r0 = r12
            r1 = r4
            int r1 = r1.t
            if (r0 <= r1) goto Lde
            r0 = r4
            r1 = r12
            r0.t = r1
        Lde:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int r10, org.objectweb.asm.TypePath r11, org.objectweb.asm.Label[] r12, org.objectweb.asm.Label[] r13, int[] r14, java.lang.String r15, boolean r16) {
            r9 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r10
            r2 = 24
            int r1 = r1 >>> r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r12
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r18 = r0
        L1b:
            r0 = r18
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L50
            r0 = r17
            r1 = r12
            r2 = r18
            r1 = r1[r2]
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r13
            r2 = r18
            r1 = r1[r2]
            int r1 = r1.c
            r2 = r12
            r3 = r18
            r2 = r2[r3]
            int r2 = r2.c
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r14
            r2 = r18
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r18 = r18 + 1
            goto L1b
        L50:
            r0 = r11
            if (r0 != 0) goto L5e
            r0 = r17
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L7d
        L5e:
            r0 = r11
            byte[] r0 = r0.a
            r1 = r11
            int r1 = r1.b
            r0 = r0[r1]
            r1 = 2
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r18 = r0
            r0 = r17
            r1 = r11
            byte[] r1 = r1.a
            r2 = r11
            int r2 = r2.b
            r3 = r18
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L7d:
            r0 = r17
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r15
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r9
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 1
            r4 = r17
            r5 = r17
            r6 = r17
            int r6 = r6.b
            r7 = 2
            int r6 = r6 - r7
            r1.<init>(r2, r3, r4, r5, r6)
            r18 = r0
            r0 = r16
            if (r0 == 0) goto Lc0
            r0 = r18
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.W
            r0.g = r1
            r0 = r9
            r1 = r18
            r0.W = r1
            goto Lcf
        Lc0:
            r0 = r18
            r1 = r9
            org.objectweb.asm.AnnotationWriter r1 = r1.X
            r0.g = r1
            r0 = r9
            r1 = r18
            r0.X = r1
        Lcf:
            r0 = r18
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int r5, org.objectweb.asm.Label r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.I
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.I = r1
        L12:
            r0 = r4
            r1 = r0
            int r1 = r1.H
            r2 = 1
            int r1 = r1 + r2
            r0.H = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.I
            r1 = r6
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.I
            r1 = r5
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int r10, int r11) {
            r9 = this;
            r0 = r9
            boolean r0 = r0.K
            if (r0 == 0) goto Lb
            r0 = r9
            r0.d()
        Lb:
            r0 = r9
            int r0 = r0.M
            if (r0 != 0) goto L270
            r0 = r9
            org.objectweb.asm.Handler r0 = r0.B
            r12 = r0
        L17:
            r0 = r12
            if (r0 == 0) goto La4
            r0 = r12
            org.objectweb.asm.Label r0 = r0.a
            org.objectweb.asm.Label r0 = r0.a()
            r13 = r0
            r0 = r12
            org.objectweb.asm.Label r0 = r0.c
            org.objectweb.asm.Label r0 = r0.a()
            r14 = r0
            r0 = r12
            org.objectweb.asm.Label r0 = r0.b
            org.objectweb.asm.Label r0 = r0.a()
            r15 = r0
            r0 = r12
            java.lang.String r0 = r0.d
            if (r0 != 0) goto L43
            java.lang.String r0 = "java/lang/Throwable"
            goto L47
        L43:
            r0 = r12
            java.lang.String r0 = r0.d
        L47:
            r16 = r0
            r0 = 24117248(0x1700000, float:4.4081038E-38)
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r16
            int r1 = r1.m7563c(r2)
            r0 = r0 | r1
            r17 = r0
            r0 = r14
            r1 = r0
            int r1 = r1.a
            r2 = 16
            r1 = r1 | r2
            r0.a = r1
        L63:
            r0 = r13
            r1 = r15
            if (r0 == r1) goto L9c
            org.objectweb.asm.Edge r0 = new org.objectweb.asm.Edge
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r17
            r0.a = r1
            r0 = r18
            r1 = r14
            r0.b = r1
            r0 = r18
            r1 = r13
            org.objectweb.asm.Edge r1 = r1.j
            r0.c = r1
            r0 = r13
            r1 = r18
            r0.j = r1
            r0 = r13
            org.objectweb.asm.Label r0 = r0.i
            r13 = r0
            goto L63
        L9c:
            r0 = r12
            org.objectweb.asm.Handler r0 = r0.f
            r12 = r0
            goto L17
        La4:
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            org.objectweb.asm.Frame r0 = r0.h
            r13 = r0
            r0 = r9
            java.lang.String r0 = r0.f
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r14 = r0
            r0 = r13
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r9
            int r2 = r2.c
            r3 = r14
            r4 = r9
            int r4 = r4.t
            r0.a(r1, r2, r3, r4)
            r0 = r9
            r1 = r13
            r0.b(r1)
            r0 = 0
            r15 = r0
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            r16 = r0
        Ld8:
            r0 = r16
            if (r0 == 0) goto L181
            r0 = r16
            r17 = r0
            r0 = r16
            org.objectweb.asm.Label r0 = r0.k
            r16 = r0
            r0 = r17
            r1 = 0
            r0.k = r1
            r0 = r17
            org.objectweb.asm.Frame r0 = r0.h
            r13 = r0
            r0 = r17
            int r0 = r0.a
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L10c
            r0 = r17
            r1 = r0
            int r1 = r1.a
            r2 = 32
            r1 = r1 | r2
            r0.a = r1
        L10c:
            r0 = r17
            r1 = r0
            int r1 = r1.a
            r2 = 64
            r1 = r1 | r2
            r0.a = r1
            r0 = r13
            int[] r0 = r0.d
            int r0 = r0.length
            r1 = r17
            int r1 = r1.g
            int r0 = r0 + r1
            r18 = r0
            r0 = r18
            r1 = r15
            if (r0 <= r1) goto L131
            r0 = r18
            r15 = r0
        L131:
            r0 = r17
            org.objectweb.asm.Edge r0 = r0.j
            r19 = r0
        L138:
            r0 = r19
            if (r0 == 0) goto L17e
            r0 = r19
            org.objectweb.asm.Label r0 = r0.b
            org.objectweb.asm.Label r0 = r0.a()
            r20 = r0
            r0 = r13
            r1 = r9
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r20
            org.objectweb.asm.Frame r2 = r2.h
            r3 = r19
            int r3 = r3.a
            boolean r0 = r0.a(r1, r2, r3)
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L174
            r0 = r20
            org.objectweb.asm.Label r0 = r0.k
            if (r0 != 0) goto L174
            r0 = r20
            r1 = r16
            r0.k = r1
            r0 = r20
            r16 = r0
        L174:
            r0 = r19
            org.objectweb.asm.Edge r0 = r0.c
            r19 = r0
            goto L138
        L17e:
            goto Ld8
        L181:
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            r17 = r0
        L187:
            r0 = r17
            if (r0 == 0) goto L247
            r0 = r17
            org.objectweb.asm.Frame r0 = r0.h
            r13 = r0
            r0 = r17
            int r0 = r0.a
            r1 = 32
            r0 = r0 & r1
            if (r0 == 0) goto L1a4
            r0 = r9
            r1 = r13
            r0.b(r1)
        L1a4:
            r0 = r17
            int r0 = r0.a
            r1 = 64
            r0 = r0 & r1
            if (r0 != 0) goto L23d
            r0 = r17
            org.objectweb.asm.Label r0 = r0.i
            r18 = r0
            r0 = r17
            int r0 = r0.c
            r19 = r0
            r0 = r18
            if (r0 != 0) goto L1cc
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            goto L1d1
        L1cc:
            r0 = r18
            int r0 = r0.c
        L1d1:
            r1 = 1
            int r0 = r0 - r1
            r20 = r0
            r0 = r20
            r1 = r19
            if (r0 < r1) goto L23d
            r0 = r15
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            r15 = r0
            r0 = r19
            r21 = r0
        L1e8:
            r0 = r21
            r1 = r20
            if (r0 >= r1) goto L200
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.r
            byte[] r0 = r0.a
            r1 = r21
            r2 = 0
            r0[r1] = r2
            int r21 = r21 + 1
            goto L1e8
        L200:
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.r
            byte[] r0 = r0.a
            r1 = r20
            r2 = -65
            r0[r1] = r2
            r0 = r9
            r1 = r19
            r2 = 0
            r3 = 1
            int r0 = r0.a(r1, r2, r3)
            r21 = r0
            r0 = r9
            int[] r0 = r0.z
            r1 = r21
            r2 = 24117248(0x1700000, float:4.4081038E-38)
            r3 = r9
            org.objectweb.asm.ClassWriter r3 = r3.b
            java.lang.String r4 = "java/lang/Throwable"
            int r3 = r3.m7563c(r4)
            r2 = r2 | r3
            r0[r1] = r2
            r0 = r9
            r0.b()
            r0 = r9
            r1 = r9
            org.objectweb.asm.Handler r1 = r1.B
            r2 = r17
            r3 = r18
            org.objectweb.asm.Handler r1 = org.objectweb.asm.Handler.a(r1, r2, r3)
            r0.B = r1
        L23d:
            r0 = r17
            org.objectweb.asm.Label r0 = r0.i
            r17 = r0
            goto L187
        L247:
            r0 = r9
            org.objectweb.asm.Handler r0 = r0.B
            r12 = r0
            r0 = r9
            r1 = 0
            r0.A = r1
        L251:
            r0 = r12
            if (r0 == 0) goto L267
            r0 = r9
            r1 = r0
            int r1 = r1.A
            r2 = 1
            int r1 = r1 + r2
            r0.A = r1
            r0 = r12
            org.objectweb.asm.Handler r0 = r0.f
            r12 = r0
            goto L251
        L267:
            r0 = r9
            r1 = r15
            r0.s = r1
            goto L488
        L270:
            r0 = r9
            int r0 = r0.M
            r1 = 1
            if (r0 != r1) goto L47e
            r0 = r9
            org.objectweb.asm.Handler r0 = r0.B
            r12 = r0
        L27d:
            r0 = r12
            if (r0 == 0) goto L300
            r0 = r12
            org.objectweb.asm.Label r0 = r0.a
            r13 = r0
            r0 = r12
            org.objectweb.asm.Label r0 = r0.c
            r14 = r0
            r0 = r12
            org.objectweb.asm.Label r0 = r0.b
            r15 = r0
        L293:
            r0 = r13
            r1 = r15
            if (r0 == r1) goto L2f8
            org.objectweb.asm.Edge r0 = new org.objectweb.asm.Edge
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.a = r1
            r0 = r16
            r1 = r14
            r0.b = r1
            r0 = r13
            int r0 = r0.a
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L2d1
            r0 = r16
            r1 = r13
            org.objectweb.asm.Edge r1 = r1.j
            r0.c = r1
            r0 = r13
            r1 = r16
            r0.j = r1
            goto L2ee
        L2d1:
            r0 = r16
            r1 = r13
            org.objectweb.asm.Edge r1 = r1.j
            org.objectweb.asm.Edge r1 = r1.c
            org.objectweb.asm.Edge r1 = r1.c
            r0.c = r1
            r0 = r13
            org.objectweb.asm.Edge r0 = r0.j
            org.objectweb.asm.Edge r0 = r0.c
            r1 = r16
            r0.c = r1
        L2ee:
            r0 = r13
            org.objectweb.asm.Label r0 = r0.i
            r13 = r0
            goto L293
        L2f8:
            r0 = r12
            org.objectweb.asm.Handler r0 = r0.f
            r12 = r0
            goto L27d
        L300:
            r0 = r9
            int r0 = r0.L
            if (r0 <= 0) goto L3cc
            r0 = 0
            r13 = r0
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            r1 = 0
            r2 = 1
            r3 = r9
            int r3 = r3.L
            r0.b(r1, r2, r3)
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            r14 = r0
        L31d:
            r0 = r14
            if (r0 == 0) goto L370
            r0 = r14
            int r0 = r0.a
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L366
            r0 = r14
            org.objectweb.asm.Edge r0 = r0.j
            org.objectweb.asm.Edge r0 = r0.c
            org.objectweb.asm.Label r0 = r0.b
            r15 = r0
            r0 = r15
            int r0 = r0.a
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L366
            int r13 = r13 + 1
            r0 = r15
            r1 = 0
            r2 = r13
            long r2 = (long) r2
            r3 = 32
            long r2 = r2 / r3
            r3 = 32
            long r2 = r2 << r3
            r3 = 1
            r4 = r13
            r5 = 32
            int r4 = r4 % r5
            long r3 = r3 << r4
            long r2 = r2 | r3
            r3 = r9
            int r3 = r3.L
            r0.b(r1, r2, r3)
        L366:
            r0 = r14
            org.objectweb.asm.Label r0 = r0.i
            r14 = r0
            goto L31d
        L370:
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            r14 = r0
        L376:
            r0 = r14
            if (r0 == 0) goto L3cc
            r0 = r14
            int r0 = r0.a
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L3c2
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            r15 = r0
        L38d:
            r0 = r15
            if (r0 == 0) goto L3a9
            r0 = r15
            r1 = r0
            int r1 = r1.a
            r2 = -2049(0xfffffffffffff7ff, float:NaN)
            r1 = r1 & r2
            r0.a = r1
            r0 = r15
            org.objectweb.asm.Label r0 = r0.i
            r15 = r0
            goto L38d
        L3a9:
            r0 = r14
            org.objectweb.asm.Edge r0 = r0.j
            org.objectweb.asm.Edge r0 = r0.c
            org.objectweb.asm.Label r0 = r0.b
            r16 = r0
            r0 = r16
            r1 = r14
            r2 = 0
            r3 = r9
            int r3 = r3.L
            r0.b(r1, r2, r3)
        L3c2:
            r0 = r14
            org.objectweb.asm.Label r0 = r0.i
            r14 = r0
            goto L376
        L3cc:
            r0 = 0
            r13 = r0
            r0 = r9
            org.objectweb.asm.Label r0 = r0.N
            r14 = r0
        L3d5:
            r0 = r14
            if (r0 == 0) goto L471
            r0 = r14
            r15 = r0
            r0 = r14
            org.objectweb.asm.Label r0 = r0.k
            r14 = r0
            r0 = r15
            int r0 = r0.f
            r16 = r0
            r0 = r16
            r1 = r15
            int r1 = r1.g
            int r0 = r0 + r1
            r17 = r0
            r0 = r17
            r1 = r13
            if (r0 <= r1) goto L401
            r0 = r17
            r13 = r0
        L401:
            r0 = r15
            org.objectweb.asm.Edge r0 = r0.j
            r18 = r0
            r0 = r15
            int r0 = r0.a
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L41b
            r0 = r18
            org.objectweb.asm.Edge r0 = r0.c
            r18 = r0
        L41b:
            r0 = r18
            if (r0 == 0) goto L46e
            r0 = r18
            org.objectweb.asm.Label r0 = r0.b
            r15 = r0
            r0 = r15
            int r0 = r0.a
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L464
            r0 = r15
            r1 = r18
            int r1 = r1.a
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L442
            r1 = 1
            goto L44a
        L442:
            r1 = r16
            r2 = r18
            int r2 = r2.a
            int r1 = r1 + r2
        L44a:
            r0.f = r1
            r0 = r15
            r1 = r0
            int r1 = r1.a
            r2 = 8
            r1 = r1 | r2
            r0.a = r1
            r0 = r15
            r1 = r14
            r0.k = r1
            r0 = r15
            r14 = r0
        L464:
            r0 = r18
            org.objectweb.asm.Edge r0 = r0.c
            r18 = r0
            goto L41b
        L46e:
            goto L3d5
        L471:
            r0 = r9
            r1 = r10
            r2 = r13
            int r1 = java.lang.Math.max(r1, r2)
            r0.s = r1
            goto L488
        L47e:
            r0 = r9
            r1 = r10
            r0.s = r1
            r0 = r9
            r1 = r11
            r0.t = r1
        L488:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    private void a(int r4, org.objectweb.asm.Label r5) {
            r3 = this;
            org.objectweb.asm.Edge r0 = new org.objectweb.asm.Edge
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r4
            r0.a = r1
            r0 = r6
            r1 = r5
            r0.b = r1
            r0 = r6
            r1 = r3
            org.objectweb.asm.Label r1 = r1.P
            org.objectweb.asm.Edge r1 = r1.j
            r0.c = r1
            r0 = r3
            org.objectweb.asm.Label r0 = r0.P
            r1 = r6
            r0.j = r1
            return
    }

    private void e() {
            r5 = this;
            r0 = r5
            int r0 = r0.M
            if (r0 != 0) goto L46
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            org.objectweb.asm.Frame r1 = new org.objectweb.asm.Frame
            r2 = r1
            r2.<init>()
            r0.h = r1
            r0 = r6
            org.objectweb.asm.Frame r0 = r0.h
            r1 = r6
            r0.b = r1
            r0 = r6
            r1 = r5
            r2 = r5
            org.objectweb.asm.ByteVector r2 = r2.r
            int r2 = r2.b
            r3 = r5
            org.objectweb.asm.ByteVector r3 = r3.r
            byte[] r3 = r3.a
            boolean r0 = r0.a(r1, r2, r3)
            r0 = r5
            org.objectweb.asm.Label r0 = r0.O
            r1 = r6
            r0.i = r1
            r0 = r5
            r1 = r6
            r0.O = r1
            goto L51
        L46:
            r0 = r5
            org.objectweb.asm.Label r0 = r0.P
            r1 = r5
            int r1 = r1.R
            r0.g = r1
        L51:
            r0 = r5
            r1 = 0
            r0.P = r1
            return
    }

    private void b(org.objectweb.asm.Frame r6) {
            r5 = this;
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            int[] r0 = r0.c
            r12 = r0
            r0 = r6
            int[] r0 = r0.d
            r13 = r0
            r0 = 0
            r7 = r0
        L17:
            r0 = r7
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L50
            r0 = r12
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L2f
            int r9 = r9 + 1
            goto L3b
        L2f:
            r0 = r10
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0 + r1
            r10 = r0
            r0 = 0
            r9 = r0
        L3b:
            r0 = r8
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto L47
            r0 = r8
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto L4a
        L47:
            int r7 = r7 + 1
        L4a:
            int r7 = r7 + 1
            goto L17
        L50:
            r0 = 0
            r7 = r0
        L52:
            r0 = r7
            r1 = r13
            int r1 = r1.length
            if (r0 >= r1) goto L76
            r0 = r13
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            int r11 = r11 + 1
            r0 = r8
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto L6d
            r0 = r8
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto L70
        L6d:
            int r7 = r7 + 1
        L70:
            int r7 = r7 + 1
            goto L52
        L76:
            r0 = r5
            r1 = r6
            org.objectweb.asm.Label r1 = r1.b
            int r1 = r1.c
            r2 = r10
            r3 = r11
            int r0 = r0.a(r1, r2, r3)
            r14 = r0
            r0 = 0
            r7 = r0
        L89:
            r0 = r10
            if (r0 <= 0) goto Lb6
            r0 = r12
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r5
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = r8
            r0[r1] = r2
            r0 = r8
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto Laa
            r0 = r8
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto Lad
        Laa:
            int r7 = r7 + 1
        Lad:
            int r7 = r7 + 1
            int r10 = r10 + (-1)
            goto L89
        Lb6:
            r0 = 0
            r7 = r0
        Lb8:
            r0 = r7
            r1 = r13
            int r1 = r1.length
            if (r0 >= r1) goto Le4
            r0 = r13
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r5
            int[] r0 = r0.z
            r1 = r14
            int r14 = r14 + 1
            r2 = r8
            r0[r1] = r2
            r0 = r8
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto Ldb
            r0 = r8
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto Lde
        Ldb:
            int r7 = r7 + 1
        Lde:
            int r7 = r7 + 1
            goto Lb8
        Le4:
            r0 = r5
            r0.b()
            return
    }

    private void f() {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = r8
            java.lang.String r2 = r2.f
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            r3 = 0
            int r0 = r0.a(r1, r2, r3)
            r9 = r0
            r0 = r8
            int r0 = r0.c
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L4c
            r0 = r8
            int r0 = r0.c
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L41
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 24117248(0x1700000, float:4.4081038E-38)
            r3 = r8
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r8
            org.objectweb.asm.ClassWriter r4 = r4.b
            java.lang.String r4 = r4.I
            int r3 = r3.m7563c(r4)
            r2 = r2 | r3
            r0[r1] = r2
            goto L4c
        L41:
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 6
            r0[r1] = r2
        L4c:
            r0 = 1
            r10 = r0
        L4e:
            r0 = r10
            r11 = r0
            r0 = r8
            java.lang.String r0 = r0.f
            r1 = r10
            int r10 = r10 + 1
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto Ld0;
                case 67: goto Ld0;
                case 68: goto Lf7;
                case 69: goto L193;
                case 70: goto Ldd;
                case 71: goto L193;
                case 72: goto L193;
                case 73: goto Ld0;
                case 74: goto Lea;
                case 75: goto L193;
                case 76: goto L15c;
                case 77: goto L193;
                case 78: goto L193;
                case 79: goto L193;
                case 80: goto L193;
                case 81: goto L193;
                case 82: goto L193;
                case 83: goto Ld0;
                case 84: goto L193;
                case 85: goto L193;
                case 86: goto L193;
                case 87: goto L193;
                case 88: goto L193;
                case 89: goto L193;
                case 90: goto Ld0;
                case 91: goto L104;
                default: goto L193;
            }
        Ld0:
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 1
            r0[r1] = r2
            goto L196
        Ldd:
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 2
            r0[r1] = r2
            goto L196
        Lea:
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 4
            r0[r1] = r2
            goto L196
        Lf7:
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 3
            r0[r1] = r2
            goto L196
        L104:
            r0 = r8
            java.lang.String r0 = r0.f
            r1 = r10
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L117
            int r10 = r10 + 1
            goto L104
        L117:
            r0 = r8
            java.lang.String r0 = r0.f
            r1 = r10
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L13a
            int r10 = r10 + 1
        L127:
            r0 = r8
            java.lang.String r0 = r0.f
            r1 = r10
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 == r1) goto L13a
            int r10 = r10 + 1
            goto L127
        L13a:
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 24117248(0x1700000, float:4.4081038E-38)
            r3 = r8
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r8
            java.lang.String r4 = r4.f
            r5 = r11
            int r10 = r10 + 1
            r6 = r10
            java.lang.String r4 = r4.substring(r5, r6)
            int r3 = r3.m7563c(r4)
            r2 = r2 | r3
            r0[r1] = r2
            goto L196
        L15c:
            r0 = r8
            java.lang.String r0 = r0.f
            r1 = r10
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 == r1) goto L16f
            int r10 = r10 + 1
            goto L15c
        L16f:
            r0 = r8
            int[] r0 = r0.z
            r1 = r9
            int r9 = r9 + 1
            r2 = 24117248(0x1700000, float:4.4081038E-38)
            r3 = r8
            org.objectweb.asm.ClassWriter r3 = r3.b
            r4 = r8
            java.lang.String r4 = r4.f
            r5 = r11
            r6 = 1
            int r5 = r5 + r6
            r6 = r10
            int r10 = r10 + 1
            java.lang.String r4 = r4.substring(r5, r6)
            int r3 = r3.m7563c(r4)
            r2 = r2 | r3
            r0[r1] = r2
            goto L196
        L193:
            goto L199
        L196:
            goto L4e
        L199:
            r0 = r8
            int[] r0 = r0.z
            r1 = 1
            r2 = r9
            r3 = 3
            int r2 = r2 - r3
            r0[r1] = r2
            r0 = r8
            r0.b()
            return
    }

    private int a(int r5, int r6, int r7) {
            r4 = this;
            r0 = 3
            r1 = r6
            int r0 = r0 + r1
            r1 = r7
            int r0 = r0 + r1
            r8 = r0
            r0 = r4
            int[] r0 = r0.z
            if (r0 == 0) goto L18
            r0 = r4
            int[] r0 = r0.z
            int r0 = r0.length
            r1 = r8
            if (r0 >= r1) goto L20
        L18:
            r0 = r4
            r1 = r8
            int[] r1 = new int[r1]
            r0.z = r1
        L20:
            r0 = r4
            int[] r0 = r0.z
            r1 = 0
            r2 = r5
            r0[r1] = r2
            r0 = r4
            int[] r0 = r0.z
            r1 = 1
            r2 = r6
            r0[r1] = r2
            r0 = r4
            int[] r0 = r0.z
            r1 = 2
            r2 = r7
            r0[r1] = r2
            r0 = 3
            return r0
    }

    private void b() {
            r4 = this;
            r0 = r4
            int[] r0 = r0.x
            if (r0 == 0) goto L27
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.v
            if (r0 != 0) goto L19
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.v = r1
        L19:
            r0 = r4
            r0.c()
            r0 = r4
            r1 = r0
            int r1 = r1.u
            r2 = 1
            int r1 = r1 + r2
            r0.u = r1
        L27:
            r0 = r4
            r1 = r4
            int[] r1 = r1.z
            r0.x = r1
            r0 = r4
            r1 = 0
            r0.z = r1
            return
    }

    private void c() {
            r5 = this;
            r0 = r5
            int[] r0 = r0.z
            r1 = 1
            r0 = r0[r1]
            r6 = r0
            r0 = r5
            int[] r0 = r0.z
            r1 = 2
            r0 = r0[r1]
            r7 = r0
            r0 = r5
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 50
            if (r0 >= r1) goto L4d
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r5
            int[] r1 = r1.z
            r2 = 0
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r0.a(r1, r2)
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r3 = r7
            int r2 = r2 + r3
            r0.a(r1, r2)
            return
        L4d:
            r0 = r5
            int[] r0 = r0.x
            r1 = 1
            r0 = r0[r1]
            r8 = r0
            r0 = 255(0xff, float:3.57E-43)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r5
            int r0 = r0.u
            if (r0 != 0) goto L6e
            r0 = r5
            int[] r0 = r0.z
            r1 = 0
            r0 = r0[r1]
            r11 = r0
            goto L7f
        L6e:
            r0 = r5
            int[] r0 = r0.z
            r1 = 0
            r0 = r0[r1]
            r1 = r5
            int[] r1 = r1.x
            r2 = 0
            r1 = r1[r2]
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            r11 = r0
        L7f:
            r0 = r7
            if (r0 != 0) goto Ld9
            r0 = r6
            r1 = r8
            int r0 = r0 - r1
            r10 = r0
            r0 = r10
            switch(r0) {
                case -3: goto Lb4;
                case -2: goto Lb4;
                case -1: goto Lb4;
                case 0: goto Lbe;
                case 1: goto Ld1;
                case 2: goto Ld1;
                case 3: goto Ld1;
                default: goto Ld6;
            }
        Lb4:
            r0 = 248(0xf8, float:3.48E-43)
            r9 = r0
            r0 = r6
            r8 = r0
            goto Ld6
        Lbe:
            r0 = r11
            r1 = 64
            if (r0 >= r1) goto Lc9
            r0 = 0
            goto Lcc
        Lc9:
            r0 = 251(0xfb, float:3.52E-43)
        Lcc:
            r9 = r0
            goto Ld6
        Ld1:
            r0 = 252(0xfc, float:3.53E-43)
            r9 = r0
        Ld6:
            goto Lf4
        Ld9:
            r0 = r6
            r1 = r8
            if (r0 != r1) goto Lf4
            r0 = r7
            r1 = 1
            if (r0 != r1) goto Lf4
            r0 = r11
            r1 = 63
            if (r0 >= r1) goto Lef
            r0 = 64
            goto Lf2
        Lef:
            r0 = 247(0xf7, float:3.46E-43)
        Lf2:
            r9 = r0
        Lf4:
            r0 = r9
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == r1) goto L12a
            r0 = 3
            r12 = r0
            r0 = 0
            r13 = r0
        L102:
            r0 = r13
            r1 = r8
            if (r0 >= r1) goto L12a
            r0 = r5
            int[] r0 = r0.z
            r1 = r12
            r0 = r0[r1]
            r1 = r5
            int[] r1 = r1.x
            r2 = r12
            r1 = r1[r2]
            if (r0 == r1) goto L121
            r0 = 255(0xff, float:3.57E-43)
            r9 = r0
            goto L12a
        L121:
            int r12 = r12 + 1
            int r13 = r13 + 1
            goto L102
        L12a:
            r0 = r9
            switch(r0) {
                case 0: goto L168;
                case 64: goto L175;
                case 247: goto L18f;
                case 248: goto L1bf;
                case 251: goto L1ac;
                case 252: goto L1d5;
                default: goto L1f5;
            }
        L168:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L226
        L175:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 64
            r2 = r11
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 4
            r3 = r6
            int r2 = r2 + r3
            r0.a(r1, r2)
            goto L226
        L18f:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 247(0xf7, float:3.46E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 4
            r3 = r6
            int r2 = r2 + r3
            r0.a(r1, r2)
            goto L226
        L1ac:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 251(0xfb, float:3.52E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L226
        L1bf:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r10
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L226
        L1d5:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r10
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r8
            int r1 = r1 + r2
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r0.a(r1, r2)
            goto L226
        L1f5:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 255(0xff, float:3.57E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r0.a(r1, r2)
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r3 = r7
            int r2 = r2 + r3
            r0.a(r1, r2)
        L226:
            return
    }

    private void a(int r6, int r7) {
            r5 = this;
            r0 = r6
            r8 = r0
        L2:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L19c
            r0 = r5
            int[] r0 = r0.z
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L8e
            r0 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            r11 = r0
            r0 = r9
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            switch(r0) {
                case 24117248: goto L40;
                case 25165824: goto L64;
                default: goto L81;
            }
        L40:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r5
            org.objectweb.asm.ClassWriter r2 = r2.b
            org.objectweb.asm.Item[] r2 = r2.H
            r3 = r11
            r2 = r2[r3]
            java.lang.String r2 = r2.g
            int r1 = r1.newClass(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L8b
        L64:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 8
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            org.objectweb.asm.ClassWriter r1 = r1.b
            org.objectweb.asm.Item[] r1 = r1.H
            r2 = r11
            r1 = r1[r2]
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L8b
        L81:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
        L8b:
            goto L196
        L8e:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r10
            r1 = 28
            int r0 = r0 >> r1
            r10 = r0
        L9e:
            r0 = r10
            int r10 = r10 + (-1)
            if (r0 <= 0) goto Lb1
            r0 = r11
            r1 = 91
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L9e
        Lb1:
            r0 = r9
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r0 != r1) goto Le4
            r0 = r11
            r1 = 76
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r11
            r1 = r5
            org.objectweb.asm.ClassWriter r1 = r1.b
            org.objectweb.asm.Item[] r1 = r1.H
            r2 = r9
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r3
            r1 = r1[r2]
            java.lang.String r1 = r1.g
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r11
            r1 = 59
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        Le4:
            r0 = r9
            r1 = 15
            r0 = r0 & r1
            switch(r0) {
                case 1: goto L128;
                case 2: goto L133;
                case 3: goto L13e;
                case 4: goto L175;
                case 5: goto L175;
                case 6: goto L175;
                case 7: goto L175;
                case 8: goto L175;
                case 9: goto L149;
                case 10: goto L154;
                case 11: goto L15f;
                case 12: goto L16a;
                default: goto L175;
            }
        L128:
            r0 = r11
            r1 = 73
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        L133:
            r0 = r11
            r1 = 70
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        L13e:
            r0 = r11
            r1 = 68
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        L149:
            r0 = r11
            r1 = 90
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        L154:
            r0 = r11
            r1 = 66
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        L15f:
            r0 = r11
            r1 = 67
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        L16a:
            r0 = r11
            r1 = 83
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L17d
        L175:
            r0 = r11
            r1 = 74
            java.lang.StringBuffer r0 = r0.append(r1)
        L17d:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r11
            java.lang.String r2 = r2.toString()
            int r1 = r1.newClass(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L196:
            int r8 = r8 + 1
            goto L2
        L19c:
            return
    }

    private void a(java.lang.Object r5) {
            r4 = this;
            r0 = r5
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L22
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r4
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r1.newClass(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L4f
        L22:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L3b
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = r5
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L4f
        L3b:
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.v
            r1 = 8
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            org.objectweb.asm.Label r1 = (org.objectweb.asm.Label) r1
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L4f:
            return
    }

    final int a() {
            r8 = this;
            r0 = r8
            int r0 = r0.h
            if (r0 == 0) goto Lf
            r0 = 6
            r1 = r8
            int r1 = r1.i
            int r0 = r0 + r1
            return r0
        Lf:
            r0 = 8
            r9 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            if (r0 <= 0) goto L155
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 <= r1) goto L33
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Method code too large!"
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Code"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 18
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.r
            int r2 = r2.b
            int r1 = r1 + r2
            r2 = 8
            r3 = r8
            int r3 = r3.A
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.E
            if (r0 == 0) goto L71
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "LocalVariableTable"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.E
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L71:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.G
            if (r0 == 0) goto L90
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "LocalVariableTypeTable"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.G
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L90:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.I
            if (r0 == 0) goto Lae
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "LineNumberTable"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.I
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Lae:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            if (r0 == 0) goto Lec
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 50
            if (r0 < r1) goto Lc8
            r0 = 1
            goto Lc9
        Lc8:
            r0 = 0
        Lc9:
            r10 = r0
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r10
            if (r1 == 0) goto Ld8
            java.lang.String r1 = "StackMapTable"
            goto Ldb
        Ld8:
            java.lang.String r1 = "StackMap"
        Ldb:
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.v
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Lec:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.W
            if (r0 == 0) goto L10b
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeVisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.W
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L10b:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.X
            if (r0 == 0) goto L12a
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeInvisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.X
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L12a:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.J
            if (r0 == 0) goto L155
            r0 = r9
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.J
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.r
            byte[] r3 = r3.a
            r4 = r8
            org.objectweb.asm.ByteVector r4 = r4.r
            int r4 = r4.b
            r5 = r8
            int r5 = r5.s
            r6 = r8
            int r6 = r6.t
            int r1 = r1.a(r2, r3, r4, r5, r6)
            int r0 = r0 + r1
            r9 = r0
        L155:
            r0 = r8
            int r0 = r0.j
            if (r0 <= 0) goto L172
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Exceptions"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = 2
            r3 = r8
            int r3 = r3.j
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L172:
            r0 = r8
            int r0 = r0.c
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L1a4
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto L196
            r0 = r8
            int r0 = r0.c
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L1a4
        L196:
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Synthetic"
            int r0 = r0.newUTF8(r1)
            int r9 = r9 + 6
        L1a4:
            r0 = r8
            int r0 = r0.c
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L1bb
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Deprecated"
            int r0 = r0.newUTF8(r1)
            int r9 = r9 + 6
        L1bb:
            r0 = r8
            java.lang.String r0 = r0.g
            if (r0 == 0) goto L1dc
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "Signature"
            int r0 = r0.newUTF8(r1)
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = r8
            java.lang.String r1 = r1.g
            int r0 = r0.newUTF8(r1)
            int r9 = r9 + 8
        L1dc:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.$
            if (r0 == 0) goto L1fb
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "MethodParameters"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 7
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.$
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L1fb:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.l
            if (r0 == 0) goto L219
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "AnnotationDefault"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 6
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.l
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L219:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.m
            if (r0 == 0) goto L238
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.m
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L238:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.n
            if (r0 == 0) goto L257
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.n
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L257:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.U
            if (r0 == 0) goto L276
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeVisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.U
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L276:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.V
            if (r0 == 0) goto L295
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeInvisibleTypeAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.V
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L295:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.o
            if (r0 == 0) goto L2e8
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 7
            r2 = 2
            r3 = r8
            org.objectweb.asm.AnnotationWriter[] r3 = r3.o
            int r3 = r3.length
            r4 = r8
            int r4 = r4.S
            int r3 = r3 - r4
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.o
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L2c1:
            r0 = r10
            r1 = r8
            int r1 = r1.S
            if (r0 < r1) goto L2e8
            r0 = r9
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.o
            r2 = r10
            r1 = r1[r2]
            if (r1 != 0) goto L2d7
            r1 = 0
            goto L2e0
        L2d7:
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.o
            r2 = r10
            r1 = r1[r2]
            int r1 = r1.a()
        L2e0:
            int r0 = r0 + r1
            r9 = r0
            int r10 = r10 + (-1)
            goto L2c1
        L2e8:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.p
            if (r0 == 0) goto L33b
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            int r0 = r0.newUTF8(r1)
            r0 = r9
            r1 = 7
            r2 = 2
            r3 = r8
            org.objectweb.asm.AnnotationWriter[] r3 = r3.p
            int r3 = r3.length
            r4 = r8
            int r4 = r4.S
            int r3 = r3 - r4
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.p
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L314:
            r0 = r10
            r1 = r8
            int r1 = r1.S
            if (r0 < r1) goto L33b
            r0 = r9
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.p
            r2 = r10
            r1 = r1[r2]
            if (r1 != 0) goto L32a
            r1 = 0
            goto L333
        L32a:
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.p
            r2 = r10
            r1 = r1[r2]
            int r1 = r1.a()
        L333:
            int r0 = r0 + r1
            r9 = r0
            int r10 = r10 + (-1)
            goto L314
        L33b:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.q
            if (r0 == 0) goto L354
            r0 = r9
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.q
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            int r1 = r1.a(r2, r3, r4, r5, r6)
            int r0 = r0 + r1
            r9 = r0
        L354:
            r0 = r9
            return r0
    }

    final void a(org.objectweb.asm.ByteVector r9) {
            r8 = this;
            r0 = 64
            r10 = r0
            r0 = 917504(0xe0000, float:1.285697E-39)
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
            r0 = r8
            int r0 = r0.h
            if (r0 == 0) goto L4b
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            org.objectweb.asm.ClassReader r1 = r1.M
            byte[] r1 = r1.b
            r2 = r8
            int r2 = r2.h
            r3 = r8
            int r3 = r3.i
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            return
        L4b:
            r0 = 0
            r12 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            if (r0 <= 0) goto L5b
            int r12 = r12 + 1
        L5b:
            r0 = r8
            int r0 = r0.j
            if (r0 <= 0) goto L65
            int r12 = r12 + 1
        L65:
            r0 = r8
            int r0 = r0.c
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L8c
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto L89
            r0 = r8
            int r0 = r0.c
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L8c
        L89:
            int r12 = r12 + 1
        L8c:
            r0 = r8
            int r0 = r0.c
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L99
            int r12 = r12 + 1
        L99:
            r0 = r8
            java.lang.String r0 = r0.g
            if (r0 == 0) goto La3
            int r12 = r12 + 1
        La3:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.$
            if (r0 == 0) goto Lad
            int r12 = r12 + 1
        Lad:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.l
            if (r0 == 0) goto Lb7
            int r12 = r12 + 1
        Lb7:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.m
            if (r0 == 0) goto Lc1
            int r12 = r12 + 1
        Lc1:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.n
            if (r0 == 0) goto Lcb
            int r12 = r12 + 1
        Lcb:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.U
            if (r0 == 0) goto Ld5
            int r12 = r12 + 1
        Ld5:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.V
            if (r0 == 0) goto Ldf
            int r12 = r12 + 1
        Ldf:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.o
            if (r0 == 0) goto Le9
            int r12 = r12 + 1
        Le9:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.p
            if (r0 == 0) goto Lf3
            int r12 = r12 + 1
        Lf3:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.q
            if (r0 == 0) goto L106
            r0 = r12
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.q
            int r1 = r1.a()
            int r0 = r0 + r1
            r12 = r0
        L106:
            r0 = r9
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            if (r0 <= 0) goto L447
            r0 = 12
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            int r0 = r0 + r1
            r1 = 8
            r2 = r8
            int r2 = r2.A
            int r1 = r1 * r2
            int r0 = r0 + r1
            r13 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.E
            if (r0 == 0) goto L141
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.E
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
        L141:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.G
            if (r0 == 0) goto L157
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.G
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
        L157:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.I
            if (r0 == 0) goto L16d
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.I
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
        L16d:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            if (r0 == 0) goto L183
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.v
            int r2 = r2.b
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
        L183:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.W
            if (r0 == 0) goto L199
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.W
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
        L199:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.X
            if (r0 == 0) goto L1af
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.X
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
        L1af:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.J
            if (r0 == 0) goto L1dc
            r0 = r13
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.J
            r2 = r8
            org.objectweb.asm.ClassWriter r2 = r2.b
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.r
            byte[] r3 = r3.a
            r4 = r8
            org.objectweb.asm.ByteVector r4 = r4.r
            int r4 = r4.b
            r5 = r8
            int r5 = r5.s
            r6 = r8
            int r6 = r6.t
            int r1 = r1.a(r2, r3, r4, r5, r6)
            int r0 = r0 + r1
            r13 = r0
        L1dc:
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Code"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r9
            r1 = r8
            int r1 = r1.s
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.t
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.r
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r9
            r1 = r8
            int r1 = r1.A
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            int r0 = r0.A
            if (r0 <= 0) goto L26d
            r0 = r8
            org.objectweb.asm.Handler r0 = r0.B
            r14 = r0
        L233:
            r0 = r14
            if (r0 == 0) goto L26d
            r0 = r9
            r1 = r14
            org.objectweb.asm.Label r1 = r1.a
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r14
            org.objectweb.asm.Label r1 = r1.b
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r14
            org.objectweb.asm.Label r1 = r1.c
            int r1 = r1.c
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r14
            int r1 = r1.e
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r14
            org.objectweb.asm.Handler r0 = r0.f
            r14 = r0
            goto L233
        L26d:
            r0 = 0
            r12 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.E
            if (r0 == 0) goto L27a
            int r12 = r12 + 1
        L27a:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.G
            if (r0 == 0) goto L284
            int r12 = r12 + 1
        L284:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.I
            if (r0 == 0) goto L28e
            int r12 = r12 + 1
        L28e:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            if (r0 == 0) goto L298
            int r12 = r12 + 1
        L298:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.W
            if (r0 == 0) goto L2a2
            int r12 = r12 + 1
        L2a2:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.X
            if (r0 == 0) goto L2ac
            int r12 = r12 + 1
        L2ac:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.J
            if (r0 == 0) goto L2bf
            r0 = r12
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.J
            int r1 = r1.a()
            int r0 = r0 + r1
            r12 = r0
        L2bf:
            r0 = r9
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.E
            if (r0 == 0) goto L305
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "LocalVariableTable"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.E
            int r1 = r1.b
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.D
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.E
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.E
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L305:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.G
            if (r0 == 0) goto L344
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "LocalVariableTypeTable"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.G
            int r1 = r1.b
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.F
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.G
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.G
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L344:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.I
            if (r0 == 0) goto L382
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "LineNumberTable"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.I
            int r1 = r1.b
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.H
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.I
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.I
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L382:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.v
            if (r0 == 0) goto L3e2
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 50
            if (r0 < r1) goto L39c
            r0 = 1
            goto L39d
        L39c:
            r0 = 0
        L39d:
            r14 = r0
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r14
            if (r2 == 0) goto L3af
            java.lang.String r2 = "StackMapTable"
            goto L3b2
        L3af:
            java.lang.String r2 = "StackMap"
        L3b2:
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.v
            int r1 = r1.b
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.u
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.v
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.v
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L3e2:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.W
            if (r0 == 0) goto L400
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.W
            r1 = r9
            r0.a(r1)
        L400:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.X
            if (r0 == 0) goto L41e
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.X
            r1 = r9
            r0.a(r1)
        L41e:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.J
            if (r0 == 0) goto L447
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.J
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.r
            byte[] r2 = r2.a
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.r
            int r3 = r3.b
            r4 = r8
            int r4 = r4.t
            r5 = r8
            int r5 = r5.s
            r6 = r9
            r0.a(r1, r2, r3, r4, r5, r6)
        L447:
            r0 = r8
            int r0 = r0.j
            if (r0 <= 0) goto L48e
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Exceptions"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            r2 = r8
            int r2 = r2.j
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r9
            r1 = r8
            int r1 = r1.j
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r13 = r0
        L473:
            r0 = r13
            r1 = r8
            int r1 = r1.j
            if (r0 >= r1) goto L48e
            r0 = r9
            r1 = r8
            int[] r1 = r1.k
            r2 = r13
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r13 = r13 + 1
            goto L473
        L48e:
            r0 = r8
            int r0 = r0.c
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L4c5
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            int r0 = r0.b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 < r1) goto L4b2
            r0 = r8
            int r0 = r0.c
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L4c5
        L4b2:
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Synthetic"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L4c5:
            r0 = r8
            int r0 = r0.c
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L4e1
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Deprecated"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L4e1:
            r0 = r8
            java.lang.String r0 = r0.g
            if (r0 == 0) goto L509
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "Signature"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = r8
            java.lang.String r2 = r2.g
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L509:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.$
            if (r0 == 0) goto L548
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "MethodParameters"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.$
            int r1 = r1.b
            r2 = 1
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.Z
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.$
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.$
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L548:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.l
            if (r0 == 0) goto L57d
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "AnnotationDefault"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.l
            int r1 = r1.b
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r9
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.l
            byte[] r1 = r1.a
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.l
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L57d:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.m
            if (r0 == 0) goto L59b
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.m
            r1 = r9
            r0.a(r1)
        L59b:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.n
            if (r0 == 0) goto L5b9
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.n
            r1 = r9
            r0.a(r1)
        L5b9:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.U
            if (r0 == 0) goto L5d7
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.U
            r1 = r9
            r0.a(r1)
        L5d7:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.V
            if (r0 == 0) goto L5f5
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.V
            r1 = r9
            r0.a(r1)
        L5f5:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.o
            if (r0 == 0) goto L617
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeVisibleParameterAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.o
            r1 = r8
            int r1 = r1.S
            r2 = r9
            org.objectweb.asm.AnnotationWriter.a(r0, r1, r2)
        L617:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.p
            if (r0 == 0) goto L639
            r0 = r9
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            java.lang.String r2 = "RuntimeInvisibleParameterAnnotations"
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.p
            r1 = r8
            int r1 = r1.S
            r2 = r9
            org.objectweb.asm.AnnotationWriter.a(r0, r1, r2)
        L639:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.q
            if (r0 == 0) goto L650
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.q
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = r9
            r0.a(r1, r2, r3, r4, r5, r6)
        L650:
            return
    }

    private void d() {
            r8 = this;
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            byte[] r0 = r0.a
            r9 = r0
            r0 = 0
            int[] r0 = new int[r0]
            r15 = r0
            r0 = 0
            int[] r0 = new int[r0]
            r16 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.r
            int r0 = r0.b
            boolean[] r0 = new boolean[r0]
            r17 = r0
            r0 = 3
            r19 = r0
        L20:
            r0 = r19
            r1 = 3
            if (r0 != r1) goto L29
            r0 = 2
            r19 = r0
        L29:
            r0 = 0
            r10 = r0
        L2b:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L240
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r20 = r0
            r0 = 0
            r21 = r0
            byte[] r0 = org.objectweb.asm.ClassWriter.a
            r1 = r20
            r0 = r0[r1]
            switch(r0) {
                case 0: goto L98;
                case 1: goto L1da;
                case 2: goto L1e0;
                case 3: goto L1da;
                case 4: goto L98;
                case 5: goto L1e0;
                case 6: goto L1e0;
                case 7: goto L1e6;
                case 8: goto L1e6;
                case 9: goto L9e;
                case 10: goto L11d;
                case 11: goto L1da;
                case 12: goto L1e0;
                case 13: goto L1e0;
                case 14: goto L123;
                case 15: goto L174;
                case 16: goto L1ec;
                case 17: goto L1bb;
                default: goto L1ec;
            }
        L98:
            int r10 = r10 + 1
            goto L1ef
        L9e:
            r0 = r20
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 <= r1) goto Lcb
            r0 = r20
            r1 = 218(0xda, float:3.05E-43)
            if (r0 >= r1) goto Lb6
            r0 = r20
            r1 = 49
            int r0 = r0 - r1
            goto Lbb
        Lb6:
            r0 = r20
            r1 = 20
            int r0 = r0 - r1
        Lbb:
            r20 = r0
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = c(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            goto Ld6
        Lcb:
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            short r1 = b(r1, r2)
            int r0 = r0 + r1
            r12 = r0
        Ld6:
            r0 = r15
            r1 = r16
            r2 = r10
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r18
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto Lf2
            r0 = r18
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r1) goto L117
        Lf2:
            r0 = r17
            r1 = r10
            r0 = r0[r1]
            if (r0 != 0) goto L117
            r0 = r20
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto L109
            r0 = r20
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L10f
        L109:
            r0 = 2
            r21 = r0
            goto L112
        L10f:
            r0 = 5
            r21 = r0
        L112:
            r0 = r17
            r1 = r10
            r2 = 1
            r0[r1] = r2
        L117:
            int r10 = r10 + 3
            goto L1ef
        L11d:
            int r10 = r10 + 5
            goto L1ef
        L123:
            r0 = r19
            r1 = 1
            if (r0 != r1) goto L13e
            r0 = r15
            r1 = r16
            r2 = 0
            r3 = r10
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r18
            r1 = 3
            r0 = r0 & r1
            int r0 = -r0
            r21 = r0
            goto L14f
        L13e:
            r0 = r17
            r1 = r10
            r0 = r0[r1]
            if (r0 != 0) goto L14f
            r0 = r10
            r1 = 3
            r0 = r0 & r1
            r21 = r0
            r0 = r17
            r1 = r10
            r2 = 1
            r0[r1] = r2
        L14f:
            r0 = r10
            r1 = 4
            int r0 = r0 + r1
            r1 = r10
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r10 = r0
            r0 = r10
            r1 = 4
            r2 = r9
            r3 = r10
            r4 = 8
            int r3 = r3 + r4
            int r2 = a(r2, r3)
            r3 = r9
            r4 = r10
            r5 = 4
            int r4 = r4 + r5
            int r3 = a(r3, r4)
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1 * r2
            r2 = 12
            int r1 = r1 + r2
            int r0 = r0 + r1
            r10 = r0
            goto L1ef
        L174:
            r0 = r19
            r1 = 1
            if (r0 != r1) goto L18f
            r0 = r15
            r1 = r16
            r2 = 0
            r3 = r10
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r18
            r1 = 3
            r0 = r0 & r1
            int r0 = -r0
            r21 = r0
            goto L1a0
        L18f:
            r0 = r17
            r1 = r10
            r0 = r0[r1]
            if (r0 != 0) goto L1a0
            r0 = r10
            r1 = 3
            r0 = r0 & r1
            r21 = r0
            r0 = r17
            r1 = r10
            r2 = 1
            r0[r1] = r2
        L1a0:
            r0 = r10
            r1 = 4
            int r0 = r0 + r1
            r1 = r10
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r10 = r0
            r0 = r10
            r1 = 8
            r2 = r9
            r3 = r10
            r4 = 4
            int r3 = r3 + r4
            int r2 = a(r2, r3)
            int r1 = r1 * r2
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0 + r1
            r10 = r0
            goto L1ef
        L1bb:
            r0 = r9
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r20 = r0
            r0 = r20
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto L1d4
            int r10 = r10 + 6
            goto L1ef
        L1d4:
            int r10 = r10 + 4
            goto L1ef
        L1da:
            int r10 = r10 + 2
            goto L1ef
        L1e0:
            int r10 = r10 + 3
            goto L1ef
        L1e6:
            int r10 = r10 + 5
            goto L1ef
        L1ec:
            int r10 = r10 + 4
        L1ef:
            r0 = r21
            if (r0 == 0) goto L23d
            r0 = r15
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r22 = r0
            r0 = r16
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r23 = r0
            r0 = r15
            r1 = 0
            r2 = r22
            r3 = 0
            r4 = r15
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r16
            r1 = 0
            r2 = r23
            r3 = 0
            r4 = r16
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r22
            r1 = r15
            int r1 = r1.length
            r2 = r10
            r0[r1] = r2
            r0 = r23
            r1 = r16
            int r1 = r1.length
            r2 = r21
            r0[r1] = r2
            r0 = r22
            r15 = r0
            r0 = r23
            r16 = r0
            r0 = r21
            if (r0 <= 0) goto L23d
            r0 = 3
            r19 = r0
        L23d:
            goto L2b
        L240:
            r0 = r19
            r1 = 3
            if (r0 >= r1) goto L249
            int r19 = r19 + (-1)
        L249:
            r0 = r19
            if (r0 != 0) goto L20
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.r
            int r2 = r2.b
            r1.<init>(r2)
            r20 = r0
            r0 = 0
            r10 = r0
        L260:
            r0 = r10
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.r
            int r1 = r1.b
            if (r0 >= r1) goto L56e
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r21 = r0
            byte[] r0 = org.objectweb.asm.ClassWriter.a
            r1 = r21
            r0 = r0[r1]
            switch(r0) {
                case 0: goto L2d0;
                case 1: goto L532;
                case 2: goto L541;
                case 3: goto L532;
                case 4: goto L2d0;
                case 5: goto L541;
                case 6: goto L541;
                case 7: goto L550;
                case 8: goto L550;
                case 9: goto L2de;
                case 10: goto L3a3;
                case 11: goto L532;
                case 12: goto L541;
                case 13: goto L541;
                case 14: goto L3d0;
                case 15: goto L46f;
                case 16: goto L55f;
                case 17: goto L500;
                default: goto L55f;
            }
        L2d0:
            r0 = r20
            r1 = r21
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            int r10 = r10 + 1
            goto L56b
        L2de:
            r0 = r21
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 <= r1) goto L30b
            r0 = r21
            r1 = 218(0xda, float:3.05E-43)
            if (r0 >= r1) goto L2f6
            r0 = r21
            r1 = 49
            int r0 = r0 - r1
            goto L2fb
        L2f6:
            r0 = r21
            r1 = 20
            int r0 = r0 - r1
        L2fb:
            r21 = r0
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = c(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            goto L316
        L30b:
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            short r1 = b(r1, r2)
            int r0 = r0 + r1
            r12 = r0
        L316:
            r0 = r15
            r1 = r16
            r2 = r10
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r17
            r1 = r10
            r0 = r0[r1]
            if (r0 == 0) goto L38d
            r0 = r21
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 != r1) goto L33d
            r0 = r20
            r1 = 200(0xc8, float:2.8E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L382
        L33d:
            r0 = r21
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L351
            r0 = r20
            r1 = 201(0xc9, float:2.82E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L382
        L351:
            r0 = r20
            r1 = r21
            r2 = 166(0xa6, float:2.33E-43)
            if (r1 > r2) goto L366
            r1 = r21
            r2 = 1
            int r1 = r1 + r2
            r2 = 1
            r1 = r1 ^ r2
            r2 = 1
            int r1 = r1 - r2
            goto L36a
        L366:
            r1 = r21
            r2 = 1
            r1 = r1 ^ r2
        L36a:
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r20
            r1 = 8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r20
            r1 = 200(0xc8, float:2.8E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            int r18 = r18 + (-3)
        L382:
            r0 = r20
            r1 = r18
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            goto L39d
        L38d:
            r0 = r20
            r1 = r21
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r20
            r1 = r18
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L39d:
            int r10 = r10 + 3
            goto L56b
        L3a3:
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = a(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            r0 = r15
            r1 = r16
            r2 = r10
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r20
            r1 = r21
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r20
            r1 = r18
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            int r10 = r10 + 5
            goto L56b
        L3d0:
            r0 = r10
            r11 = r0
            r0 = r10
            r1 = 4
            int r0 = r0 + r1
            r1 = r11
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r10 = r0
            r0 = r20
            r1 = 170(0xaa, float:2.38E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r20
            r1 = 0
            r2 = 0
            r3 = 4
            r4 = r20
            int r4 = r4.b
            r5 = 4
            int r4 = r4 % r5
            int r3 = r3 - r4
            r4 = 4
            int r3 = r3 % r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r11
            r1 = r9
            r2 = r10
            int r1 = a(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            int r10 = r10 + 4
            r0 = r15
            r1 = r16
            r2 = r11
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r20
            r1 = r18
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r9
            r1 = r10
            int r0 = a(r0, r1)
            r14 = r0
            int r10 = r10 + 4
            r0 = r20
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r9
            r1 = r10
            int r0 = a(r0, r1)
            r1 = r14
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r14 = r0
            int r10 = r10 + 4
            r0 = r20
            r1 = r9
            r2 = r10
            r3 = 4
            int r2 = r2 - r3
            int r1 = a(r1, r2)
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L444:
            r0 = r14
            if (r0 <= 0) goto L56b
            r0 = r11
            r1 = r9
            r2 = r10
            int r1 = a(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            int r10 = r10 + 4
            r0 = r15
            r1 = r16
            r2 = r11
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r20
            r1 = r18
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            int r14 = r14 + (-1)
            goto L444
        L46f:
            r0 = r10
            r11 = r0
            r0 = r10
            r1 = 4
            int r0 = r0 + r1
            r1 = r11
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r10 = r0
            r0 = r20
            r1 = 171(0xab, float:2.4E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r20
            r1 = 0
            r2 = 0
            r3 = 4
            r4 = r20
            int r4 = r4.b
            r5 = 4
            int r4 = r4 % r5
            int r3 = r3 - r4
            r4 = 4
            int r3 = r3 % r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r11
            r1 = r9
            r2 = r10
            int r1 = a(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            int r10 = r10 + 4
            r0 = r15
            r1 = r16
            r2 = r11
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r20
            r1 = r18
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r9
            r1 = r10
            int r0 = a(r0, r1)
            r14 = r0
            int r10 = r10 + 4
            r0 = r20
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L4c7:
            r0 = r14
            if (r0 <= 0) goto L56b
            r0 = r20
            r1 = r9
            r2 = r10
            int r1 = a(r1, r2)
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            int r10 = r10 + 4
            r0 = r11
            r1 = r9
            r2 = r10
            int r1 = a(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            int r10 = r10 + 4
            r0 = r15
            r1 = r16
            r2 = r11
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r20
            r1 = r18
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            int r14 = r14 + (-1)
            goto L4c7
        L500:
            r0 = r9
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r21 = r0
            r0 = r21
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto L523
            r0 = r20
            r1 = r9
            r2 = r10
            r3 = 6
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            int r10 = r10 + 6
            goto L56b
        L523:
            r0 = r20
            r1 = r9
            r2 = r10
            r3 = 4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            int r10 = r10 + 4
            goto L56b
        L532:
            r0 = r20
            r1 = r9
            r2 = r10
            r3 = 2
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            int r10 = r10 + 2
            goto L56b
        L541:
            r0 = r20
            r1 = r9
            r2 = r10
            r3 = 3
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            int r10 = r10 + 3
            goto L56b
        L550:
            r0 = r20
            r1 = r9
            r2 = r10
            r3 = 5
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            int r10 = r10 + 5
            goto L56b
        L55f:
            r0 = r20
            r1 = r9
            r2 = r10
            r3 = 4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            int r10 = r10 + 4
        L56b:
            goto L260
        L56e:
            r0 = r8
            int r0 = r0.M
            if (r0 != 0) goto L602
            r0 = r8
            org.objectweb.asm.Label r0 = r0.N
            r21 = r0
        L57b:
            r0 = r21
            if (r0 == 0) goto L5b2
            r0 = r21
            int r0 = r0.c
            r1 = 3
            int r0 = r0 - r1
            r10 = r0
            r0 = r10
            if (r0 < 0) goto L59f
            r0 = r17
            r1 = r10
            r0 = r0[r1]
            if (r0 == 0) goto L59f
            r0 = r21
            r1 = r0
            int r1 = r1.a
            r2 = 16
            r1 = r1 | r2
            r0.a = r1
        L59f:
            r0 = r15
            r1 = r16
            r2 = r21
            a(r0, r1, r2)
            r0 = r21
            org.objectweb.asm.Label r0 = r0.i
            r21 = r0
            goto L57b
        L5b2:
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            org.objectweb.asm.Item[] r0 = r0.H
            if (r0 == 0) goto L5ff
            r0 = 0
            r13 = r0
        L5bf:
            r0 = r13
            r1 = r8
            org.objectweb.asm.ClassWriter r1 = r1.b
            org.objectweb.asm.Item[] r1 = r1.H
            int r1 = r1.length
            if (r0 >= r1) goto L5ff
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            org.objectweb.asm.Item[] r0 = r0.H
            r1 = r13
            r0 = r0[r1]
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L5f9
            r0 = r22
            int r0 = r0.b
            r1 = 31
            if (r0 != r1) goto L5f9
            r0 = r22
            r1 = r15
            r2 = r16
            r3 = 0
            r4 = r22
            int r4 = r4.c
            int r1 = a(r1, r2, r3, r4)
            r0.c = r1
        L5f9:
            int r13 = r13 + 1
            goto L5bf
        L5ff:
            goto L611
        L602:
            r0 = r8
            int r0 = r0.u
            if (r0 <= 0) goto L611
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.b
            r1 = 1
            r0.L = r1
        L611:
            r0 = r8
            org.objectweb.asm.Handler r0 = r0.B
            r21 = r0
        L617:
            r0 = r21
            if (r0 == 0) goto L64a
            r0 = r15
            r1 = r16
            r2 = r21
            org.objectweb.asm.Label r2 = r2.a
            a(r0, r1, r2)
            r0 = r15
            r1 = r16
            r2 = r21
            org.objectweb.asm.Label r2 = r2.b
            a(r0, r1, r2)
            r0 = r15
            r1 = r16
            r2 = r21
            org.objectweb.asm.Label r2 = r2.c
            a(r0, r1, r2)
            r0 = r21
            org.objectweb.asm.Handler r0 = r0.f
            r21 = r0
            goto L617
        L64a:
            r0 = 0
            r13 = r0
        L64d:
            r0 = r13
            r1 = 2
            if (r0 >= r1) goto L6c5
            r0 = r13
            if (r0 != 0) goto L65f
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.E
            goto L663
        L65f:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.G
        L663:
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L6bf
            r0 = r22
            byte[] r0 = r0.a
            r9 = r0
            r0 = 0
            r10 = r0
        L672:
            r0 = r10
            r1 = r22
            int r1 = r1.b
            if (r0 >= r1) goto L6bf
            r0 = r9
            r1 = r10
            int r0 = c(r0, r1)
            r12 = r0
            r0 = r15
            r1 = r16
            r2 = 0
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r18 = r0
            r0 = r9
            r1 = r10
            r2 = r18
            a(r0, r1, r2)
            r0 = r12
            r1 = r9
            r2 = r10
            r3 = 2
            int r2 = r2 + r3
            int r1 = c(r1, r2)
            int r0 = r0 + r1
            r12 = r0
            r0 = r15
            r1 = r16
            r2 = 0
            r3 = r12
            int r0 = a(r0, r1, r2, r3)
            r1 = r18
            int r0 = r0 - r1
            r18 = r0
            r0 = r9
            r1 = r10
            r2 = 2
            int r1 = r1 + r2
            r2 = r18
            a(r0, r1, r2)
            int r10 = r10 + 10
            goto L672
        L6bf:
            int r13 = r13 + 1
            goto L64d
        L6c5:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.I
            if (r0 == 0) goto L6f9
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.I
            byte[] r0 = r0.a
            r9 = r0
            r0 = 0
            r10 = r0
        L6d6:
            r0 = r10
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.I
            int r1 = r1.b
            if (r0 >= r1) goto L6f9
            r0 = r9
            r1 = r10
            r2 = r15
            r3 = r16
            r4 = 0
            r5 = r9
            r6 = r10
            int r5 = c(r5, r6)
            int r2 = a(r2, r3, r4, r5)
            a(r0, r1, r2)
            int r10 = r10 + 4
            goto L6d6
        L6f9:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.J
            r22 = r0
        L6ff:
            r0 = r22
            if (r0 == 0) goto L738
            r0 = r22
            org.objectweb.asm.Label[] r0 = r0.getLabels()
            r23 = r0
            r0 = r23
            if (r0 == 0) goto L72e
            r0 = r23
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r13 = r0
        L717:
            r0 = r13
            if (r0 < 0) goto L72e
            r0 = r15
            r1 = r16
            r2 = r23
            r3 = r13
            r2 = r2[r3]
            a(r0, r1, r2)
            int r13 = r13 + (-1)
            goto L717
        L72e:
            r0 = r22
            org.objectweb.asm.Attribute r0 = r0.a
            r22 = r0
            goto L6ff
        L738:
            r0 = r8
            r1 = r20
            r0.r = r1
            return
    }

    static int c(byte[] r5, int r6) {
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r5
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    static short b(byte[] r5, int r6) {
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r5
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    static int a(byte[] r5, int r6) {
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 << r1
            r1 = r5
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r5
            r2 = r6
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r5
            r2 = r6
            r3 = 3
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    static void a(byte[] r5, int r6, int r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    static int a(int[] r4, int[] r5, int r6, int r7) {
            r0 = r7
            r1 = r6
            int r0 = r0 - r1
            r8 = r0
            r0 = 0
            r9 = r0
        L8:
            r0 = r9
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L4a
            r0 = r6
            r1 = r4
            r2 = r9
            r1 = r1[r2]
            if (r0 >= r1) goto L2b
            r0 = r4
            r1 = r9
            r0 = r0[r1]
            r1 = r7
            if (r0 > r1) goto L2b
            r0 = r8
            r1 = r5
            r2 = r9
            r1 = r1[r2]
            int r0 = r0 + r1
            r8 = r0
            goto L44
        L2b:
            r0 = r7
            r1 = r4
            r2 = r9
            r1 = r1[r2]
            if (r0 >= r1) goto L44
            r0 = r4
            r1 = r9
            r0 = r0[r1]
            r1 = r6
            if (r0 > r1) goto L44
            r0 = r8
            r1 = r5
            r2 = r9
            r1 = r1[r2]
            int r0 = r0 - r1
            r8 = r0
        L44:
            int r9 = r9 + 1
            goto L8
        L4a:
            r0 = r8
            return r0
    }

    static void a(int[] r6, int[] r7, org.objectweb.asm.Label r8) {
            r0 = r8
            int r0 = r0.a
            r1 = 4
            r0 = r0 & r1
            if (r0 != 0) goto L21
            r0 = r8
            r1 = r6
            r2 = r7
            r3 = 0
            r4 = r8
            int r4 = r4.c
            int r1 = a(r1, r2, r3, r4)
            r0.c = r1
            r0 = r8
            r1 = r0
            int r1 = r1.a
            r2 = 4
            r1 = r1 | r2
            r0.a = r1
        L21:
            return
    }
}
