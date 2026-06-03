package javassist.tools.web;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/web/Webserver.class */
public class Webserver {
    private java.net.ServerSocket socket;
    private javassist.ClassPool classPool;
    protected javassist.Translator translator;
    private static final byte[] endofline = null;
    private static final int typeHtml = 1;
    private static final int typeClass = 2;
    private static final int typeGif = 3;
    private static final int typeJpeg = 4;
    private static final int typeText = 5;
    public java.lang.String debugDir;
    public java.lang.String htmlfileBase;

    public static void main(java.lang.String[] r5) throws java.io.IOException {
            r0 = r5
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L18
            javassist.tools.web.Webserver r0 = new javassist.tools.web.Webserver
            r1 = r0
            r2 = r5
            r3 = 0
            r2 = r2[r3]
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r0.run()
            goto L20
        L18:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Usage: java javassist.tools.web.Webserver <port number>"
            r0.println(r1)
        L20:
            return
    }

    public Webserver(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = java.lang.Integer.parseInt(r1)
            r0.<init>(r1)
            return
    }

    public Webserver(int r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = 0
            r0.debugDir = r1
            r0 = r5
            r1 = 0
            r0.htmlfileBase = r1
            r0 = r5
            java.net.ServerSocket r1 = new java.net.ServerSocket
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.socket = r1
            r0 = r5
            r1 = 0
            r0.classPool = r1
            r0 = r5
            r1 = 0
            r0.translator = r1
            return
    }

    public void setClassPool(javassist.ClassPool r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.classPool = r1
            return
    }

