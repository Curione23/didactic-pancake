package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ParameterAnnotationsAttribute.class */
public class ParameterAnnotationsAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String visibleTag = "RuntimeVisibleParameterAnnotations";
    public static final java.lang.String invisibleTag = "RuntimeInvisibleParameterAnnotations";

    public ParameterAnnotationsAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7, byte[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public ParameterAnnotationsAttribute(javassist.bytecode.ConstPool r9, java.lang.String r10) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = 1
            byte[] r3 = new byte[r3]
            r4 = r3
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r0.<init>(r1, r2, r3)
            return
    }

    ParameterAnnotationsAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public int numParameters() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
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
            r0.parameters()     // Catch: java.lang.Exception -> L27
            javassist.bytecode.ParameterAnnotationsAttribute r0 = new javassist.bytecode.ParameterAnnotationsAttribute     // Catch: java.lang.Exception -> L27
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
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public javassist.bytecode.annotation.Annotation[][] getAnnotations() {
            r5 = this;
            javassist.bytecode.AnnotationsAttribute$Parser r0 = new javassist.bytecode.AnnotationsAttribute$Parser     // Catch: java.lang.Exception -> L13
            r1 = r0
            r2 = r5
            byte[] r2 = r2.info     // Catch: java.lang.Exception -> L13
            r3 = r5
            javassist.bytecode.ConstPool r3 = r3.constPool     // Catch: java.lang.Exception -> L13
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L13
            javassist.bytecode.annotation.Annotation[][] r0 = r0.parseParameters()     // Catch: java.lang.Exception -> L13
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

    public void setAnnotations(javassist.bytecode.annotation.Annotation[][] r6) {
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
            r0 = r8
            r1 = r6
            int r1 = r1.length     // Catch: java.io.IOException -> L62
            r0.numParameters(r1)     // Catch: java.io.IOException -> L62
            r0 = r6
            r9 = r0
            r0 = r9
            int r0 = r0.length     // Catch: java.io.IOException -> L62
            r10 = r0
            r0 = 0
            r11 = r0
        L26:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L5b
            r0 = r9
            r1 = r11
            r0 = r0[r1]     // Catch: java.io.IOException -> L62
            r12 = r0
            r0 = r8
            r1 = r12
            int r1 = r1.length     // Catch: java.io.IOException -> L62
            r0.numAnnotations(r1)     // Catch: java.io.IOException -> L62
            r0 = 0
            r13 = r0
        L3e:
            r0 = r13
            r1 = r12
            int r1 = r1.length     // Catch: java.io.IOException -> L62
            if (r0 >= r1) goto L55
            r0 = r12
            r1 = r13
            r0 = r0[r1]     // Catch: java.io.IOException -> L62
            r1 = r8
            r0.write(r1)     // Catch: java.io.IOException -> L62
            int r13 = r13 + 1
            goto L3e
        L55:
            int r11 = r11 + 1
            goto L26
        L5b:
            r0 = r8
            r0.close()     // Catch: java.io.IOException -> L62
            goto L6e
        L62:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L6e:
            r0 = r5
            r1 = r7
            byte[] r1 = r1.toByteArray()
            r0.set(r1)
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
            r0.parameters()     // Catch: java.lang.Exception -> L18
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
            javassist.bytecode.annotation.Annotation[][] r0 = r0.getAnnotations()
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L16:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L5f
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r13 = r0
        L2f:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L52
            r0 = r11
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r6
            r1 = r14
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            int r13 = r13 + 1
            goto L2f
        L52:
            r0 = r6
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r9 = r9 + 1
            goto L16
        L5f:
            r0 = r6
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = " (?=,)|, $"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
            return r0
    }
}
