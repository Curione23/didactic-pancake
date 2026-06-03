package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ClassPoolTail.class */
final class ClassPoolTail {
    protected javassist.ClassPathList pathList;

    public ClassPoolTail() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.pathList = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "[class path: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            javassist.ClassPathList r0 = r0.pathList
            r5 = r0
        L14:
            r0 = r5
            if (r0 == 0) goto L36
            r0 = r4
            r1 = r5
            javassist.ClassPath r1 = r1.path
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            char r1 = java.io.File.pathSeparatorChar
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            javassist.ClassPathList r0 = r0.next
            r5 = r0
            goto L14
        L36:
            r0 = r4
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    public synchronized javassist.ClassPath insertClassPath(javassist.ClassPath r7) {
            r6 = this;
            r0 = r6
            javassist.ClassPathList r1 = new javassist.ClassPathList
            r2 = r1
            r3 = r7
            r4 = r6
            javassist.ClassPathList r4 = r4.pathList
            r2.<init>(r3, r4)
            r0.pathList = r1
            r0 = r7
            return r0
    }

    public synchronized javassist.ClassPath appendClassPath(javassist.ClassPath r6) {
            r5 = this;
            javassist.ClassPathList r0 = new javassist.ClassPathList
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r5
            javassist.ClassPathList r0 = r0.pathList
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L1b
            r0 = r5
            r1 = r7
            r0.pathList = r1
            goto L2f
        L1b:
            r0 = r8
            javassist.ClassPathList r0 = r0.next
            if (r0 == 0) goto L2a
            r0 = r8
            javassist.ClassPathList r0 = r0.next
            r8 = r0
            goto L1b
        L2a:
            r0 = r8
            r1 = r7
            r0.next = r1
        L2f:
            r0 = r6
            return r0
    }

    public synchronized void removeClassPath(javassist.ClassPath r4) {
            r3 = this;
            r0 = r3
            javassist.ClassPathList r0 = r0.pathList
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L44
            r0 = r5
            javassist.ClassPath r0 = r0.path
            r1 = r4
            if (r0 != r1) goto L1c
            r0 = r3
            r1 = r5
            javassist.ClassPathList r1 = r1.next
            r0.pathList = r1
            goto L44
        L1c:
            r0 = r5
            javassist.ClassPathList r0 = r0.next
            if (r0 == 0) goto L44
            r0 = r5
            javassist.ClassPathList r0 = r0.next
            javassist.ClassPath r0 = r0.path
            r1 = r4
            if (r0 != r1) goto L3c
            r0 = r5
            r1 = r5
            javassist.ClassPathList r1 = r1.next
            javassist.ClassPathList r1 = r1.next
            r0.next = r1
            goto L1c
        L3c:
            r0 = r5
            javassist.ClassPathList r0 = r0.next
            r5 = r0
            goto L1c
        L44:
            return
    }

    public javassist.ClassPath appendSystemPath() {
            r5 = this;
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 53
            if (r0 >= r1) goto L14
            r0 = r5
            javassist.ClassClassPath r1 = new javassist.ClassClassPath
            r2 = r1
            r2.<init>()
            javassist.ClassPath r0 = r0.appendClassPath(r1)
            return r0
        L14:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r6 = r0
            r0 = r5
            javassist.LoaderClassPath r1 = new javassist.LoaderClassPath
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            javassist.ClassPath r0 = r0.appendClassPath(r1)
            return r0
    }

    public javassist.ClassPath insertClassPath(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.ClassPath r1 = makePathObject(r1)
            javassist.ClassPath r0 = r0.insertClassPath(r1)
            return r0
    }

    public javassist.ClassPath appendClassPath(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.ClassPath r1 = makePathObject(r1)
            javassist.ClassPath r0 = r0.appendClassPath(r1)
            return r0
    }

    private static javassist.ClassPath makePathObject(java.lang.String r5) throws javassist.NotFoundException {
            r0 = r5
            java.lang.String r0 = r0.toLowerCase()
            r6 = r0
            r0 = r6
            java.lang.String r1 = ".jar"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L17
            r0 = r6
            java.lang.String r1 = ".zip"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L20
        L17:
            javassist.JarClassPath r0 = new javassist.JarClassPath
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L20:
            r0 = r5
            int r0 = r0.length()
            r7 = r0
            r0 = r7
            r1 = 2
            if (r0 <= r1) goto L61
            r0 = r5
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 42
            if (r0 != r1) goto L61
            r0 = r5
            r1 = r7
            r2 = 2
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 47
            if (r0 == r1) goto L4f
            r0 = r5
            r1 = r7
            r2 = 2
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            char r1 = java.io.File.separatorChar
            if (r0 != r1) goto L61
        L4f:
            r0 = r5
            r1 = 0
            r2 = r7
            r3 = 2
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r8 = r0
            javassist.JarDirClassPath r0 = new javassist.JarDirClassPath
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            return r0
        L61:
            javassist.DirClassPath r0 = new javassist.DirClassPath
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
    }

