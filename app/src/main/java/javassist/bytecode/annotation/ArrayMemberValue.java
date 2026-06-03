package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/ArrayMemberValue.class */
public class ArrayMemberValue extends javassist.bytecode.annotation.MemberValue {
    javassist.bytecode.annotation.MemberValue type;
    javassist.bytecode.annotation.MemberValue[] values;

    public ArrayMemberValue(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r1 = 91
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 0
            r0.type = r1
            r0 = r4
            r1 = 0
            r0.values = r1
            return
    }

    public ArrayMemberValue(javassist.bytecode.annotation.MemberValue r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = 91
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.type = r1
            r0 = r4
            r1 = 0
            r0.values = r1
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Object getValue(java.lang.ClassLoader r8, javassist.ClassPool r9, java.lang.reflect.Method r10) throws java.lang.ClassNotFoundException {
            r7 = this;
            r0 = r7
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            if (r0 != 0) goto L25
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no array elements found: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L25:
            r0 = r7
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            int r0 = r0.length
            r11 = r0
            r0 = r7
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            if (r0 != 0) goto L64
            r0 = r10
            java.lang.Class r0 = r0.getReturnType()
            java.lang.Class r0 = r0.getComponentType()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L46
            r0 = r11
            if (r0 <= 0) goto L6e
        L46:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "broken array type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r7
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            r1 = r8
            java.lang.Class r0 = r0.getType(r1)
            r12 = r0
        L6e:
            r0 = r12
            r1 = r11
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r13 = r0
            r0 = 0
            r14 = r0
        L7a:
            r0 = r14
            r1 = r11
            if (r0 >= r1) goto L9b
            r0 = r13
            r1 = r14
            r2 = r7
            javassist.bytecode.annotation.MemberValue[] r2 = r2.values
            r3 = r14
            r2 = r2[r3]
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.Object r2 = r2.getValue(r3, r4, r5)
            java.lang.reflect.Array.set(r0, r1, r2)
            int r14 = r14 + 1
            goto L7a
        L9b:
            r0 = r13
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    java.lang.Class<?> getType(java.lang.ClassLoader r5) throws java.lang.ClassNotFoundException {
            r4 = this;
            r0 = r4
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            if (r0 != 0) goto L11
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.String r2 = "no array type specified"
            r1.<init>(r2)
            throw r0
        L11:
            r0 = r4
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            r1 = r5
            java.lang.Class r0 = r0.getType(r1)
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r6 = r0
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            if (r0 == 0) goto L10
            r0 = r4
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            r1 = r5
            r2 = r6
            r0.renameClass(r1, r2)
        L10:
            r0 = r4
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            if (r0 == 0) goto L3d
            r0 = r4
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L23:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L3d
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r5
            r2 = r6
            r0.renameClass(r1, r2)
            int r9 = r9 + 1
            goto L23
        L3d:
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            if (r0 == 0) goto Lf
            r0 = r3
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            r1 = r4
            r0.renameClass(r1)
        Lf:
            r0 = r3
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            if (r0 == 0) goto L39
            r0 = r3
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L21:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L39
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            r1 = r4
            r0.renameClass(r1)
            int r7 = r7 + 1
            goto L21
        L39:
            return
    }

    public javassist.bytecode.annotation.MemberValue getType() {
            r2 = this;
            r0 = r2
            javassist.bytecode.annotation.MemberValue r0 = r0.type
            return r0
    }

    public javassist.bytecode.annotation.MemberValue[] getValue() {
            r2 = this;
            r0 = r2
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            return r0
    }

    public void setValue(javassist.bytecode.annotation.MemberValue[] r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.values = r1
            r0 = r5
            if (r0 == 0) goto L15
            r0 = r5
            int r0 = r0.length
            if (r0 <= 0) goto L15
            r0 = r4
            r1 = r5
            r2 = 0
            r1 = r1[r2]
            r0.type = r1
        L15:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            if (r0 == 0) goto L47
            r0 = 0
            r6 = r0
        L18:
            r0 = r6
            r1 = r4
            javassist.bytecode.annotation.MemberValue[] r1 = r1.values
            int r1 = r1.length
            if (r0 >= r1) goto L47
            r0 = r5
            r1 = r4
            javassist.bytecode.annotation.MemberValue[] r1 = r1.values
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r1 = r4
            javassist.bytecode.annotation.MemberValue[] r1 = r1.values
            int r1 = r1.length
            if (r0 >= r1) goto L41
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L41:
            int r6 = r6 + 1
            goto L18
        L47:
            r0 = r5
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void write(javassist.bytecode.annotation.AnnotationsWriter r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            if (r0 != 0) goto Lb
            r0 = 0
            goto L10
        Lb:
            r0 = r3
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            int r0 = r0.length
        L10:
            r5 = r0
            r0 = r4
            r1 = r5
            r0.arrayValue(r1)
            r0 = 0
            r6 = r0
        L18:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L2d
            r0 = r3
            javassist.bytecode.annotation.MemberValue[] r0 = r0.values
            r1 = r6
            r0 = r0[r1]
            r1 = r4
            r0.write(r1)
            int r6 = r6 + 1
            goto L18
        L2d:
            return
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(javassist.bytecode.annotation.MemberValueVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.visitArrayMemberValue(r1)
            return
    }
}
