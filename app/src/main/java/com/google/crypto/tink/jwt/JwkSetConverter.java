package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
public final class JwkSetConverter {
    private static final java.lang.String JWT_ECDSA_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    private static final java.lang.String JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    private static final java.lang.String JWT_RSA_SSA_PSS_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwkSetConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = null;

        static {
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = r0
                r1 = 1
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r2 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS256     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r3 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS512     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] r3 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = r3
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm     // Catch: java.lang.NoSuchFieldError -> L4d
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512     // Catch: java.lang.NoSuchFieldError -> L4d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm[] r3 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = r3
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r4 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256     // Catch: java.lang.NoSuchFieldError -> L5e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L5e
            L5e:
                int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L68
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384     // Catch: java.lang.NoSuchFieldError -> L68
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L68
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L68
            L68:
                int[] r0 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L72
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512     // Catch: java.lang.NoSuchFieldError -> L72
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L72
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L72
            L72:
                return
        }
    }

    private JwkSetConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.gson.JsonObject convertJwtEcdsaKey(com.google.crypto.tink.internal.ProtoKeySerialization r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r6.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb1
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb1
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb1
            int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r2 = r0.getAlgorithm()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L33
            r2 = 2
            if (r1 == r2) goto L2e
            r2 = 3
            if (r1 != r2) goto L26
            java.lang.String r1 = "ES512"
            java.lang.String r2 = "P-521"
            goto L37
        L26:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown algorithm"
            r6.<init>(r0)
            throw r6
        L2e:
            java.lang.String r1 = "ES384"
            java.lang.String r2 = "P-384"
            goto L37
        L33:
            java.lang.String r1 = "ES256"
            java.lang.String r2 = "P-256"
        L37:
            com.google.gson.JsonObject r3 = new com.google.gson.JsonObject
            r3.<init>()
            java.lang.String r4 = "kty"
            java.lang.String r5 = "EC"
            r3.addProperty(r4, r5)
            java.lang.String r4 = "crv"
            r3.addProperty(r4, r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getX()
            byte[] r2 = r2.toByteArray()
            java.lang.String r2 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r2)
            java.lang.String r4 = "x"
            r3.addProperty(r4, r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getY()
            byte[] r2 = r2.toByteArray()
            java.lang.String r2 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r2)
            java.lang.String r4 = "y"
            r3.addProperty(r4, r2)
            java.lang.String r2 = "use"
            java.lang.String r4 = "sig"
            r3.addProperty(r2, r4)
            java.lang.String r2 = "alg"
            r3.addProperty(r2, r1)
            com.google.gson.JsonArray r1 = new com.google.gson.JsonArray
            r1.<init>()
            java.lang.String r2 = "verify"
            r1.add(r2)
            java.lang.String r2 = "key_ops"
            r3.add(r2, r1)
            java.lang.Integer r6 = r6.getIdRequirementOrNull()
            java.util.Optional r6 = getKid(r6)
            boolean r1 = r6.isPresent()
            java.lang.String r2 = "kid"
            if (r1 == 0) goto L9f
            java.lang.Object r6 = r6.get()
            java.lang.String r6 = (java.lang.String) r6
            r3.addProperty(r2, r6)
            goto Lb0
        L9f:
            boolean r6 = r0.hasCustomKid()
            if (r6 == 0) goto Lb0
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r6 = r0.getCustomKid()
            java.lang.String r6 = r6.getValue()
            r3.addProperty(r2, r6)
        Lb0:
            return r3
        Lb1:
            r6 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "failed to parse value as JwtEcdsaPublicKey proto"
            r0.<init>(r1, r6)
            throw r0
    }

    private static com.google.gson.JsonObject convertJwtRsaSsaPkcs1(com.google.crypto.tink.internal.ProtoKeySerialization r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La6
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La6
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La6
            int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r2 = r0.getAlgorithm()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L2f
            r2 = 2
            if (r1 == r2) goto L2c
            r2 = 3
            if (r1 != r2) goto L24
            java.lang.String r1 = "RS512"
            goto L31
        L24:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown algorithm"
            r5.<init>(r0)
            throw r5
        L2c:
            java.lang.String r1 = "RS384"
            goto L31
        L2f:
            java.lang.String r1 = "RS256"
        L31:
            com.google.gson.JsonObject r2 = new com.google.gson.JsonObject
            r2.<init>()
            java.lang.String r3 = "kty"
            java.lang.String r4 = "RSA"
            r2.addProperty(r3, r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getN()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "n"
            r2.addProperty(r4, r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getE()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "e"
            r2.addProperty(r4, r3)
            java.lang.String r3 = "use"
            java.lang.String r4 = "sig"
            r2.addProperty(r3, r4)
            java.lang.String r3 = "alg"
            r2.addProperty(r3, r1)
            com.google.gson.JsonArray r1 = new com.google.gson.JsonArray
            r1.<init>()
            java.lang.String r3 = "verify"
            r1.add(r3)
            java.lang.String r3 = "key_ops"
            r2.add(r3, r1)
            java.lang.Integer r5 = r5.getIdRequirementOrNull()
            java.util.Optional r5 = getKid(r5)
            boolean r1 = r5.isPresent()
            java.lang.String r3 = "kid"
            if (r1 == 0) goto L94
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            r2.addProperty(r3, r5)
            goto La5
        L94:
            boolean r5 = r0.hasCustomKid()
            if (r5 == 0) goto La5
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid r5 = r0.getCustomKid()
            java.lang.String r5 = r5.getValue()
            r2.addProperty(r3, r5)
        La5:
            return r2
        La6:
            r5 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "failed to parse value as JwtRsaSsaPkcs1PublicKey proto"
            r0.<init>(r1, r5)
            throw r0
    }

    private static com.google.gson.JsonObject convertJwtRsaSsaPss(com.google.crypto.tink.internal.ProtoKeySerialization r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La6
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La6
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La6
            int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r2 = r0.getAlgorithm()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L2f
            r2 = 2
            if (r1 == r2) goto L2c
            r2 = 3
            if (r1 != r2) goto L24
            java.lang.String r1 = "PS512"
            goto L31
        L24:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown algorithm"
            r5.<init>(r0)
            throw r5
        L2c:
            java.lang.String r1 = "PS384"
            goto L31
        L2f:
            java.lang.String r1 = "PS256"
        L31:
            com.google.gson.JsonObject r2 = new com.google.gson.JsonObject
            r2.<init>()
            java.lang.String r3 = "kty"
            java.lang.String r4 = "RSA"
            r2.addProperty(r3, r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getN()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "n"
            r2.addProperty(r4, r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getE()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "e"
            r2.addProperty(r4, r3)
            java.lang.String r3 = "use"
            java.lang.String r4 = "sig"
            r2.addProperty(r3, r4)
            java.lang.String r3 = "alg"
            r2.addProperty(r3, r1)
            com.google.gson.JsonArray r1 = new com.google.gson.JsonArray
            r1.<init>()
            java.lang.String r3 = "verify"
            r1.add(r3)
            java.lang.String r3 = "key_ops"
            r2.add(r3, r1)
            java.lang.Integer r5 = r5.getIdRequirementOrNull()
            java.util.Optional r5 = getKid(r5)
            boolean r1 = r5.isPresent()
            java.lang.String r3 = "kid"
            if (r1 == 0) goto L94
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            r2.addProperty(r3, r5)
            goto La5
        L94:
            boolean r5 = r0.hasCustomKid()
            if (r5 == 0) goto La5
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid r5 = r0.getCustomKid()
            java.lang.String r5 = r5.getValue()
            r2.addProperty(r3, r5)
        La5:
            return r2
        La6:
            r5 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "failed to parse value as JwtRsaSsaPssPublicKey proto"
            r0.<init>(r1, r5)
            throw r0
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization convertToEcdsaKey(com.google.gson.JsonObject r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "alg"
            java.lang.String r1 = getStringItem(r5, r0)
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 0
            r4 = -1
            switch(r2) {
                case 66245349: goto L29;
                case 66246401: goto L1e;
                case 66248104: goto L13;
                default: goto L12;
            }
        L12:
            goto L33
        L13:
            java.lang.String r2 = "ES512"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1c
            goto L33
        L1c:
            r4 = 2
            goto L33
        L1e:
            java.lang.String r2 = "ES384"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L27
            goto L33
        L27:
            r4 = 1
            goto L33
        L29:
            java.lang.String r2 = "ES256"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L32
            goto L33
        L32:
            r4 = r3
        L33:
            java.lang.String r1 = "crv"
            switch(r4) {
                case 0: goto L61;
                case 1: goto L59;
                case 2: goto L51;
                default: goto L38;
            }
        L38:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown Ecdsa Algorithm: "
            r2.<init>(r3)
            java.lang.String r5 = getStringItem(r5, r0)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L51:
            java.lang.String r0 = "P-521"
            expectStringItem(r5, r1, r0)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512
            goto L68
        L59:
            java.lang.String r0 = "P-384"
            expectStringItem(r5, r1, r0)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384
            goto L68
        L61:
            java.lang.String r0 = "P-256"
            expectStringItem(r5, r1, r0)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256
        L68:
            java.lang.String r1 = "d"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Le0
            java.lang.String r1 = "kty"
            java.lang.String r2 = "EC"
            expectStringItem(r5, r1, r2)
            validateUseIsSig(r5)
            validateKeyOpsIsVerify(r5)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.newBuilder()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = r1.setVersion(r3)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r0 = r1.setAlgorithm(r0)
            java.lang.String r1 = "x"
            java.lang.String r1 = getStringItem(r5, r1)
            byte[] r1 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r0 = r0.setX(r1)
            java.lang.String r1 = "y"
            java.lang.String r1 = getStringItem(r5, r1)
            byte[] r1 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r0 = r0.setY(r1)
            java.lang.String r1 = "kid"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto Lca
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r2 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.newBuilder()
            java.lang.String r5 = getStringItem(r5, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r5 = r2.setValue(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r5.build()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r5 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r5
            r0.setCustomKid(r5)
        Lca:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r0.build()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r5 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r5
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            r2 = 0
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r5 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r3, r5, r0, r1, r2)
            return r5
        Le0:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "importing ECDSA private keys is not implemented"
            r5.<init>(r0)
            throw r5
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization convertToRsaSsaPkcs1Key(com.google.gson.JsonObject r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "alg"
            java.lang.String r1 = getStringItem(r5, r0)
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 0
            r4 = -1
            switch(r2) {
                case 78251122: goto L29;
                case 78252174: goto L1e;
                case 78253877: goto L13;
                default: goto L12;
            }
        L12:
            goto L33
        L13:
            java.lang.String r2 = "RS512"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1c
            goto L33
        L1c:
            r4 = 2
            goto L33
        L1e:
            java.lang.String r2 = "RS384"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L27
            goto L33
        L27:
            r4 = 1
            goto L33
        L29:
            java.lang.String r2 = "RS256"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L32
            goto L33
        L32:
            r4 = r3
        L33:
            switch(r4) {
                case 0: goto L55;
                case 1: goto L52;
                case 2: goto L4f;
                default: goto L36;
            }
        L36:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown Rsa Algorithm: "
            r2.<init>(r3)
            java.lang.String r5 = getStringItem(r5, r0)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L4f:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512
            goto L57
        L52:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384
            goto L57
        L55:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256
        L57:
            java.lang.String r1 = "p"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "q"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "dp"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "dq"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "d"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "qi"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "kty"
            java.lang.String r2 = "RSA"
            expectStringItem(r5, r1, r2)
            validateUseIsSig(r5)
            validateKeyOpsIsVerify(r5)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.newBuilder()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r1 = r1.setVersion(r3)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r0 = r1.setAlgorithm(r0)
            java.lang.String r1 = "e"
            java.lang.String r1 = getStringItem(r5, r1)
            byte[] r1 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r0 = r0.setE(r1)
            java.lang.String r1 = "n"
            java.lang.String r1 = getStringItem(r5, r1)
            byte[] r1 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r0 = r0.setN(r1)
            java.lang.String r1 = "kid"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto Le1
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid$Builder r2 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder()
            java.lang.String r5 = getStringItem(r5, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid$Builder r5 = r2.setValue(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r5.build()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid r5 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) r5
            r0.setCustomKid(r5)
        Le1:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r0.build()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r5 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) r5
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            r2 = 0
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r5 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r3, r5, r0, r1, r2)
            return r5
        Lf7:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "importing RSA private keys is not implemented"
            r5.<init>(r0)
            throw r5
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization convertToRsaSsaPssKey(com.google.gson.JsonObject r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "alg"
            java.lang.String r1 = getStringItem(r5, r0)
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 0
            r4 = -1
            switch(r2) {
                case 76404080: goto L29;
                case 76405132: goto L1e;
                case 76406835: goto L13;
                default: goto L12;
            }
        L12:
            goto L33
        L13:
            java.lang.String r2 = "PS512"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1c
            goto L33
        L1c:
            r4 = 2
            goto L33
        L1e:
            java.lang.String r2 = "PS384"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L27
            goto L33
        L27:
            r4 = 1
            goto L33
        L29:
            java.lang.String r2 = "PS256"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L32
            goto L33
        L32:
            r4 = r3
        L33:
            switch(r4) {
                case 0: goto L55;
                case 1: goto L52;
                case 2: goto L4f;
                default: goto L36;
            }
        L36:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown Rsa Algorithm: "
            r2.<init>(r3)
            java.lang.String r5 = getStringItem(r5, r0)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L4f:
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS512
            goto L57
        L52:
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS384
            goto L57
        L55:
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS256
        L57:
            java.lang.String r1 = "p"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf5
            java.lang.String r1 = "q"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf5
            java.lang.String r1 = "dq"
            boolean r2 = r5.has(r1)
            if (r2 != 0) goto Lf5
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf5
            java.lang.String r1 = "d"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf5
            java.lang.String r1 = "qi"
            boolean r1 = r5.has(r1)
            if (r1 != 0) goto Lf5
            java.lang.String r1 = "kty"
            java.lang.String r2 = "RSA"
            expectStringItem(r5, r1, r2)
            validateUseIsSig(r5)
            validateKeyOpsIsVerify(r5)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r1 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.newBuilder()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r1 = r1.setVersion(r3)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r0 = r1.setAlgorithm(r0)
            java.lang.String r1 = "e"
            java.lang.String r1 = getStringItem(r5, r1)
            byte[] r1 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r0 = r0.setE(r1)
            java.lang.String r1 = "n"
            java.lang.String r1 = getStringItem(r5, r1)
            byte[] r1 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r0 = r0.setN(r1)
            java.lang.String r1 = "kid"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto Ldf
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid$Builder r2 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKid.newBuilder()
            java.lang.String r5 = getStringItem(r5, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid$Builder r5 = r2.setValue(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r5.build()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid r5 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKid) r5
            r0.setCustomKid(r5)
        Ldf:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r0.build()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r5 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey) r5
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = r5.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            r2 = 0
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r5 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r3, r5, r0, r1, r2)
            return r5
        Lf5:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "importing RSA private keys is not implemented"
            r5.<init>(r0)
            throw r5
    }

    private static void expectStringItem(com.google.gson.JsonObject r2, java.lang.String r3, java.lang.String r4) throws java.security.GeneralSecurityException {
            java.lang.String r2 = getStringItem(r2, r3)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " value: "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
    }

    @java.lang.Deprecated
    public static java.lang.String fromKeysetHandle(com.google.crypto.tink.KeysetHandle r0, com.google.crypto.tink.tinkkey.KeyAccess r1) throws java.io.IOException, java.security.GeneralSecurityException {
            java.lang.String r0 = fromPublicKeysetHandle(r0)
            return r0
    }

    public static java.lang.String fromPublicKeysetHandle(com.google.crypto.tink.KeysetHandle r7) throws java.io.IOException, java.security.GeneralSecurityException {
            com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r7.size()
            if (r2 >= r3) goto Lbd
            com.google.crypto.tink.KeysetHandle$Entry r3 = r7.getAt(r2)
            com.google.crypto.tink.KeyStatus r4 = r3.getStatus()
            com.google.crypto.tink.KeyStatus r5 = com.google.crypto.tink.KeyStatus.ENABLED
            if (r4 == r5) goto L1b
            goto La9
        L1b:
            com.google.crypto.tink.Key r3 = r3.getKey()
            boolean r4 = r3 instanceof com.google.crypto.tink.internal.LegacyProtoKey
            if (r4 == 0) goto Lb5
            com.google.crypto.tink.internal.LegacyProtoKey r3 = (com.google.crypto.tink.internal.LegacyProtoKey) r3
            r4 = 0
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = r3.getSerialization(r4)
            com.google.crypto.tink.proto.OutputPrefixType r4 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r4 == r5) goto L43
            com.google.crypto.tink.proto.OutputPrefixType r4 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r4 != r5) goto L3b
            goto L43
        L3b:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "only OutputPrefixType RAW and TINK are supported"
            r7.<init>(r0)
            throw r7
        L43:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r4 = r3.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r5 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            if (r4 != r5) goto Lad
            java.lang.String r4 = r3.getTypeUrl()
            r4.hashCode()
            int r5 = r4.hashCode()
            r6 = -1
            switch(r5) {
                case -1204668709: goto L71;
                case 516334794: goto L66;
                case 1174255008: goto L5b;
                default: goto L5a;
            }
        L5a:
            goto L7b
        L5b:
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L64
            goto L7b
        L64:
            r6 = 2
            goto L7b
        L66:
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6f
            goto L7b
        L6f:
            r6 = 1
            goto L7b
        L71:
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L7a
            goto L7b
        L7a:
            r6 = r1
        L7b:
            switch(r6) {
                case 0: goto La2;
                case 1: goto L9a;
                case 2: goto L92;
                default: goto L7e;
            }
        L7e:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = r3.getTypeUrl()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "key type %s is not supported"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        L92:
            com.google.gson.JsonObject r3 = convertJwtRsaSsaPss(r3)
            r0.add(r3)
            goto La9
        L9a:
            com.google.gson.JsonObject r3 = convertJwtRsaSsaPkcs1(r3)
            r0.add(r3)
            goto La9
        La2:
            com.google.gson.JsonObject r3 = convertJwtEcdsaKey(r3)
            r0.add(r3)
        La9:
            int r2 = r2 + 1
            goto L7
        Lad:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "only public keys can be converted"
            r7.<init>(r0)
            throw r7
        Lb5:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "only LegacyProtoKey is currently supported"
            r7.<init>(r0)
            throw r7
        Lbd:
            com.google.gson.JsonObject r7 = new com.google.gson.JsonObject
            r7.<init>()
            java.lang.String r1 = "keys"
            r7.add(r1, r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private static java.util.Optional<java.lang.String> getKid(@javax.annotation.Nullable java.lang.Integer r1) {
            if (r1 != 0) goto L7
            java.util.Optional r1 = java.util.Optional.empty()
            return r1
        L7:
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r1.intValue()
            java.nio.ByteBuffer r1 = r0.putInt(r1)
            byte[] r1 = r1.array()
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r1)
            java.util.Optional r1 = java.util.Optional.of(r1)
            return r1
    }

    private static java.lang.String getStringItem(com.google.gson.JsonObject r1, java.lang.String r2) throws java.security.GeneralSecurityException {
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L40
            com.google.gson.JsonElement r0 = r1.get(r2)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L27
            com.google.gson.JsonElement r0 = r1.get(r2)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L27
            com.google.gson.JsonElement r1 = r1.get(r2)
            java.lang.String r1 = r1.getAsString()
            return r1
        L27:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " is not a string"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L40:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " not found"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetHandle toKeysetHandle(java.lang.String r0, com.google.crypto.tink.tinkkey.KeyAccess r1) throws java.io.IOException, java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetHandle r0 = toPublicKeysetHandle(r0)
            return r0
    }

    public static com.google.crypto.tink.KeysetHandle toPublicKeysetHandle(java.lang.String r8) throws java.io.IOException, java.security.GeneralSecurityException {
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.StackOverflowError -> Lc5 com.google.gson.JsonParseException -> Lc7 java.lang.IllegalStateException -> Lc9
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.StackOverflowError -> Lc5 com.google.gson.JsonParseException -> Lc7 java.lang.IllegalStateException -> Lc9
            r1.<init>(r8)     // Catch: java.lang.StackOverflowError -> Lc5 com.google.gson.JsonParseException -> Lc7 java.lang.IllegalStateException -> Lc9
            r0.<init>(r1)     // Catch: java.lang.StackOverflowError -> Lc5 com.google.gson.JsonParseException -> Lc7 java.lang.IllegalStateException -> Lc9
            r8 = 0
            r0.setLenient(r8)     // Catch: java.lang.StackOverflowError -> Lc5 com.google.gson.JsonParseException -> Lc7 java.lang.IllegalStateException -> Lc9
            com.google.gson.JsonElement r0 = com.google.gson.internal.Streams.parse(r0)     // Catch: java.lang.StackOverflowError -> Lc5 com.google.gson.JsonParseException -> Lc7 java.lang.IllegalStateException -> Lc9
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.lang.StackOverflowError -> Lc5 com.google.gson.JsonParseException -> Lc7 java.lang.IllegalStateException -> Lc9
            com.google.crypto.tink.KeysetHandle$Builder r1 = com.google.crypto.tink.KeysetHandle.newBuilder()
            java.lang.String r2 = "keys"
            com.google.gson.JsonElement r0 = r0.get(r2)
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r0.next()
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
            com.google.gson.JsonObject r2 = r2.getAsJsonObject()
            java.lang.String r3 = "alg"
            java.lang.String r4 = getStringItem(r2, r3)
            r5 = 2
            java.lang.String r4 = r4.substring(r8, r5)
            r4.hashCode()
            int r6 = r4.hashCode()
            r7 = -1
            switch(r6) {
                case 2222: goto L64;
                case 2563: goto L59;
                case 2625: goto L50;
                default: goto L4e;
            }
        L4e:
            r5 = r7
            goto L6e
        L50:
            java.lang.String r6 = "RS"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L6e
            goto L4e
        L59:
            java.lang.String r5 = "PS"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L62
            goto L4e
        L62:
            r5 = 1
            goto L6e
        L64:
            java.lang.String r5 = "ES"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6d
            goto L4e
        L6d:
            r5 = r8
        L6e:
            switch(r5) {
                case 0: goto L94;
                case 1: goto L8f;
                case 2: goto L8a;
                default: goto L71;
            }
        L71:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected alg value: "
            r0.<init>(r1)
            java.lang.String r1 = getStringItem(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L8a:
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = convertToRsaSsaPkcs1Key(r2)
            goto L98
        L8f:
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = convertToRsaSsaPssKey(r2)
            goto L98
        L94:
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = convertToEcdsaKey(r2)
        L98:
            com.google.crypto.tink.internal.LegacyProtoKey r3 = new com.google.crypto.tink.internal.LegacyProtoKey
            r4 = 0
            r3.<init>(r2, r4)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r2 = com.google.crypto.tink.KeysetHandle.importKey(r3)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r2 = r2.withRandomId()
            r1.addEntry(r2)
            goto L28
        Lab:
            int r0 = r1.size()
            if (r0 <= 0) goto Lbd
            com.google.crypto.tink.KeysetHandle$Builder$Entry r8 = r1.getAt(r8)
            r8.makePrimary()
            com.google.crypto.tink.KeysetHandle r8 = r1.build()
            return r8
        Lbd:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r8.<init>(r0)
            throw r8
        Lc5:
            r8 = move-exception
            goto Lca
        Lc7:
            r8 = move-exception
            goto Lca
        Lc9:
            r8 = move-exception
        Lca:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "JWK set is invalid JSON"
            r0.<init>(r1, r8)
            throw r0
    }

    private static void validateKeyOpsIsVerify(com.google.gson.JsonObject r4) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "key_ops"
            boolean r1 = r4.has(r0)
            if (r1 != 0) goto L9
            return
        L9:
            com.google.gson.JsonElement r1 = r4.get(r0)
            boolean r1 = r1.isJsonArray()
            if (r1 == 0) goto L79
            com.google.gson.JsonElement r4 = r4.get(r0)
            com.google.gson.JsonArray r4 = r4.getAsJsonArray()
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto L71
            r0 = 0
            com.google.gson.JsonElement r1 = r4.get(r0)
            boolean r1 = r1.isJsonPrimitive()
            if (r1 == 0) goto L69
            com.google.gson.JsonElement r1 = r4.get(r0)
            com.google.gson.JsonPrimitive r1 = r1.getAsJsonPrimitive()
            boolean r1 = r1.isString()
            if (r1 == 0) goto L69
            com.google.gson.JsonElement r1 = r4.get(r0)
            java.lang.String r1 = r1.getAsString()
            java.lang.String r2 = "verify"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4c
            return
        L4c:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "unexpected keyOps value: "
            r2.<init>(r3)
            com.google.gson.JsonElement r4 = r4.get(r0)
            java.lang.String r4 = r4.getAsString()
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L69:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "key_ops is not a string"
            r4.<init>(r0)
            throw r4
        L71:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "key_ops must contain exactly one element"
            r4.<init>(r0)
            throw r4
        L79:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "key_ops is not an array"
            r4.<init>(r0)
            throw r4
    }

    private static void validateUseIsSig(com.google.gson.JsonObject r2) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "use"
            boolean r1 = r2.has(r0)
            if (r1 != 0) goto L9
            return
        L9:
            java.lang.String r1 = "sig"
            expectStringItem(r2, r0, r1)
            return
    }
}
