package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyObjectOutputStream.class */
public class ProxyObjectOutputStream extends java.io.ObjectOutputStream {
    public ProxyObjectOutputStream(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // java.io.ObjectOutputStream
    protected void writeClassDescriptor(java.io.ObjectStreamClass r5) throws java.io.IOException {
            r4 = this;
            r0 = r5
            java.lang.Class r0 = r0.forClass()
            r6 = r0
            r0 = r6
            boolean r0 = javassist.util.proxy.ProxyFactory.isProxyClass(r0)
            if (r0 == 0) goto L7d
            r0 = r4
            r1 = 1
            r0.writeBoolean(r1)
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            r7 = r0
            r0 = r6
            java.lang.Class[] r0 = r0.getInterfaces()
            r8 = r0
            r0 = r6
            byte[] r0 = javassist.util.proxy.ProxyFactory.getFilterSignature(r0)
            r9 = r0
            r0 = r7
            java.lang.String r0 = r0.getName()
            r10 = r0
            r0 = r4
            r1 = r10
            r0.writeObject(r1)
            r0 = r4
            r1 = r8
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0.writeInt(r1)
            r0 = 0
            r11 = r0
        L3a:
            r0 = r11
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L6d
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            java.lang.Class<javassist.util.proxy.ProxyObject> r1 = javassist.util.proxy.ProxyObject.class
            if (r0 == r1) goto L67
            r0 = r12
            java.lang.Class<javassist.util.proxy.Proxy> r1 = javassist.util.proxy.Proxy.class
            if (r0 == r1) goto L67
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r10 = r0
            r0 = r4
            r1 = r10
            r0.writeObject(r1)
        L67:
            int r11 = r11 + 1
            goto L3a
        L6d:
            r0 = r4
            r1 = r9
            int r1 = r1.length
            r0.writeInt(r1)
            r0 = r4
            r1 = r9
            r0.write(r1)
            goto L87
        L7d:
            r0 = r4
            r1 = 0
            r0.writeBoolean(r1)
            r0 = r4
            r1 = r5
            super.writeClassDescriptor(r1)
        L87:
            return
    }
}
