package com.google.gson.stream;

/* JADX INFO: loaded from: classes2.dex */
public enum JsonToken extends java.lang.Enum<com.google.gson.stream.JsonToken> {
    private static final /* synthetic */ com.google.gson.stream.JsonToken[] $VALUES = null;
    public static final com.google.gson.stream.JsonToken BEGIN_ARRAY = null;
    public static final com.google.gson.stream.JsonToken BEGIN_OBJECT = null;
    public static final com.google.gson.stream.JsonToken BOOLEAN = null;
    public static final com.google.gson.stream.JsonToken END_ARRAY = null;
    public static final com.google.gson.stream.JsonToken END_DOCUMENT = null;
    public static final com.google.gson.stream.JsonToken END_OBJECT = null;
    public static final com.google.gson.stream.JsonToken NAME = null;
    public static final com.google.gson.stream.JsonToken NULL = null;
    public static final com.google.gson.stream.JsonToken NUMBER = null;
    public static final com.google.gson.stream.JsonToken STRING = null;

    static {
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "BEGIN_ARRAY"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.BEGIN_ARRAY = r0
            com.google.gson.stream.JsonToken r1 = new com.google.gson.stream.JsonToken
            java.lang.String r2 = "END_ARRAY"
            r3 = 1
            r1.<init>(r2, r3)
            com.google.gson.stream.JsonToken.END_ARRAY = r1
            com.google.gson.stream.JsonToken r2 = new com.google.gson.stream.JsonToken
            java.lang.String r3 = "BEGIN_OBJECT"
            r4 = 2
            r2.<init>(r3, r4)
            com.google.gson.stream.JsonToken.BEGIN_OBJECT = r2
            com.google.gson.stream.JsonToken r3 = new com.google.gson.stream.JsonToken
            java.lang.String r4 = "END_OBJECT"
            r5 = 3
            r3.<init>(r4, r5)
            com.google.gson.stream.JsonToken.END_OBJECT = r3
            com.google.gson.stream.JsonToken r4 = new com.google.gson.stream.JsonToken
            java.lang.String r5 = "NAME"
            r6 = 4
            r4.<init>(r5, r6)
            com.google.gson.stream.JsonToken.NAME = r4
            com.google.gson.stream.JsonToken r5 = new com.google.gson.stream.JsonToken
            java.lang.String r6 = "STRING"
            r7 = 5
            r5.<init>(r6, r7)
            com.google.gson.stream.JsonToken.STRING = r5
            com.google.gson.stream.JsonToken r6 = new com.google.gson.stream.JsonToken
            java.lang.String r7 = "NUMBER"
            r8 = 6
            r6.<init>(r7, r8)
            com.google.gson.stream.JsonToken.NUMBER = r6
            com.google.gson.stream.JsonToken r7 = new com.google.gson.stream.JsonToken
            java.lang.String r8 = "BOOLEAN"
            r9 = 7
            r7.<init>(r8, r9)
            com.google.gson.stream.JsonToken.BOOLEAN = r7
            com.google.gson.stream.JsonToken r8 = new com.google.gson.stream.JsonToken
            java.lang.String r9 = "NULL"
            r10 = 8
            r8.<init>(r9, r10)
            com.google.gson.stream.JsonToken.NULL = r8
            com.google.gson.stream.JsonToken r9 = new com.google.gson.stream.JsonToken
            java.lang.String r10 = "END_DOCUMENT"
            r11 = 9
            r9.<init>(r10, r11)
            com.google.gson.stream.JsonToken.END_DOCUMENT = r9
            com.google.gson.stream.JsonToken[] r0 = new com.google.gson.stream.JsonToken[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.google.gson.stream.JsonToken.$VALUES = r0
            return
    }

    JsonToken(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.stream.JsonToken valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.stream.JsonToken> r0 = com.google.gson.stream.JsonToken.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.stream.JsonToken r1 = (com.google.gson.stream.JsonToken) r1
            return r1
    }

    public static com.google.gson.stream.JsonToken[] values() {
            com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.stream.JsonToken[] r0 = (com.google.gson.stream.JsonToken[]) r0
            return r0
    }
}
