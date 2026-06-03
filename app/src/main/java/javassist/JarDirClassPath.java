package javassist;

/* JADX INFO: compiled from: ClassPoolTail.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/JarDirClassPath.class */
final class JarDirClassPath implements javassist.ClassPath {
    javassist.JarClassPath[] jars;


    JarDirClassPath(java.lang.String r8) throws javassist.NotFoundException {
            r7 = this;
            r0 = r7
            r0.<init>()
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            javassist.JarDirClassPath$1 r1 = new javassist.JarDirClassPath$1
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            java.io.File[] r0 = r0.listFiles(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L46
            r0 = r7
            r1 = r9
            int r1 = r1.length
            javassist.JarClassPath[] r1 = new javassist.JarClassPath[r1]
            r0.jars = r1
            r0 = 0
            r10 = r0
        L27:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L46
            r0 = r7
            javassist.JarClassPath[] r0 = r0.jars
            r1 = r10
            javassist.JarClassPath r2 = new javassist.JarClassPath
            r3 = r2
            r4 = r9
            r5 = r10
            r4 = r4[r5]
            java.lang.String r4 = r4.getPath()
            r3.<init>(r4)
            r0[r1] = r2
            int r10 = r10 + 1
            goto L27
        L46:
            return
    }

    @Override // javassist.ClassPath
    public java.io.InputStream openClassfile(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.JarClassPath[] r0 = r0.jars
            if (r0 == 0) goto L29
            r0 = 0
            r5 = r0
        L9:
            r0 = r5
            r1 = r3
            javassist.JarClassPath[] r1 = r1.jars
            int r1 = r1.length
            if (r0 >= r1) goto L29
            r0 = r3
            javassist.JarClassPath[] r0 = r0.jars
            r1 = r5
            r0 = r0[r1]
            r1 = r4
            java.io.InputStream r0 = r0.openClassfile(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L23
            r0 = r6
            return r0
        L23:
            int r5 = r5 + 1
            goto L9
        L29:
            r0 = 0
            return r0
    }

    @Override // javassist.ClassPath
    public java.net.URL find(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.JarClassPath[] r0 = r0.jars
            if (r0 == 0) goto L29
            r0 = 0
            r5 = r0
        L9:
            r0 = r5
            r1 = r3
            javassist.JarClassPath[] r1 = r1.jars
            int r1 = r1.length
            if (r0 >= r1) goto L29
            r0 = r3
            javassist.JarClassPath[] r0 = r0.jars
            r1 = r5
            r0 = r0[r1]
            r1 = r4
            java.net.URL r0 = r0.find(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L23
            r0 = r6
            return r0
        L23:
            int r5 = r5 + 1
            goto L9
        L29:
            r0 = 0
            return r0
    }
}
