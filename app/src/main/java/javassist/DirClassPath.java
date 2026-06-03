package javassist;

/* JADX INFO: compiled from: ClassPoolTail.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/DirClassPath.class */
final class DirClassPath implements javassist.ClassPath {
    java.lang.String directory;

    DirClassPath(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.directory = r1
            return
    }

    @Override // javassist.ClassPath
    public java.io.InputStream openClassfile(java.lang.String r6) {
            r5 = this;
            char r0 = java.io.File.separatorChar     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            r1 = r0
            r1.<init>()     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            r1 = r5
            java.lang.String r1 = r1.directory     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            r1 = r6
            r2 = 46
            r3 = r7
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            r8 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L32 java.lang.SecurityException -> L36
            return r0
        L32:
            r7 = move-exception
            goto L37
        L36:
            r7 = move-exception
        L37:
            r0 = 0
            return r0
    }

    @Override // javassist.ClassPath
    public java.net.URL find(java.lang.String r6) {
            r5 = this;
            char r0 = java.io.File.separatorChar
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.String r1 = r1.directory
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = 46
            r3 = r7
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            boolean r0 = r0.exists()
            if (r0 == 0) goto L4e
            r0 = r9
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.net.MalformedURLException -> L47 java.io.IOException -> L4c
            java.net.URI r0 = r0.toURI()     // Catch: java.net.MalformedURLException -> L47 java.io.IOException -> L4c
            java.net.URL r0 = r0.toURL()     // Catch: java.net.MalformedURLException -> L47 java.io.IOException -> L4c
            return r0
        L47:
            r10 = move-exception
            goto L4e
        L4c:
            r10 = move-exception
        L4e:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.directory
            return r0
    }
}
