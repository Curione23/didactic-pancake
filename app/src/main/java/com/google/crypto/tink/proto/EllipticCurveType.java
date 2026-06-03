package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public enum EllipticCurveType extends java.lang.Enum<com.google.crypto.tink.proto.EllipticCurveType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.EllipticCurveType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.EllipticCurveType CURVE25519 = null;
    public static final int CURVE25519_VALUE = 5;
    public static final com.google.crypto.tink.proto.EllipticCurveType NIST_P256 = null;
    public static final int NIST_P256_VALUE = 2;
    public static final com.google.crypto.tink.proto.EllipticCurveType NIST_P384 = null;
    public static final int NIST_P384_VALUE = 3;
    public static final com.google.crypto.tink.proto.EllipticCurveType NIST_P521 = null;
    public static final int NIST_P521_VALUE = 4;
    public static final com.google.crypto.tink.proto.EllipticCurveType UNKNOWN_CURVE = null;
    public static final int UNKNOWN_CURVE_VALUE = 0;
    public static final com.google.crypto.tink.proto.EllipticCurveType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EllipticCurveType> internalValueMap = null;
    private final int value;


    private static final class EllipticCurveTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.EllipticCurveType$EllipticCurveTypeVerifier r0 = new com.google.crypto.tink.proto.EllipticCurveType$EllipticCurveTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.EllipticCurveType.EllipticCurveTypeVerifier.INSTANCE = r0
                return
        }

        private EllipticCurveTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
                r0 = this;
                com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.forNumber(r1)
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
            com.google.crypto.tink.proto.EllipticCurveType r0 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r1 = "UNKNOWN_CURVE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EllipticCurveType.UNKNOWN_CURVE = r0
            com.google.crypto.tink.proto.EllipticCurveType r1 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r2 = "NIST_P256"
            r3 = 1
            r4 = 2
            r1.<init>(r2, r3, r4)
            com.google.crypto.tink.proto.EllipticCurveType.NIST_P256 = r1
            com.google.crypto.tink.proto.EllipticCurveType r2 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r3 = "NIST_P384"
            r5 = 3
            r2.<init>(r3, r4, r5)
            com.google.crypto.tink.proto.EllipticCurveType.NIST_P384 = r2
            com.google.crypto.tink.proto.EllipticCurveType r3 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r4 = "NIST_P521"
            r6 = 4
            r3.<init>(r4, r5, r6)
            com.google.crypto.tink.proto.EllipticCurveType.NIST_P521 = r3
            com.google.crypto.tink.proto.EllipticCurveType r4 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r5 = "CURVE25519"
            r7 = 5
            r4.<init>(r5, r6, r7)
            com.google.crypto.tink.proto.EllipticCurveType.CURVE25519 = r4
            com.google.crypto.tink.proto.EllipticCurveType r5 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r6 = "UNRECOGNIZED"
            r8 = -1
            r5.<init>(r6, r7, r8)
            com.google.crypto.tink.proto.EllipticCurveType.UNRECOGNIZED = r5
            com.google.crypto.tink.proto.EllipticCurveType[] r0 = new com.google.crypto.tink.proto.EllipticCurveType[]{r0, r1, r2, r3, r4, r5}
            com.google.crypto.tink.proto.EllipticCurveType.$VALUES = r0
            com.google.crypto.tink.proto.EllipticCurveType$1 r0 = new com.google.crypto.tink.proto.EllipticCurveType$1
            r0.<init>()
            com.google.crypto.tink.proto.EllipticCurveType.internalValueMap = r0
            return
    }

    EllipticCurveType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.EllipticCurveType forNumber(int r1) {
            if (r1 == 0) goto L1c
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L16
            r0 = 4
            if (r1 == r0) goto L13
            r0 = 5
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.CURVE25519
            return r1
        L13:
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            return r1
        L16:
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            return r1
        L19:
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            return r1
        L1c:
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.UNKNOWN_CURVE
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EllipticCurveType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.EllipticCurveType> r0 = com.google.crypto.tink.proto.EllipticCurveType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.EllipticCurveType.EllipticCurveTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.EllipticCurveType valueOf(int r0) {
            com.google.crypto.tink.proto.EllipticCurveType r0 = forNumber(r0)
            return r0
    }

    public static com.google.crypto.tink.proto.EllipticCurveType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.EllipticCurveType> r0 = com.google.crypto.tink.proto.EllipticCurveType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.EllipticCurveType r1 = (com.google.crypto.tink.proto.EllipticCurveType) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EllipticCurveType[] values() {
            com.google.crypto.tink.proto.EllipticCurveType[] r0 = com.google.crypto.tink.proto.EllipticCurveType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.EllipticCurveType[] r0 = (com.google.crypto.tink.proto.EllipticCurveType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.UNRECOGNIZED
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
