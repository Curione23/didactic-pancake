package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public enum KeyStatusType extends java.lang.Enum<com.google.crypto.tink.proto.KeyStatusType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.KeyStatusType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.KeyStatusType DESTROYED = null;
    public static final int DESTROYED_VALUE = 3;
    public static final com.google.crypto.tink.proto.KeyStatusType DISABLED = null;
    public static final int DISABLED_VALUE = 2;
    public static final com.google.crypto.tink.proto.KeyStatusType ENABLED = null;
    public static final int ENABLED_VALUE = 1;
    public static final com.google.crypto.tink.proto.KeyStatusType UNKNOWN_STATUS = null;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    public static final com.google.crypto.tink.proto.KeyStatusType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.KeyStatusType> internalValueMap = null;
    private final int value;


    private static final class KeyStatusTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.KeyStatusType$KeyStatusTypeVerifier r0 = new com.google.crypto.tink.proto.KeyStatusType$KeyStatusTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.KeyStatusType.KeyStatusTypeVerifier.INSTANCE = r0
                return
        }

        private KeyStatusTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
                r0 = this;
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.forNumber(r1)
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
            com.google.crypto.tink.proto.KeyStatusType r0 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r1 = "UNKNOWN_STATUS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS = r0
            com.google.crypto.tink.proto.KeyStatusType r1 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r2 = "ENABLED"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.google.crypto.tink.proto.KeyStatusType.ENABLED = r1
            com.google.crypto.tink.proto.KeyStatusType r2 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r3 = "DISABLED"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.google.crypto.tink.proto.KeyStatusType.DISABLED = r2
            com.google.crypto.tink.proto.KeyStatusType r3 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r4 = "DESTROYED"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.google.crypto.tink.proto.KeyStatusType.DESTROYED = r3
            com.google.crypto.tink.proto.KeyStatusType r4 = new com.google.crypto.tink.proto.KeyStatusType
            r5 = 4
            r6 = -1
            java.lang.String r7 = "UNRECOGNIZED"
            r4.<init>(r7, r5, r6)
            com.google.crypto.tink.proto.KeyStatusType.UNRECOGNIZED = r4
            com.google.crypto.tink.proto.KeyStatusType[] r0 = new com.google.crypto.tink.proto.KeyStatusType[]{r0, r1, r2, r3, r4}
            com.google.crypto.tink.proto.KeyStatusType.$VALUES = r0
            com.google.crypto.tink.proto.KeyStatusType$1 r0 = new com.google.crypto.tink.proto.KeyStatusType$1
            r0.<init>()
            com.google.crypto.tink.proto.KeyStatusType.internalValueMap = r0
            return
    }

    KeyStatusType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.KeyStatusType forNumber(int r1) {
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
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED
            return r1
        L10:
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DISABLED
            return r1
        L13:
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            return r1
        L16:
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.KeyStatusType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.KeyStatusType> r0 = com.google.crypto.tink.proto.KeyStatusType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.KeyStatusType.KeyStatusTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyStatusType valueOf(int r0) {
            com.google.crypto.tink.proto.KeyStatusType r0 = forNumber(r0)
            return r0
    }

    public static com.google.crypto.tink.proto.KeyStatusType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.KeyStatusType> r0 = com.google.crypto.tink.proto.KeyStatusType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.KeyStatusType r1 = (com.google.crypto.tink.proto.KeyStatusType) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyStatusType[] values() {
            com.google.crypto.tink.proto.KeyStatusType[] r0 = com.google.crypto.tink.proto.KeyStatusType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.KeyStatusType[] r0 = (com.google.crypto.tink.proto.KeyStatusType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.UNRECOGNIZED
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
