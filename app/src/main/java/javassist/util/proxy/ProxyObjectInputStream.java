package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/ProxyObjectInputStream.class */
public class ProxyObjectInputStream extends java.io.ObjectInputStream {
    private java.lang.ClassLoader loader;

    public ProxyObjectInputStream(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r1.getContextClassLoader()
            r0.loader = r1
            r0 = r3
            java.lang.ClassLoader r0 = r0.loader
            if (r0 != 0) goto L1d
            r0 = r3
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
            r0.loader = r1
        L1d:
            return
    }

    public void setClassLoader(java.lang.ClassLoader r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = r4
            r0.loader = r1
            goto L10
        Lc:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
            r4 = r0
        L10:
            return
    }

    @Override // java.io.ObjectInputStream
    protected java.io.ObjectStreamClass readClassDescriptor() throws java.io.IOException, java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            boolean r0 = r0.readBoolean()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L90
            r0 = r5
            java.lang.Object r0 = r0.readObject()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r5
            java.lang.ClassLoader r0 = r0.loader
            r1 = r7
            java.lang.Class r0 = r0.loadClass(r1)
            r8 = r0
            r0 = r5
            int r0 = r0.readInt()
            r9 = r0
            r0 = r9
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        L2a:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L4c
            r0 = r5
            java.lang.Object r0 = r0.readObject()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r10
            r1 = r11
            r2 = r5
            java.lang.ClassLoader r2 = r2.loader
            r3 = r7
            java.lang.Class r2 = r2.loadClass(r3)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L2a
        L4c:
            r0 = r5
            int r0 = r0.readInt()
            r9 = r0
            r0 = r9
            byte[] r0 = new byte[r0]
            r11 = r0
            r0 = r5
            r1 = r11
            int r0 = r0.read(r1)
            javassist.util.proxy.ProxyFactory r0 = new javassist.util.proxy.ProxyFactory
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = 1
            r0.setUseCache(r1)
            r0 = r12
            r1 = 0
            r0.setUseWriteReplace(r1)
            r0 = r12
            r1 = r8
            r0.setSuperclass(r1)
            r0 = r12
            r1 = r10
            r0.setInterfaces(r1)
            r0 = r12
            r1 = r11
            java.lang.Class r0 = r0.createClass(r1)
            r13 = r0
            r0 = r13
            java.io.ObjectStreamClass r0 = java.io.ObjectStreamClass.lookup(r0)
            return r0
        L90:
            r0 = r5
            java.io.ObjectStreamClass r0 = super.readClassDescriptor()
            return r0
    }
}
