package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/LoaderClassPath.class */
public class LoaderClassPath implements javassist.ClassPath {
    private java.lang.ref.Reference<java.lang.ClassLoader> clref;

    public LoaderClassPath(java.lang.ClassLoader r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.clref = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.ref.Reference<java.lang.ClassLoader> r0 = r0.clref
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            java.lang.String r0 = "<null>"
            goto L1c
        Lf:
            r0 = r2
            java.lang.ref.Reference<java.lang.ClassLoader> r0 = r0.clref
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.String r0 = r0.toString()
        L1c:
            return r0
    }

    @Override // javassist.ClassPath
    public java.io.InputStream openClassfile(java.lang.String r6) throws javassist.NotFoundException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
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
            java.lang.ref.Reference<java.lang.ClassLoader> r0 = r0.clref
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = r8
            r1 = r7
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            r9 = r0
            r0 = r9
            return r0
    }

    @Override // javassist.ClassPath
    public java.net.URL find(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
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
            java.lang.ref.Reference<java.lang.ClassLoader> r0 = r0.clref
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = r8
            r1 = r7
            java.net.URL r0 = r0.getResource(r1)
            r9 = r0
            r0 = r9
            return r0
    }
}
