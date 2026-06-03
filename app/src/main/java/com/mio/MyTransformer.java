package com.mio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:com/mio/MyTransformer.class */
public class MyTransformer implements java.lang.instrument.ClassFileTransformer {


    public MyTransformer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public byte[] transform(java.lang.ClassLoader r7, java.lang.String r8, java.lang.Class<?> r9, java.security.ProtectionDomain r10, byte[] r11) throws java.lang.instrument.IllegalClassFormatException {
            r6 = this;
            r0 = r8
            java.lang.String r1 = "net/fabricmc/installer/client/ClientInstaller"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "正在尝试修改profileName"
            r0.println(r1)     // Catch: java.lang.Throwable -> L60
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader     // Catch: java.lang.Throwable -> L60
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r12 = r0
            org.objectweb.asm.ClassWriter r0 = new org.objectweb.asm.ClassWriter     // Catch: java.lang.Throwable -> L60
            r1 = r0
            r2 = r12
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L60
            r13 = r0
            com.mio.MyTransformer$1 r0 = new com.mio.MyTransformer$1     // Catch: java.lang.Throwable -> L60
            r1 = r0
            r2 = r6
            r3 = 327680(0x50000, float:4.59177E-40)
            r4 = r13
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L60
            r14 = r0
            r0 = r12
            r1 = r14
            r2 = 0
            r0.accept(r1, r2)     // Catch: java.lang.Throwable -> L60
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "profileName修改为:"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "profileName"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L60
            r0.println(r1)     // Catch: java.lang.Throwable -> L60
            r0 = r13
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L60
            return r0
        L60:
            r12 = move-exception
            r0 = r12
            r0.printStackTrace()
        L67:
            r0 = r11
            return r0
    }
}
