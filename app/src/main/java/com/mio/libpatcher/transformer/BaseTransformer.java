package com.mio.libpatcher.transformer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:com/mio/libpatcher/transformer/BaseTransformer.class */
public interface BaseTransformer extends java.lang.instrument.ClassFileTransformer {
    public static final javassist.ClassPool pool = null;

    java.lang.String getTargetClassName();

    default java.util.List<java.lang.String> getTargetClassNames() {
            r2 = this;
            r0 = 0
            return r0
    }

    void transform(javassist.CtClass r1) throws java.lang.Throwable;

    default byte[] transform(java.lang.ClassLoader r6, java.lang.String r7, java.lang.Class<?> r8, java.security.ProtectionDomain r9, byte[] r10) throws java.lang.instrument.IllegalClassFormatException {
            r5 = this;
            r0 = r5
            java.lang.String r0 = r0.getTargetClassName()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "."
            java.lang.String r2 = "/"
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L9e
            r1 = r7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L9e
            r11 = r0
            r0 = r5
            java.util.List r0 = r0.getTargetClassNames()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L58
            r0 = r5
            java.util.List r0 = r0.getTargetClassNames()     // Catch: java.lang.Throwable -> L9e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9e
            r12 = r0
        L29:
            r0 = r12
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L58
            r0 = r12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9e
            r13 = r0
            r0 = r13
            java.lang.String r1 = "."
            java.lang.String r2 = "/"
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L9e
            r1 = r7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L55
            r0 = 1
            r11 = r0
            goto L58
        L55:
            goto L29
        L58:
            r0 = r11
            if (r0 == 0) goto L9b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "Patch target class: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L9e
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9e
            com.mio.libpatcher.util.LogUtil.info(r0)     // Catch: java.lang.Throwable -> L9e
            javassist.ClassPool r0 = com.mio.libpatcher.transformer.BaseTransformer.pool     // Catch: java.lang.Throwable -> L9e
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L9e
            r2 = r1
            r3 = r10
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9e
            javassist.CtClass r0 = r0.makeClass(r1)     // Catch: java.lang.Throwable -> L9e
            r12 = r0
            r0 = r5
            r1 = r12
            r0.transform(r1)     // Catch: java.lang.Throwable -> L9e
            r0 = r12
            byte[] r0 = r0.toBytecode()     // Catch: java.lang.Throwable -> L9e
            r13 = r0
            r0 = r12
            r0.detach()     // Catch: java.lang.Throwable -> L9e
            r0 = r13
            return r0
        L9b:
            goto La8
        L9e:
            r11 = move-exception
            r0 = r11
            java.lang.String r0 = r0.toString()
            com.mio.libpatcher.util.LogUtil.error(r0)
        La8:
            r0 = r10
            return r0
    }

    static {
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()
            com.mio.libpatcher.transformer.BaseTransformer.pool = r0
            return
    }
}