    public void addTranslator(javassist.ClassPool r4, javassist.Translator r5) throws javassist.NotFoundException, javassist.CannotCompileException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.classPool = r1
            r0 = r3
            r1 = r5
            r0.translator = r1
            r0 = r5
            r1 = r3
            javassist.ClassPool r1 = r1.classPool
            r0.start(r1)
            return
    }

    public void end() throws java.io.IOException {
            r2 = this;
            r0 = r2
            java.net.ServerSocket r0 = r0.socket
            r0.close()
            return
    }

    public void logging(java.lang.String r4) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r4
            r0.println(r1)
            return
    }

    public void logging(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r4
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " "
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r5
            r0.println(r1)
            return
    }

    public void logging(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r4
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " "
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r5
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " "
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r6
            r0.println(r1)
            return
    }

    public void logging2(java.lang.String r4) {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "    "
            r0.print(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r4
            r0.println(r1)
            return
    }

    public void run() {
            r5 = this;
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "ready to service..."
            r0.println(r1)
        L8:
            javassist.tools.web.ServiceThread r0 = new javassist.tools.web.ServiceThread     // Catch: java.io.IOException -> L1f
            r1 = r0
            r2 = r5
            r3 = r5
            java.net.ServerSocket r3 = r3.socket     // Catch: java.io.IOException -> L1f
            java.net.Socket r3 = r3.accept()     // Catch: java.io.IOException -> L1f
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L1f
            r6 = r0
            r0 = r6
            r0.start()     // Catch: java.io.IOException -> L1f
            goto L8
        L1f:
            r6 = move-exception
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.toString()
            r0.logging(r1)
            goto L8
    }

    final void process(java.net.Socket r6) throws java.io.IOException {
            r5 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = r0
            r2 = r6
            java.io.InputStream r2 = r2.getInputStream()
            r1.<init>(r2)
            r7 = r0
            r0 = r5
            r1 = r7
            java.lang.String r0 = r0.readLine(r1)
            r8 = r0
            r0 = r5
            r1 = r6
            java.net.InetAddress r1 = r1.getInetAddress()
            java.lang.String r1 = r1.getHostName()
            java.util.Date r2 = new java.util.Date
            r3 = r2
            r3.<init>()
            java.lang.String r2 = r2.toString()
            r3 = r8
            r0.logging(r1, r2, r3)
        L28:
            r0 = r5
            r1 = r7
            int r0 = r0.skipLine(r1)
            if (r0 <= 0) goto L33
            goto L28
        L33:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r1 = r0
            r2 = r6
            java.io.OutputStream r2 = r2.getOutputStream()
            r1.<init>(r2)
            r9 = r0
            r0 = r5
            r1 = r7
            r2 = r9
            r3 = r8
            r0.doReply(r1, r2, r3)     // Catch: javassist.tools.web.BadHttpRequest -> L4b
            goto L55
        L4b:
            r10 = move-exception
            r0 = r5
            r1 = r9
            r2 = r10
            r0.replyError(r1, r2)
        L55:
            r0 = r9
            r0.flush()
            r0 = r7
            r0.close()
            r0 = r9
            r0.close()
            r0 = r6
            r0.close()
            return
    }

    private java.lang.String readLine(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
        L8:
            r0 = r4
            int r0 = r0.read()
            r1 = r0
            r6 = r1
            if (r0 < 0) goto L21
            r0 = r6
            r1 = 13
            if (r0 == r1) goto L21
            r0 = r5
            r1 = r6
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8
        L21:
            r0 = r4
            int r0 = r0.read()
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private int skipLine(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r6 = r0
        L2:
            r0 = r4
            int r0 = r0.read()
            r1 = r0
            r5 = r1
            if (r0 < 0) goto L17
            r0 = r5
            r1 = 13
            if (r0 == r1) goto L17
            int r6 = r6 + 1
            goto L2
        L17:
            r0 = r4
            int r0 = r0.read()
            r0 = r6
            return r0
    }

    public void doReply(java.io.InputStream r7, java.io.OutputStream r8, java.lang.String r9) throws java.io.IOException, javassist.tools.web.BadHttpRequest {
            r6 = this;
            r0 = r9
            java.lang.String r1 = "GET /"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1d
            r0 = r9
            r1 = 5
            r2 = r9
            r3 = 32
            r4 = 5
            int r2 = r2.indexOf(r3, r4)
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = r0
            r13 = r1
            r12 = r0
            goto L25
        L1d:
            javassist.tools.web.BadHttpRequest r0 = new javassist.tools.web.BadHttpRequest
            r1 = r0
            r1.<init>()
            throw r0
        L25:
            r0 = r12
            java.lang.String r1 = ".class"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L35
            r0 = 2
            r11 = r0
            goto L72
        L35:
            r0 = r12
            java.lang.String r1 = ".html"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L49
            r0 = r12
            java.lang.String r1 = ".htm"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L4f
        L49:
            r0 = 1
            r11 = r0
            goto L72
        L4f:
            r0 = r12
            java.lang.String r1 = ".gif"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L5f
            r0 = 3
            r11 = r0
            goto L72
        L5f:
            r0 = r12
            java.lang.String r1 = ".jpg"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L6f
            r0 = 4
            r11 = r0
            goto L72
        L6f:
            r0 = 5
            r11 = r0
        L72:
            r0 = r12
            int r0 = r0.length()
            r10 = r0
            r0 = r11
            r1 = 2
            if (r0 != r1) goto L8c
            r0 = r6
            r1 = r8
            r2 = r12
            r3 = r10
            boolean r0 = r0.letUsersSendClassfile(r1, r2, r3)
            if (r0 == 0) goto L8c
            return
        L8c:
            r0 = r6
            r1 = r12
            r2 = r10
            r0.checkFilename(r1, r2)
            r0 = r6
            java.lang.String r0 = r0.htmlfileBase
            if (r0 == 0) goto Lb3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.String r1 = r1.htmlfileBase
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12 = r0
        Lb3:
            char r0 = java.io.File.separatorChar
            r1 = 47
            if (r0 == r1) goto Lc7
            r0 = r12
            r1 = 47
            char r2 = java.io.File.separatorChar
            java.lang.String r0 = r0.replace(r1, r2)
            r12 = r0
        Lc7:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            boolean r0 = r0.canRead()
            if (r0 == 0) goto L11b
            r0 = r6
            r1 = r8
            r2 = r14
            long r2 = r2.length()
            r3 = r11
            r0.sendHeader(r1, r2, r3)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            r15 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r16 = r0
        Lf8:
            r0 = r15
            r1 = r16
            int r0 = r0.read(r1)
            r10 = r0
            r0 = r10
            if (r0 > 0) goto L109
            goto L115
        L109:
            r0 = r8
            r1 = r16
            r2 = 0
            r3 = r10
            r0.write(r1, r2, r3)
            goto Lf8
        L115:
            r0 = r15
            r0.close()
            return
        L11b:
            r0 = r11
            r1 = 2
            if (r0 != r1) goto L18f
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L18f
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r17 = r0
        L154:
            r0 = r15
            r1 = r17
            int r0 = r0.read(r1)
            r10 = r0
            r0 = r10
            if (r0 > 0) goto L165
            goto L172
        L165:
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r10
            r0.write(r1, r2, r3)
            goto L154
        L172:
            r0 = r16
            byte[] r0 = r0.toByteArray()
            r18 = r0
            r0 = r6
            r1 = r8
            r2 = r18
            int r2 = r2.length
            long r2 = (long) r2
            r3 = 2
            r0.sendHeader(r1, r2, r3)
            r0 = r8
            r1 = r18
            r0.write(r1)
            r0 = r15
            r0.close()
            return
        L18f:
            javassist.tools.web.BadHttpRequest r0 = new javassist.tools.web.BadHttpRequest
            r1 = r0
            r1.<init>()
            throw r0
    }

    private void checkFilename(java.lang.String r4, int r5) throws javassist.tools.web.BadHttpRequest {
            r3 = this;
            r0 = 0
            r6 = r0
        L2:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L32
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            if (r0 != 0) goto L2c
            r0 = r7
            r1 = 46
            if (r0 == r1) goto L2c
            r0 = r7
            r1 = 47
            if (r0 == r1) goto L2c
            javassist.tools.web.BadHttpRequest r0 = new javassist.tools.web.BadHttpRequest
            r1 = r0
            r1.<init>()
            throw r0
        L2c:
            int r6 = r6 + 1
            goto L2
        L32:
            r0 = r4
            java.lang.String r1 = ".."
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L44
            javassist.tools.web.BadHttpRequest r0 = new javassist.tools.web.BadHttpRequest
            r1 = r0
            r1.<init>()
            throw r0
        L44:
            return
    }

    private boolean letUsersSendClassfile(java.io.OutputStream r7, java.lang.String r8, int r9) throws java.io.IOException, javassist.tools.web.BadHttpRequest {
            r6 = this;
            r0 = r6
            javassist.ClassPool r0 = r0.classPool
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r8
            r1 = 0
            r2 = r9
            r3 = 6
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            r11 = r0
            r0 = r6
            javassist.Translator r0 = r0.translator     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L31
            r0 = r6
            javassist.Translator r0 = r0.translator     // Catch: java.lang.Exception -> L56
            r1 = r6
            javassist.ClassPool r1 = r1.classPool     // Catch: java.lang.Exception -> L56
            r2 = r11
            r0.onLoad(r1, r2)     // Catch: java.lang.Exception -> L56
        L31:
            r0 = r6
            javassist.ClassPool r0 = r0.classPool     // Catch: java.lang.Exception -> L56
            r1 = r11
            javassist.CtClass r0 = r0.get(r1)     // Catch: java.lang.Exception -> L56
            r12 = r0
            r0 = r12
            byte[] r0 = r0.toBytecode()     // Catch: java.lang.Exception -> L56
            r10 = r0
            r0 = r6
            java.lang.String r0 = r0.debugDir     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L53
            r0 = r12
            r1 = r6
            java.lang.String r1 = r1.debugDir     // Catch: java.lang.Exception -> L56
            r0.writeFile(r1)     // Catch: java.lang.Exception -> L56
        L53:
            goto L62
        L56:
            r12 = move-exception
            javassist.tools.web.BadHttpRequest r0 = new javassist.tools.web.BadHttpRequest
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r6
            r1 = r7
            r2 = r10
            int r2 = r2.length
            long r2 = (long) r2
            r3 = 2
            r0.sendHeader(r1, r2, r3)
            r0 = r7
            r1 = r10
            r0.write(r1)
            r0 = 1
            return r0
    }

    private void sendHeader(java.io.OutputStream r5, long r6, int r8) throws java.io.IOException {
            r4 = this;
            r0 = r5
            java.lang.String r1 = "HTTP/1.0 200 OK"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            r0 = r5
            byte[] r1 = javassist.tools.web.Webserver.endofline
            r0.write(r1)
            r0 = r5
            java.lang.String r1 = "Content-Length: "
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            r0 = r5
            r1 = r6
            java.lang.String r1 = java.lang.Long.toString(r1)
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            r0 = r5
            byte[] r1 = javassist.tools.web.Webserver.endofline
            r0.write(r1)
            r0 = r8
            r1 = 2
            if (r0 != r1) goto L40
            r0 = r5
            java.lang.String r1 = "Content-Type: application/octet-stream"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            goto L89
        L40:
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L53
            r0 = r5
            java.lang.String r1 = "Content-Type: text/html"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            goto L89
        L53:
            r0 = r8
            r1 = 3
            if (r0 != r1) goto L66
            r0 = r5
            java.lang.String r1 = "Content-Type: image/gif"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            goto L89
        L66:
            r0 = r8
            r1 = 4
            if (r0 != r1) goto L79
            r0 = r5
            java.lang.String r1 = "Content-Type: image/jpg"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            goto L89
        L79:
            r0 = r8
            r1 = 5
            if (r0 != r1) goto L89
            r0 = r5
            java.lang.String r1 = "Content-Type: text/plain"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
        L89:
            r0 = r5
            byte[] r1 = javassist.tools.web.Webserver.endofline
            r0.write(r1)
            r0 = r5
            byte[] r1 = javassist.tools.web.Webserver.endofline
            r0.write(r1)
            return
    }

    private void replyError(java.io.OutputStream r5, javassist.tools.web.BadHttpRequest r6) throws java.io.IOException {
            r4 = this;
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "bad request: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.logging2(r1)
            r0 = r5
            java.lang.String r1 = "HTTP/1.0 400 Bad Request"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            r0 = r5
            byte[] r1 = javassist.tools.web.Webserver.endofline
            r0.write(r1)
            r0 = r5
            byte[] r1 = javassist.tools.web.Webserver.endofline
            r0.write(r1)
            r0 = r5
            java.lang.String r1 = "<H1>Bad Request</H1>"
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            return
    }

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r1 = r0
            r2 = 0
            r3 = 13
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 10
            r1[r2] = r3
            javassist.tools.web.Webserver.endofline = r0
            return
    }
}
