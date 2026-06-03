package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ByteArrayClassPath.class */
public class ByteArrayClassPath implements javassist.ClassPath {
    protected java.lang.String classname;
    protected byte[] classfile;

    /* JADX INFO: renamed from: javassist.ByteArrayClassPath$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ByteArrayClassPath$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ByteArrayClassPath$BytecodeURLConnection.class */
    private class BytecodeURLConnection extends java.net.URLConnection {
        final /* synthetic */ javassist.ByteArrayClassPath this$0;

        protected BytecodeURLConnection(javassist.ByteArrayClassPath r4, java.net.URL r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r1 = r5
                r0.<init>(r1)
                return
        }

        @Override // java.net.URLConnection
        public void connect() throws java.io.IOException {
                r1 = this;
                return
        }

        @Override // java.net.URLConnection
        public java.io.InputStream getInputStream() throws java.io.IOException {
                r4 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                r1 = r0
                r2 = r4
                javassist.ByteArrayClassPath r2 = r2.this$0
                byte[] r2 = r2.classfile
                r1.<init>(r2)
                return r0
        }

        @Override // java.net.URLConnection
        public int getContentLength() {
                r2 = this;
                r0 = r2
                javassist.ByteArrayClassPath r0 = r0.this$0
                byte[] r0 = r0.classfile
                int r0 = r0.length
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/ByteArrayClassPath$BytecodeURLStreamHandler.class */
    private class BytecodeURLStreamHandler extends java.net.URLStreamHandler {
        final /* synthetic */ javassist.ByteArrayClassPath this$0;

        private BytecodeURLStreamHandler(javassist.ByteArrayClassPath r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        @Override // java.net.URLStreamHandler
        protected java.net.URLConnection openConnection(java.net.URL r6) {
                r5 = this;
                javassist.ByteArrayClassPath$BytecodeURLConnection r0 = new javassist.ByteArrayClassPath$BytecodeURLConnection
                r1 = r0
                r2 = r5
                javassist.ByteArrayClassPath r2 = r2.this$0
                r3 = r6
                r1.<init>(r2, r3)
                return r0
        }

        /* synthetic */ BytecodeURLStreamHandler(javassist.ByteArrayClassPath r4, javassist.ByteArrayClassPath.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    public ByteArrayClassPath(java.lang.String r4, byte[] r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.classname = r1
            r0 = r3
            r1 = r5
            r0.classfile = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "byte[]:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.classname
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.ClassPath
    public java.io.InputStream openClassfile(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.classname
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r1 = r0
            r2 = r4
            byte[] r2 = r2.classfile
            r1.<init>(r2)
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // javassist.ClassPath
    public java.net.URL find(java.lang.String r10) {
            r9 = this;
            r0 = r9
            java.lang.String r0 = r0.classname
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r10
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L4b
            r1 = r0
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.net.MalformedURLException -> L4b
            r4 = r3
            r4.<init>()     // Catch: java.net.MalformedURLException -> L4b
            java.lang.String r4 = "file:/ByteArrayClassPath/"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.net.MalformedURLException -> L4b
            r4 = r11
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.net.MalformedURLException -> L4b
            java.lang.String r3 = r3.toString()     // Catch: java.net.MalformedURLException -> L4b
            javassist.ByteArrayClassPath$BytecodeURLStreamHandler r4 = new javassist.ByteArrayClassPath$BytecodeURLStreamHandler     // Catch: java.net.MalformedURLException -> L4b
            r5 = r4
            r6 = r9
            r7 = 0
            r5.<init>(r6, r7)     // Catch: java.net.MalformedURLException -> L4b
            r1.<init>(r2, r3, r4)     // Catch: java.net.MalformedURLException -> L4b
            return r0
        L4b:
            r12 = move-exception
        L4c:
            r0 = 0
            return r0
    }
}
