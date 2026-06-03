package javassist.tools.rmi;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/rmi/ObjectImporter.class */
public class ObjectImporter implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final byte[] endofline;
    private java.lang.String servername;
    private java.lang.String orgServername;
    private int port;
    private int orgPort;
    protected byte[] lookupCommand;
    protected byte[] rmiCommand;
    private static final java.lang.Class<?>[] proxyConstructorParamTypes = null;

    public ObjectImporter(java.applet.Applet r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = 2
            byte[] r1 = new byte[r1]
            r2 = r1
            r3 = 0
            r4 = 13
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 10
            r2[r3] = r4
            r0.endofline = r1
            r0 = r6
            java.lang.String r1 = "POST /lookup HTTP/1.0"
            byte[] r1 = r1.getBytes()
            r0.lookupCommand = r1
            r0 = r6
            java.lang.String r1 = "POST /rmi HTTP/1.0"
            byte[] r1 = r1.getBytes()
            r0.rmiCommand = r1
            r0 = r7
            java.net.URL r0 = r0.getCodeBase()
            r8 = r0
            r0 = r6
            r1 = r6
            r2 = r8
            java.lang.String r2 = r2.getHost()
            r3 = r2; r2 = r1; r1 = r3; 
            r2.servername = r3
            r0.orgServername = r1
            r0 = r6
            r1 = r6
            r2 = r8
            int r2 = r2.getPort()
            r3 = r2; r2 = r1; r1 = r3; 
            r2.port = r3
            r0.orgPort = r1
            return
    }

    public ObjectImporter(java.lang.String r7, int r8) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = 2
            byte[] r1 = new byte[r1]
            r2 = r1
            r3 = 0
            r4 = 13
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 10
            r2[r3] = r4
            r0.endofline = r1
            r0 = r6
            java.lang.String r1 = "POST /lookup HTTP/1.0"
            byte[] r1 = r1.getBytes()
            r0.lookupCommand = r1
            r0 = r6
            java.lang.String r1 = "POST /rmi HTTP/1.0"
            byte[] r1 = r1.getBytes()
            r0.rmiCommand = r1
            r0 = r6
            r1 = r6
            r2 = r7
            r3 = r2; r2 = r1; r1 = r3; 
            r2.servername = r3
            r0.orgServername = r1
            r0 = r6
            r1 = r6
            r2 = r8
            r3 = r2; r2 = r1; r1 = r3; 
            r2.port = r3
            r0.orgPort = r1
            return
    }

    public java.lang.Object getObject(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.lookupObject(r1)     // Catch: javassist.tools.rmi.ObjectNotFoundException -> L6
            return r0
        L6:
            r5 = move-exception
            r0 = 0
            return r0
    }

    public void setHttpProxy(java.lang.String r4, int r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "POST http://"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.orgServername
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.orgPort
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/lookup HTTP/1.0"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r3
            r1 = r7
            byte[] r1 = r1.getBytes()
            r0.lookupCommand = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/rmi HTTP/1.0"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r3
            r1 = r7
            byte[] r1 = r1.getBytes()
            r0.rmiCommand = r1
            r0 = r3
            r1 = r4
            r0.servername = r1
            r0 = r3
            r1 = r5
            r0.port = r1
            return
    }

    public java.lang.Object lookupObject(java.lang.String r6) throws javassist.tools.rmi.ObjectNotFoundException {
            r5 = this;
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.Exception -> L8d
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.servername     // Catch: java.lang.Exception -> L8d
            r3 = r5
            int r3 = r3.port     // Catch: java.lang.Exception -> L8d
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L8d
            r7 = r0
            r0 = r7
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.lang.Exception -> L8d
            r8 = r0
            r0 = r8
            r1 = r5
            byte[] r1 = r1.lookupCommand     // Catch: java.lang.Exception -> L8d
            r0.write(r1)     // Catch: java.lang.Exception -> L8d
            r0 = r8
            r1 = r5
            byte[] r1 = r1.endofline     // Catch: java.lang.Exception -> L8d
            r0.write(r1)     // Catch: java.lang.Exception -> L8d
            r0 = r8
            r1 = r5
            byte[] r1 = r1.endofline     // Catch: java.lang.Exception -> L8d
            r0.write(r1)     // Catch: java.lang.Exception -> L8d
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L8d
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: java.lang.Exception -> L8d
            r9 = r0
            r0 = r9
            r1 = r6
            r0.writeUTF(r1)     // Catch: java.lang.Exception -> L8d
            r0 = r9
            r0.flush()     // Catch: java.lang.Exception -> L8d
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L8d
            r1 = r0
            r2 = r7
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L8d
            r1.<init>(r2)     // Catch: java.lang.Exception -> L8d
            r10 = r0
            r0 = r5
            r1 = r10
            r0.skipHeader(r1)     // Catch: java.lang.Exception -> L8d
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L8d
            r1 = r0
            r2 = r10
            r1.<init>(r2)     // Catch: java.lang.Exception -> L8d
            r11 = r0
            r0 = r11
            int r0 = r0.readInt()     // Catch: java.lang.Exception -> L8d
            r12 = r0
            r0 = r11
            java.lang.String r0 = r0.readUTF()     // Catch: java.lang.Exception -> L8d
            r13 = r0
            r0 = r11
            r0.close()     // Catch: java.lang.Exception -> L8d
            r0 = r9
            r0.close()     // Catch: java.lang.Exception -> L8d
            r0 = r7
            r0.close()     // Catch: java.lang.Exception -> L8d
            r0 = r12
            if (r0 < 0) goto L8a
            r0 = r5
            r1 = r12
            r2 = r13
            java.lang.Object r0 = r0.createProxy(r1, r2)     // Catch: java.lang.Exception -> L8d
            return r0
        L8a:
            goto L9c
        L8d:
            r7 = move-exception
            r0 = r7
            r0.printStackTrace()
            javassist.tools.rmi.ObjectNotFoundException r0 = new javassist.tools.rmi.ObjectNotFoundException
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        L9c:
            javassist.tools.rmi.ObjectNotFoundException r0 = new javassist.tools.rmi.ObjectNotFoundException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    private java.lang.Object createProxy(int r7, java.lang.String r8) throws java.lang.Exception {
            r6 = this;
            r0 = r8
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r9 = r0
            r0 = r9
            java.lang.Class<?>[] r1 = javassist.tools.rmi.ObjectImporter.proxyConstructorParamTypes
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            r10 = r0
            r0 = r10
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    public java.lang.Object call(int r6, int r7, java.lang.Object[] r8) throws javassist.tools.rmi.RemoteException {
            r5 = this;
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.servername     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r3 = r5
            int r3 = r3.port     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1.<init>(r2, r3)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r12 = r0
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1 = r0
            r2 = r12
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r13 = r0
            r0 = r13
            r1 = r5
            byte[] r1 = r1.rmiCommand     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0.write(r1)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r13
            r1 = r5
            byte[] r1 = r1.endofline     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0.write(r1)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r13
            r1 = r5
            byte[] r1 = r1.endofline     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0.write(r1)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1 = r0
            r2 = r13
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r14 = r0
            r0 = r14
            r1 = r6
            r0.writeInt(r1)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r14
            r1 = r7
            r0.writeInt(r1)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r5
            r1 = r14
            r2 = r8
            r0.writeParameters(r1, r2)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r14
            r0.flush()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1 = r0
            r2 = r12
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r15 = r0
            r0 = r5
            r1 = r15
            r0.skipHeader(r1)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r1 = r0
            r2 = r15
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r16 = r0
            r0 = r16
            boolean r0 = r0.readBoolean()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L98
            r0 = r16
            java.lang.Object r0 = r0.readObject()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r10 = r0
            goto L9f
        L98:
            r0 = r16
            java.lang.String r0 = r0.readUTF()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r11 = r0
        L9f:
            r0 = r16
            r0.close()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r14
            r0.close()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r12
            r0.close()     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r0 = r10
            boolean r0 = r0 instanceof javassist.tools.rmi.RemoteRef     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            if (r0 == 0) goto Lcd
            r0 = r10
            javassist.tools.rmi.RemoteRef r0 = (javassist.tools.rmi.RemoteRef) r0     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r17 = r0
            r0 = r5
            r1 = r17
            int r1 = r1.oid     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r2 = r17
            java.lang.String r2 = r2.classname     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            java.lang.Object r0 = r0.createProxy(r1, r2)     // Catch: java.lang.ClassNotFoundException -> Ld0 java.io.IOException -> Ldc java.lang.Exception -> Le8
            r10 = r0
        Lcd:
            goto Lf4
        Ld0:
            r12 = move-exception
            javassist.tools.rmi.RemoteException r0 = new javassist.tools.rmi.RemoteException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        Ldc:
            r12 = move-exception
            javassist.tools.rmi.RemoteException r0 = new javassist.tools.rmi.RemoteException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        Le8:
            r12 = move-exception
            javassist.tools.rmi.RemoteException r0 = new javassist.tools.rmi.RemoteException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        Lf4:
            r0 = r9
            if (r0 == 0) goto Lfc
            r0 = r10
            return r0
        Lfc:
            javassist.tools.rmi.RemoteException r0 = new javassist.tools.rmi.RemoteException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
    }

    private void skipHeader(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
        L0:
            r0 = 0
            r5 = r0
        L2:
            r0 = r4
            int r0 = r0.read()
            r1 = r0
            r6 = r1
            if (r0 < 0) goto L17
            r0 = r6
            r1 = 13
            if (r0 == r1) goto L17
            int r5 = r5 + 1
            goto L2
        L17:
            r0 = r4
            int r0 = r0.read()
            r0 = r5
            if (r0 > 0) goto L0
            return
    }

    private void writeParameters(java.io.ObjectOutputStream r6, java.lang.Object[] r7) throws java.io.IOException {
            r5 = this;
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r6
            r1 = r8
            r0.writeInt(r1)
            r0 = 0
            r9 = r0
        Lb:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L47
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            boolean r0 = r0 instanceof javassist.tools.rmi.Proxy
            if (r0 == 0) goto L39
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            javassist.tools.rmi.Proxy r0 = (javassist.tools.rmi.Proxy) r0
            r10 = r0
            r0 = r6
            javassist.tools.rmi.RemoteRef r1 = new javassist.tools.rmi.RemoteRef
            r2 = r1
            r3 = r10
            int r3 = r3._getObjectId()
            r2.<init>(r3)
            r0.writeObject(r1)
            goto L41
        L39:
            r0 = r6
            r1 = r7
            r2 = r9
            r1 = r1[r2]
            r0.writeObject(r1)
        L41:
            int r9 = r9 + 1
            goto Lb
        L47:
            return
    }

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = r0
            r2 = 0
            java.lang.Class<javassist.tools.rmi.ObjectImporter> r3 = javassist.tools.rmi.ObjectImporter.class
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r2] = r3
            javassist.tools.rmi.ObjectImporter.proxyConstructorParamTypes = r0
            return
    }
}
