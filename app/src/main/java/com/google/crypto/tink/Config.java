package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class Config {
    private Config() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry getTinkKeyTypeEntry(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, boolean r6) {
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r0 = com.google.crypto.tink.proto.KeyTypeEntry.newBuilder()
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r3 = r0.setPrimitiveName(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink."
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r3 = r3.setTypeUrl(r4)
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r3 = r3.setKeyManagerVersion(r5)
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r3 = r3.setNewKeyAllowed(r6)
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r2 = r3.setCatalogueName(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTypeEntry r2 = (com.google.crypto.tink.proto.KeyTypeEntry) r2
            return r2
    }

    public static void register(com.google.crypto.tink.proto.RegistryConfig r1) throws java.security.GeneralSecurityException {
            java.util.List r1 = r1.getEntryList()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.google.crypto.tink.proto.KeyTypeEntry r0 = (com.google.crypto.tink.proto.KeyTypeEntry) r0
            registerKeyType(r0)
            goto L8
        L18:
            return
    }

    public static void registerKeyType(com.google.crypto.tink.proto.KeyTypeEntry r4) throws java.security.GeneralSecurityException {
            validate(r4)
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkAead"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkMac"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkHybridDecrypt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkHybridEncrypt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkPublicKeySign"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkPublicKeyVerify"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkStreamingAead"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkDeterministicAead"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            goto L8a
        L64:
            java.lang.String r0 = r4.getCatalogueName()
            com.google.crypto.tink.Catalogue r0 = com.google.crypto.tink.Registry.getCatalogue(r0)
            com.google.crypto.tink.PrimitiveWrapper r1 = r0.getPrimitiveWrapper()
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r1)
            java.lang.String r1 = r4.getTypeUrl()
            java.lang.String r2 = r4.getPrimitiveName()
            int r3 = r4.getKeyManagerVersion()
            com.google.crypto.tink.KeyManager r0 = r0.getKeyManager(r1, r2, r3)
            boolean r4 = r4.getNewKeyAllowed()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r4)
        L8a:
            return
    }

    private static void validate(com.google.crypto.tink.proto.KeyTypeEntry r1) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r1.getTypeUrl()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2f
            java.lang.String r0 = r1.getPrimitiveName()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            java.lang.String r1 = r1.getCatalogueName()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1f
            return
        L1f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Missing catalogue_name."
            r1.<init>(r0)
            throw r1
        L27:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Missing primitive_name."
            r1.<init>(r0)
            throw r1
        L2f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Missing type_url."
            r1.<init>(r0)
            throw r1
    }
}
