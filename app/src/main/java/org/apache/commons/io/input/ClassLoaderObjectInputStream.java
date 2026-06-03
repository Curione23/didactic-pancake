package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class ClassLoaderObjectInputStream extends java.io.ObjectInputStream {
    private final java.lang.ClassLoader classLoader;

    public ClassLoaderObjectInputStream(java.lang.ClassLoader r1, java.io.InputStream r2) throws java.io.IOException, java.io.StreamCorruptedException {
            r0 = this;
            r0.<init>(r2)
            r0.classLoader = r1
            return
    }

    @Override // java.io.ObjectInputStream
    protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass r4) throws java.io.IOException, java.lang.ClassNotFoundException {
            r3 = this;
            java.lang.String r0 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> Lc
            java.lang.ClassLoader r1 = r3.classLoader     // Catch: java.lang.ClassNotFoundException -> Lc
            r2 = 0
            java.lang.Class r4 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.ClassNotFoundException -> Lc
            return r4
        Lc:
            java.lang.Class r4 = super.resolveClass(r4)
            return r4
    }

    @Override // java.io.ObjectInputStream
    protected java.lang.Class<?> resolveProxyClass(java.lang.String[] r6) throws java.io.IOException, java.lang.ClassNotFoundException {
            r5 = this;
            int r0 = r6.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            r2 = r1
        L5:
            int r3 = r6.length
            if (r2 >= r3) goto L15
            r3 = r6[r2]
            java.lang.ClassLoader r4 = r5.classLoader
            java.lang.Class r3 = java.lang.Class.forName(r3, r1, r4)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L5
        L15:
            java.lang.ClassLoader r1 = r5.classLoader     // Catch: java.lang.IllegalArgumentException -> L1c
            java.lang.Class r6 = java.lang.reflect.Proxy.getProxyClass(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L1c
            return r6
        L1c:
            java.lang.Class r6 = super.resolveProxyClass(r6)
            return r6
    }
}
