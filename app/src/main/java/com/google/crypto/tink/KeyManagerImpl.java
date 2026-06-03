package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes2.dex */
class KeyManagerImpl<PrimitiveT, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> implements com.google.crypto.tink.KeyManager<PrimitiveT> {
    private final com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> keyTypeManager;
    private final java.lang.Class<PrimitiveT> primitiveClass;

    private static class KeyFactoryHelper<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
        final com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory;

        KeyFactoryHelper(com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> r1) {
                r0 = this;
                r0.<init>()
                r0.keyFactory = r1
                return
        }

        private KeyProtoT validateCreate(KeyFormatProtoT r2) throws java.security.GeneralSecurityException {
                r1 = this;
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyFactory
                r0.validateKeyFormat(r2)
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyFactory
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r0.createKey(r2)
                return r2
        }

        KeyProtoT castValidateCreate(com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.security.GeneralSecurityException {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Expected proto of type "
                r0.<init>(r1)
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyFactory
                java.lang.Class r1 = r1.getKeyFormatClass()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyFactory
                java.lang.Class r1 = r1.getKeyFormatClass()
                java.lang.Object r3 = com.google.crypto.tink.KeyManagerImpl.access$000(r3, r0, r1)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r2.validateCreate(r3)
                return r3
        }

        KeyProtoT parseValidateCreate(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyFactory
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r0.parseKeyFormat(r2)
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.validateCreate(r2)
                return r2
        }
    }

    public KeyManagerImpl(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r2, java.lang.Class<PrimitiveT> r3) {
            r1 = this;
            r1.<init>()
            java.util.Set r0 = r2.supportedPrimitives()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L2e
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            goto L2e
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Given internalKeyMananger %s does not support primitive class %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        L2e:
            r1.keyTypeManager = r2
            r1.primitiveClass = r3
            return
    }

    static /* synthetic */ java.lang.Object access$000(java.lang.Object r0, java.lang.String r1, java.lang.Class r2) throws java.security.GeneralSecurityException {
            java.lang.Object r0 = castOrThrowSecurityException(r0, r1, r2)
            return r0
    }

    private static <CastedT> CastedT castOrThrowSecurityException(java.lang.Object r0, java.lang.String r1, java.lang.Class<CastedT> r2) throws java.security.GeneralSecurityException {
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L7
            return r0
        L7:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r1)
            throw r0
    }

    private com.google.crypto.tink.KeyManagerImpl.KeyFactoryHelper<?, KeyProtoT> keyFactoryHelper() {
            r2 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = new com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyTypeManager
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r1 = r1.keyFactory()
            r0.<init>(r1)
            return r0
    }

    private PrimitiveT validateKeyAndGetPrimitive(KeyProtoT r3) throws java.security.GeneralSecurityException {
            r2 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            java.lang.Class<PrimitiveT> r1 = r2.primitiveClass
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.keyTypeManager
            r0.validateKey(r3)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.keyTypeManager
            java.lang.Class<PrimitiveT> r1 = r2.primitiveClass
            java.lang.Object r3 = r0.getPrimitive(r3, r1)
            return r3
        L18:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Cannot create a primitive for Void"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.crypto.tink.KeyManager
    public final boolean doesSupport(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.getKeyType()
            boolean r2 = r2.equals(r0)
            return r2
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.String getKeyType() {
            r1 = this;
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyTypeManager
            java.lang.String r0 = r0.getKeyType()
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(com.google.crypto.tink.shaded.protobuf.ByteString r4) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r3.keyTypeManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = r0.parseKey(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb
            java.lang.Object r4 = r3.validateKeyAndGetPrimitive(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb
            return r4
        Lb:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failures parsing proto of type "
            r1.<init>(r2)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r2 = r3.keyTypeManager
            java.lang.Class r2 = r2.getKeyClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.security.GeneralSecurityException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected proto of type "
            r0.<init>(r1)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyTypeManager
            java.lang.Class r1 = r1.getKeyClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyTypeManager
            java.lang.Class r1 = r1.getKeyClass()
            java.lang.Object r3 = castOrThrowSecurityException(r3, r0, r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            java.lang.Object r3 = r2.validateKeyAndGetPrimitive(r3)
            return r3
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.Class<PrimitiveT> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<PrimitiveT> r0 = r1.primitiveClass
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public int getVersion() {
            r1 = this;
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyTypeManager
            int r0 = r0.getVersion()
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.ByteString r4) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = r3.keyFactoryHelper()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = r0.parseValidateCreate(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9
            return r4
        L9:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failures parsing proto of type "
            r1.<init>(r2)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r2 = r3.keyTypeManager
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r2 = r2.keyFactory()
            java.lang.Class r2 = r2.getKeyFormatClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = r1.keyFactoryHelper()
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r0.castValidateCreate(r2)
            return r2
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = r2.keyFactoryHelper()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r0.parseValidateCreate(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r0 = com.google.crypto.tink.proto.KeyData.newBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            java.lang.String r1 = r2.getKeyType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r0 = r0.setTypeUrl(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.toByteString()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r3 = r0.setValue(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.keyTypeManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r0.keyMaterialType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r3 = r3.setKeyMaterialType(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData r3 = (com.google.crypto.tink.proto.KeyData) r3     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            return r3
        L2d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Unexpected proto"
            r0.<init>(r1, r3)
            throw r0
    }
}
