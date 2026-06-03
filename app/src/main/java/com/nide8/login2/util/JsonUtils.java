package com.nide8.login2.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/util/JsonUtils.class */
public final class JsonUtils {
    public static java.lang.Object parseJson(java.lang.String r3) throws java.io.UncheckedIOException {
            r0 = r3
            java.lang.Object r0 = com.nide8.login2.internal.org.json.simple.JSONValue.parse(r0)     // Catch: com.nide8.login2.internal.org.json.simple.parser.ParseException -> L5
            return r0
        L5:
            r4 = move-exception
            java.lang.String r0 = "Invalid JSON"
            r1 = r4
            java.io.UncheckedIOException r0 = com.nide8.login2.util.IOUtils.newUncheckedIOException(r0, r1)
            throw r0
    }

    public static com.nide8.login2.internal.org.json.simple.JSONObject asObject(java.lang.Object r4) throws java.io.UncheckedIOException {
            r0 = r4
            java.lang.Class<com.nide8.login2.internal.org.json.simple.JSONObject> r1 = com.nide8.login2.internal.org.json.simple.JSONObject.class
            java.lang.String r2 = "an object"
            java.lang.Object r0 = assertJson(r0, r1, r2)
            com.nide8.login2.internal.org.json.simple.JSONObject r0 = (com.nide8.login2.internal.org.json.simple.JSONObject) r0
            return r0
    }

    public static com.nide8.login2.internal.org.json.simple.JSONArray asArray(java.lang.Object r4) throws java.io.UncheckedIOException {
            r0 = r4
            java.lang.Class<com.nide8.login2.internal.org.json.simple.JSONArray> r1 = com.nide8.login2.internal.org.json.simple.JSONArray.class
            java.lang.String r2 = "an array"
            java.lang.Object r0 = assertJson(r0, r1, r2)
            com.nide8.login2.internal.org.json.simple.JSONArray r0 = (com.nide8.login2.internal.org.json.simple.JSONArray) r0
            return r0
    }

    public static java.lang.String asString(java.lang.Object r4) throws java.io.UncheckedIOException {
            r0 = r4
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "a string"
            java.lang.Object r0 = assertJson(r0, r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private static <T> T assertJson(java.lang.Object r3, java.lang.Class<T> r4, java.lang.String r5) {
            r0 = r4
            r1 = r3
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto La
            r0 = r3
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Invalid JSON: not "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.UncheckedIOException r0 = com.nide8.login2.util.IOUtils.newUncheckedIOException(r0)
            throw r0
    }

    private JsonUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
