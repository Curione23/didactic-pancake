package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class ProtoKeySerialization implements com.google.crypto.tink.internal.Serialization {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType;
    private final com.google.crypto.tink.util.Bytes objectIdentifier;
    private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
    private final java.lang.String typeUrl;
    private final com.google.crypto.tink.shaded.protobuf.ByteString value;

    private ProtoKeySerialization(java.lang.String r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.proto.KeyData.KeyMaterialType r3, com.google.crypto.tink.proto.OutputPrefixType r4, @javax.annotation.Nullable java.lang.Integer r5) {
            r0 = this;
            r0.<init>()
            r0.typeUrl = r1
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r1)
            r0.objectIdentifier = r1
            r0.value = r2
            r0.keyMaterialType = r3
            r0.outputPrefixType = r4
            r0.idRequirement = r5
            return
    }

    public static com.google.crypto.tink.internal.ProtoKeySerialization create(java.lang.String r7, com.google.crypto.tink.shaded.protobuf.ByteString r8, com.google.crypto.tink.proto.KeyData.KeyMaterialType r9, com.google.crypto.tink.proto.OutputPrefixType r10, @javax.annotation.Nullable java.lang.Integer r11) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r10 != r0) goto Lf
            if (r11 != 0) goto L7
            goto L11
        L7:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "Keys with output prefix type raw should not have an id requirement."
            r7.<init>(r8)
            throw r7
        Lf:
            if (r11 == 0) goto L1d
        L11:
            com.google.crypto.tink.internal.ProtoKeySerialization r6 = new com.google.crypto.tink.internal.ProtoKeySerialization
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L1d:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "Keys with output prefix type different from raw should have an id requirement."
            r7.<init>(r8)
            throw r7
    }

    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            java.lang.Integer r0 = r1.idRequirement
            return r0
    }

    public com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r1.keyMaterialType
            return r0
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public com.google.crypto.tink.util.Bytes getObjectIdentifier() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.objectIdentifier
            return r0
    }

    public com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
            r1 = this;
            com.google.crypto.tink.proto.OutputPrefixType r0 = r1.outputPrefixType
            return r0
    }

    public java.lang.String getTypeUrl() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.ByteString getValue() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.value
            return r0
    }
}
