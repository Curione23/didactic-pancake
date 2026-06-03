package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
final class JsonUtil {
    private JsonUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isValidString(java.lang.String r0) {
            boolean r0 = com.google.crypto.tink.internal.JsonParser.isValidString(r0)
            return r0
    }

    static com.google.gson.JsonObject parseJson(java.lang.String r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.gson.JsonElement r3 = com.google.crypto.tink.internal.JsonParser.parse(r3)     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            com.google.gson.JsonObject r3 = r3.getAsJsonObject()     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            return r3
        L9:
            r3 = move-exception
            goto Le
        Lb:
            r3 = move-exception
            goto Le
        Ld:
            r3 = move-exception
        Le:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid JSON: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static com.google.gson.JsonArray parseJsonArray(java.lang.String r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.gson.JsonElement r3 = com.google.crypto.tink.internal.JsonParser.parse(r3)     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            com.google.gson.JsonArray r3 = r3.getAsJsonArray()     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            return r3
        L9:
            r3 = move-exception
            goto Le
        Lb:
            r3 = move-exception
            goto Le
        Ld:
            r3 = move-exception
        Le:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid JSON: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
