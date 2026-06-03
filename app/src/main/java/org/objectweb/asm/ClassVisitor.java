package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/ClassVisitor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/ClassVisitor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/ClassVisitor.class */
public abstract class ClassVisitor {
    protected final int api;
    protected org.objectweb.asm.ClassVisitor cv;

    public ClassVisitor(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public ClassVisitor(int r4, org.objectweb.asm.ClassVisitor r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == r1) goto L18
            r0 = r4
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 == r1) goto L18
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            r0 = r3
            r1 = r4
            r0.api = r1
            r0 = r3
            r1 = r5
            r0.cv = r1
            return
    }

    public void visit(int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L17
            r0 = r8
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.visit(r1, r2, r3, r4, r5, r6)
        L17:
            return
    }

    public void visitSource(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r5
            r2 = r6
            r0.visitSource(r1, r2)
        L10:
            return
    }

    public void visitOuterClass(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L11
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitOuterClass(r1, r2, r3)
        L11:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L11
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r5
            r2 = r6
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotation(r1, r2)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L11
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r1.<init>()
            throw r0
        L11:
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L25
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitTypeAnnotation(r1, r2, r3, r4)
            return r0
        L25:
            r0 = 0
            return r0
    }

    public void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto Lf
            r0 = r3
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r4
            r0.visitAttribute(r1)
        Lf:
            return
    }

    public void visitInnerClass(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L13
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitInnerClass(r1, r2, r3, r4)
        L13:
            return
    }

    public org.objectweb.asm.FieldVisitor visitField(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L16
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.FieldVisitor r0 = r0.visitField(r1, r2, r3, r4, r5)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.MethodVisitor visitMethod(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto L16
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public void visitEnd() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            if (r0 == 0) goto Le
            r0 = r2
            org.objectweb.asm.ClassVisitor r0 = r0.cv
            r0.visitEnd()
        Le:
            return
    }
}
