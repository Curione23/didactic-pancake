package com.movtery.optifine_renamer.optifine;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:com/movtery/optifine_renamer/optifine/ChangeClassTransformer.class */
public class ChangeClassTransformer implements java.lang.instrument.ClassFileTransformer {
    private final java.lang.String versionName;


    public ChangeClassTransformer(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.versionName = r1
            return
    }

    public byte[] transform(java.lang.ClassLoader r7, java.lang.String r8, java.lang.Class<?> r9, java.security.ProtectionDomain r10, byte[] r11) {
            r6 = this;
            java.lang.String r0 = "optifine/Installer"
            r1 = r8
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L3a
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r12 = r0
            org.objectweb.asm.ClassWriter r0 = new org.objectweb.asm.ClassWriter
            r1 = r0
            r2 = 2
            r1.<init>(r2)
            r13 = r0
            com.movtery.optifine_renamer.optifine.ChangeClassTransformer$1 r0 = new com.movtery.optifine_renamer.optifine.ChangeClassTransformer$1
            r1 = r0
            r2 = r6
            r3 = 589824(0x90000, float:8.2652E-40)
            r4 = r13
            r1.<init>(r2, r3, r4)
            r14 = r0
            r0 = r12
            r1 = r14
            r2 = 0
            r0.accept(r1, r2)
            r0 = r13
            byte[] r0 = r0.toByteArray()
            return r0
        L3a:
            r0 = r11
            return r0
    }

    static /* synthetic */ java.lang.String access$000(com.movtery.optifine_renamer.optifine.ChangeClassTransformer r2) {
            r0 = r2
            java.lang.String r0 = r0.versionName
            return r0
    }
}
