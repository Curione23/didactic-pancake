package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Type.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/Type.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Type.class */
public class Type {
    public static final int VOID = 0;
    public static final int BOOLEAN = 1;
    public static final int CHAR = 2;
    public static final int BYTE = 3;
    public static final int SHORT = 4;
    public static final int INT = 5;
    public static final int FLOAT = 6;
    public static final int LONG = 7;
    public static final int DOUBLE = 8;
    public static final int ARRAY = 9;
    public static final int OBJECT = 10;
    public static final int METHOD = 11;
    public static final org.objectweb.asm.Type VOID_TYPE = null;
    public static final org.objectweb.asm.Type BOOLEAN_TYPE = null;
    public static final org.objectweb.asm.Type CHAR_TYPE = null;
    public static final org.objectweb.asm.Type BYTE_TYPE = null;
    public static final org.objectweb.asm.Type SHORT_TYPE = null;
    public static final org.objectweb.asm.Type INT_TYPE = null;
    public static final org.objectweb.asm.Type FLOAT_TYPE = null;
    public static final org.objectweb.asm.Type LONG_TYPE = null;
    public static final org.objectweb.asm.Type DOUBLE_TYPE = null;
    private final int a;
    private final char[] b;
    private final int c;
    private final int d;

    private Type(int r4, char[] r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.a = r1
            r0 = r3
            r1 = r5
            r0.b = r1
            r0 = r3
            r1 = r6
            r0.c = r1
            r0 = r3
            r1 = r7
            r0.d = r1
            return
    }

    public static org.objectweb.asm.Type getType(java.lang.String r3) {
            r0 = r3
            char[] r0 = r0.toCharArray()
            r1 = 0
            org.objectweb.asm.Type r0 = a(r0, r1)
            return r0
    }

