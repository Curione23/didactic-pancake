package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/BootstrapMethodsAttribute.class */
public class BootstrapMethodsAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "BootstrapMethods";

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/BootstrapMethodsAttribute$BootstrapMethod.class */
    public static class BootstrapMethod {
        public int methodRef;
        public int[] arguments;

        public BootstrapMethod(int r4, int[] r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.methodRef = r1
                r0 = r3
                r1 = r5
                r0.arguments = r1
                return
        }
    }

    BootstrapMethodsAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public BootstrapMethodsAttribute(javassist.bytecode.ConstPool r6, javassist.bytecode.BootstrapMethodsAttribute.BootstrapMethod[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "BootstrapMethods"
            r0.<init>(r1, r2)
            r0 = 2
            r8 = r0
            r0 = 0
            r9 = r0
        Lc:
            r0 = r9
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L28
            r0 = r8
            r1 = 4
            r2 = r7
            r3 = r9
            r2 = r2[r3]
            int[] r2 = r2.arguments
            int r2 = r2.length
            r3 = 2
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r8 = r0
            int r9 = r9 + 1
            goto Lc
        L28:
            r0 = r8
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r7
            int r0 = r0.length
            r1 = r9
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = 2
            r10 = r0
            r0 = 0
            r11 = r0
        L3b:
            r0 = r11
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L93
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            int r0 = r0.methodRef
            r1 = r9
            r2 = r10
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            int[] r0 = r0.arguments
            int r0 = r0.length
            r1 = r9
            r2 = r10
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            int[] r0 = r0.arguments
            r12 = r0
            int r10 = r10 + 4
            r0 = 0
            r13 = r0
        L70:
            r0 = r13
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L8d
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            r1 = r9
            r2 = r10
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r10 = r10 + 2
            int r13 = r13 + 1
            goto L70
        L8d:
            int r11 = r11 + 1
            goto L3b
        L93:
            r0 = r5
            r1 = r9
            r0.set(r1)
            return
    }

    public javassist.bytecode.BootstrapMethodsAttribute.BootstrapMethod[] getMethods() {
            r7 = this;
            r0 = r7
            byte[] r0 = r0.get()
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r9 = r0
            r0 = r9
            javassist.bytecode.BootstrapMethodsAttribute$BootstrapMethod[] r0 = new javassist.bytecode.BootstrapMethodsAttribute.BootstrapMethod[r0]
            r10 = r0
            r0 = 2
            r11 = r0
            r0 = 0
            r12 = r0
        L16:
            r0 = r12
            r1 = r9
            if (r0 >= r1) goto L6a
            r0 = r8
            r1 = r11
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r13 = r0
            r0 = r8
            r1 = r11
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r14 = r0
            r0 = r14
            int[] r0 = new int[r0]
            r15 = r0
            int r11 = r11 + 4
            r0 = 0
            r16 = r0
        L3a:
            r0 = r16
            r1 = r14
            if (r0 >= r1) goto L55
            r0 = r15
            r1 = r16
            r2 = r8
            r3 = r11
            int r2 = javassist.bytecode.ByteArray.readU16bit(r2, r3)
            r0[r1] = r2
            int r11 = r11 + 2
            int r16 = r16 + 1
            goto L3a
        L55:
            r0 = r10
            r1 = r12
            javassist.bytecode.BootstrapMethodsAttribute$BootstrapMethod r2 = new javassist.bytecode.BootstrapMethodsAttribute$BootstrapMethod
            r3 = r2
            r4 = r13
            r5 = r15
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r12 = r12 + 1
            goto L16
        L6a:
            r0 = r10
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.BootstrapMethodsAttribute$BootstrapMethod[] r0 = r0.getMethods()
            r10 = r0
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r11 = r0
            r0 = 0
            r12 = r0
        Le:
            r0 = r12
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L5d
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            r1 = r11
            r2 = r13
            int r2 = r2.methodRef
            r3 = r8
            r4 = r9
            int r1 = r1.copy(r2, r3, r4)
            r0.methodRef = r1
            r0 = 0
            r14 = r0
        L2f:
            r0 = r14
            r1 = r13
            int[] r1 = r1.arguments
            int r1 = r1.length
            if (r0 >= r1) goto L57
            r0 = r13
            int[] r0 = r0.arguments
            r1 = r14
            r2 = r11
            r3 = r13
            int[] r3 = r3.arguments
            r4 = r14
            r3 = r3[r4]
            r4 = r8
            r5 = r9
            int r2 = r2.copy(r3, r4, r5)
            r0[r1] = r2
            int r14 = r14 + 1
            goto L2f
        L57:
            int r12 = r12 + 1
            goto Le
        L5d:
            javassist.bytecode.BootstrapMethodsAttribute r0 = new javassist.bytecode.BootstrapMethodsAttribute
            r1 = r0
            r2 = r8
            r3 = r10
            r1.<init>(r2, r3)
            return r0
    }
}
