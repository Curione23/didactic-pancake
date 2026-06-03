package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
final class JsonUtil {

    static final class BooleanField extends net.openid.appauth.JsonUtil.Field<java.lang.Boolean> {
        BooleanField(java.lang.String r1, boolean r2) {
                r0 = this;
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.<init>(r1, r2)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.openid.appauth.JsonUtil.Field
        java.lang.Boolean convert(java.lang.String r1) {
                r0 = this;
                boolean r1 = java.lang.Boolean.parseBoolean(r1)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // net.openid.appauth.JsonUtil.Field
        /* bridge */ /* synthetic */ java.lang.Boolean convert(java.lang.String r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.convert(r1)
                return r1
        }
    }

    static abstract class Field<T> {
        public final T defaultValue;
        public final java.lang.String key;

        Field(java.lang.String r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.defaultValue = r2
                return
        }

        abstract T convert(java.lang.String r1);
    }

    static abstract class ListField<T> {
        public final java.util.List<T> defaultValue;
        public final java.lang.String key;

        ListField(java.lang.String r1, java.util.List<T> r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.defaultValue = r2
                return
        }

        abstract T convert(java.lang.String r1);
    }

    static final class StringField extends net.openid.appauth.JsonUtil.Field<java.lang.String> {
        StringField(java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        StringField(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // net.openid.appauth.JsonUtil.Field
        /* bridge */ /* synthetic */ java.lang.String convert(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = r0.convert2(r1)
                return r1
        }

        @Override // net.openid.appauth.JsonUtil.Field
        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        java.lang.String convert2(java.lang.String r1) {
                r0 = this;
                return r1
        }
    }

    static final class StringListField extends net.openid.appauth.JsonUtil.ListField<java.lang.String> {
        StringListField(java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        StringListField(java.lang.String r1, java.util.List<java.lang.String> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // net.openid.appauth.JsonUtil.ListField
        /* bridge */ /* synthetic */ java.lang.String convert(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = r0.convert2(r1)
                return r1
        }

        @Override // net.openid.appauth.JsonUtil.ListField
        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        java.lang.String convert2(java.lang.String r1) {
                r0 = this;
                return r1
        }
    }

    static final class UriField extends net.openid.appauth.JsonUtil.Field<android.net.Uri> {
        UriField(java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        UriField(java.lang.String r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.openid.appauth.JsonUtil.Field
        android.net.Uri convert(java.lang.String r1) {
                r0 = this;
                android.net.Uri r1 = android.net.Uri.parse(r1)
                return r1
        }

        @Override // net.openid.appauth.JsonUtil.Field
        /* bridge */ /* synthetic */ android.net.Uri convert(java.lang.String r1) {
                r0 = this;
                android.net.Uri r1 = r0.convert(r1)
                return r1
        }
    }

    private JsonUtil() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This type is not intended to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static <T> T get(org.json.JSONObject r1, net.openid.appauth.JsonUtil.Field<T> r2) {
            java.lang.String r0 = r2.key     // Catch: org.json.JSONException -> L16
            boolean r0 = r1.has(r0)     // Catch: org.json.JSONException -> L16
            if (r0 != 0) goto Lb
            T r1 = r2.defaultValue     // Catch: org.json.JSONException -> L16
            return r1
        Lb:
            java.lang.String r0 = r2.key     // Catch: org.json.JSONException -> L16
            java.lang.String r1 = r1.getString(r0)     // Catch: org.json.JSONException -> L16
            java.lang.Object r1 = r2.convert(r1)     // Catch: org.json.JSONException -> L16
            return r1
        L16:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected JSONException"
            r2.<init>(r0, r1)
            throw r2
    }

    public static <T> java.util.List<T> get(org.json.JSONObject r3, net.openid.appauth.JsonUtil.ListField<T> r4) {
            java.lang.String r0 = r4.key     // Catch: org.json.JSONException -> L4d
            boolean r0 = r3.has(r0)     // Catch: org.json.JSONException -> L4d
            if (r0 != 0) goto Lb
            java.util.List<T> r3 = r4.defaultValue     // Catch: org.json.JSONException -> L4d
            return r3
        Lb:
            java.lang.String r0 = r4.key     // Catch: org.json.JSONException -> L4d
            java.lang.Object r3 = r3.get(r0)     // Catch: org.json.JSONException -> L4d
            boolean r0 = r3 instanceof org.json.JSONArray     // Catch: org.json.JSONException -> L4d
            if (r0 == 0) goto L32
            org.json.JSONArray r3 = (org.json.JSONArray) r3     // Catch: org.json.JSONException -> L4d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> L4d
            r0.<init>()     // Catch: org.json.JSONException -> L4d
            r1 = 0
        L1d:
            int r2 = r3.length()     // Catch: org.json.JSONException -> L4d
            if (r1 >= r2) goto L31
            java.lang.String r2 = r3.getString(r1)     // Catch: org.json.JSONException -> L4d
            java.lang.Object r2 = r4.convert(r2)     // Catch: org.json.JSONException -> L4d
            r0.add(r2)     // Catch: org.json.JSONException -> L4d
            int r1 = r1 + 1
            goto L1d
        L31:
            return r0
        L32:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: org.json.JSONException -> L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4d
            r0.<init>()     // Catch: org.json.JSONException -> L4d
            java.lang.String r4 = r4.key     // Catch: org.json.JSONException -> L4d
            java.lang.StringBuilder r4 = r0.append(r4)     // Catch: org.json.JSONException -> L4d
            java.lang.String r0 = " does not contain the expected JSON array"
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: org.json.JSONException -> L4d
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L4d
            r3.<init>(r4)     // Catch: org.json.JSONException -> L4d
            throw r3     // Catch: org.json.JSONException -> L4d
        L4d:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected JSONException"
            r4.<init>(r0, r3)
            throw r4
    }

    public static org.json.JSONObject getJsonObjectIfDefined(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            org.json.JSONObject r2 = r2.optJSONObject(r3)
            if (r2 == 0) goto L19
            return r2
        L19:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "field \""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" is mapped to a null value"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.Long getLongIfDefined(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            r1 = 0
            if (r0 == 0) goto L21
            boolean r0 = r2.isNull(r3)
            if (r0 == 0) goto L18
            goto L21
        L18:
            long r2 = r2.getLong(r3)     // Catch: org.json.JSONException -> L21
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L21
            return r2
        L21:
            return r1
    }

    public static java.lang.String getString(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            java.lang.String r1 = "field \""
            if (r0 == 0) goto L32
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L19
            return r2
        L19:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" is mapped to a null value"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L32:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" not found in json object"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.String getStringIfDefined(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L19
            return r2
        L19:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "field \""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" is mapped to a null value"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.util.List<java.lang.String> getStringList(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            if (r0 == 0) goto L19
            org.json.JSONArray r2 = r2.getJSONArray(r3)
            java.util.List r2 = toStringList(r2)
            return r2
        L19:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "field \""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" not found in json object"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.util.List<java.lang.String> getStringListIfDefined(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            org.json.JSONArray r2 = r2.getJSONArray(r3)
            if (r2 == 0) goto L1d
            java.util.List r2 = toStringList(r2)
            return r2
        L1d:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "field \""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" is mapped to a null value"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.util.Map<java.lang.String, java.lang.String> getStringMap(org.json.JSONObject r4, java.lang.String r5) throws org.json.JSONException {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r4, r1)
            java.lang.String r1 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r5, r1)
            boolean r1 = r4.has(r5)
            if (r1 != 0) goto L16
            return r0
        L16:
            org.json.JSONObject r4 = r4.getJSONObject(r5)
            java.util.Iterator r5 = r4.keys()
        L1e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r4.getString(r1)
            java.lang.String r3 = "additional parameter values must not be null"
            java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r1, r2)
            goto L1e
        L3a:
            return r0
    }

    public static android.net.Uri getUri(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L15
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L15:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "field \""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" is mapped to a null value"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static android.net.Uri getUriIfDefined(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            java.lang.String r2 = r2.getString(r3)
            if (r2 == 0) goto L1d
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L1d:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "field \""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" is mapped to a null value"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.util.List<android.net.Uri> getUriList(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.has(r3)
            if (r0 == 0) goto L19
            org.json.JSONArray r2 = r2.getJSONArray(r3)
            java.util.List r2 = toUriList(r2)
            return r2
        L19:
            org.json.JSONException r2 = new org.json.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "field \""
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\" not found in json object"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static org.json.JSONObject mapToJsonObject(java.util.Map<java.lang.String, java.lang.String> r4) {
            net.openid.appauth.Preconditions.checkNotNull(r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "map entries must not have null keys"
            net.openid.appauth.Preconditions.checkNotNull(r2, r3)
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "map entries must not have null values"
            net.openid.appauth.Preconditions.checkNotNull(r2, r3)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            put(r0, r2, r1)
            goto L10
        L42:
            return r0
    }

    public static void put(org.json.JSONObject r2, java.lang.String r3, int r4) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "value must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r0, r1)
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L17
            return
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract, ex"
            r2.<init>(r3)
            throw r2
    }

    public static void put(org.json.JSONObject r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "value must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L13
            return
        L13:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract"
            r2.<init>(r3, r1)
            throw r2
    }

    public static void put(org.json.JSONObject r1, java.lang.String r2, org.json.JSONArray r3) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "value must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L13
            return
        L13:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract"
            r2.<init>(r3, r1)
            throw r2
    }

    public static void put(org.json.JSONObject r1, java.lang.String r2, org.json.JSONObject r3) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "value must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L13
            return
        L13:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract"
            r2.<init>(r3, r1)
            throw r2
    }

    public static void putIfNotNull(org.json.JSONObject r1, java.lang.String r2, android.net.Uri r3) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            if (r3 != 0) goto Ld
            return
        Ld:
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L15
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L15
            return
        L15:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract"
            r2.<init>(r3, r1)
            throw r2
    }

    public static void putIfNotNull(org.json.JSONObject r1, java.lang.String r2, java.lang.Long r3) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            if (r3 != 0) goto Ld
            return
        Ld:
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract"
            r2.<init>(r3, r1)
            throw r2
    }

    static void putIfNotNull(org.json.JSONObject r4, java.lang.String r5, java.lang.Object r6) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r5, r0)
            if (r6 != 0) goto Ld
            return
        Ld:
            boolean r0 = r6 instanceof java.util.Collection     // Catch: org.json.JSONException -> L4b
            if (r0 == 0) goto L1c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4b
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: org.json.JSONException -> L4b
            r0.<init>(r6)     // Catch: org.json.JSONException -> L4b
            r4.put(r5, r0)     // Catch: org.json.JSONException -> L4b
            goto L4a
        L1c:
            boolean r0 = r6 instanceof java.util.Map     // Catch: org.json.JSONException -> L4b
            if (r0 == 0) goto L47
            java.util.Map r6 = (java.util.Map) r6     // Catch: org.json.JSONException -> L4b
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4b
            r0.<init>()     // Catch: org.json.JSONException -> L4b
            java.util.Set r1 = r6.keySet()     // Catch: org.json.JSONException -> L4b
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L4b
        L2f:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L4b
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L4b
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L4b
            java.lang.Object r3 = r6.get(r2)     // Catch: org.json.JSONException -> L4b
            putIfNotNull(r0, r2, r3)     // Catch: org.json.JSONException -> L4b
            goto L2f
        L43:
            r4.put(r5, r0)     // Catch: org.json.JSONException -> L4b
            goto L4a
        L47:
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L4b
        L4a:
            return
        L4b:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "JSONException thrown in violation of contract"
            r5.<init>(r6, r4)
            throw r5
    }

    public static void putIfNotNull(org.json.JSONObject r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            if (r3 != 0) goto Ld
            return
        Ld:
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract"
            r2.<init>(r3, r1)
            throw r2
    }

    public static void putIfNotNull(org.json.JSONObject r1, java.lang.String r2, org.json.JSONObject r3) {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "field must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            if (r3 != 0) goto Ld
            return
        Ld:
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "JSONException thrown in violation of contract"
            r2.<init>(r3, r1)
            throw r2
    }

    public static org.json.JSONArray toJsonArray(java.lang.Iterable<?> r2) {
            java.lang.String r0 = "objects cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = r1.toString()
            r0.put(r1)
            goto Le
        L20:
            return r0
    }

    public static java.util.List<java.lang.Object> toList(org.json.JSONArray r4) throws org.json.JSONException {
            java.lang.String r0 = "jsonArray must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lb:
            int r2 = r4.length()
            if (r1 >= r2) goto L30
            java.lang.Object r2 = r4.get(r1)
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L20
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            java.util.List r2 = toList(r2)
            goto L2a
        L20:
            boolean r3 = r2 instanceof org.json.JSONObject
            if (r3 == 0) goto L2a
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.util.Map r2 = toMap(r2)
        L2a:
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L30:
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.Object> toMap(org.json.JSONObject r5) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r5, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r5.keys()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L29
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.List r3 = toList(r3)
            goto L33
        L29:
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L33
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.Map r3 = toMap(r3)
        L33:
            r0.put(r2, r3)
            goto Le
        L37:
            return r0
    }

    public static java.util.List<java.lang.String> toStringList(org.json.JSONArray r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L20
            r1 = 0
        L8:
            int r2 = r3.length()
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r3.get(r1)
            java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            int r1 = r1 + 1
            goto L8
        L20:
            return r0
    }

    public static java.util.List<android.net.Uri> toUriList(org.json.JSONArray r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L24
            r1 = 0
        L8:
            int r2 = r3.length()
            if (r1 >= r2) goto L24
            java.lang.Object r2 = r3.get(r1)
            java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L8
        L24:
            return r0
    }
}
