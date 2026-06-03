package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/MemberValue.class */
public abstract class MemberValue {
    javassist.bytecode.ConstPool cp;
    char tag;

    MemberValue(char r4, javassist.bytecode.ConstPool r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r5
            r0.cp = r1
            r0 = r3
            r1 = r4
            r0.tag = r1
            return
    }

    abstract java.lang.Object getValue(java.lang.ClassLoader r1, javassist.ClassPool r2, java.lang.reflect.Method r3) throws java.lang.ClassNotFoundException;

    abstract java.lang.Class<?> getType(java.lang.ClassLoader r1) throws java.lang.ClassNotFoundException;

    static java.lang.Class<?> loadClass(java.lang.ClassLoader r5, java.lang.String r6) throws java.lang.ClassNotFoundException, javassist.bytecode.annotation.NoSuchClassError {
            r0 = r6
            java.lang.String r0 = convertFromArray(r0)     // Catch: java.lang.LinkageError -> La
            r1 = 1
            r2 = r5
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.LinkageError -> La
            return r0
        La:
            r7 = move-exception
            javassist.bytecode.annotation.NoSuchClassError r0 = new javassist.bytecode.annotation.NoSuchClassError
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
    }

    private static java.lang.String convertFromArray(java.lang.String r5) {
            r0 = r5
            java.lang.String r1 = "[]"
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L45
            r0 = r5
            r1 = 0
            r2 = r6
            java.lang.String r0 = r0.substring(r1, r2)
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            java.lang.String r2 = javassist.bytecode.Descriptor.of(r2)
            r1.<init>(r2)
            r8 = r0
        L1f:
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L39
            r0 = r8
            r1 = 0
            r2 = 91
            java.lang.StringBuilder r0 = r0.insert(r1, r2)
            r0 = r5
            java.lang.String r1 = "[]"
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0.indexOf(r1, r2)
            r6 = r0
            goto L1f
        L39:
            r0 = r8
            java.lang.String r0 = r0.toString()
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
        L45:
            r0 = r5
            return r0
    }

    public void renameClass(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            return
    }

    public void renameClass(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            return
    }

    public abstract void accept(javassist.bytecode.annotation.MemberValueVisitor r1);

    public abstract void write(javassist.bytecode.annotation.AnnotationsWriter r1) throws java.io.IOException;
}
