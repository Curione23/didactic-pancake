package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONArray.class */
public class JSONArray implements java.lang.Iterable<java.lang.Object> {
    private final java.util.ArrayList<java.lang.Object> myArrayList;

    public JSONArray() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.myArrayList = r1
            return
    }

    public JSONArray(org.json.JSONTokener r4) throws org.json.JSONException {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            char r0 = r0.nextClean()
            r1 = 91
            if (r0 == r1) goto L14
            r0 = r4
            java.lang.String r1 = "A JSONArray text must start with '['"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L14:
            r0 = r4
            char r0 = r0.nextClean()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L24
            r0 = r4
            java.lang.String r1 = "Expected a ',' or ']'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L24:
            r0 = r5
            r1 = 93
            if (r0 == r1) goto Lad
            r0 = r4
            r0.back()
        L2e:
            r0 = r4
            char r0 = r0.nextClean()
            r1 = 44
            if (r0 != r1) goto L49
            r0 = r4
            r0.back()
            r0 = r3
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            java.lang.Object r1 = org.json.JSONObject.NULL
            boolean r0 = r0.add(r1)
            goto L59
        L49:
            r0 = r4
            r0.back()
            r0 = r3
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r4
            java.lang.Object r1 = r1.nextValue()
            boolean r0 = r0.add(r1)
        L59:
            r0 = r4
            char r0 = r0.nextClean()
            switch(r0) {
                case 0: goto L80;
                case 44: goto L87;
                case 93: goto La5;
                default: goto La6;
            }
        L80:
            r0 = r4
            java.lang.String r1 = "Expected a ',' or ']'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L87:
            r0 = r4
            char r0 = r0.nextClean()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L97
            r0 = r4
            java.lang.String r1 = "Expected a ',' or ']'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L97:
            r0 = r5
            r1 = 93
            if (r0 != r1) goto L9e
            return
        L9e:
            r0 = r4
            r0.back()
            goto L2e
        La5:
            return
        La6:
            r0 = r4
            java.lang.String r1 = "Expected a ',' or ']'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        Lad:
            return
    }

    public JSONArray(java.lang.String r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            org.json.JSONTokener r1 = new org.json.JSONTokener
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.<init>(r1)
            return
    }

    public JSONArray(java.util.Collection<?> r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            if (r0 != 0) goto L16
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.myArrayList = r1
            goto L2d
        L16:
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r6
            int r3 = r3.size()
            r2.<init>(r3)
            r0.myArrayList = r1
            r0 = r5
            r1 = r6
            r2 = 1
            r0.addAll(r1, r2)
        L2d:
            return
    }

    public JSONArray(java.lang.Iterable<?> r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 != 0) goto L9
            return
        L9:
            r0 = r4
            r1 = r5
            r2 = 1
            r0.addAll(r1, r2)
            return
    }

    public JSONArray(org.json.JSONArray r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            if (r0 != 0) goto L16
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.myArrayList = r1
            goto L25
        L16:
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r6
            java.util.ArrayList<java.lang.Object> r3 = r3.myArrayList
            r2.<init>(r3)
            r0.myArrayList = r1
        L25:
            return
    }

    public JSONArray(java.lang.Object r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L18
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "JSONArray initial value should be a string or collection or array."
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r4
            r1 = r5
            r2 = 1
            r0.addAll(r1, r2)
            return
    }

    public JSONArray(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            if (r0 >= 0) goto L12
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "JSONArray initial capacity cannot be negative."
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.myArrayList = r1
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Object> iterator() {
            r2 = this;
            r0 = r2
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public java.lang.Object get(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.opt(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2a
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONArray["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] not found."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L2a:
            r0 = r7
            return r0
    }

    public boolean getBoolean(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            r0 = r7
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L25
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L25
        L23:
            r0 = 0
            return r0
        L25:
            r0 = r7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            r0 = r7
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L44
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L44
        L42:
            r0 = 1
            return r0
        L44:
            r0 = r6
            java.lang.String r1 = "boolean"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public double getDouble(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L15
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            return r0
        L15:
            r0 = r7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1d
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Exception -> L1d
            return r0
        L1d:
            r8 = move-exception
            r0 = r6
            java.lang.String r1 = "double"
            r2 = r7
            r3 = r8
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public float getFloat(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L15
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
        L15:
            r0 = r7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1d
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Exception -> L1d
            return r0
        L1d:
            r8 = move-exception
            r0 = r6
            java.lang.String r1 = "float"
            r2 = r7
            r3 = r8
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public java.lang.Number getNumber(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Number     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L12
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L1a
            return r0
        L12:
            r0 = r7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1a
            java.lang.Number r0 = org.json.JSONObject.stringToNumber(r0)     // Catch: java.lang.Exception -> L1a
            return r0
        L1a:
            r8 = move-exception
            r0 = r6
            java.lang.String r1 = "number"
            r2 = r7
            r3 = r8
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public <E extends java.lang.Enum<E>> E getEnum(java.lang.Class<E> r6, int r7) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Enum r0 = r0.optEnum(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2f
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "enum of type "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r2 = org.json.JSONObject.quote(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r5
            r3 = r7
            java.lang.Object r2 = r2.opt(r3)
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
        L2f:
            r0 = r8
            return r0
    }

    public java.math.BigDecimal getBigDecimal(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            r1 = 0
            java.math.BigDecimal r0 = org.json.JSONObject.objectToBigDecimal(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L19
            r0 = r6
            java.lang.String r1 = "BigDecimal"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
        L19:
            r0 = r8
            return r0
    }

    public java.math.BigInteger getBigInteger(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            r1 = 0
            java.math.BigInteger r0 = org.json.JSONObject.objectToBigInteger(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L19
            r0 = r6
            java.lang.String r1 = "BigInteger"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
        L19:
            r0 = r8
            return r0
    }

    public int getInt(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L15
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L15:
            r0 = r7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L1d
            return r0
        L1d:
            r8 = move-exception
            r0 = r6
            java.lang.String r1 = "int"
            r2 = r7
            r3 = r8
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public org.json.JSONArray getJSONArray(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L12
            r0 = r7
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
        L12:
            r0 = r6
            java.lang.String r1 = "JSONArray"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public org.json.JSONObject getJSONObject(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L12
            r0 = r7
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L12:
            r0 = r6
            java.lang.String r1 = "JSONObject"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public long getLong(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L15
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L15:
            r0 = r7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1d
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L1d
            return r0
        L1d:
            r8 = move-exception
            r0 = r6
            java.lang.String r1 = "long"
            r2 = r7
            r3 = r8
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public java.lang.String getString(int r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L12
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            r0 = r6
            java.lang.String r1 = "String"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public boolean isNull(int r5) {
            r4 = this;
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r4
            r2 = r5
            java.lang.Object r1 = r1.opt(r2)
            boolean r0 = r0.equals(r1)
            return r0
    }

    public java.lang.String join(java.lang.String r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            int r0 = r0.length()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Lc
            java.lang.String r0 = ""
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r5
            java.util.ArrayList<java.lang.Object> r2 = r2.myArrayList
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = org.json.JSONObject.valueToString(r2)
            r1.<init>(r2)
            r8 = r0
            r0 = 1
            r9 = r0
        L22:
            r0 = r9
            r1 = r7
            if (r0 >= r1) goto L43
            r0 = r8
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.util.ArrayList<java.lang.Object> r1 = r1.myArrayList
            r2 = r9
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = org.json.JSONObject.valueToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r9 = r9 + 1
            goto L22
        L43:
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int length() {
            r2 = this;
            r0 = r2
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            int r0 = r0.size()
            return r0
    }

    public void clear() {
            r2 = this;
            r0 = r2
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r0.clear()
            return
    }

    public java.lang.Object opt(int r4) {
            r3 = this;
            r0 = r4
            if (r0 < 0) goto Lc
            r0 = r4
            r1 = r3
            int r1 = r1.length()
            if (r0 < r1) goto L10
        Lc:
            r0 = 0
            goto L18
        L10:
            r0 = r3
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
        L18:
            return r0
    }

    public boolean optBoolean(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            return r0
    }

    public boolean optBoolean(int r4, boolean r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.Exception -> L6
            return r0
        L6:
            r6 = move-exception
            r0 = r5
            return r0
    }

    public double optDouble(int r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            double r0 = r0.optDouble(r1, r2)
            return r0
    }

    public double optDouble(int r5, double r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            java.lang.Number r0 = r0.optNumber(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lf
            r0 = r6
            return r0
        Lf:
            r0 = r8
            double r0 = r0.doubleValue()
            r9 = r0
            r0 = r9
            return r0
    }

    public float optFloat(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 2143289344(0x7fc00000, float:NaN)
            float r0 = r0.optFloat(r1, r2)
            return r0
    }

    public float optFloat(int r5, float r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            java.lang.Number r0 = r0.optNumber(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Ld
            r0 = r6
            return r0
        Ld:
            r0 = r7
            float r0 = r0.floatValue()
            r8 = r0
            r0 = r8
            return r0
    }

    public int optInt(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public int optInt(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            java.lang.Number r0 = r0.optNumber(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Ld
            r0 = r6
            return r0
        Ld:
            r0 = r7
            int r0 = r0.intValue()
            return r0
    }

    public <E extends java.lang.Enum<E>> E optEnum(java.lang.Class<E> r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            java.lang.Enum r0 = r0.optEnum(r1, r2, r3)
            return r0
    }

    public <E extends java.lang.Enum<E>> E optEnum(java.lang.Class<E> r4, int r5, E r6) {
            r3 = this;
            r0 = r3
            r1 = r5
            java.lang.Object r0 = r0.opt(r1)     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            r7 = r0
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            r1 = r7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            if (r0 == 0) goto L14
            r0 = r6
            return r0
        L14:
            r0 = r4
            r1 = r7
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            boolean r0 = r0.isAssignableFrom(r1)     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            if (r0 == 0) goto L2a
            r0 = r7
            java.lang.Enum r0 = (java.lang.Enum) r0     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            r8 = r0
            r0 = r8
            return r0
        L2a:
            r0 = r4
            r1 = r7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L34 java.lang.NullPointerException -> L38
            return r0
        L34:
            r7 = move-exception
            r0 = r6
            return r0
        L38:
            r7 = move-exception
            r0 = r6
            return r0
    }

    public java.math.BigInteger optBigInteger(int r4, java.math.BigInteger r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            r0 = r6
            r1 = r5
            java.math.BigInteger r0 = org.json.JSONObject.objectToBigInteger(r0, r1)
            return r0
    }

    public java.math.BigDecimal optBigDecimal(int r4, java.math.BigDecimal r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            r0 = r6
            r1 = r5
            java.math.BigDecimal r0 = org.json.JSONObject.objectToBigDecimal(r0, r1)
            return r0
    }

    public org.json.JSONArray optJSONArray(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L14
            r0 = r5
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public org.json.JSONObject optJSONObject(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L14
            r0 = r5
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public long optLong(int r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            long r0 = r0.optLong(r1, r2)
            return r0
    }

    public long optLong(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            java.lang.Number r0 = r0.optNumber(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lf
            r0 = r6
            return r0
        Lf:
            r0 = r8
            long r0 = r0.longValue()
            return r0
    }

    public java.lang.Number optNumber(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            java.lang.Number r0 = r0.optNumber(r1, r2)
            return r0
    }

    public java.lang.Number optNumber(int r4, java.lang.Number r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
            r0 = r5
            return r0
        L12:
            r0 = r6
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L1e
            r0 = r6
            java.lang.Number r0 = (java.lang.Number) r0
            return r0
        L1e:
            r0 = r6
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L31
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2d
            java.lang.Number r0 = org.json.JSONObject.stringToNumber(r0)     // Catch: java.lang.Exception -> L2d
            return r0
        L2d:
            r7 = move-exception
            r0 = r5
            return r0
        L31:
            r0 = r5
            return r0
    }

    public java.lang.String optString(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            return r0
    }

    public java.lang.String optString(int r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            r0 = r5
            goto L18
        L14:
            r0 = r6
            java.lang.String r0 = r0.toString()
        L18:
            return r0
    }

    public org.json.JSONArray put(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r1 == 0) goto Lb
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto Le
        Lb:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        Le:
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray put(java.util.Collection<?> r6) {
            r5 = this;
            r0 = r5
            org.json.JSONArray r1 = new org.json.JSONArray
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray put(double r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray put(float r4) throws org.json.JSONException {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray put(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray put(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray put(java.util.Map<?, ?> r6) {
            r5 = this;
            r0 = r5
            org.json.JSONObject r1 = new org.json.JSONObject
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray put(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            org.json.JSONObject.testValidity(r0)
            r0 = r3
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r4
            boolean r0 = r0.add(r1)
            r0 = r3
            return r0
    }

    public org.json.JSONArray put(int r5, boolean r6) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            if (r2 == 0) goto Lc
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto Lf
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        Lf:
            org.json.JSONArray r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONArray put(int r7, java.util.Collection<?> r8) throws org.json.JSONException {
            r6 = this;
            r0 = r6
            r1 = r7
            org.json.JSONArray r2 = new org.json.JSONArray
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            org.json.JSONArray r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONArray put(int r6, double r7) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            org.json.JSONArray r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONArray put(int r5, float r6) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            org.json.JSONArray r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONArray put(int r5, int r6) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.json.JSONArray r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONArray put(int r6, long r7) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            org.json.JSONArray r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONArray put(int r7, java.util.Map<?, ?> r8) throws org.json.JSONException {
            r6 = this;
            r0 = r6
            r1 = r7
            org.json.JSONObject r2 = new org.json.JSONObject
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            org.json.JSONArray r0 = r0.put(r1, r2)
            r0 = r6
            return r0
    }

    public org.json.JSONArray put(int r6, java.lang.Object r7) throws org.json.JSONException {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L24
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONArray["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] not found."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r6
            r1 = r5
            int r1 = r1.length()
            if (r0 >= r1) goto L3c
            r0 = r7
            org.json.JSONObject.testValidity(r0)
            r0 = r5
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.set(r1, r2)
            r0 = r5
            return r0
        L3c:
            r0 = r6
            r1 = r5
            int r1 = r1.length()
            if (r0 != r1) goto L4a
            r0 = r5
            r1 = r7
            org.json.JSONArray r0 = r0.put(r1)
            return r0
        L4a:
            r0 = r5
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L54:
            r0 = r6
            r1 = r5
            int r1 = r1.length()
            if (r0 == r1) goto L6a
            r0 = r5
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            java.lang.Object r1 = org.json.JSONObject.NULL
            boolean r0 = r0.add(r1)
            goto L54
        L6a:
            r0 = r5
            r1 = r7
            org.json.JSONArray r0 = r0.put(r1)
            return r0
    }

    public org.json.JSONArray putAll(java.util.Collection<?> r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.addAll(r1, r2)
            r0 = r4
            return r0
    }

    public org.json.JSONArray putAll(java.lang.Iterable<?> r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.addAll(r1, r2)
            r0 = r4
            return r0
    }

    public org.json.JSONArray putAll(org.json.JSONArray r4) {
            r3 = this;
            r0 = r3
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r4
            java.util.ArrayList<java.lang.Object> r1 = r1.myArrayList
            boolean r0 = r0.addAll(r1)
            r0 = r3
            return r0
    }

    public org.json.JSONArray putAll(java.lang.Object r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.addAll(r1, r2)
            r0 = r4
            return r0
    }

    public java.lang.Object query(java.lang.String r6) {
            r5 = this;
            r0 = r5
            org.json.JSONPointer r1 = new org.json.JSONPointer
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.lang.Object r0 = r0.query(r1)
            return r0
    }

    public java.lang.Object query(org.json.JSONPointer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.Object r0 = r0.queryFrom(r1)
            return r0
    }

    public java.lang.Object optQuery(java.lang.String r6) {
            r5 = this;
            r0 = r5
            org.json.JSONPointer r1 = new org.json.JSONPointer
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.lang.Object r0 = r0.optQuery(r1)
            return r0
    }

    public java.lang.Object optQuery(org.json.JSONPointer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.Object r0 = r0.queryFrom(r1)     // Catch: org.json.JSONPointerException -> L6
            return r0
        L6:
            r5 = move-exception
            r0 = 0
            return r0
    }

    public java.lang.Object remove(int r4) {
            r3 = this;
            r0 = r4
            if (r0 < 0) goto L17
            r0 = r4
            r1 = r3
            int r1 = r1.length()
            if (r0 >= r1) goto L17
            r0 = r3
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public boolean similar(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            int r0 = r0.length()
            r5 = r0
            r0 = r5
            r1 = r4
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            int r1 = r1.length()
            if (r0 == r1) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = 0
            r6 = r0
        L1d:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto Ld8
            r0 = r3
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r4
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L43
            goto Ld2
        L43:
            r0 = r7
            if (r0 != 0) goto L4a
            r0 = 0
            return r0
        L4a:
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L61
            r0 = r7
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r1 = r8
            boolean r0 = r0.similar(r1)
            if (r0 != 0) goto Ld2
            r0 = 0
            return r0
        L61:
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L78
            r0 = r7
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r1 = r8
            boolean r0 = r0.similar(r1)
            if (r0 != 0) goto Ld2
            r0 = 0
            return r0
        L78:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L9a
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L9a
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = r8
            java.lang.Number r1 = (java.lang.Number) r1
            boolean r0 = org.json.JSONObject.isNumberSimilar(r0, r1)
            if (r0 != 0) goto Ld2
            r0 = 0
            return r0
        L9a:
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONString
            if (r0 == 0) goto Lc6
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONString
            if (r0 == 0) goto Lc6
            r0 = r7
            org.json.JSONString r0 = (org.json.JSONString) r0
            java.lang.String r0 = r0.toJSONString()
            r1 = r8
            org.json.JSONString r1 = (org.json.JSONString) r1
            java.lang.String r1 = r1.toJSONString()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld2
            r0 = 0
            return r0
        Lc6:
            r0 = r7
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld2
            r0 = 0
            return r0
        Ld2:
            int r6 = r6 + 1
            goto L1d
        Ld8:
            r0 = 1
            return r0
    }

    public org.json.JSONObject toJSONObject(org.json.JSONArray r6) throws org.json.JSONException {
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L12
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
        L12:
            r0 = 0
            return r0
        L14:
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r2 = r6
            int r2 = r2.length()
            r1.<init>(r2)
            r7 = r0
            r0 = 0
            r8 = r0
        L22:
            r0 = r8
            r1 = r6
            int r1 = r1.length()
            if (r0 >= r1) goto L3f
            r0 = r7
            r1 = r6
            r2 = r8
            java.lang.String r1 = r1.getString(r2)
            r2 = r5
            r3 = r8
            java.lang.Object r2 = r2.opt(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            int r8 = r8 + 1
            goto L22
        L3f:
            r0 = r7
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.String r0 = r0.toString(r1)     // Catch: java.lang.Exception -> L6
            return r0
        L6:
            r4 = move-exception
            r0 = 0
            return r0
    }

    public java.lang.String toString(int r6) throws org.json.JSONException {
            r5 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            java.lang.StringBuffer r0 = r0.getBuffer()
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            r0 = r5
            r1 = r7
            r2 = r6
            r3 = 0
            java.io.Writer r0 = r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1c
            r1 = r8
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r0 = r9
            throw r0
    }

    public java.io.Writer write(java.io.Writer r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            java.io.Writer r0 = r0.write(r1, r2, r3)
            return r0
    }

    public java.io.Writer write(java.io.Writer r6, int r7, int r8) throws org.json.JSONException {
            r5 = this;
            r0 = 0
            r9 = r0
            r0 = r5
            int r0 = r0.length()     // Catch: java.io.IOException -> Lb8
            r10 = r0
            r0 = r6
            r1 = 91
            r0.write(r1)     // Catch: java.io.IOException -> Lb8
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L35
            r0 = r6
            r1 = r5
            java.util.ArrayList<java.lang.Object> r1 = r1.myArrayList     // Catch: java.lang.Exception -> L27 java.io.IOException -> Lb8
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L27 java.io.IOException -> Lb8
            r2 = r7
            r3 = r8
            java.io.Writer r0 = org.json.JSONObject.writeValue(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L27 java.io.IOException -> Lb8
            goto Lb0
        L27:
            r11 = move-exception
            org.json.JSONException r0 = new org.json.JSONException     // Catch: java.io.IOException -> Lb8
            r1 = r0
            java.lang.String r2 = "Unable to write JSONArray value at index: 0"
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> Lb8
            throw r0     // Catch: java.io.IOException -> Lb8
        L35:
            r0 = r10
            if (r0 == 0) goto Lb0
            r0 = r8
            r1 = r7
            int r0 = r0 + r1
            r11 = r0
            r0 = 0
            r12 = r0
        L42:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto La1
            r0 = r9
            if (r0 == 0) goto L54
            r0 = r6
            r1 = 44
            r0.write(r1)     // Catch: java.io.IOException -> Lb8
        L54:
            r0 = r7
            if (r0 <= 0) goto L5e
            r0 = r6
            r1 = 10
            r0.write(r1)     // Catch: java.io.IOException -> Lb8
        L5e:
            r0 = r6
            r1 = r11
            org.json.JSONObject.indent(r0, r1)     // Catch: java.io.IOException -> Lb8
            r0 = r6
            r1 = r5
            java.util.ArrayList<java.lang.Object> r1 = r1.myArrayList     // Catch: java.lang.Exception -> L78 java.io.IOException -> Lb8
            r2 = r12
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L78 java.io.IOException -> Lb8
            r2 = r7
            r3 = r11
            java.io.Writer r0 = org.json.JSONObject.writeValue(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L78 java.io.IOException -> Lb8
            goto L98
        L78:
            r13 = move-exception
            org.json.JSONException r0 = new org.json.JSONException     // Catch: java.io.IOException -> Lb8
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb8
            r3 = r2
            r3.<init>()     // Catch: java.io.IOException -> Lb8
            java.lang.String r3 = "Unable to write JSONArray value at index: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> Lb8
            r3 = r12
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> Lb8
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> Lb8
            r3 = r13
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> Lb8
            throw r0     // Catch: java.io.IOException -> Lb8
        L98:
            r0 = 1
            r9 = r0
            int r12 = r12 + 1
            goto L42
        La1:
            r0 = r7
            if (r0 <= 0) goto Lab
            r0 = r6
            r1 = 10
            r0.write(r1)     // Catch: java.io.IOException -> Lb8
        Lab:
            r0 = r6
            r1 = r8
            org.json.JSONObject.indent(r0, r1)     // Catch: java.io.IOException -> Lb8
        Lb0:
            r0 = r6
            r1 = 93
            r0.write(r1)     // Catch: java.io.IOException -> Lb8
            r0 = r6
            return r0
        Lb8:
            r9 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
    }

    public java.util.List<java.lang.Object> toList() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            java.util.ArrayList<java.lang.Object> r2 = r2.myArrayList
            int r2 = r2.size()
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L17:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L7b
            r0 = r6
            java.lang.Object r0 = r0.next()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L35
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
        L35:
            r0 = r5
            r1 = 0
            boolean r0 = r0.add(r1)
            goto L78
        L40:
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L58
            r0 = r5
            r1 = r7
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            java.util.List r1 = r1.toList()
            boolean r0 = r0.add(r1)
            goto L78
        L58:
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L70
            r0 = r5
            r1 = r7
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.util.Map r1 = r1.toMap()
            boolean r0 = r0.add(r1)
            goto L78
        L70:
            r0 = r5
            r1 = r7
            boolean r0 = r0.add(r1)
        L78:
            goto L17
        L7b:
            r0 = r5
            return r0
    }

    public boolean isEmpty() {
            r2 = this;
            r0 = r2
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            boolean r0 = r0.isEmpty()
            return r0
    }

    private void addAll(java.util.Collection<?> r5, boolean r6) {
            r4 = this;
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r4
            java.util.ArrayList<java.lang.Object> r1 = r1.myArrayList
            int r1 = r1.size()
            r2 = r5
            int r2 = r2.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L20:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3e
            r0 = r7
            java.lang.Object r0 = r0.next()
            r8 = r0
            r0 = r4
            r1 = r8
            java.lang.Object r1 = org.json.JSONObject.wrap(r1)
            org.json.JSONArray r0 = r0.put(r1)
            goto L20
        L3e:
            goto L63
        L41:
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L48:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L63
            r0 = r7
            java.lang.Object r0 = r0.next()
            r8 = r0
            r0 = r4
            r1 = r8
            org.json.JSONArray r0 = r0.put(r1)
            goto L48
        L63:
            return
    }

    private void addAll(java.lang.Iterable<?> r4, boolean r5) {
            r3 = this;
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        Lb:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L29
            r0 = r6
            java.lang.Object r0 = r0.next()
            r7 = r0
            r0 = r3
            r1 = r7
            java.lang.Object r1 = org.json.JSONObject.wrap(r1)
            org.json.JSONArray r0 = r0.put(r1)
            goto Lb
        L29:
            goto L4e
        L2c:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L33:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4e
            r0 = r6
            java.lang.Object r0 = r0.next()
            r7 = r0
            r0 = r3
            r1 = r7
            org.json.JSONArray r0 = r0.put(r1)
            goto L33
        L4e:
            return
    }

    private void addAll(java.lang.Object r5, boolean r6) throws org.json.JSONException {
            r4 = this;
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L60
            r0 = r5
            int r0 = java.lang.reflect.Array.getLength(r0)
            r7 = r0
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r4
            java.util.ArrayList<java.lang.Object> r1 = r1.myArrayList
            int r1 = r1.size()
            r2 = r7
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            r0 = r6
            if (r0 == 0) goto L43
            r0 = 0
            r8 = r0
        L26:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L40
            r0 = r4
            r1 = r5
            r2 = r8
            java.lang.Object r1 = java.lang.reflect.Array.get(r1, r2)
            java.lang.Object r1 = org.json.JSONObject.wrap(r1)
            org.json.JSONArray r0 = r0.put(r1)
            int r8 = r8 + 1
            goto L26
        L40:
            goto L5d
        L43:
            r0 = 0
            r8 = r0
        L46:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L5d
            r0 = r4
            r1 = r5
            r2 = r8
            java.lang.Object r1 = java.lang.reflect.Array.get(r1, r2)
            org.json.JSONArray r0 = r0.put(r1)
            int r8 = r8 + 1
            goto L46
        L5d:
            goto La9
        L60:
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L79
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.myArrayList
            r1 = r5
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            java.util.ArrayList<java.lang.Object> r1 = r1.myArrayList
            boolean r0 = r0.addAll(r1)
            goto La9
        L79:
            r0 = r5
            boolean r0 = r0 instanceof java.util.Collection
            if (r0 == 0) goto L8c
            r0 = r4
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = r6
            r0.addAll(r1, r2)
            goto La9
        L8c:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Iterable
            if (r0 == 0) goto L9f
            r0 = r4
            r1 = r5
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = r6
            r0.addAll(r1, r2)
            goto La9
        L9f:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "JSONArray initial value should be a string or collection or array."
            r1.<init>(r2)
            throw r0
        La9:
            return
    }

    private static org.json.JSONException wrongValueFormatException(int r5, java.lang.String r6, java.lang.Object r7, java.lang.Throwable r8) {
            r0 = r7
            if (r0 != 0) goto L2e
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONArray["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " (null)."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L2e:
            r0 = r7
            boolean r0 = r0 instanceof java.util.Map
            if (r0 != 0) goto L43
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Iterable
            if (r0 != 0) goto L43
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L79
        L43:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONArray["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " ("
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L79:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONArray["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " ("
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " : "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }
}
