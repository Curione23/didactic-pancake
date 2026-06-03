package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/AnnotationVisitor.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/AnnotationVisitor.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/AnnotationVisitor.class */
public abstract class AnnotationVisitor {
    protected final int api;
    protected org.objectweb.asm.AnnotationVisitor av;

    public AnnotationVisitor(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public AnnotationVisitor(int r4, org.objectweb.asm.AnnotationVisitor r5) {
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
            r0.av = r1
            return
    }

    public void visit(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            r1 = r5
            r2 = r6
            r0.visit(r1, r2)
        L10:
            return
    }

    public void visitEnum(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            if (r0 == 0) goto L11
            r0 = r5
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitEnum(r1, r2, r3)
        L11:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            if (r0 == 0) goto L11
            r0 = r4
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            r1 = r5
            r2 = r6
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotation(r1, r2)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            if (r0 == 0) goto L10
            r0 = r3
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            r1 = r4
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitArray(r1)
            return r0
        L10:
            r0 = 0
            return r0
    }

    public void visitEnd() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            if (r0 == 0) goto Le
            r0 = r2
            org.objectweb.asm.AnnotationVisitor r0 = r0.av
            r0.visitEnd()
        Le:
            return
    }
}
