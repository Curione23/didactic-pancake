package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AnnotationDefaultAttribute.class */
public class AnnotationDefaultAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "AnnotationDefault";

    public AnnotationDefaultAttribute(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "AnnotationDefault"
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    public AnnotationDefaultAttribute(javassist.bytecode.ConstPool r8) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = 2
            byte[] r2 = new byte[r2]
            r3 = r2
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 0
            r3[r4] = r5
            r0.<init>(r1, r2)
            return
    }

    AnnotationDefaultAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
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
            r1 = 0
            int r0 = r0.memberValue(r1)     // Catch: java.lang.Exception -> L25
            javassist.bytecode.AnnotationDefaultAttribute r0 = new javassist.bytecode.AnnotationDefaultAttribute     // Catch: java.lang.Exception -> L25
            r1 = r0
            r2 = r8
            r3 = r10
            byte[] r3 = r3.close()     // Catch: java.lang.Exception -> L25
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L25
            return r0
        L25:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r11
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            javassist.bytecode.annotation.MemberValue r0 = r0.getDefaultValue()     // Catch: java.lang.Exception -> L13
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            r0.renameClass(r1, r2)     // Catch: java.lang.Exception -> L13
            r0 = r4
            r1 = r7
            r0.setDefaultValue(r1)     // Catch: java.lang.Exception -> L13
            goto L14
        L13:
            r7 = move-exception
        L14:
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.annotation.MemberValue r0 = r0.getDefaultValue()     // Catch: java.lang.Exception -> L12
            r5 = r0
            r0 = r5
            r1 = r4
            r0.renameClass(r1)     // Catch: java.lang.Exception -> L12
            r0 = r3
            r1 = r5
            r0.setDefaultValue(r1)     // Catch: java.lang.Exception -> L12
            goto L13
        L12:
            r5 = move-exception
        L13:
            return
    }

    public javassist.bytecode.annotation.MemberValue getDefaultValue() {
            r5 = this;
            javassist.bytecode.AnnotationsAttribute$Parser r0 = new javassist.bytecode.AnnotationsAttribute$Parser     // Catch: java.lang.Exception -> L13
            r1 = r0
            r2 = r5
            byte[] r2 = r2.info     // Catch: java.lang.Exception -> L13
            r3 = r5
            javassist.bytecode.ConstPool r3 = r3.constPool     // Catch: java.lang.Exception -> L13
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L13
            javassist.bytecode.annotation.MemberValue r0 = r0.parseMemberValue()     // Catch: java.lang.Exception -> L13
            return r0
        L13:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public void setDefaultValue(javassist.bytecode.annotation.MemberValue r6) {
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
            r1 = r8
            r0.write(r1)     // Catch: java.io.IOException -> L21
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L21
            goto L2d
        L21:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r5
            r1 = r7
            byte[] r1 = r1.toByteArray()
            r0.set(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            javassist.bytecode.annotation.MemberValue r0 = r0.getDefaultValue()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
