package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public enum JavaType extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.JavaType> {
    private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.JavaType[] $VALUES = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType BOOLEAN = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType BYTE_STRING = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType DOUBLE = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType ENUM = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType FLOAT = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType INT = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType LONG = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType MESSAGE = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType STRING = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType VOID = null;
    private final java.lang.Class<?> boxedType;
    private final java.lang.Object defaultDefault;
    private final java.lang.Class<?> type;

    static {
            com.google.crypto.tink.shaded.protobuf.JavaType r6 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            r5 = 0
            java.lang.String r1 = "VOID"
            r2 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.crypto.tink.shaded.protobuf.JavaType.VOID = r6
            com.google.crypto.tink.shaded.protobuf.JavaType r1 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            r0 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = "INT"
            r9 = 1
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            com.google.crypto.tink.shaded.protobuf.JavaType.INT = r1
            com.google.crypto.tink.shaded.protobuf.JavaType r2 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r17 = java.lang.Long.class
            r3 = 0
            java.lang.Long r18 = java.lang.Long.valueOf(r3)
            java.lang.String r14 = "LONG"
            r15 = 2
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            com.google.crypto.tink.shaded.protobuf.JavaType.LONG = r2
            com.google.crypto.tink.shaded.protobuf.JavaType r3 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r10 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r11 = java.lang.Float.class
            r4 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r4)
            java.lang.String r8 = "FLOAT"
            r9 = 3
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            com.google.crypto.tink.shaded.protobuf.JavaType.FLOAT = r3
            com.google.crypto.tink.shaded.protobuf.JavaType r4 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r16 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r17 = java.lang.Double.class
            r7 = 0
            java.lang.Double r18 = java.lang.Double.valueOf(r7)
            java.lang.String r14 = "DOUBLE"
            r15 = 4
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            com.google.crypto.tink.shaded.protobuf.JavaType.DOUBLE = r4
            com.google.crypto.tink.shaded.protobuf.JavaType r5 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r10 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r11 = java.lang.Boolean.class
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            java.lang.String r8 = "BOOLEAN"
            r9 = 5
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            com.google.crypto.tink.shaded.protobuf.JavaType.BOOLEAN = r5
            com.google.crypto.tink.shaded.protobuf.JavaType r7 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String r18 = ""
            java.lang.String r14 = "STRING"
            r15 = 6
            r13 = r7
            r13.<init>(r14, r15, r16, r17, r18)
            com.google.crypto.tink.shaded.protobuf.JavaType.STRING = r7
            com.google.crypto.tink.shaded.protobuf.JavaType r14 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ByteString> r11 = com.google.crypto.tink.shaded.protobuf.ByteString.class
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ByteString> r12 = com.google.crypto.tink.shaded.protobuf.ByteString.class
            com.google.crypto.tink.shaded.protobuf.ByteString r13 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            java.lang.String r9 = "BYTE_STRING"
            r10 = 7
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            com.google.crypto.tink.shaded.protobuf.JavaType.BYTE_STRING = r14
            com.google.crypto.tink.shaded.protobuf.JavaType r8 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r18 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r19 = java.lang.Integer.class
            r20 = 0
            java.lang.String r16 = "ENUM"
            r17 = 8
            r15 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            com.google.crypto.tink.shaded.protobuf.JavaType.ENUM = r8
            com.google.crypto.tink.shaded.protobuf.JavaType r9 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<java.lang.Object> r24 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r25 = java.lang.Object.class
            r26 = 0
            java.lang.String r22 = "MESSAGE"
            r23 = 9
            r21 = r9
            r21.<init>(r22, r23, r24, r25, r26)
            com.google.crypto.tink.shaded.protobuf.JavaType.MESSAGE = r9
            r0 = r6
            r6 = r7
            r7 = r14
            com.google.crypto.tink.shaded.protobuf.JavaType[] r0 = new com.google.crypto.tink.shaded.protobuf.JavaType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.google.crypto.tink.shaded.protobuf.JavaType.$VALUES = r0
            return
    }

    JavaType(java.lang.String r1, int r2, java.lang.Class r3, java.lang.Class r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.type = r3
            r0.boxedType = r4
            r0.defaultDefault = r5
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.JavaType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.JavaType> r0 = com.google.crypto.tink.shaded.protobuf.JavaType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.shaded.protobuf.JavaType r1 = (com.google.crypto.tink.shaded.protobuf.JavaType) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.JavaType[] values() {
            com.google.crypto.tink.shaded.protobuf.JavaType[] r0 = com.google.crypto.tink.shaded.protobuf.JavaType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.shaded.protobuf.JavaType[] r0 = (com.google.crypto.tink.shaded.protobuf.JavaType[]) r0
            return r0
    }

    public java.lang.Class<?> getBoxedType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.boxedType
            return r0
    }

    public java.lang.Object getDefaultDefault() {
            r1 = this;
            java.lang.Object r0 = r1.defaultDefault
            return r0
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            return r0
    }

    public boolean isValidType(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
