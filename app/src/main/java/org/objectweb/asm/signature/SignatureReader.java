package org.objectweb.asm.signature;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/signature/SignatureReader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/signature/SignatureReader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/signature/SignatureReader.class */
public class SignatureReader {
    private final java.lang.String a;

    public SignatureReader(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.a = r1
            return
    }

    public void accept(org.objectweb.asm.signature.SignatureVisitor r6) {
            r5 = this;
            r0 = r5
            java.lang.String r0 = r0.a
            r7 = r0
            r0 = r7
            int r0 = r0.length()
            r8 = r0
            r0 = r7
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 60
            if (r0 != r1) goto L88
            r0 = 2
            r9 = r0
        L17:
            r0 = r7
            r1 = 58
            r2 = r9
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = 1
            int r2 = r2 - r3
            r3 = r11
            java.lang.String r1 = r1.substring(r2, r3)
            r0.visitFormalTypeParameter(r1)
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            r1 = 76
            if (r0 == r1) goto L52
            r0 = r10
            r1 = 91
            if (r0 == r1) goto L52
            r0 = r10
            r1 = 84
            if (r0 != r1) goto L5e
        L52:
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitClassBound()
            int r0 = a(r0, r1, r2)
            r9 = r0
        L5e:
            r0 = r7
            r1 = r9
            int r9 = r9 + 1
            char r0 = r0.charAt(r1)
            r1 = r0
            r10 = r1
            r1 = 58
            if (r0 != r1) goto L7e
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitInterfaceBound()
            int r0 = a(r0, r1, r2)
            r9 = r0
            goto L5e
        L7e:
            r0 = r10
            r1 = 62
            if (r0 != r1) goto L17
            goto L8b
        L88:
            r0 = 0
            r9 = r0
        L8b:
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 != r1) goto Ld8
            int r9 = r9 + 1
        L99:
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r1 = 41
            if (r0 == r1) goto Lb3
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitParameterType()
            int r0 = a(r0, r1, r2)
            r9 = r0
            goto L99
        Lb3:
            r0 = r7
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitReturnType()
            int r0 = a(r0, r1, r2)
            r9 = r0
        Lc1:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto Lf9
            r0 = r7
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitExceptionType()
            int r0 = a(r0, r1, r2)
            r9 = r0
            goto Lc1
        Ld8:
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitSuperclass()
            int r0 = a(r0, r1, r2)
            r9 = r0
        Le4:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto Lf9
            r0 = r7
            r1 = r9
            r2 = r6
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitInterface()
            int r0 = a(r0, r1, r2)
            r9 = r0
            goto Le4
        Lf9:
            return
    }

    public void acceptType(org.objectweb.asm.signature.SignatureVisitor r5) {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.a
            r1 = 0
            r2 = r5
            int r0 = a(r0, r1, r2)
            return
    }

    private static int a(java.lang.String r5, int r6, org.objectweb.asm.signature.SignatureVisitor r7) {
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = r0
            r8 = r1
            switch(r0) {
                case 66: goto L80;
                case 67: goto L80;
                case 68: goto L80;
                case 69: goto Laa;
                case 70: goto L80;
                case 71: goto Laa;
                case 72: goto Laa;
                case 73: goto L80;
                case 74: goto L80;
                case 75: goto Laa;
                case 76: goto Laa;
                case 77: goto Laa;
                case 78: goto Laa;
                case 79: goto Laa;
                case 80: goto Laa;
                case 81: goto Laa;
                case 82: goto Laa;
                case 83: goto L80;
                case 84: goto L91;
                case 85: goto Laa;
                case 86: goto L80;
                case 87: goto Laa;
                case 88: goto Laa;
                case 89: goto Laa;
                case 90: goto L80;
                case 91: goto L87;
                default: goto Laa;
            }
        L80:
            r0 = r7
            r1 = r8
            r0.visitBaseType(r1)
            r0 = r6
            return r0
        L87:
            r0 = r5
            r1 = r6
            r2 = r7
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitArrayType()
            int r0 = a(r0, r1, r2)
            return r0
        L91:
            r0 = r5
            r1 = 59
            r2 = r6
            int r0 = r0.indexOf(r1, r2)
            r10 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            r0.visitTypeVariable(r1)
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            return r0
        Laa:
            r0 = r6
            r9 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
        Lb3:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = r0
            r8 = r1
            switch(r0) {
                case 46: goto Le0;
                case 59: goto Le0;
                case 60: goto L11c;
                default: goto L19c;
            }
        Le0:
            r0 = r11
            if (r0 != 0) goto L104
            r0 = r5
            r1 = r9
            r2 = r6
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r12
            if (r0 == 0) goto Lfe
            r0 = r7
            r1 = r13
            r0.visitInnerClassType(r1)
            goto L104
        Lfe:
            r0 = r7
            r1 = r13
            r0.visitClassType(r1)
        L104:
            r0 = r8
            r1 = 59
            if (r0 != r1) goto L110
            r0 = r7
            r0.visitEnd()
            r0 = r6
            return r0
        L110:
            r0 = r6
            r9 = r0
            r0 = 0
            r11 = r0
            r0 = 1
            r12 = r0
            goto L19c
        L11c:
            r0 = r5
            r1 = r9
            r2 = r6
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L135
            r0 = r7
            r1 = r13
            r0.visitInnerClassType(r1)
            goto L13b
        L135:
            r0 = r7
            r1 = r13
            r0.visitClassType(r1)
        L13b:
            r0 = 1
            r11 = r0
        L13e:
            r0 = r5
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = r0
            r8 = r1
            switch(r0) {
                case 42: goto L173;
                case 43: goto L17d;
                case 45: goto L17d;
                case 62: goto L170;
                default: goto L18d;
            }
        L170:
            goto L19c
        L173:
            int r6 = r6 + 1
            r0 = r7
            r0.visitTypeArgument()
            goto L13e
        L17d:
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            r3 = r8
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitTypeArgument(r3)
            int r0 = a(r0, r1, r2)
            r6 = r0
            goto L13e
        L18d:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 61
            org.objectweb.asm.signature.SignatureVisitor r2 = r2.visitTypeArgument(r3)
            int r0 = a(r0, r1, r2)
            r6 = r0
            goto L13e
        L19c:
            goto Lb3
    }
}
