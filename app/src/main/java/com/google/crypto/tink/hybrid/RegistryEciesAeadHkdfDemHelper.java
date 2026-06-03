package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes2.dex */
class RegistryEciesAeadHkdfDemHelper implements com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper {
    private com.google.crypto.tink.proto.AesCtrHmacAeadKey aesCtrHmacAeadKey;
    private int aesCtrKeySize;
    private com.google.crypto.tink.proto.AesGcmKey aesGcmKey;
    private com.google.crypto.tink.proto.AesSivKey aesSivKey;
    private final java.lang.String demKeyTypeUrl;
    private final int symmetricKeySize;

    RegistryEciesAeadHkdfDemHelper(com.google.crypto.tink.proto.KeyTemplate r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.getTypeUrl()
            r3.demKeyTypeUrl = r0
            java.lang.String r1 = com.google.crypto.tink.aead.AeadConfig.AES_GCM_TYPE_URL
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L35
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            com.google.crypto.tink.proto.AesGcmKeyFormat r0 = com.google.crypto.tink.proto.AesGcmKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = com.google.crypto.tink.Registry.newKey(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            com.google.crypto.tink.proto.AesGcmKey r4 = (com.google.crypto.tink.proto.AesGcmKey) r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            r3.aesGcmKey = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            int r4 = r0.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            r3.symmetricKeySize = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            goto L94
        L2c:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid KeyFormat protobuf, expected AesGcmKeyFormat"
            r0.<init>(r1, r4)
            throw r0
        L35:
            java.lang.String r1 = com.google.crypto.tink.aead.AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat"
            if (r1 == 0) goto L72
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = com.google.crypto.tink.Registry.newKey(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r4 = (com.google.crypto.tink.proto.AesCtrHmacAeadKey) r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            r3.aesCtrHmacAeadKey = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.proto.AesCtrKeyFormat r4 = r0.getAesCtrKeyFormat()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            int r4 = r4.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            r3.aesCtrKeySize = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            com.google.crypto.tink.proto.HmacKeyFormat r4 = r0.getHmacKeyFormat()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            int r4 = r4.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            int r0 = r3.aesCtrKeySize     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            int r0 = r0 + r4
            r3.symmetricKeySize = r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L6b
            goto L94
        L6b:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r2, r4)
            throw r0
        L72:
            java.lang.String r1 = com.google.crypto.tink.daead.DeterministicAeadConfig.AES_SIV_TYPE_URL
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L9c
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
            com.google.crypto.tink.proto.AesSivKeyFormat r0 = com.google.crypto.tink.proto.AesSivKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = com.google.crypto.tink.Registry.newKey(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
            com.google.crypto.tink.proto.AesSivKey r4 = (com.google.crypto.tink.proto.AesSivKey) r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
            r3.aesSivKey = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
            int r4 = r0.getKeySize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
            r3.symmetricKeySize = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L95
        L94:
            return
        L95:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r2, r4)
            throw r0
        L9c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported AEAD DEM key type: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public com.google.crypto.tink.hybrid.subtle.AeadOrDaead getAeadOrDaead(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.getSymmetricKeySizeInBytes()
            if (r0 != r1) goto Lfc
            java.lang.String r0 = r3.demKeyTypeUrl
            java.lang.String r1 = com.google.crypto.tink.aead.AeadConfig.AES_GCM_TYPE_URL
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L3e
            com.google.crypto.tink.proto.AesGcmKey$Builder r0 = com.google.crypto.tink.proto.AesGcmKey.newBuilder()
            com.google.crypto.tink.proto.AesGcmKey r2 = r3.aesGcmKey
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r2)
            com.google.crypto.tink.proto.AesGcmKey$Builder r0 = (com.google.crypto.tink.proto.AesGcmKey.Builder) r0
            int r2 = r3.symmetricKeySize
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4, r1, r2)
            com.google.crypto.tink.proto.AesGcmKey$Builder r4 = r0.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.AesGcmKey r4 = (com.google.crypto.tink.proto.AesGcmKey) r4
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r0 = new com.google.crypto.tink.hybrid.subtle.AeadOrDaead
            java.lang.String r1 = r3.demKeyTypeUrl
            java.lang.Class<com.google.crypto.tink.Aead> r2 = com.google.crypto.tink.Aead.class
            java.lang.Object r4 = com.google.crypto.tink.Registry.getPrimitive(r1, r4, r2)
            com.google.crypto.tink.Aead r4 = (com.google.crypto.tink.Aead) r4
            r0.<init>(r4)
            return r0
        L3e:
            java.lang.String r0 = r3.demKeyTypeUrl
            java.lang.String r2 = com.google.crypto.tink.aead.AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lbe
            int r0 = r3.aesCtrKeySize
            byte[] r0 = java.util.Arrays.copyOfRange(r4, r1, r0)
            int r1 = r3.aesCtrKeySize
            int r2 = r3.symmetricKeySize
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r1, r2)
            com.google.crypto.tink.proto.AesCtrKey$Builder r1 = com.google.crypto.tink.proto.AesCtrKey.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r2 = r3.aesCtrHmacAeadKey
            com.google.crypto.tink.proto.AesCtrKey r2 = r2.getAesCtrKey()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.mergeFrom(r2)
            com.google.crypto.tink.proto.AesCtrKey$Builder r1 = (com.google.crypto.tink.proto.AesCtrKey.Builder) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            com.google.crypto.tink.proto.AesCtrKey$Builder r0 = r1.setKeyValue(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCtrKey r0 = (com.google.crypto.tink.proto.AesCtrKey) r0
            com.google.crypto.tink.proto.HmacKey$Builder r1 = com.google.crypto.tink.proto.HmacKey.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r2 = r3.aesCtrHmacAeadKey
            com.google.crypto.tink.proto.HmacKey r2 = r2.getHmacKey()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.mergeFrom(r2)
            com.google.crypto.tink.proto.HmacKey$Builder r1 = (com.google.crypto.tink.proto.HmacKey.Builder) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.HmacKey$Builder r4 = r1.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.HmacKey r4 = (com.google.crypto.tink.proto.HmacKey) r4
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r1 = com.google.crypto.tink.proto.AesCtrHmacAeadKey.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r2 = r3.aesCtrHmacAeadKey
            int r2 = r2.getVersion()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r1 = r1.setVersion(r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r0 = r1.setAesCtrKey(r0)
            com.google.crypto.tink.proto.AesCtrHmacAeadKey$Builder r4 = r0.setHmacKey(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.AesCtrHmacAeadKey r4 = (com.google.crypto.tink.proto.AesCtrHmacAeadKey) r4
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r0 = new com.google.crypto.tink.hybrid.subtle.AeadOrDaead
            java.lang.String r1 = r3.demKeyTypeUrl
            java.lang.Class<com.google.crypto.tink.Aead> r2 = com.google.crypto.tink.Aead.class
            java.lang.Object r4 = com.google.crypto.tink.Registry.getPrimitive(r1, r4, r2)
            com.google.crypto.tink.Aead r4 = (com.google.crypto.tink.Aead) r4
            r0.<init>(r4)
            return r0
        Lbe:
            java.lang.String r0 = r3.demKeyTypeUrl
            java.lang.String r2 = com.google.crypto.tink.daead.DeterministicAeadConfig.AES_SIV_TYPE_URL
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf4
            com.google.crypto.tink.proto.AesSivKey$Builder r0 = com.google.crypto.tink.proto.AesSivKey.newBuilder()
            com.google.crypto.tink.proto.AesSivKey r2 = r3.aesSivKey
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r2)
            com.google.crypto.tink.proto.AesSivKey$Builder r0 = (com.google.crypto.tink.proto.AesSivKey.Builder) r0
            int r2 = r3.symmetricKeySize
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4, r1, r2)
            com.google.crypto.tink.proto.AesSivKey$Builder r4 = r0.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.AesSivKey r4 = (com.google.crypto.tink.proto.AesSivKey) r4
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r0 = new com.google.crypto.tink.hybrid.subtle.AeadOrDaead
            java.lang.String r1 = r3.demKeyTypeUrl
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r2 = com.google.crypto.tink.DeterministicAead.class
            java.lang.Object r4 = com.google.crypto.tink.Registry.getPrimitive(r1, r4, r2)
            com.google.crypto.tink.DeterministicAead r4 = (com.google.crypto.tink.DeterministicAead) r4
            r0.<init>(r4)
            return r0
        Lf4:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown DEM key type"
            r4.<init>(r0)
            throw r4
        Lfc:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Symmetric key has incorrect length"
            r4.<init>(r0)
            throw r4
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public int getSymmetricKeySizeInBytes() {
            r1 = this;
            int r0 = r1.symmetricKeySize
            return r0
    }
}
