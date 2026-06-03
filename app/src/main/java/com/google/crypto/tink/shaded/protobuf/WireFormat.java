package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class WireFormat {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_ITEM_END_TAG = 0;
    static final int MESSAGE_SET_ITEM_TAG = 0;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_MESSAGE_TAG = 0;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_TYPE_ID_TAG = 0;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld8
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                return
        }
    }

    public enum FieldType extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType BOOL = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType BYTES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType DOUBLE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType ENUM = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType FIXED32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType FIXED64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType FLOAT = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType GROUP = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType INT32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType INT64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType MESSAGE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SFIXED32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SFIXED64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SINT32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType SINT64 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType STRING = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType UINT32 = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType UINT64 = null;
        private final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType javaType;
        private final int wireType;





        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE
                java.lang.String r2 = "DOUBLE"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r1, r4)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT
                java.lang.String r5 = "FLOAT"
                r6 = 5
                r1.<init>(r5, r4, r2, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT = r1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r7 = "INT64"
                r8 = 2
                r2.<init>(r7, r8, r5, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64 = r2
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r9 = "UINT64"
                r10 = 3
                r5.<init>(r9, r10, r7, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64 = r5
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r7 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r11 = "INT32"
                r12 = 4
                r7.<init>(r11, r12, r9, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32 = r7
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                java.lang.String r11 = "FIXED64"
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r13 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                r9.<init>(r11, r6, r13, r4)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64 = r9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r11 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r13 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r14 = "FIXED32"
                r15 = 6
                r11.<init>(r14, r15, r13, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32 = r11
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r13 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r14 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN
                java.lang.String r15 = "BOOL"
                r12 = 7
                r13.<init>(r15, r12, r14, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL = r13
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$1 r14 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$1
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING
                java.lang.String r12 = "STRING"
                r4 = 8
                r14.<init>(r12, r4, r15, r8)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING = r14
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$2 r12 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$2
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                java.lang.String r4 = "GROUP"
                r6 = 9
                r12.<init>(r4, r6, r15, r10)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP = r12
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$3 r4 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$3
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                java.lang.String r6 = "MESSAGE"
                r10 = 10
                r4.<init>(r6, r10, r15, r8)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE = r4
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$4 r6 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$4
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING
                java.lang.String r10 = "BYTES"
                r3 = 11
                r6.<init>(r10, r3, r15, r8)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES = r6
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r3 = "UINT32"
                r8 = 12
                r16 = r6
                r6 = 0
                r10.<init>(r3, r8, r15, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32 = r10
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                java.lang.String r8 = "ENUM"
                r17 = r10
                r10 = 13
                r3.<init>(r8, r10, r15, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM = r3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r15 = "SFIXED32"
                r10 = 14
                r18 = r3
                r3 = 5
                r6.<init>(r15, r10, r8, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32 = r6
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r15 = "SFIXED64"
                r10 = 15
                r19 = r6
                r6 = 1
                r3.<init>(r15, r10, r8, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64 = r3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT
                java.lang.String r15 = "SINT32"
                r10 = 16
                r20 = r3
                r3 = 0
                r6.<init>(r15, r10, r8, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32 = r6
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = new com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r15 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG
                java.lang.String r10 = "SINT64"
                r21 = r6
                r6 = 17
                r8.<init>(r10, r6, r15, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64 = r8
                r10 = 18
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r10 = new com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[r10]
                r10[r3] = r0
                r0 = 1
                r10[r0] = r1
                r0 = 2
                r10[r0] = r2
                r0 = 3
                r10[r0] = r5
                r0 = 4
                r10[r0] = r7
                r0 = 5
                r10[r0] = r9
                r0 = 6
                r10[r0] = r11
                r0 = 7
                r10[r0] = r13
                r0 = 8
                r10[r0] = r14
                r0 = 9
                r10[r0] = r12
                r0 = 10
                r10[r0] = r4
                r0 = 11
                r10[r0] = r16
                r0 = 12
                r10[r0] = r17
                r0 = 13
                r10[r0] = r18
                r0 = 14
                r10[r0] = r19
                r0 = 15
                r10[r0] = r20
                r0 = 16
                r10[r0] = r21
                r10[r6] = r8
                com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.$VALUES = r10
                return
        }

        FieldType(java.lang.String r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.javaType = r3
                r0.wireType = r4
                return
        }

        /* synthetic */ FieldType(java.lang.String r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType r3, int r4, com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType> r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = (com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType) r1
                return r1
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[] values() {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType[]) r0
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getJavaType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r1.javaType
                return r0
        }

        public int getWireType() {
                r1 = this;
                int r0 = r1.wireType
                return r0
        }

        public boolean isPackable() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public enum JavaType extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType BOOLEAN = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType BYTE_STRING = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType DOUBLE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType ENUM = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType FLOAT = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType INT = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType LONG = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType MESSAGE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType STRING = null;
        private final java.lang.Object defaultDefault;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "INT"
                r0.<init>(r3, r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r3 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r4 = "LONG"
                r5 = 1
                r2.<init>(r4, r5, r3)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG = r2
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r4 = 0
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                java.lang.String r5 = "FLOAT"
                r6 = 2
                r3.<init>(r5, r6, r4)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT = r3
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r4 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r5 = 0
                java.lang.Double r5 = java.lang.Double.valueOf(r5)
                java.lang.String r6 = "DOUBLE"
                r7 = 3
                r4.<init>(r6, r7, r5)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE = r4
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r5 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r6 = 4
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r7 = "BOOLEAN"
                r5.<init>(r7, r6, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN = r5
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r6 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r1 = 5
                java.lang.String r7 = ""
                java.lang.String r8 = "STRING"
                r6.<init>(r8, r1, r7)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING = r6
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r7 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                r1 = 6
                com.google.crypto.tink.shaded.protobuf.ByteString r8 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
                java.lang.String r9 = "BYTE_STRING"
                r7.<init>(r9, r1, r8)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING = r7
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r8 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                java.lang.String r1 = "ENUM"
                r9 = 7
                r10 = 0
                r8.<init>(r1, r9, r10)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM = r8
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r9 = new com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType
                java.lang.String r1 = "MESSAGE"
                r11 = 8
                r9.<init>(r1, r11, r10)
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE = r9
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.$VALUES = r0
                return
        }

        JavaType(java.lang.String r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.defaultDefault = r3
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType> r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = (com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType) r1
                return r1
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[] values() {
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType[]) r0
                return r0
        }

        java.lang.Object getDefaultDefault() {
                r1 = this;
                java.lang.Object r0 = r1.defaultDefault
                return r0
        }
    }

    enum Utf8Validation extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation LAZY = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation LOOSE = null;
        public static final com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation STRICT = null;




        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$1 r0 = new com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$1
                java.lang.String r1 = "LOOSE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LOOSE = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$2 r1 = new com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$2
                java.lang.String r3 = "STRICT"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.STRICT = r1
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$3 r3 = new com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation$3
                java.lang.String r5 = "LAZY"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LAZY = r3
                r5 = 3
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation[] r5 = new com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.$VALUES = r5
                return
        }

        Utf8Validation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Utf8Validation(java.lang.String r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation> r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r1 = (com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation) r1
                return r1
        }

        public static com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[] values() {
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation[] r0 = (com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation[]) r0
                return r0
        }

        abstract java.lang.Object readString(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException;
    }

    static {
            r0 = 1
            r1 = 3
            int r2 = makeTag(r0, r1)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG = r2
            r2 = 4
            int r0 = makeTag(r0, r2)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG = r0
            r0 = 0
            r2 = 2
            int r0 = makeTag(r2, r0)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG = r0
            int r0 = makeTag(r1, r2)
            com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG = r0
            return
    }

    private WireFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getTagFieldNumber(int r0) {
            int r0 = r0 >>> 3
            return r0
    }

    public static int getTagWireType(int r0) {
            r0 = r0 & 7
            return r0
    }

    static int makeTag(int r0, int r1) {
            int r0 = r0 << 3
            r0 = r0 | r1
            return r0
    }

    static java.lang.Object readPrimitiveField(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation r3) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto La1;
                case 2: goto L98;
                case 3: goto L8f;
                case 4: goto L86;
                case 5: goto L7d;
                case 6: goto L74;
                case 7: goto L6b;
                case 8: goto L62;
                case 9: goto L5d;
                case 10: goto L54;
                case 11: goto L4b;
                case 12: goto L42;
                case 13: goto L39;
                case 14: goto L30;
                case 15: goto L2b;
                case 16: goto L23;
                case 17: goto L1b;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "There is no way to get here, but the compiler thinks otherwise."
            r1.<init>(r2)
            throw r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "readPrimitiveField() cannot handle enums."
            r1.<init>(r2)
            throw r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "readPrimitiveField() cannot handle embedded messages."
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "readPrimitiveField() cannot handle nested groups."
            r1.<init>(r2)
            throw r1
        L2b:
            java.lang.Object r1 = r3.readString(r1)
            return r1
        L30:
            long r1 = r1.readSInt64()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L39:
            int r1 = r1.readSInt32()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L42:
            long r1 = r1.readSFixed64()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L4b:
            int r1 = r1.readSFixed32()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L54:
            int r1 = r1.readUInt32()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L5d:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.readBytes()
            return r1
        L62:
            boolean r1 = r1.readBool()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L6b:
            int r1 = r1.readFixed32()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L74:
            long r1 = r1.readFixed64()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L7d:
            int r1 = r1.readInt32()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L86:
            long r1 = r1.readUInt64()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L8f:
            long r1 = r1.readInt64()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L98:
            float r1 = r1.readFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        La1:
            double r1 = r1.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
    }
}
