package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class NoSecretKeysetHandle {
    private NoSecretKeysetHandle() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle parseFrom(byte[] r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            com.google.crypto.tink.proto.Keyset r1 = com.google.crypto.tink.proto.Keyset.parseFrom(r1, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            validate(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.KeysetHandle.fromKeyset(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            return r1
        L10:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid keyset"
            r1.<init>(r0)
            throw r1
    }

    public static final com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader r0) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.Keyset r0 = r0.read()
            validate(r0)
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)
            return r0
    }

    private static void validate(com.google.crypto.tink.proto.Keyset r3) throws java.security.GeneralSecurityException {
            java.util.List r3 = r3.getKeyList()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r3.next()
            com.google.crypto.tink.proto.Keyset$Key r0 = (com.google.crypto.tink.proto.Keyset.Key) r0
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
            if (r1 == r2) goto L39
            com.google.crypto.tink.proto.KeyData r1 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r1.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            if (r1 == r2) goto L39
            com.google.crypto.tink.proto.KeyData r0 = r0.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r0.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r0 == r1) goto L39
            goto L8
        L39:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains secret key material"
            r3.<init>(r0)
            throw r3
        L41:
            return
    }
}
