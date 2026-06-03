package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/TypePath.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/TypePath.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/TypePath.class */
public class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int WILDCARD_BOUND = 2;
    public static final int TYPE_ARGUMENT = 3;
    byte[] a;
    int b;

    TypePath(byte[] r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.a = r1
            r0 = r3
            r1 = r5
            r0.b = r1
            return
    }

    public int getLength() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.a
            r1 = r3
            int r1 = r1.b
            r0 = r0[r1]
            return r0
    }

    public int getStep(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.a
            r1 = r5
            int r1 = r1.b
            r2 = 2
            r3 = r6
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
    }

    public int getStepArgument(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.a
            r1 = r5
            int r1 = r1.b
            r2 = 2
            r3 = r6
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = 2
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
    }

    public static org.objectweb.asm.TypePath fromString(java.lang.String r5) {
            r0 = r5
            if (r0 == 0) goto Lb
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = r5
            int r0 = r0.length()
            r6 = r0
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = 0
            r8 = r0
        L23:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto Lc3
            r0 = r5
            r1 = r8
            int r8 = r8 + 1
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 91
            if (r0 != r1) goto L43
            r0 = r7
            r1 = 0
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
            goto Lc0
        L43:
            r0 = r9
            r1 = 46
            if (r0 != r1) goto L54
            r0 = r7
            r1 = 1
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
            goto Lc0
        L54:
            r0 = r9
            r1 = 42
            if (r0 != r1) goto L65
            r0 = r7
            r1 = 2
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
            goto Lc0
        L65:
            r0 = r9
            r1 = 48
            if (r0 < r1) goto Lc0
            r0 = r9
            r1 = 57
            if (r0 > r1) goto Lc0
            r0 = r9
            r1 = 48
            int r0 = r0 - r1
            r10 = r0
        L7a:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto La6
            r0 = r5
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = r0
            r9 = r1
            r1 = 48
            if (r0 < r1) goto La6
            r0 = r9
            r1 = 57
            if (r0 > r1) goto La6
            r0 = r10
            r1 = 10
            int r0 = r0 * r1
            r1 = r9
            int r0 = r0 + r1
            r1 = 48
            int r0 = r0 - r1
            r10 = r0
            int r8 = r8 + 1
            goto L7a
        La6:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto Lb8
            r0 = r5
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 != r1) goto Lb8
            int r8 = r8 + 1
        Lb8:
            r0 = r7
            r1 = 3
            r2 = r10
            org.objectweb.asm.ByteVector r0 = r0.a(r1, r2)
        Lc0:
            goto L23
        Lc3:
            r0 = r7
            byte[] r0 = r0.a
            r1 = 0
            r2 = r7
            int r2 = r2.b
            r3 = 2
            int r2 = r2 / r3
            byte r2 = (byte) r2
            r0[r1] = r2
            org.objectweb.asm.TypePath r0 = new org.objectweb.asm.TypePath
            r1 = r0
            r2 = r7
            byte[] r2 = r2.a
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            r0 = r5
            int r0 = r0.getLength()
            r6 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r2 = r6
            r3 = 2
            int r2 = r2 * r3
            r1.<init>(r2)
            r7 = r0
            r0 = 0
            r8 = r0
        L12:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L79
            r0 = r5
            r1 = r8
            int r0 = r0.getStep(r1)
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L46;
                case 2: goto L50;
                case 3: goto L5a;
                default: goto L6c;
            }
        L3c:
            r0 = r7
            r1 = 91
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L73
        L46:
            r0 = r7
            r1 = 46
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L73
        L50:
            r0 = r7
            r1 = 42
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L73
        L5a:
            r0 = r7
            r1 = r5
            r2 = r8
            int r1 = r1.getStepArgument(r2)
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L73
        L6c:
            r0 = r7
            r1 = 95
            java.lang.StringBuffer r0 = r0.append(r1)
        L73:
            int r8 = r8 + 1
            goto L12
        L79:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }
}
