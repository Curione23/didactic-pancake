package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ClassClassPath.class */
public class ClassClassPath implements javassist.ClassPath {
    private java.lang.Class<?> thisClass;

    public ClassClassPath(java.lang.Class<?> r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.thisClass = r1
            return
    }

    ClassClassPath() {
            r3 = this;
            r0 = r3
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0.<init>(r1)
            return
    }

    @Override // javassist.ClassPath
    public java.io.InputStream openClassfile(java.lang.String r6) throws javassist.NotFoundException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r5
            java.lang.Class<?> r0 = r0.thisClass
            r1 = r7
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            return r0
    }

    @Override // javassist.ClassPath
    public java.net.URL find(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = 47
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r5
            java.lang.Class<?> r0 = r0.thisClass
            r1 = r7
            java.net.URL r0 = r0.getResource(r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.Class<?> r1 = r1.thisClass
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
