package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public enum HpkeKdf extends java.lang.Enum<com.google.crypto.tink.proto.HpkeKdf> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.HpkeKdf[] $VALUES = null;
    public static final com.google.crypto.tink.proto.HpkeKdf HKDF_SHA256 = null;
    public static final int HKDF_SHA256_VALUE = 1;
    public static final com.google.crypto.tink.proto.HpkeKdf HKDF_SHA384 = null;
    public static final int HKDF_SHA384_VALUE = 2;
    public static final com.google.crypto.tink.proto.HpkeKdf HKDF_SHA512 = null;
    public static final int HKDF_SHA512_VALUE = 3;
    public static final com.google.crypto.tink.proto.HpkeKdf KDF_UNKNOWN = null;
    public static final int KDF_UNKNOWN_VALUE = 0;
    public static final com.google.crypto.tink.proto.HpkeKdf UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeKdf> internalValueMap = null;
    private final int value;


    private static final class HpkeKdfVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.HpkeKdf$HpkeKdfVerifier r0 = new com.google.crypto.tink.proto.HpkeKdf$HpkeKdfVerifier
                r0.<init>()
                com.google.crypto.tink.proto.HpkeKdf.HpkeKdfVerifier.INSTANCE = r0
                return
        }

        private HpkeKdfVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
                r0 = this;
                com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.forNumber(r1)
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
            com.google.crypto.tink.proto.HpkeKdf r0 = new com.google.crypto.tink.proto.HpkeKdf
            java.lang.String r1 = "KDF_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeKdf.KDF_UNKNOWN = r0
            com.google.crypto.tink.proto.HpkeKdf r1 = new com.google.crypto.tink.proto.HpkeKdf
            java.lang.String r2 = "HKDF_SHA256"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA256 = r1
            com.google.crypto.tink.proto.HpkeKdf r2 = new com.google.crypto.tink.proto.HpkeKdf
            java.lang.String r3 = "HKDF_SHA384"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA384 = r2
            com.google.crypto.tink.proto.HpkeKdf r3 = new com.google.crypto.tink.proto.HpkeKdf
            java.lang.String r4 = "HKDF_SHA512"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA512 = r3
            com.google.crypto.tink.proto.HpkeKdf r4 = new com.google.crypto.tink.proto.HpkeKdf
            r5 = 4
            r6 = -1
            java.lang.String r7 = "UNRECOGNIZED"
            r4.<init>(r7, r5, r6)
            com.google.crypto.tink.proto.HpkeKdf.UNRECOGNIZED = r4
            com.google.crypto.tink.proto.HpkeKdf[] r0 = new com.google.crypto.tink.proto.HpkeKdf[]{r0, r1, r2, r3, r4}
            com.google.crypto.tink.proto.HpkeKdf.$VALUES = r0
            com.google.crypto.tink.proto.HpkeKdf$1 r0 = new com.google.crypto.tink.proto.HpkeKdf$1
            r0.<init>()
            com.google.crypto.tink.proto.HpkeKdf.internalValueMap = r0
            return
    }

    HpkeKdf(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.HpkeKdf forNumber(int r1) {
            if (r1 == 0) goto L16
            r0 = 1
            if (r1 == r0) goto L13
            r0 = 2
            if (r1 == r0) goto L10
            r0 = 3
            if (r1 == r0) goto Ld
            r1 = 0
            return r1
        Ld:
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA512
            return r1
        L10:
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA384
            return r1
        L13:
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA256
            return r1
        L16:
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.KDF_UNKNOWN
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeKdf> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.HpkeKdf> r0 = com.google.crypto.tink.proto.HpkeKdf.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.HpkeKdf.HpkeKdfVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.HpkeKdf valueOf(int r0) {
            com.google.crypto.tink.proto.HpkeKdf r0 = forNumber(r0)
            return r0
    }

    public static com.google.crypto.tink.proto.HpkeKdf valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.HpkeKdf> r0 = com.google.crypto.tink.proto.HpkeKdf.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.HpkeKdf r1 = (com.google.crypto.tink.proto.HpkeKdf) r1
            return r1
    }

    public static com.google.crypto.tink.proto.HpkeKdf[] values() {
            com.google.crypto.tink.proto.HpkeKdf[] r0 = com.google.crypto.tink.proto.HpkeKdf.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.HpkeKdf[] r0 = (com.google.crypto.tink.proto.HpkeKdf[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.HpkeKdf r0 = com.google.crypto.tink.proto.HpkeKdf.UNRECOGNIZED
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
