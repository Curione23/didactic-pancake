package javassist.tools.rmi;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/rmi/AppletServer.class */
public class AppletServer extends javassist.tools.web.Webserver {
    private javassist.tools.rmi.StubGenerator stubGen;
    private java.util.Map<java.lang.String, javassist.tools.rmi.ExportedObject> exportedNames;
    private java.util.List<javassist.tools.rmi.ExportedObject> exportedObjects;
    private static final byte[] okHeader = null;

    public AppletServer(java.lang.String r4) throws java.io.IOException, javassist.NotFoundException, javassist.CannotCompileException {
            r3 = this;
            r0 = r3
            r1 = r4
            int r1 = java.lang.Integer.parseInt(r1)
            r0.<init>(r1)
            return
    }

    public AppletServer(int r6) throws java.io.IOException, javassist.NotFoundException, javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            javassist.ClassPool r1 = javassist.ClassPool.getDefault()
            javassist.tools.rmi.StubGenerator r2 = new javassist.tools.rmi.StubGenerator
            r3 = r2
            r3.<init>()
            r3 = r6
            r0.<init>(r1, r2, r3)
            return
    }

    public AppletServer(int r6, javassist.ClassPool r7) throws java.io.IOException, javassist.NotFoundException, javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            javassist.ClassPool r1 = new javassist.ClassPool
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            javassist.tools.rmi.StubGenerator r2 = new javassist.tools.rmi.StubGenerator
            r3 = r2
            r3.<init>()
            r3 = r6
            r0.<init>(r1, r2, r3)
            return
    }

    private AppletServer(javassist.ClassPool r5, javassist.tools.rmi.StubGenerator r6, int r7) throws java.io.IOException, javassist.NotFoundException, javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r7
            r0.<init>(r1)
            r0 = r4
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = r1
            r2.<init>()
            r0.exportedNames = r1
            r0 = r4
            java.util.Vector r1 = new java.util.Vector
            r2 = r1
            r2.<init>()
            r0.exportedObjects = r1
            r0 = r4
            r1 = r6
            r0.stubGen = r1
            r0 = r4
            r1 = r5
            r2 = r6
            r0.addTranslator(r1, r2)
            return
    }

    @Override // javassist.tools.web.Webserver
    public void run() {
            r2 = this;
            r0 = r2
            super.run()
            return
    }

    public synchronized int exportObject(java.lang.String r5, java.lang.Object r6) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r7 = r0
            javassist.tools.rmi.ExportedObject r0 = new javassist.tools.rmi.ExportedObject
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r6
            r0.object = r1
            r0 = r8
            r1 = r7
            java.lang.reflect.Method[] r1 = r1.getMethods()
            r0.methods = r1
            r0 = r4
            java.util.List<javassist.tools.rmi.ExportedObject> r0 = r0.exportedObjects
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r8
            r1 = r4
            java.util.List<javassist.tools.rmi.ExportedObject> r1 = r1.exportedObjects
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r0.identifier = r1
            r0 = r5
            if (r0 == 0) goto L4a
            r0 = r4
            java.util.Map<java.lang.String, javassist.tools.rmi.ExportedObject> r0 = r0.exportedNames
            r1 = r5
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
        L4a:
            r0 = r4
            javassist.tools.rmi.StubGenerator r0 = r0.stubGen     // Catch: javassist.NotFoundException -> L56
            r1 = r7
            boolean r0 = r0.makeProxyClass(r1)     // Catch: javassist.NotFoundException -> L56
            goto L62
        L56:
            r9 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r8
            int r0 = r0.identifier
            return r0
    }

    @Override // javassist.tools.web.Webserver
    public void doReply(java.io.InputStream r6, java.io.OutputStream r7, java.lang.String r8) throws java.io.IOException, javassist.tools.web.BadHttpRequest {
            r5 = this;
            r0 = r8
            java.lang.String r1 = "POST /rmi "
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L12
            r0 = r5
            r1 = r6
            r2 = r7
            r0.processRMI(r1, r2)
            goto L2c
        L12:
            r0 = r8
            java.lang.String r1 = "POST /lookup "
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L25
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r7
            r0.lookupName(r1, r2, r3)
            goto L2c
        L25:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.doReply(r1, r2, r3)
        L2c:
            return
    }

    private void processRMI(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
            r5 = this;
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            int r0 = r0.readInt()
            r9 = r0
            r0 = r8
            int r0 = r0.readInt()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r5
            java.util.List<javassist.tools.rmi.ExportedObject> r0 = r0.exportedObjects     // Catch: java.lang.Exception -> L4d
            r1 = r9
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L4d
            javassist.tools.rmi.ExportedObject r0 = (javassist.tools.rmi.ExportedObject) r0     // Catch: java.lang.Exception -> L4d
            r13 = r0
            r0 = r5
            r1 = r8
            java.lang.Object[] r0 = r0.readParameters(r1)     // Catch: java.lang.Exception -> L4d
            r14 = r0
            r0 = r5
            r1 = r13
            java.lang.reflect.Method[] r1 = r1.methods     // Catch: java.lang.Exception -> L4d
            r2 = r10
            r1 = r1[r2]     // Catch: java.lang.Exception -> L4d
            r2 = r13
            java.lang.Object r2 = r2.object     // Catch: java.lang.Exception -> L4d
            r3 = r14
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L4d
            java.lang.Object r0 = r0.convertRvalue(r1)     // Catch: java.lang.Exception -> L4d
            r12 = r0
            goto L5c
        L4d:
            r13 = move-exception
            r0 = r13
            r11 = r0
            r0 = r5
            r1 = r13
            java.lang.String r1 = r1.toString()
            r0.logging2(r1)
        L5c:
            r0 = r7
            byte[] r1 = javassist.tools.rmi.AppletServer.okHeader
            r0.write(r1)
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r13 = r0
            r0 = r11
            if (r0 == 0) goto L85
            r0 = r13
            r1 = 0
            r0.writeBoolean(r1)
            r0 = r13
            r1 = r11
            java.lang.String r1 = r1.toString()
            r0.writeUTF(r1)
            goto Lae
        L85:
            r0 = r13
            r1 = 1
            r0.writeBoolean(r1)     // Catch: java.io.NotSerializableException -> L95 java.io.InvalidClassException -> La3
            r0 = r13
            r1 = r12
            r0.writeObject(r1)     // Catch: java.io.NotSerializableException -> L95 java.io.InvalidClassException -> La3
            goto Lae
        L95:
            r14 = move-exception
            r0 = r5
            r1 = r14
            java.lang.String r1 = r1.toString()
            r0.logging2(r1)
            goto Lae
        La3:
            r14 = move-exception
            r0 = r5
            r1 = r14
            java.lang.String r1 = r1.toString()
            r0.logging2(r1)
        Lae:
            r0 = r13
            r0.flush()
            r0 = r13
            r0.close()
            r0 = r8
            r0.close()
            return
    }

    private java.lang.Object[] readParameters(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            r0 = r5
            int r0 = r0.readInt()
            r6 = r0
            r0 = r6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r7 = r0
            r0 = 0
            r8 = r0
        Ld:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L4e
            r0 = r5
            java.lang.Object r0 = r0.readObject()
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof javassist.tools.rmi.RemoteRef
            if (r0 == 0) goto L42
            r0 = r9
            javassist.tools.rmi.RemoteRef r0 = (javassist.tools.rmi.RemoteRef) r0
            r10 = r0
            r0 = r4
            java.util.List<javassist.tools.rmi.ExportedObject> r0 = r0.exportedObjects
            r1 = r10
            int r1 = r1.oid
            java.lang.Object r0 = r0.get(r1)
            javassist.tools.rmi.ExportedObject r0 = (javassist.tools.rmi.ExportedObject) r0
            r11 = r0
            r0 = r11
            java.lang.Object r0 = r0.object
            r9 = r0
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r0[r1] = r2
            int r8 = r8 + 1
            goto Ld
        L4e:
            r0 = r7
            return r0
    }

    private java.lang.Object convertRvalue(java.lang.Object r7) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r8 = r0
            r0 = r6
            javassist.tools.rmi.StubGenerator r0 = r0.stubGen
            r1 = r8
            boolean r0 = r0.isProxyClass(r1)
            if (r0 == 0) goto L28
            javassist.tools.rmi.RemoteRef r0 = new javassist.tools.rmi.RemoteRef
            r1 = r0
            r2 = r6
            r3 = 0
            r4 = r7
            int r2 = r2.exportObject(r3, r4)
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L28:
            r0 = r7
            return r0
    }

    private void lookupName(java.lang.String r5, java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
            r4 = this;
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            java.lang.String r0 = java.io.DataInputStream.readUTF(r0)
            r9 = r0
            r0 = r4
            java.util.Map<java.lang.String, javassist.tools.rmi.ExportedObject> r0 = r0.exportedNames
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            javassist.tools.rmi.ExportedObject r0 = (javassist.tools.rmi.ExportedObject) r0
            r10 = r0
            r0 = r7
            byte[] r1 = javassist.tools.rmi.AppletServer.okHeader
            r0.write(r1)
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L5f
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "not found."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.logging2(r1)
            r0 = r11
            r1 = -1
            r0.writeInt(r1)
            r0 = r11
            java.lang.String r1 = "error"
            r0.writeUTF(r1)
            goto L7f
        L5f:
            r0 = r4
            r1 = r9
            r0.logging2(r1)
            r0 = r11
            r1 = r10
            int r1 = r1.identifier
            r0.writeInt(r1)
            r0 = r11
            r1 = r10
            java.lang.Object r1 = r1.object
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.writeUTF(r1)
        L7f:
            r0 = r11
            r0.flush()
            r0 = r11
            r0.close()
            r0 = r8
            r0.close()
            return
    }

    static {
            java.lang.String r0 = "HTTP/1.0 200 OK\r\n\r\n"
            byte[] r0 = r0.getBytes()
            javassist.tools.rmi.AppletServer.okHeader = r0
            return
    }
}
