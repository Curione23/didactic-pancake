package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/LocalVariableTypeAttribute.class */
public class LocalVariableTypeAttribute extends javassist.bytecode.LocalVariableAttribute {
    public static final java.lang.String tag = "LocalVariableTypeTable";

    public LocalVariableTypeAttribute(javassist.bytecode.ConstPool r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "LocalVariableTypeTable"
            r3 = 2
            byte[] r3 = new byte[r3]
            r0.<init>(r1, r2, r3)
            r0 = 0
            r1 = r5
            byte[] r1 = r1.info
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    LocalVariableTypeAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    private LocalVariableTypeAttribute(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "LocalVariableTypeTable"
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // javassist.bytecode.LocalVariableAttribute
    java.lang.String renameEntry(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r0 = javassist.bytecode.SignatureAttribute.renameClass(r0, r1, r2)
            return r0
    }

    @Override // javassist.bytecode.LocalVariableAttribute
    java.lang.String renameEntry(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            java.lang.String r0 = javassist.bytecode.SignatureAttribute.renameClass(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.LocalVariableAttribute
    javassist.bytecode.LocalVariableAttribute makeThisAttr(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            javassist.bytecode.LocalVariableTypeAttribute r0 = new javassist.bytecode.LocalVariableTypeAttribute
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }
}
