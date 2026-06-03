package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes2.dex */
class PrivateKeyManagerImpl<PrimitiveT, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> extends com.google.crypto.tink.KeyManagerImpl<PrimitiveT, KeyProtoT> implements com.google.crypto.tink.PrivateKeyManager<PrimitiveT> {
    private final com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyManager;
    private final com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> publicKeyManager;

    public PrivateKeyManagerImpl(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r1, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r2, java.lang.Class<PrimitiveT> r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.privateKeyManager = r1
            r0.publicKeyManager = r2
            return
    }

    @Override // com.google.crypto.tink.PrivateKeyManager
    public com.google.crypto.tink.proto.KeyData getPublicKeyData(com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.privateKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r0.parseKey(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.privateKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            r0.validateKey(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.privateKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r0.getPublicKey(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.publicKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            r0.validateKey(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r0 = com.google.crypto.tink.proto.KeyData.newBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.publicKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            java.lang.String r1 = r1.getKeyType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r0 = r0.setTypeUrl(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.toByteString()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r3 = r0.setValue(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.publicKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r0.keyMaterialType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r3 = r3.setKeyMaterialType(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData r3 = (com.google.crypto.tink.proto.KeyData) r3     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            return r3
        L3d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "expected serialized proto of type "
            r0.<init>(r1, r3)
            throw r0
    }
}
