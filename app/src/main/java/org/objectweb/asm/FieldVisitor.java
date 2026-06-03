package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/FieldVisitor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/FieldVisitor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/FieldVisitor.class */
public abstract class FieldVisitor {
    protected final int api;
    protected org.objectweb.asm.FieldVisitor fv;

    public FieldVisitor(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public FieldVisitor(int r4, org.objectweb.asm.FieldVisitor r5) {
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
            r0.fv = r1
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            if (r0 == 0) goto L11
            r0 = r4
            org.objectweb.asm.FieldVisitor r0 = r0.fv
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
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            if (r0 == 0) goto L25
            r0 = r6
            org.objectweb.asm.FieldVisitor r0 = r0.fv
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
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            if (r0 == 0) goto Lf
            r0 = r3
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            r1 = r4
            r0.visitAttribute(r1)
        Lf:
            return
    }

    public void visitEnd() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            if (r0 == 0) goto Le
            r0 = r2
            org.objectweb.asm.FieldVisitor r0 = r0.fv
            r0.visitEnd()
        Le:
            return
    }
}