    void writeClassfile(java.lang.String r5, java.io.OutputStream r6) throws javassist.NotFoundException, java.io.IOException, javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            java.io.InputStream r0 = r0.openClassfile(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r7
            r1 = r6
            copyStream(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r7
            r0.close()
            goto L28
        L1f:
            r8 = move-exception
            r0 = r7
            r0.close()
            r0 = r8
            throw r0
        L28:
            return
    }

    java.io.InputStream openClassfile(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.ClassPathList r0 = r0.pathList
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
        La:
            r0 = r5
            if (r0 == 0) goto L35
            r0 = r5
            javassist.ClassPath r0 = r0.path     // Catch: javassist.NotFoundException -> L1c
            r1 = r4
            java.io.InputStream r0 = r0.openClassfile(r1)     // Catch: javassist.NotFoundException -> L1c
            r6 = r0
            goto L27
        L1c:
            r8 = move-exception
            r0 = r7
            if (r0 != 0) goto L27
            r0 = r8
            r7 = r0
        L27:
            r0 = r6
            if (r0 != 0) goto L33
            r0 = r5
            javassist.ClassPathList r0 = r0.next
            r5 = r0
            goto La
        L33:
            r0 = r6
            return r0
        L35:
            r0 = r7
            if (r0 == 0) goto L3d
            r0 = r7
            throw r0
        L3d:
            r0 = 0
            return r0
    }

    public java.net.URL find(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.ClassPathList r0 = r0.pathList
            r5 = r0
            r0 = 0
            r6 = r0
        L7:
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            javassist.ClassPath r0 = r0.path
            r1 = r4
            java.net.URL r0 = r0.find(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L22
            r0 = r5
            javassist.ClassPathList r0 = r0.next
            r5 = r0
            goto L7
        L22:
            r0 = r6
            return r0
        L24:
            r0 = 0
            return r0
    }

    public static byte[] readStream(java.io.InputStream r7) throws java.io.IOException {
            r0 = 8
            byte[] r0 = new byte[r0]
            r8 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            r9 = r0
            r0 = 0
            r10 = r0
        Lc:
            r0 = r10
            r1 = 8
            if (r0 >= r1) goto L97
            r0 = r8
            r1 = r10
            r2 = r9
            byte[] r2 = new byte[r2]
            r0[r1] = r2
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
        L1e:
            r0 = r7
            r1 = r8
            r2 = r10
            r1 = r1[r2]
            r2 = r11
            r3 = r9
            r4 = r11
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)
            r12 = r0
            r0 = r12
            if (r0 < 0) goto L3c
            r0 = r11
            r1 = r12
            int r0 = r0 + r1
            r11 = r0
            goto L87
        L3c:
            r0 = r9
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r0 - r1
            r1 = r11
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
        L4e:
            r0 = r15
            r1 = r10
            if (r0 >= r1) goto L77
            r0 = r8
            r1 = r15
            r0 = r0[r1]
            r1 = 0
            r2 = r13
            r3 = r14
            r4 = r14
            r5 = 4096(0x1000, float:5.74E-42)
            int r4 = r4 + r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r14
            r1 = r14
            int r0 = r0 + r1
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r0 + r1
            r14 = r0
            int r15 = r15 + 1
            goto L4e
        L77:
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r1 = 0
            r2 = r13
            r3 = r14
            r4 = r11
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r13
            return r0
        L87:
            r0 = r11
            r1 = r9
            if (r0 < r1) goto L1e
            r0 = r9
            r1 = 2
            int r0 = r0 * r1
            r9 = r0
            int r10 = r10 + 1
            goto Lc
        L97:
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "too much data"
            r1.<init>(r2)
            throw r0
    }

    public static void copyStream(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        L9:
            r0 = r10
            r1 = 64
            if (r0 >= r1) goto L5b
            r0 = r10
            r1 = 8
            if (r0 >= r1) goto L1f
            r0 = r8
            r1 = 2
            int r0 = r0 * r1
            r8 = r0
            r0 = r8
            byte[] r0 = new byte[r0]
            r9 = r0
        L1f:
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
        L25:
            r0 = r6
            r1 = r9
            r2 = r11
            r3 = r8
            r4 = r11
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)
            r12 = r0
            r0 = r12
            if (r0 < 0) goto L41
            r0 = r11
            r1 = r12
            int r0 = r0 + r1
            r11 = r0
            goto L4a
        L41:
            r0 = r7
            r1 = r9
            r2 = 0
            r3 = r11
            r0.write(r1, r2, r3)
            return
        L4a:
            r0 = r11
            r1 = r8
            if (r0 < r1) goto L25
            r0 = r7
            r1 = r9
            r0.write(r1)
            int r10 = r10 + 1
            goto L9
        L5b:
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "too much data"
            r1.<init>(r2)
            throw r0
    }
}
