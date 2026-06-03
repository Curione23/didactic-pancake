package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public enum HashType extends java.lang.Enum<com.google.crypto.tink.proto.HashType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.HashType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.HashType SHA1 = null;
    public static final int SHA1_VALUE = 1;
    public static final com.google.crypto.tink.proto.HashType SHA224 = null;
    public static final int SHA224_VALUE = 5;
    public static final com.google.crypto.tink.proto.HashType SHA256 = null;
    public static final int SHA256_VALUE = 3;
    public static final com.google.crypto.tink.proto.HashType SHA384 = null;
    public static final int SHA384_VALUE = 2;
    public static final com.google.crypto.tink.proto.HashType SHA512 = null;
    public static final int SHA512_VALUE = 4;
    public static final com.google.crypto.tink.proto.HashType UNKNOWN_HASH = null;
    public static final int UNKNOWN_HASH_VALUE = 0;
    public static final com.google.crypto.tink.proto.HashType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HashType> internalValueMap = null;
    private final int value;


    private static final class HashTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.HashType$HashTypeVerifier r0 = new com.google.crypto.tink.proto.HashType$HashTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.HashType.HashTypeVerifier.INSTANCE = r0
                return
        }

        private HashTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
                r0 = this;
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.forNumber(r1)
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            java.lang.String r1 = "UNKNOWN_HASH"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HashType.UNKNOWN_HASH = r0
            com.google.crypto.tink.proto.HashType r1 = new com.google.crypto.tink.proto.HashType
            java.lang.String r2 = "SHA1"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.google.crypto.tink.proto.HashType.SHA1 = r1
            com.google.crypto.tink.proto.HashType r2 = new com.google.crypto.tink.proto.HashType
            java.lang.String r3 = "SHA384"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.google.crypto.tink.proto.HashType.SHA384 = r2
            com.google.crypto.tink.proto.HashType r3 = new com.google.crypto.tink.proto.HashType
            java.lang.String r4 = "SHA256"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.google.crypto.tink.proto.HashType.SHA256 = r3
            com.google.crypto.tink.proto.HashType r4 = new com.google.crypto.tink.proto.HashType
            java.lang.String r5 = "SHA512"
            r6 = 4
            r4.<init>(r5, r6, r6)
            com.google.crypto.tink.proto.HashType.SHA512 = r4
            com.google.crypto.tink.proto.HashType r5 = new com.google.crypto.tink.proto.HashType
            java.lang.String r6 = "SHA224"
            r7 = 5
            r5.<init>(r6, r7, r7)
            com.google.crypto.tink.proto.HashType.SHA224 = r5
            com.google.crypto.tink.proto.HashType r6 = new com.google.crypto.tink.proto.HashType
            r7 = 6
            r8 = -1
            java.lang.String r9 = "UNRECOGNIZED"
            r6.<init>(r9, r7, r8)
            com.google.crypto.tink.proto.HashType.UNRECOGNIZED = r6
            com.google.crypto.tink.proto.HashType[] r0 = new com.google.crypto.tink.proto.HashType[]{r0, r1, r2, r3, r4, r5, r6}
            com.google.crypto.tink.proto.HashType.$VALUES = r0
            com.google.crypto.tink.proto.HashType$1 r0 = new com.google.crypto.tink.proto.HashType$1
            r0.<init>()
            com.google.crypto.tink.proto.HashType.internalValueMap = r0
            return
    }

    HashType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.HashType forNumber(int r1) {
            if (r1 == 0) goto L22
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 == r0) goto L19
            r0 = 4
            if (r1 == r0) goto L16
            r0 = 5
            if (r1 == r0) goto L13
            r1 = 0
            return r1
        L13:
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA224
            return r1
        L16:
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            return r1
        L19:
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            return r1
        L1c:
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384
            return r1
        L1f:
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1
            return r1
        L22:
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.UNKNOWN_HASH
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HashType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.HashType> r0 = com.google.crypto.tink.proto.HashType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.HashType.HashTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.HashType valueOf(int r0) {
            com.google.crypto.tink.proto.HashType r0 = forNumber(r0)
            return r0
    }

    public static com.google.crypto.tink.proto.HashType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.HashType> r0 = com.google.crypto.tink.proto.HashType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.HashType r1 = (com.google.crypto.tink.proto.HashType) r1
            return r1
    }

    public static com.google.crypto.tink.proto.HashType[] values() {
            com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.HashType[] r0 = (com.google.crypto.tink.proto.HashType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.UNRECOGNIZED
            if (r2 == r0) goto L7
            int r0 = r2.value
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
