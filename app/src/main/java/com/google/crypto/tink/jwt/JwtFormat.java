package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
final class JwtFormat {

    static class Parts {
        java.lang.String header;
        java.lang.String payload;
        byte[] signatureOrMac;
        java.lang.String unsignedCompact;

        Parts(java.lang.String r1, byte[] r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.unsignedCompact = r1
                r0.signatureOrMac = r2
                r0.header = r3
                r0.payload = r4
                return
        }
    }

    private JwtFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String createHeader(java.lang.String r2, java.util.Optional<java.lang.String> r3, java.util.Optional<java.lang.String> r4) throws java.security.InvalidAlgorithmParameterException {
            validateAlgorithm(r2)
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            boolean r1 = r4.isPresent()
            if (r1 == 0) goto L19
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "kid"
            r0.addProperty(r1, r4)
        L19:
            java.lang.String r4 = "alg"
            r0.addProperty(r4, r2)
            boolean r2 = r3.isPresent()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r3.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "typ"
            r0.addProperty(r3, r2)
        L2f:
            java.lang.String r2 = r0.toString()
            java.nio.charset.Charset r3 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r2 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r2)
            return r2
    }

    static java.lang.String createSignedCompact(java.lang.String r1, byte[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "."
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = encodeSignature(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    static java.lang.String createUnsignedCompact(java.lang.String r2, java.util.Optional<java.lang.String> r3, com.google.crypto.tink.jwt.RawJwt r4) throws java.security.InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.JwtInvalidException {
            java.lang.String r0 = r4.getJsonPayload()
            boolean r1 = r4.hasTypeHeader()
            if (r1 == 0) goto L13
            java.lang.String r4 = r4.getTypeHeader()
            java.util.Optional r4 = java.util.Optional.of(r4)
            goto L17
        L13:
            java.util.Optional r4 = java.util.Optional.empty()
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = createHeader(r2, r4, r3)
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = encodePayload(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    static java.lang.String decodeHeader(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            byte[] r2 = strictUrlSafeDecode(r2)
            validateUtf8(r2)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.crypto.tink.internal.Util.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    static java.lang.String decodePayload(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            byte[] r2 = strictUrlSafeDecode(r2)
            validateUtf8(r2)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.crypto.tink.internal.Util.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    static byte[] decodeSignature(java.lang.String r0) throws com.google.crypto.tink.jwt.JwtInvalidException {
            byte[] r0 = strictUrlSafeDecode(r0)
            return r0
    }

    static java.lang.String encodePayload(java.lang.String r1) {
            java.nio.charset.Charset r0 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r1)
            return r1
    }

    static java.lang.String encodeSignature(byte[] r0) {
            java.lang.String r0 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r0)
            return r0
    }

    static java.util.Optional<java.lang.Integer> getKeyId(java.lang.String r2) {
            byte[] r2 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r2)
            int r0 = r2.length
            r1 = 4
            if (r0 == r1) goto Ld
            java.util.Optional r2 = java.util.Optional.empty()
            return r2
        Ld:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            int r2 = r2.getInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.Optional r2 = java.util.Optional.of(r2)
            return r2
    }

    static java.util.Optional<java.lang.String> getKid(int r1, com.google.crypto.tink.proto.OutputPrefixType r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r2 != r0) goto L9
            java.util.Optional r1 = java.util.Optional.empty()
            return r1
        L9:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r2 != r0) goto L23
            r2 = 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteBuffer r1 = r2.putInt(r1)
            byte[] r1 = r1.array()
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r1)
            java.util.Optional r1 = java.util.Optional.of(r1)
            return r1
        L23:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "unsupported output prefix type"
            r1.<init>(r2)
            throw r1
    }

    private static java.lang.String getStringHeader(com.google.gson.JsonObject r2, java.lang.String r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            boolean r0 = r2.has(r3)
            java.lang.String r1 = "header "
            if (r0 == 0) goto L42
            com.google.gson.JsonElement r0 = r2.get(r3)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L29
            com.google.gson.JsonElement r0 = r2.get(r3)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L29
            com.google.gson.JsonElement r2 = r2.get(r3)
            java.lang.String r2 = r2.getAsString()
            return r2
        L29:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " is not a string"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L42:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " does not exist"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static java.util.Optional<java.lang.String> getTypeHeader(com.google.gson.JsonObject r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            java.lang.String r0 = "typ"
            boolean r1 = r2.has(r0)
            if (r1 == 0) goto L11
            java.lang.String r2 = getStringHeader(r2, r0)
            java.util.Optional r2 = java.util.Optional.of(r2)
            return r2
        L11:
            java.util.Optional r2 = java.util.Optional.empty()
            return r2
    }

    static boolean isValidUrlsafeBase64Char(char r1) {
            r0 = 97
            if (r1 < r0) goto L8
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L23
        L8:
            r0 = 65
            if (r1 < r0) goto L10
            r0 = 90
            if (r1 <= r0) goto L23
        L10:
            r0 = 48
            if (r1 < r0) goto L18
            r0 = 57
            if (r1 <= r0) goto L23
        L18:
            r0 = 45
            if (r1 == r0) goto L23
            r0 = 95
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            return r1
    }

    static com.google.crypto.tink.jwt.JwtFormat.Parts splitSignedCompact(java.lang.String r5) throws com.google.crypto.tink.jwt.JwtInvalidException {
            validateASCII(r5)
            r0 = 46
            int r1 = r5.lastIndexOf(r0)
            java.lang.String r2 = "only tokens in JWS compact serialization format are supported"
            if (r1 < 0) goto L4c
            r3 = 0
            java.lang.String r4 = r5.substring(r3, r1)
            int r1 = r1 + 1
            java.lang.String r5 = r5.substring(r1)
            byte[] r5 = decodeSignature(r5)
            int r1 = r4.indexOf(r0)
            if (r1 < 0) goto L46
            java.lang.String r3 = r4.substring(r3, r1)
            int r1 = r1 + 1
            java.lang.String r1 = r4.substring(r1)
            int r0 = r1.indexOf(r0)
            if (r0 > 0) goto L40
            java.lang.String r0 = decodeHeader(r3)
            java.lang.String r1 = decodePayload(r1)
            com.google.crypto.tink.jwt.JwtFormat$Parts r2 = new com.google.crypto.tink.jwt.JwtFormat$Parts
            r2.<init>(r4, r5, r0, r1)
            return r2
        L40:
            com.google.crypto.tink.jwt.JwtInvalidException r5 = new com.google.crypto.tink.jwt.JwtInvalidException
            r5.<init>(r2)
            throw r5
        L46:
            com.google.crypto.tink.jwt.JwtInvalidException r5 = new com.google.crypto.tink.jwt.JwtInvalidException
            r5.<init>(r2)
            throw r5
        L4c:
            com.google.crypto.tink.jwt.JwtInvalidException r5 = new com.google.crypto.tink.jwt.JwtInvalidException
            r5.<init>(r2)
            throw r5
    }

    static byte[] strictUrlSafeDecode(java.lang.String r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r0 = 0
        L1:
            int r1 = r3.length()
            if (r0 >= r1) goto L1c
            char r1 = r3.charAt(r0)
            boolean r1 = isValidUrlsafeBase64Char(r1)
            if (r1 == 0) goto L14
            int r0 = r0 + 1
            goto L1
        L14:
            com.google.crypto.tink.jwt.JwtInvalidException r3 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r0 = "invalid encoding"
            r3.<init>(r0)
            throw r3
        L1c:
            byte[] r3 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r3)     // Catch: java.lang.IllegalArgumentException -> L21
            return r3
        L21:
            r3 = move-exception
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid encoding: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static void validateASCII(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r0 = 0
        L1:
            int r1 = r2.length()
            if (r0 >= r1) goto L1a
            char r1 = r2.charAt(r0)
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 > 0) goto L12
            int r0 = r0 + 1
            goto L1
        L12:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r0 = "Non ascii character"
            r2.<init>(r0)
            throw r2
        L1a:
            return
    }

    private static void validateAlgorithm(java.lang.String r3) throws java.security.InvalidAlgorithmParameterException {
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case 66245349: goto L92;
                case 66246401: goto L87;
                case 66248104: goto L7c;
                case 69015912: goto L71;
                case 69016964: goto L66;
                case 69018667: goto L5b;
                case 76404080: goto L50;
                case 76405132: goto L45;
                case 76406835: goto L37;
                case 78251122: goto L29;
                case 78252174: goto L1b;
                case 78253877: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L9c
        Ld:
            java.lang.String r0 = "RS512"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L17
            goto L9c
        L17:
            r1 = 11
            goto L9c
        L1b:
            java.lang.String r0 = "RS384"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L25
            goto L9c
        L25:
            r1 = 10
            goto L9c
        L29:
            java.lang.String r0 = "RS256"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L33
            goto L9c
        L33:
            r1 = 9
            goto L9c
        L37:
            java.lang.String r0 = "PS512"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto L9c
        L41:
            r1 = 8
            goto L9c
        L45:
            java.lang.String r0 = "PS384"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4e
            goto L9c
        L4e:
            r1 = 7
            goto L9c
        L50:
            java.lang.String r0 = "PS256"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L59
            goto L9c
        L59:
            r1 = 6
            goto L9c
        L5b:
            java.lang.String r0 = "HS512"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L64
            goto L9c
        L64:
            r1 = 5
            goto L9c
        L66:
            java.lang.String r0 = "HS384"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6f
            goto L9c
        L6f:
            r1 = 4
            goto L9c
        L71:
            java.lang.String r0 = "HS256"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L7a
            goto L9c
        L7a:
            r1 = 3
            goto L9c
        L7c:
            java.lang.String r0 = "ES512"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L85
            goto L9c
        L85:
            r1 = 2
            goto L9c
        L87:
            java.lang.String r0 = "ES384"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L90
            goto L9c
        L90:
            r1 = 1
            goto L9c
        L92:
            java.lang.String r0 = "ES256"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L9b
            goto L9c
        L9b:
            r1 = 0
        L9c:
            switch(r1) {
                case 0: goto Lb4;
                case 1: goto Lb4;
                case 2: goto Lb4;
                case 3: goto Lb4;
                case 4: goto Lb4;
                case 5: goto Lb4;
                case 6: goto Lb4;
                case 7: goto Lb4;
                case 8: goto Lb4;
                case 9: goto Lb4;
                case 10: goto Lb4;
                case 11: goto Lb4;
                default: goto L9f;
            }
        L9f:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid algorithm: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        Lb4:
            return
    }

    static void validateHeader(java.lang.String r2, java.util.Optional<java.lang.String> r3, java.util.Optional<java.lang.String> r4, com.google.gson.JsonObject r5) throws java.security.InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.JwtInvalidException {
            validateAlgorithm(r2)
            java.lang.String r0 = "alg"
            java.lang.String r0 = getStringHeader(r5, r0)
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L66
            java.lang.String r2 = "crit"
            boolean r2 = r5.has(r2)
            if (r2 != 0) goto L5e
            boolean r2 = r3.isPresent()
            if (r2 == 0) goto L2c
            boolean r2 = r4.isPresent()
            if (r2 != 0) goto L24
            goto L2c
        L24:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r3 = "custom_kid can only be set for RAW keys."
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.String r2 = "kid"
            boolean r2 = r5.has(r2)
            boolean r0 = r3.isPresent()
            if (r0 == 0) goto L4c
            if (r2 == 0) goto L44
            java.lang.Object r3 = r3.get()
            java.lang.String r3 = (java.lang.String) r3
            validateKidInHeader(r3, r5)
            goto L4c
        L44:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r3 = "missing kid in header"
            r2.<init>(r3)
            throw r2
        L4c:
            boolean r3 = r4.isPresent()
            if (r3 == 0) goto L5d
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r4.get()
            java.lang.String r2 = (java.lang.String) r2
            validateKidInHeader(r2, r5)
        L5d:
            return
        L5e:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r3 = "all tokens with crit headers are rejected"
            r2.<init>(r3)
            throw r2
        L66:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r4 = "invalid algorithm; expected %s, got %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r3.<init>(r2)
            throw r3
    }

    private static void validateKidInHeader(java.lang.String r1, com.google.gson.JsonObject r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            java.lang.String r0 = "kid"
            java.lang.String r2 = getStringHeader(r2, r0)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "invalid kid in header"
            r1.<init>(r2)
            throw r1
    }

    static void validateUtf8(byte[] r1) throws com.google.crypto.tink.jwt.JwtInvalidException {
            java.nio.charset.Charset r0 = com.google.crypto.tink.internal.Util.UTF_8
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch: java.nio.charset.CharacterCodingException -> Le
            r0.decode(r1)     // Catch: java.nio.charset.CharacterCodingException -> Le
            return
        Le:
            r1 = move-exception
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r1 = r1.getMessage()
            r0.<init>(r1)
            throw r0
    }
}