    public static org.objectweb.asm.Type getObjectType(java.lang.String r7) {
            r0 = r7
            char[] r0 = r0.toCharArray()
            r8 = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = r8
            r3 = 0
            char r2 = r2[r3]
            r3 = 91
            if (r2 != r3) goto L16
            r2 = 9
            goto L18
        L16:
            r2 = 10
        L18:
            r3 = r8
            r4 = 0
            r5 = r8
            int r5 = r5.length
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static org.objectweb.asm.Type getMethodType(java.lang.String r3) {
            r0 = r3
            char[] r0 = r0.toCharArray()
            r1 = 0
            org.objectweb.asm.Type r0 = a(r0, r1)
            return r0
    }

    public static org.objectweb.asm.Type getMethodType(org.objectweb.asm.Type r3, org.objectweb.asm.Type... r4) {
            r0 = r3
            r1 = r4
            java.lang.String r0 = getMethodDescriptor(r0, r1)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public static org.objectweb.asm.Type getType(java.lang.Class r3) {
            r0 = r3
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L63
            r0 = r3
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L12
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            return r0
        L12:
            r0 = r3
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L1d
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.VOID_TYPE
            return r0
        L1d:
            r0 = r3
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L28
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BOOLEAN_TYPE
            return r0
        L28:
            r0 = r3
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L33
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BYTE_TYPE
            return r0
        L33:
            r0 = r3
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L3e
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.CHAR_TYPE
            return r0
        L3e:
            r0 = r3
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L49
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.SHORT_TYPE
            return r0
        L49:
            r0 = r3
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L54
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            return r0
        L54:
            r0 = r3
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L5f
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            return r0
        L5f:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            return r0
        L63:
            r0 = r3
            java.lang.String r0 = getDescriptor(r0)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public static org.objectweb.asm.Type getType(java.lang.reflect.Constructor r2) {
            r0 = r2
            java.lang.String r0 = getConstructorDescriptor(r0)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public static org.objectweb.asm.Type getType(java.lang.reflect.Method r2) {
            r0 = r2
            java.lang.String r0 = getMethodDescriptor(r0)
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public static org.objectweb.asm.Type[] getArgumentTypes(java.lang.String r5) {
            r0 = r5
            char[] r0 = r0.toCharArray()
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = 0
            r8 = r0
        L9:
            r0 = r6
            r1 = r7
            int r7 = r7 + 1
            char r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = 41
            if (r0 != r1) goto L1b
            goto L43
        L1b:
            r0 = r9
            r1 = 76
            if (r0 != r1) goto L36
        L22:
            r0 = r6
            r1 = r7
            int r7 = r7 + 1
            char r0 = r0[r1]
            r1 = 59
            if (r0 == r1) goto L30
            goto L22
        L30:
            int r8 = r8 + 1
            goto L40
        L36:
            r0 = r9
            r1 = 91
            if (r0 == r1) goto L40
            int r8 = r8 + 1
        L40:
            goto L9
        L43:
            r0 = r8
            org.objectweb.asm.Type[] r0 = new org.objectweb.asm.Type[r0]
            r9 = r0
            r0 = 1
            r7 = r0
            r0 = 0
            r8 = r0
        L4d:
            r0 = r6
            r1 = r7
            char r0 = r0[r1]
            r1 = 41
            if (r0 == r1) goto L80
            r0 = r9
            r1 = r8
            r2 = r6
            r3 = r7
            org.objectweb.asm.Type r2 = a(r2, r3)
            r0[r1] = r2
            r0 = r7
            r1 = r9
            r2 = r8
            r1 = r1[r2]
            int r1 = r1.d
            r2 = r9
            r3 = r8
            r2 = r2[r3]
            int r2 = r2.a
            r3 = 10
            if (r2 != r3) goto L76
            r2 = 2
            goto L77
        L76:
            r2 = 0
        L77:
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7 = r0
            int r8 = r8 + 1
            goto L4d
        L80:
            r0 = r9
            return r0
    }

    public static org.objectweb.asm.Type[] getArgumentTypes(java.lang.reflect.Method r5) {
            r0 = r5
            java.lang.Class[] r0 = r0.getParameterTypes()
            r6 = r0
            r0 = r6
            int r0 = r0.length
            org.objectweb.asm.Type[] r0 = new org.objectweb.asm.Type[r0]
            r7 = r0
            r0 = r6
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
        L10:
            r0 = r8
            if (r0 < 0) goto L23
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r8
            r2 = r2[r3]
            org.objectweb.asm.Type r2 = getType(r2)
            r0[r1] = r2
            int r8 = r8 + (-1)
            goto L10
        L23:
            r0 = r7
            return r0
    }

    public static org.objectweb.asm.Type getReturnType(java.lang.String r4) {
            r0 = r4
            char[] r0 = r0.toCharArray()
            r5 = r0
            r0 = r5
            r1 = r4
            r2 = 41
            int r1 = r1.indexOf(r2)
            r2 = 1
            int r1 = r1 + r2
            org.objectweb.asm.Type r0 = a(r0, r1)
            return r0
    }

    public static org.objectweb.asm.Type getReturnType(java.lang.reflect.Method r2) {
            r0 = r2
            java.lang.Class r0 = r0.getReturnType()
            org.objectweb.asm.Type r0 = getType(r0)
            return r0
    }

    public static int getArgumentsAndReturnSizes(java.lang.String r4) {
            r0 = 1
            r5 = r0
            r0 = 1
            r6 = r0
        L4:
            r0 = r4
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 41
            if (r0 != r1) goto L39
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r5
            r1 = 2
            int r0 = r0 << r1
            r1 = r7
            r2 = 86
            if (r1 != r2) goto L26
            r1 = 0
            goto L37
        L26:
            r1 = r7
            r2 = 68
            if (r1 == r2) goto L32
            r1 = r7
            r2 = 74
            if (r1 != r2) goto L36
        L32:
            r1 = 2
            goto L37
        L36:
            r1 = 1
        L37:
            r0 = r0 | r1
            return r0
        L39:
            r0 = r7
            r1 = 76
            if (r0 != r1) goto L55
        L3f:
            r0 = r4
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 == r1) goto L4f
            goto L3f
        L4f:
            int r5 = r5 + 1
            goto L94
        L55:
            r0 = r7
            r1 = 91
            if (r0 != r1) goto L7f
        L5b:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = r0
            r7 = r1
            r1 = 91
            if (r0 != r1) goto L6d
            int r6 = r6 + 1
            goto L5b
        L6d:
            r0 = r7
            r1 = 68
            if (r0 == r1) goto L79
            r0 = r7
            r1 = 74
            if (r0 != r1) goto L94
        L79:
            int r5 = r5 + (-1)
            goto L94
        L7f:
            r0 = r7
            r1 = 68
            if (r0 == r1) goto L8b
            r0 = r7
            r1 = 74
            if (r0 != r1) goto L91
        L8b:
            int r5 = r5 + 2
            goto L94
        L91:
            int r5 = r5 + 1
        L94:
            goto L4
    }

    private static org.objectweb.asm.Type a(char[] r8, int r9) {
            r0 = r8
            r1 = r9
            char r0 = r0[r1]
            switch(r0) {
                case 66: goto L84;
                case 67: goto L80;
                case 68: goto L98;
                case 69: goto Lfd;
                case 70: goto L90;
                case 71: goto Lfd;
                case 72: goto Lfd;
                case 73: goto L8c;
                case 74: goto L94;
                case 75: goto Lfd;
                case 76: goto Lda;
                case 77: goto Lfd;
                case 78: goto Lfd;
                case 79: goto Lfd;
                case 80: goto Lfd;
                case 81: goto Lfd;
                case 82: goto Lfd;
                case 83: goto L88;
                case 84: goto Lfd;
                case 85: goto Lfd;
                case 86: goto L78;
                case 87: goto Lfd;
                case 88: goto Lfd;
                case 89: goto Lfd;
                case 90: goto L7c;
                case 91: goto L9c;
                default: goto Lfd;
            }
        L78:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.VOID_TYPE
            return r0
        L7c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BOOLEAN_TYPE
            return r0
        L80:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.CHAR_TYPE
            return r0
        L84:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.BYTE_TYPE
            return r0
        L88:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.SHORT_TYPE
            return r0
        L8c:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.INT_TYPE
            return r0
        L90:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.FLOAT_TYPE
            return r0
        L94:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.LONG_TYPE
            return r0
        L98:
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.DOUBLE_TYPE
            return r0
        L9c:
            r0 = 1
            r10 = r0
        L9e:
            r0 = r8
            r1 = r9
            r2 = r10
            int r1 = r1 + r2
            char r0 = r0[r1]
            r1 = 91
            if (r0 != r1) goto Lae
            int r10 = r10 + 1
            goto L9e
        Lae:
            r0 = r8
            r1 = r9
            r2 = r10
            int r1 = r1 + r2
            char r0 = r0[r1]
            r1 = 76
            if (r0 != r1) goto Lcb
            int r10 = r10 + 1
        Lbb:
            r0 = r8
            r1 = r9
            r2 = r10
            int r1 = r1 + r2
            char r0 = r0[r1]
            r1 = 59
            if (r0 == r1) goto Lcb
            int r10 = r10 + 1
            goto Lbb
        Lcb:
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 9
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = 1
            int r5 = r5 + r6
            r1.<init>(r2, r3, r4, r5)
            return r0
        Lda:
            r0 = 1
            r10 = r0
        Ldc:
            r0 = r8
            r1 = r9
            r2 = r10
            int r1 = r1 + r2
            char r0 = r0[r1]
            r1 = 59
            if (r0 == r1) goto Lec
            int r10 = r10 + 1
            goto Ldc
        Lec:
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 10
            r3 = r8
            r4 = r9
            r5 = 1
            int r4 = r4 + r5
            r5 = r10
            r6 = 1
            int r5 = r5 - r6
            r1.<init>(r2, r3, r4, r5)
            return r0
        Lfd:
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 11
            r3 = r8
            r4 = r9
            r5 = r8
            int r5 = r5.length
            r6 = r9
            int r5 = r5 - r6
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public int getSort() {
            r2 = this;
            r0 = r2
            int r0 = r0.a
            return r0
    }

    public int getDimensions() {
            r4 = this;
            r0 = 1
            r5 = r0
        L2:
            r0 = r4
            char[] r0 = r0.b
            r1 = r4
            int r1 = r1.c
            r2 = r5
            int r1 = r1 + r2
            char r0 = r0[r1]
            r1 = 91
            if (r0 != r1) goto L18
            int r5 = r5 + 1
            goto L2
        L18:
            r0 = r5
            return r0
    }

    public org.objectweb.asm.Type getElementType() {
            r4 = this;
            r0 = r4
            char[] r0 = r0.b
            r1 = r4
            int r1 = r1.c
            r2 = r4
            int r2 = r2.getDimensions()
            int r1 = r1 + r2
            org.objectweb.asm.Type r0 = a(r0, r1)
            return r0
    }

    public java.lang.String getClassName() {
            r6 = this;
            r0 = r6
            int r0 = r0.a
            switch(r0) {
                case 0: goto L40;
                case 1: goto L43;
                case 2: goto L46;
                case 3: goto L49;
                case 4: goto L4c;
                case 5: goto L4f;
                case 6: goto L52;
                case 7: goto L55;
                case 8: goto L58;
                case 9: goto L5b;
                case 10: goto L85;
                default: goto La0;
            }
        L40:
            java.lang.String r0 = "void"
            return r0
        L43:
            java.lang.String r0 = "boolean"
            return r0
        L46:
            java.lang.String r0 = "char"
            return r0
        L49:
            java.lang.String r0 = "byte"
            return r0
        L4c:
            java.lang.String r0 = "short"
            return r0
        L4f:
            java.lang.String r0 = "int"
            return r0
        L52:
            java.lang.String r0 = "float"
            return r0
        L55:
            java.lang.String r0 = "long"
            return r0
        L58:
            java.lang.String r0 = "double"
            return r0
        L5b:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r2 = r6
            org.objectweb.asm.Type r2 = r2.getElementType()
            java.lang.String r2 = r2.getClassName()
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            int r0 = r0.getDimensions()
            r8 = r0
        L6f:
            r0 = r8
            if (r0 <= 0) goto L80
            r0 = r7
            java.lang.String r1 = "[]"
            java.lang.StringBuffer r0 = r0.append(r1)
            int r8 = r8 + (-1)
            goto L6f
        L80:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        L85:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r6
            char[] r2 = r2.b
            r3 = r6
            int r3 = r3.c
            r4 = r6
            int r4 = r4.d
            r1.<init>(r2, r3, r4)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
        La0:
            r0 = 0
            return r0
    }

    public java.lang.String getInternalName() {
            r6 = this;
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r6
            char[] r2 = r2.b
            r3 = r6
            int r3 = r3.c
            r4 = r6
            int r4 = r4.d
            r1.<init>(r2, r3, r4)
            return r0
    }

    public org.objectweb.asm.Type[] getArgumentTypes() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            org.objectweb.asm.Type[] r0 = getArgumentTypes(r0)
            return r0
    }

    public org.objectweb.asm.Type getReturnType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            org.objectweb.asm.Type r0 = getReturnType(r0)
            return r0
    }

    public int getArgumentsAndReturnSizes() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            int r0 = getArgumentsAndReturnSizes(r0)
            return r0
    }

    public java.lang.String getDescriptor() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            r1 = r4
            r0.a(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getMethodDescriptor(org.objectweb.asm.Type r3, org.objectweb.asm.Type... r4) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = 40
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = 0
            r6 = r0
        L11:
            r0 = r6
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L24
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r1 = r5
            r0.a(r1)
            int r6 = r6 + 1
            goto L11
        L24:
            r0 = r5
            r1 = 41
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            r1 = r5
            r0.a(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void a(java.lang.StringBuffer r6) {
            r5 = this;
            r0 = r5
            char[] r0 = r0.b
            if (r0 != 0) goto L1a
            r0 = r6
            r1 = r5
            int r1 = r1.c
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r2
            r2 = 24
            int r1 = r1 >>> r2
            char r1 = (char) r1
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L56
        L1a:
            r0 = r5
            int r0 = r0.a
            r1 = 10
            if (r0 != r1) goto L45
            r0 = r6
            r1 = 76
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            char[] r1 = r1.b
            r2 = r5
            int r2 = r2.c
            r3 = r5
            int r3 = r3.d
            java.lang.StringBuffer r0 = r0.append(r1, r2, r3)
            r0 = r6
            r1 = 59
            java.lang.StringBuffer r0 = r0.append(r1)
            goto L56
        L45:
            r0 = r6
            r1 = r5
            char[] r1 = r1.b
            r2 = r5
            int r2 = r2.c
            r3 = r5
            int r3 = r3.d
            java.lang.StringBuffer r0 = r0.append(r1, r2, r3)
        L56:
            return
    }

    public static java.lang.String getInternalName(java.lang.Class r4) {
            r0 = r4
            java.lang.String r0 = r0.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static java.lang.String getDescriptor(java.lang.Class r3) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            a(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getConstructorDescriptor(java.lang.reflect.Constructor r4) {
            r0 = r4
            java.lang.Class[] r0 = r0.getParameterTypes()
            r5 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = 40
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = 0
            r7 = r0
        L16:
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L29
            r0 = r6
            r1 = r5
            r2 = r7
            r1 = r1[r2]
            a(r0, r1)
            int r7 = r7 + 1
            goto L16
        L29:
            r0 = r6
            java.lang.String r1 = ")V"
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getMethodDescriptor(java.lang.reflect.Method r4) {
            r0 = r4
            java.lang.Class[] r0 = r0.getParameterTypes()
            r5 = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = 40
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = 0
            r7 = r0
        L16:
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L29
            r0 = r6
            r1 = r5
            r2 = r7
            r1 = r1[r2]
            a(r0, r1)
            int r7 = r7 + 1
            goto L16
        L29:
            r0 = r6
            r1 = 41
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r6
            r1 = r4
            java.lang.Class r1 = r1.getReturnType()
            a(r0, r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static void a(java.lang.StringBuffer r4, java.lang.Class r5) {
            r0 = r5
            r6 = r0
        L2:
            r0 = r6
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L7b
            r0 = r6
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L16
            r0 = 73
            r7 = r0
            goto L74
        L16:
            r0 = r6
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L23
            r0 = 86
            r7 = r0
            goto L74
        L23:
            r0 = r6
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L30
            r0 = 90
            r7 = r0
            goto L74
        L30:
            r0 = r6
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L3d
            r0 = 66
            r7 = r0
            goto L74
        L3d:
            r0 = r6
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L4a
            r0 = 67
            r7 = r0
            goto L74
        L4a:
            r0 = r6
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L57
            r0 = 83
            r7 = r0
            goto L74
        L57:
            r0 = r6
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L64
            r0 = 68
            r7 = r0
            goto L74
        L64:
            r0 = r6
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L71
            r0 = 70
            r7 = r0
            goto L74
        L71:
            r0 = 74
            r7 = r0
        L74:
            r0 = r4
            r1 = r7
            java.lang.StringBuffer r0 = r0.append(r1)
            return
        L7b:
            r0 = r6
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L91
            r0 = r4
            r1 = 91
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r6
            java.lang.Class r0 = r0.getComponentType()
            r6 = r0
            goto L2
        L91:
            r0 = r4
            r1 = 76
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r7
            int r0 = r0.length()
            r8 = r0
            r0 = 0
            r9 = r0
        La6:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto Lce
            r0 = r7
            r1 = r9
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r4
            r1 = r10
            r2 = 46
            if (r1 != r2) goto Lc2
            r1 = 47
            goto Lc4
        Lc2:
            r1 = r10
        Lc4:
            java.lang.StringBuffer r0 = r0.append(r1)
            int r9 = r9 + 1
            goto La6
        Lce:
            r0 = r4
            r1 = 59
            java.lang.StringBuffer r0 = r0.append(r1)
            return
    }

    public int getSize() {
            r3 = this;
            r0 = r3
            char[] r0 = r0.b
            if (r0 != 0) goto L12
            r0 = r3
            int r0 = r0.c
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            goto L13
        L12:
            r0 = 1
        L13:
            return r0
    }

    public int getOpcode(int r5) {
            r4 = this;
            r0 = r5
            r1 = 46
            if (r0 == r1) goto Lc
            r0 = r5
            r1 = 79
            if (r0 != r1) goto L24
        Lc:
            r0 = r5
            r1 = r4
            char[] r1 = r1.b
            if (r1 != 0) goto L21
            r1 = r4
            int r1 = r1.c
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 >> r2
            goto L22
        L21:
            r1 = 4
        L22:
            int r0 = r0 + r1
            return r0
        L24:
            r0 = r5
            r1 = r4
            char[] r1 = r1.b
            if (r1 != 0) goto L39
            r1 = r4
            int r1 = r1.c
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 >> r2
            goto L3a
        L39:
            r1 = 4
        L3a:
            int r0 = r0 + r1
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r5
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            r6 = r0
            r0 = r4
            int r0 = r0.a
            r1 = r6
            int r1 = r1.a
            if (r0 == r1) goto L22
            r0 = 0
            return r0
        L22:
            r0 = r4
            int r0 = r0.a
            r1 = 9
            if (r0 < r1) goto L6c
            r0 = r4
            int r0 = r0.d
            r1 = r6
            int r1 = r1.d
            if (r0 == r1) goto L38
            r0 = 0
            return r0
        L38:
            r0 = r4
            int r0 = r0.c
            r7 = r0
            r0 = r6
            int r0 = r0.c
            r8 = r0
            r0 = r7
            r1 = r4
            int r1 = r1.d
            int r0 = r0 + r1
            r9 = r0
        L4b:
            r0 = r7
            r1 = r9
            if (r0 >= r1) goto L6c
            r0 = r4
            char[] r0 = r0.b
            r1 = r7
            char r0 = r0[r1]
            r1 = r6
            char[] r1 = r1.b
            r2 = r8
            char r1 = r1[r2]
            if (r0 == r1) goto L63
            r0 = 0
            return r0
        L63:
            int r7 = r7 + 1
            int r8 = r8 + 1
            goto L4b
        L6c:
            r0 = 1
            return r0
    }

    public int hashCode() {
            r5 = this;
            r0 = 13
            r1 = r5
            int r1 = r1.a
            int r0 = r0 * r1
            r6 = r0
            r0 = r5
            int r0 = r0.a
            r1 = 9
            if (r0 < r1) goto L34
            r0 = r5
            int r0 = r0.c
            r7 = r0
            r0 = r7
            r1 = r5
            int r1 = r1.d
            int r0 = r0 + r1
            r8 = r0
        L1d:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L34
            r0 = 17
            r1 = r6
            r2 = r5
            char[] r2 = r2.b
            r3 = r7
            char r2 = r2[r3]
            int r1 = r1 + r2
            int r0 = r0 * r1
            r6 = r0
            int r7 = r7 + 1
            goto L1d
        L34:
            r0 = r6
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getDescriptor()
            return r0
    }

    static {
            _clinit_()
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 1443168256(0x56050000, float:3.655876E13)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.VOID_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 1
            r3 = 0
            r4 = 1509950721(0x5a000501, float:9.008575E15)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.BOOLEAN_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 2
            r3 = 0
            r4 = 1124075009(0x43000601, float:128.02345)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.CHAR_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 3
            r3 = 0
            r4 = 1107297537(0x42000501, float:32.004887)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.BYTE_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 4
            r3 = 0
            r4 = 1392510721(0x53000701, float:5.498733E11)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.SHORT_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 5
            r3 = 0
            r4 = 1224736769(0x49000001, float:524288.06)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.INT_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 6
            r3 = 0
            r4 = 1174536705(0x46020201, float:8320.501)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.FLOAT_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 7
            r3 = 0
            r4 = 1241579778(0x4a010102, float:2113600.5)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.LONG_TYPE = r0
            org.objectweb.asm.Type r0 = new org.objectweb.asm.Type
            r1 = r0
            r2 = 8
            r3 = 0
            r4 = 1141048066(0x44030302, float:524.047)
            r5 = 1
            r1.<init>(r2, r3, r4, r5)
            org.objectweb.asm.Type.DOUBLE_TYPE = r0
            return
    }

    static void _clinit_() {
            return
    }
}
