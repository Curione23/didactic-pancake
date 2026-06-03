package javassist;

/* JADX INFO: compiled from: ClassPoolTail.java */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/JarClassPath.class */
final class JarClassPath implements javassist.ClassPath {
    java.util.Set<java.lang.String> jarfileEntries;
    java.lang.String jarfileURL;

    JarClassPath(java.lang.String r6) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = 0
            r7 = r0
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r1 = r0
            r2 = r6
            r1.<init>(r2)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r7 = r0
            r0 = r5
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r0.jarfileEntries = r1     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r0 = r7
            java.util.Enumeration r0 = r0.entries()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r8 = r0
        L25:
            r0 = r8
            boolean r0 = r0.hasNext()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            if (r0 == 0) goto L58
            r0 = r8
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.util.jar.JarEntry r0 = (java.util.jar.JarEntry) r0     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getName()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.lang.String r1 = ".class"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            if (r0 == 0) goto L55
            r0 = r5
            java.util.Set<java.lang.String> r0 = r0.jarfileEntries     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r1 = r9
            java.lang.String r1 = r1.getName()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            boolean r0 = r0.add(r1)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
        L55:
            goto L25
        L58:
            r0 = r5
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r2 = r1
            r3 = r6
            r2.<init>(r3)     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.io.File r1 = r1.getCanonicalFile()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.net.URI r1 = r1.toURI()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.net.URL r1 = r1.toURL()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r0.jarfileURL = r1     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L8f
            r0 = 0
            r1 = r7
            if (r0 == r1) goto L7d
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L7c
            goto L7d
        L7c:
            r8 = move-exception
        L7d:
            return
        L7e:
            r8 = move-exception
            r0 = 0
            r1 = r7
            if (r0 == r1) goto La2
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L8b
            goto La2
        L8b:
            r8 = move-exception
            goto La2
        L8f:
            r10 = move-exception
            r0 = 0
            r1 = r7
            if (r0 == r1) goto L9f
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L9d
            goto L9f
        L9d:
            r11 = move-exception
        L9f:
            r0 = r10
            throw r0
        La2:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.ClassPath
    public java.io.InputStream openClassfile(java.lang.String r6) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.net.URL r0 = r0.find(r1)
            r7 = r0
            r0 = 0
            r1 = r7
            if (r0 == r1) goto L44
            boolean r0 = javassist.ClassPool.cacheOpenedJarFile     // Catch: java.io.IOException -> L28
            if (r0 == 0) goto L19
            r0 = r7
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L28
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L28
            return r0
        L19:
            r0 = r7
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L28
            r8 = r0
            r0 = r8
            r1 = 0
            r0.setUseCaches(r1)     // Catch: java.io.IOException -> L28
            r0 = r8
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L28
            return r0
        L28:
            r8 = move-exception
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "broken jar file?: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L44:
            r0 = 0
            return r0
    }

    @Override // javassist.ClassPath
    public java.net.URL find(java.lang.String r9) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r9
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r8
            java.util.Set<java.lang.String> r0 = r0.jarfileEntries
            r1 = r10
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L45
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L44
            r1 = r0
            java.lang.String r2 = "jar:%s!/%s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.net.MalformedURLException -> L44
            r4 = r3
            r5 = 0
            r6 = r8
            java.lang.String r6 = r6.jarfileURL     // Catch: java.net.MalformedURLException -> L44
            r4[r5] = r6     // Catch: java.net.MalformedURLException -> L44
            r4 = r3
            r5 = 1
            r6 = r10
            r4[r5] = r6     // Catch: java.net.MalformedURLException -> L44
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.net.MalformedURLException -> L44
            r1.<init>(r2)     // Catch: java.net.MalformedURLException -> L44
            return r0
        L44:
            r11 = move-exception
        L45:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.jarfileURL
            if (r0 != 0) goto Lc
            java.lang.String r0 = "<null>"
            goto L10
        Lc:
            r0 = r2
            java.lang.String r0 = r0.jarfileURL
        L10:
            return r0
    }
}
