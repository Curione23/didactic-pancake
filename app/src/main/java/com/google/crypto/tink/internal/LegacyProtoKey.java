package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class LegacyProtoKey extends com.google.crypto.tink.Key {
    private final com.google.crypto.tink.internal.ProtoKeySerialization serialization;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.LegacyProtoKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.KeyData$KeyMaterialType[] r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = r0
                r1 = 1
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                com.google.crypto.tink.proto.OutputPrefixType[] r2 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r2
                com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r1 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L38
                com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L38
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L43
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L4e
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L4e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                return
        }
    }

    @com.google.errorprone.annotations.Immutable
    private static class LegacyProtoParametersNotForCreation extends com.google.crypto.tink.Parameters {
        private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
        private final java.lang.String typeUrl;

        private LegacyProtoParametersNotForCreation(java.lang.String r1, com.google.crypto.tink.proto.OutputPrefixType r2) {
                r0 = this;
                r0.<init>()
                r0.typeUrl = r1
                r0.outputPrefixType = r2
                return
        }

        /* synthetic */ LegacyProtoParametersNotForCreation(java.lang.String r1, com.google.crypto.tink.proto.OutputPrefixType r2, com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static java.lang.String outputPrefixToString(com.google.crypto.tink.proto.OutputPrefixType r1) {
                int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
                int r1 = r1.ordinal()
                r1 = r0[r1]
                r0 = 1
                if (r1 == r0) goto L20
                r0 = 2
                if (r1 == r0) goto L1d
                r0 = 3
                if (r1 == r0) goto L1a
                r0 = 4
                if (r1 == r0) goto L17
                java.lang.String r1 = "UNKNOWN"
                return r1
            L17:
                java.lang.String r1 = "CRUNCHY"
                return r1
            L1a:
                java.lang.String r1 = "RAW"
                return r1
            L1d:
                java.lang.String r1 = "LEGACY"
                return r1
            L20:
                java.lang.String r1 = "TINK"
                return r1
        }

        @Override // com.google.crypto.tink.Parameters
        public boolean hasIdRequirement() {
                r2 = this;
                com.google.crypto.tink.proto.OutputPrefixType r0 = r2.outputPrefixType
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
                if (r0 == r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.typeUrl
                com.google.crypto.tink.proto.OutputPrefixType r1 = r2.outputPrefixType
                java.lang.String r1 = outputPrefixToString(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "(typeUrl=%s, outputPrefixType=%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    public LegacyProtoKey(com.google.crypto.tink.internal.ProtoKeySerialization r1, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException {
            r0 = this;
            r0.<init>()
            throwIfMissingAccess(r1, r2)
            r0.serialization = r1
            return
    }

    private static void throwIfMissingAccess(com.google.crypto.tink.internal.ProtoKeySerialization r1, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.internal.LegacyProtoKey.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L13
            r0 = 2
            if (r1 == r0) goto L13
            goto L16
        L13:
            com.google.crypto.tink.SecretKeyAccess.requireAccess(r2)
        L16:
            return
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.internal.LegacyProtoKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.internal.LegacyProtoKey r4 = (com.google.crypto.tink.internal.LegacyProtoKey) r4
            com.google.crypto.tink.internal.ProtoKeySerialization r4 = r4.serialization
            com.google.crypto.tink.proto.OutputPrefixType r0 = r4.getOutputPrefixType()
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = r3.serialization
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1b
            return r1
        L1b:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r4.getKeyMaterialType()
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = r3.serialization
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2c
            return r1
        L2c:
            java.lang.String r0 = r4.getTypeUrl()
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = r3.serialization
            java.lang.String r2 = r2.getTypeUrl()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3d
            return r1
        L3d:
            java.lang.Integer r0 = r4.getIdRequirementOrNull()
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = r3.serialization
            java.lang.Integer r2 = r2.getIdRequirementOrNull()
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L4e
            return r1
        L4e:
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = r3.serialization
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getValue()
            byte[] r4 = r4.toByteArray()
            boolean r4 = com.google.crypto.tink.subtle.Bytes.equal(r0, r4)
            return r4
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = r1.serialization
            java.lang.Integer r0 = r0.getIdRequirementOrNull()
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public com.google.crypto.tink.Parameters getParameters() {
            r4 = this;
            com.google.crypto.tink.internal.LegacyProtoKey$LegacyProtoParametersNotForCreation r0 = new com.google.crypto.tink.internal.LegacyProtoKey$LegacyProtoParametersNotForCreation
            com.google.crypto.tink.internal.ProtoKeySerialization r1 = r4.serialization
            java.lang.String r1 = r1.getTypeUrl()
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = r4.serialization
            com.google.crypto.tink.proto.OutputPrefixType r2 = r2.getOutputPrefixType()
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.crypto.tink.internal.ProtoKeySerialization getSerialization(@javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = r1.serialization
            throwIfMissingAccess(r0, r2)
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = r1.serialization
            return r2
    }
}
