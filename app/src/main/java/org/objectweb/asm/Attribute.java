package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Attribute.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/Attribute.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Attribute.class */
public class Attribute {
    public final java.lang.String type;
    byte[] b;
    org.objectweb.asm.Attribute a;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/Attribute$Set.class */
    static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private int size;
        private org.objectweb.asm.Attribute[] data;

        Set() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 6
                org.objectweb.asm.Attribute[] r1 = new org.objectweb.asm.Attribute[r1]
                r0.data = r1
                return
        }

        void addAttributes(org.objectweb.asm.Attribute r4) {
                r3 = this;
                r0 = r4
                r5 = r0
            L2:
                r0 = r5
                if (r0 == 0) goto L1b
                r0 = r3
                r1 = r5
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L13
                r0 = r3
                r1 = r5
                r0.add(r1)
            L13:
                r0 = r5
                org.objectweb.asm.Attribute r0 = r0.nextAttribute
                r5 = r0
                goto L2
            L1b:
                return
        }

        org.objectweb.asm.Attribute[] toArray() {
                r6 = this;
                r0 = r6
                int r0 = r0.size
                org.objectweb.asm.Attribute[] r0 = new org.objectweb.asm.Attribute[r0]
                r7 = r0
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = 0
                r2 = r7
                r3 = 0
                r4 = r6
                int r4 = r4.size
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r7
                return r0
        }

        private boolean contains(org.objectweb.asm.Attribute r4) {
                r3 = this;
                r0 = 0
                r5 = r0
            L2:
                r0 = r5
                r1 = r3
                int r1 = r1.size
                if (r0 >= r1) goto L25
                r0 = r3
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = r5
                r0 = r0[r1]
                java.lang.String r0 = r0.type
                r1 = r4
                java.lang.String r1 = r1.type
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1f
                r0 = 1
                return r0
            L1f:
                int r5 = r5 + 1
                goto L2
            L25:
                r0 = 0
                return r0
        }

        private void add(org.objectweb.asm.Attribute r7) {
                r6 = this;
                r0 = r6
                int r0 = r0.size
                r1 = r6
                org.objectweb.asm.Attribute[] r1 = r1.data
                int r1 = r1.length
                if (r0 < r1) goto L2b
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                int r0 = r0.length
                r1 = 6
                int r0 = r0 + r1
                org.objectweb.asm.Attribute[] r0 = new org.objectweb.asm.Attribute[r0]
                r8 = r0
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = 0
                r2 = r8
                r3 = 0
                r4 = r6
                int r4 = r4.size
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r6
                r1 = r8
                r0.data = r1
            L2b:
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = r6
                r2 = r1
                int r2 = r2.size
                r3 = r2; r2 = r1; r1 = r3; 
                r4 = 1
                int r3 = r3 + r4
                r2.size = r3
                r2 = r7
                r0[r1] = r2
                return
        }
    }

    protected Attribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.type = r1
            return
    }

    public boolean isUnknown() {
            r2 = this;
            r0 = 1
            return r0
    }

    public boolean isCodeAttribute() {
            r2 = this;
            r0 = 0
            return r0
    }

    protected org.objectweb.asm.Label[] getLabels() {
            r2 = this;
            r0 = 0
            return r0
    }

    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r7, int r8, int r9, char[] r10, int r11, org.objectweb.asm.Label[] r12) {
            r6 = this;
            org.objectweb.asm.Attribute r0 = new org.objectweb.asm.Attribute
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.type
            r1.<init>(r2)
            r13 = r0
            r0 = r13
            r1 = r9
            byte[] r1 = new byte[r1]
            r0.b = r1
            r0 = r7
            byte[] r0 = r0.b
            r1 = r8
            r2 = r13
            byte[] r2 = r2.b
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r13
            return r0
    }

    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter r4, byte[] r5, int r6, int r7, int r8) {
            r3 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r3
            byte[] r1 = r1.b
            r0.a = r1
            r0 = r9
            r1 = r3
            byte[] r1 = r1.b
            int r1 = r1.length
            r0.b = r1
            r0 = r9
            return r0
    }

    final int a() {
            r2 = this;
            r0 = 0
            r3 = r0
            r0 = r2
            r4 = r0
        L4:
            r0 = r4
            if (r0 == 0) goto L13
            int r3 = r3 + 1
            r0 = r4
            org.objectweb.asm.Attribute r0 = r0.a
            r4 = r0
            goto L4
        L13:
            r0 = r3
            return r0
    }

    final int a(org.objectweb.asm.ClassWriter r9, byte[] r10, int r11, int r12, int r13) {
            r8 = this;
            r0 = r8
            r14 = r0
            r0 = 0
            r15 = r0
        L6:
            r0 = r14
            if (r0 == 0) goto L36
            r0 = r9
            r1 = r14
            java.lang.String r1 = r1.type
            int r0 = r0.newUTF8(r1)
            r0 = r15
            r1 = r14
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            org.objectweb.asm.ByteVector r1 = r1.write(r2, r3, r4, r5, r6)
            int r1 = r1.b
            r2 = 6
            int r1 = r1 + r2
            int r0 = r0 + r1
            r15 = r0
            r0 = r14
            org.objectweb.asm.Attribute r0 = r0.a
            r14 = r0
            goto L6
        L36:
            r0 = r15
            return r0
    }

    final void a(org.objectweb.asm.ClassWriter r8, byte[] r9, int r10, int r11, int r12, org.objectweb.asm.ByteVector r13) {
            r7 = this;
            r0 = r7
            r14 = r0
        L3:
            r0 = r14
            if (r0 == 0) goto L48
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.ByteVector r0 = r0.write(r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r13
            r1 = r8
            r2 = r14
            java.lang.String r2 = r2.type
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r15
            int r1 = r1.b
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r13
            r1 = r15
            byte[] r1 = r1.a
            r2 = 0
            r3 = r15
            int r3 = r3.b
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r14
            org.objectweb.asm.Attribute r0 = r0.a
            r14 = r0
            goto L3
        L48:
            return
    }
}
