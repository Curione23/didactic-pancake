package javassist.tools.web;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/web/Viewer.class */
public class Viewer extends java.lang.ClassLoader {
    private java.lang.String server;
    private int port;

    public static void main(java.lang.String[] r7) throws java.lang.Throwable {
            r0 = r7
            int r0 = r0.length
            r1 = 3
            if (r0 < r1) goto L35
            javassist.tools.web.Viewer r0 = new javassist.tools.web.Viewer
            r1 = r0
            r2 = r7
            r3 = 0
            r2 = r2[r3]
            r3 = r7
            r4 = 1
            r3 = r3[r4]
            int r3 = java.lang.Integer.parseInt(r3)
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r7
            int r0 = r0.length
            r1 = 3
            int r0 = r0 - r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = r0
            r0 = r7
            r1 = 3
            r2 = r9
            r3 = 0
            r4 = r7
            int r4 = r4.length
            r5 = 3
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            r1 = r7
            r2 = 2
            r1 = r1[r2]
            r2 = r9
            r0.run(r1, r2)
            goto L3d
        L35:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Usage: java javassist.tools.web.Viewer <host> <port> class [args ...]"
            r0.println(r1)
        L3d:
            return
    }

    public Viewer(java.lang.String r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.server = r1
            r0 = r3
            r1 = r5
            r0.port = r1
            return
    }

    public java.lang.String getServer() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.server
            return r0
    }

    public int getPort() {
            r2 = this;
            r0 = r2
            int r0 = r0.port
            return r0
    }

    public void run(java.lang.String r8, java.lang.String[] r9) throws java.lang.Throwable {
            r7 = this;
            r0 = r7
            r1 = r8
            java.lang.Class r0 = r0.loadClass(r1)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "main"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L25
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L25
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L25
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L25
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L25
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L25
            goto L2d
        L25:
            r11 = move-exception
            r0 = r11
            java.lang.Throwable r0 = r0.getTargetException()
            throw r0
        L2d:
            return
    }

    @Override // java.lang.ClassLoader
    protected synchronized java.lang.Class<?> loadClass(java.lang.String r5, boolean r6) throws java.lang.ClassNotFoundException {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.Class r0 = r0.findLoadedClass(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L10
            r0 = r4
            r1 = r5
            java.lang.Class r0 = r0.findClass(r1)
            r7 = r0
        L10:
            r0 = r7
            if (r0 != 0) goto L1d
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L1d:
            r0 = r6
            if (r0 == 0) goto L26
            r0 = r4
            r1 = r7
            r0.resolveClass(r1)
        L26:
            r0 = r7
            return r0
    }

    @Override // java.lang.ClassLoader
    protected java.lang.Class<?> findClass(java.lang.String r7) throws java.lang.ClassNotFoundException {
            r6 = this;
            r0 = 0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "java."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L1d
            r0 = r7
            java.lang.String r1 = "javax."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L1d
            r0 = r7
            java.lang.String r1 = "javassist.tools.web.Viewer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L23
        L1d:
            r0 = r6
            r1 = r7
            java.lang.Class r0 = r0.findSystemClass(r1)
            r8 = r0
        L23:
            r0 = r8
            if (r0 != 0) goto L3f
            r0 = r6
            r1 = r7
            byte[] r0 = r0.fetchClass(r1)     // Catch: java.lang.Exception -> L3e
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3b
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = 0
            r4 = r9
            int r4 = r4.length     // Catch: java.lang.Exception -> L3e
            java.lang.Class r0 = r0.defineClass(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L3e
            r8 = r0
        L3b:
            goto L3f
        L3e:
            r9 = move-exception
        L3f:
            r0 = r8
            return r0
    }

    protected byte[] fetchClass(java.lang.String r11) throws java.lang.Exception {
            r10 = this;
            java.net.URL r0 = new java.net.URL
            r1 = r0
            java.lang.String r2 = "http"
            r3 = r10
            java.lang.String r3 = r3.server
            r4 = r10
            int r4 = r4.port
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = r5
            r6.<init>()
            java.lang.String r6 = "/"
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r11
            r7 = 46
            r8 = 47
            java.lang.String r6 = r6.replace(r7, r8)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ".class"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            java.net.URLConnection r0 = r0.openConnection()
            r14 = r0
            r0 = r14
            r0.connect()
            r0 = r14
            int r0 = r0.getContentLength()
            r15 = r0
            r0 = r14
            java.io.InputStream r0 = r0.getInputStream()
            r16 = r0
            r0 = r15
            if (r0 > 0) goto L59
            r0 = r10
            r1 = r16
            byte[] r0 = r0.readStream(r1)
            r12 = r0
            goto La3
        L59:
            r0 = r15
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = 0
            r17 = r0
        L61:
            r0 = r16
            r1 = r12
            r2 = r17
            r3 = r15
            r4 = r17
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)
            r18 = r0
            r0 = r18
            if (r0 >= 0) goto L95
            r0 = r16
            r0.close()
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "the stream was closed: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L95:
            r0 = r17
            r1 = r18
            int r0 = r0 + r1
            r17 = r0
            r0 = r17
            r1 = r15
            if (r0 < r1) goto L61
        La3:
            r0 = r16
            r0.close()
            r0 = r12
            return r0
    }

    private byte[] readStream(java.io.InputStream r7) throws java.io.IOException {
            r6 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        Lb:
            r0 = r9
            r1 = r10
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            int r0 = r0.length
            r1 = r9
            int r0 = r0 - r1
            if (r0 > 0) goto L2b
            r0 = r8
            int r0 = r0.length
            r1 = 2
            int r0 = r0 * r1
            byte[] r0 = new byte[r0]
            r11 = r0
            r0 = r8
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r11
            r8 = r0
        L2b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r8
            int r3 = r3.length
            r4 = r9
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)
            r10 = r0
            r0 = r10
            if (r0 >= 0) goto Lb
            r0 = r9
            byte[] r0 = new byte[r0]
            r11 = r0
            r0 = r8
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r11
            return r0
    }
}
