package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public enum OutputPrefixType extends java.lang.Enum<com.google.crypto.tink.proto.OutputPrefixType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.OutputPrefixType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.OutputPrefixType CRUNCHY = null;
    public static final int CRUNCHY_VALUE = 4;
    public static final com.google.crypto.tink.proto.OutputPrefixType LEGACY = null;
    public static final int LEGACY_VALUE = 2;
    public static final com.google.crypto.tink.proto.OutputPrefixType RAW = null;
    public static final int RAW_VALUE = 3;
    public static final com.google.crypto.tink.proto.OutputPrefixType TINK = null;
    public static final int TINK_VALUE = 1;
    public static final com.google.crypto.tink.proto.OutputPrefixType UNKNOWN_PREFIX = null;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final com.google.crypto.tink.proto.OutputPrefixType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> internalValueMap = null;
    private final int value;


    private static final class OutputPrefixTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType$OutputPrefixTypeVerifier r0 = new com.google.crypto.tink.proto.OutputPrefixType$OutputPrefixTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.OutputPrefixType.OutputPrefixTypeVerifier.INSTANCE = r0
                return
        }

        private OutputPrefixTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
                r0 = this;
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.forNumber(r1)
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
            com.google.crypto.tink.proto.OutputPrefixType r0 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r1 = "UNKNOWN_PREFIX"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX = r0
            com.google.crypto.tink.proto.OutputPrefixType r1 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r2 = "TINK"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.google.crypto.tink.proto.OutputPrefixType.TINK = r1
            com.google.crypto.tink.proto.OutputPrefixType r2 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r3 = "LEGACY"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.google.crypto.tink.proto.OutputPrefixType.LEGACY = r2
            com.google.crypto.tink.proto.OutputPrefixType r3 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r4 = "RAW"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.google.crypto.tink.proto.OutputPrefixType.RAW = r3
            com.google.crypto.tink.proto.OutputPrefixType r4 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r5 = "CRUNCHY"
            r6 = 4
            r4.<init>(r5, r6, r6)
            com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY = r4
            com.google.crypto.tink.proto.OutputPrefixType r5 = new com.google.crypto.tink.proto.OutputPrefixType
            r6 = 5
            r7 = -1
            java.lang.String r8 = "UNRECOGNIZED"
            r5.<init>(r8, r6, r7)
            com.google.crypto.tink.proto.OutputPrefixType.UNRECOGNIZED = r5
            com.google.crypto.tink.proto.OutputPrefixType[] r0 = new com.google.crypto.tink.proto.OutputPrefixType[]{r0, r1, r2, r3, r4, r5}
            com.google.crypto.tink.proto.OutputPrefixType.$VALUES = r0
            com.google.crypto.tink.proto.OutputPrefixType$1 r0 = new com.google.crypto.tink.proto.OutputPrefixType$1
            r0.<init>()
            com.google.crypto.tink.proto.OutputPrefixType.internalValueMap = r0
            return
    }

    OutputPrefixType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.OutputPrefixType forNumber(int r1) {
            if (r1 == 0) goto L1c
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r1
        L13:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r1
        L16:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r1
        L19:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r1
        L1c:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> r0 = com.google.crypto.tink.proto.OutputPrefixType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.OutputPrefixType.OutputPrefixTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.OutputPrefixType valueOf(int r0) {
            com.google.crypto.tink.proto.OutputPrefixType r0 = forNumber(r0)
            return r0
    }

    public static com.google.crypto.tink.proto.OutputPrefixType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.OutputPrefixType> r0 = com.google.crypto.tink.proto.OutputPrefixType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = (com.google.crypto.tink.proto.OutputPrefixType) r1
            return r1
    }

    public static com.google.crypto.tink.proto.OutputPrefixType[] values() {
            com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.OutputPrefixType[] r0 = (com.google.crypto.tink.proto.OutputPrefixType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.UNRECOGNIZED
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
