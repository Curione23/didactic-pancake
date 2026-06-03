package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/URLClassPath.class */
public class URLClassPath implements javassist.ClassPath {
    protected java.lang.String hostname;
    protected int port;
    protected java.lang.String directory;
    protected java.lang.String packageName;

    public URLClassPath(java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.hostname = r1
            r0 = r3
            r1 = r5
            r0.port = r1
            r0 = r3
            r1 = r6
            r0.directory = r1
            r0 = r3
            r1 = r7
            r0.packageName = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.hostname
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.port
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.directory
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.ClassPath
    public java.io.InputStream openClassfile(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.net.URLConnection r0 = r0.openClassfile0(r1)     // Catch: java.io.IOException -> L12
            r5 = r0
            r0 = r5
            if (r0 == 0) goto Lf
            r0 = r5
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L12
            return r0
        Lf:
            goto L13
        L12:
            r5 = move-exception
        L13:
            r0 = 0
            return r0
    }

    private java.net.URLConnection openClassfile0(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            java.lang.String r0 = r0.packageName
            if (r0 == 0) goto L12
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L41
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.String r1 = r1.directory
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
            java.lang.String r0 = r0.hostname
            r1 = r5
            int r1 = r1.port
            r2 = r7
            java.net.URLConnection r0 = fetchClass0(r0, r1, r2)
            return r0
        L41:
            r0 = 0
            return r0
    }

    @Override // javassist.ClassPath
    public java.net.URL find(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.net.URLConnection r0 = r0.openClassfile0(r1)     // Catch: java.io.IOException -> L1b
            r5 = r0
            r0 = r5
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L1b
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L18
            r0 = r6
            r0.close()     // Catch: java.io.IOException -> L1b
            r0 = r5
            java.net.URL r0 = r0.getURL()     // Catch: java.io.IOException -> L1b
            return r0
        L18:
            goto L1c
        L1b:
            r5 = move-exception
        L1c:
            r0 = 0
            return r0
    }

    public static byte[] fetchClass(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10) throws java.io.IOException {
            r0 = r7
            r1 = r8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            r4 = 46
            r5 = 47
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".class"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.net.URLConnection r0 = fetchClass0(r0, r1, r2)
            r12 = r0
            r0 = r12
            int r0 = r0.getContentLength()
            r13 = r0
            r0 = r12
            java.io.InputStream r0 = r0.getInputStream()
            r14 = r0
            r0 = r13
            if (r0 > 0) goto L42
            r0 = r14
            byte[] r0 = javassist.ClassPoolTail.readStream(r0)     // Catch: java.lang.Throwable -> L91
            r11 = r0
            goto L89
        L42:
            r0 = r13
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L91
            r11 = r0
            r0 = 0
            r15 = r0
        L4b:
            r0 = r14
            r1 = r11
            r2 = r15
            r3 = r13
            r4 = r15
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)     // Catch: java.lang.Throwable -> L91
            r16 = r0
            r0 = r16
            if (r0 >= 0) goto L7b
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L91
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = "the stream was closed: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L91
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L91
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L7b:
            r0 = r15
            r1 = r16
            int r0 = r0 + r1
            r15 = r0
            r0 = r15
            r1 = r13
            if (r0 < r1) goto L4b
        L89:
            r0 = r14
            r0.close()
            goto L9b
        L91:
            r17 = move-exception
            r0 = r14
            r0.close()
            r0 = r17
            throw r0
        L9b:
            r0 = r11
            return r0
    }

    private static java.net.URLConnection fetchClass0(java.lang.String r7, int r8, java.lang.String r9) throws java.io.IOException {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L10
            r1 = r0
            java.lang.String r2 = "http"
            r3 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5)     // Catch: java.net.MalformedURLException -> L10
            r10 = r0
            goto L1c
        L10:
            r11 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "invalid URL?"
            r1.<init>(r2)
            throw r0
        L1c:
            r0 = r10
            java.net.URLConnection r0 = r0.openConnection()
            r11 = r0
            r0 = r11
            r0.connect()
            r0 = r11
            return r0
    }
}
