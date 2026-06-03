package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONObject.class */
public class JSONObject {
    static final java.util.regex.Pattern NUMBER_PATTERN = null;
    private final java.util.Map<java.lang.String, java.lang.Object> map;
    public static final java.lang.Object NULL = null;

    /* JADX INFO: renamed from: org.json.JSONObject$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONObject$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONObject$Null.class */
    private static final class Null {
        private Null() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        protected final java.lang.Object clone() {
                r2 = this;
                r0 = r2
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r4
                if (r0 == 0) goto L9
                r0 = r4
                r1 = r3
                if (r0 != r1) goto Ld
            L9:
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        public int hashCode() {
                r2 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "null"
                return r0
        }

        /* synthetic */ Null(org.json.JSONObject.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public java.lang.Class<? extends java.util.Map> getMapType() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    public JSONObject() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.map = r1
            return
    }

    public JSONObject(org.json.JSONObject r7, java.lang.String... r8) {
            r6 = this;
            r0 = r6
            r1 = r8
            int r1 = r1.length
            r0.<init>(r1)
            r0 = 0
            r9 = r0
        L8:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L28
            r0 = r6
            r1 = r8
            r2 = r9
            r1 = r1[r2]     // Catch: java.lang.Exception -> L20
            r2 = r7
            r3 = r8
            r4 = r9
            r3 = r3[r4]     // Catch: java.lang.Exception -> L20
            java.lang.Object r2 = r2.opt(r3)     // Catch: java.lang.Exception -> L20
            org.json.JSONObject r0 = r0.putOnce(r1, r2)     // Catch: java.lang.Exception -> L20
            goto L22
        L20:
            r10 = move-exception
        L22:
            int r9 = r9 + 1
            goto L8
        L28:
            return
    }

    public JSONObject(org.json.JSONTokener r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            char r0 = r0.nextClean()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L14
            r0 = r5
            java.lang.String r1 = "A JSONObject text must begin with '{'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L14:
            r0 = r5
            char r0 = r0.getPrevious()
            r8 = r0
            r0 = r5
            char r0 = r0.nextClean()
            r6 = r0
            r0 = r6
            switch(r0) {
                case 0: goto L4c;
                case 91: goto L54;
                case 123: goto L54;
                case 125: goto L53;
                default: goto L62;
            }
        L4c:
            r0 = r5
            java.lang.String r1 = "A JSONObject text must end with '}'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L53:
            return
        L54:
            r0 = r8
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L62
            r0 = r5
            java.lang.String r1 = "A JSON Object can not directly nest another JSON Object or JSON Array."
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L62:
            r0 = r5
            r0.back()
            r0 = r5
            java.lang.Object r0 = r0.nextValue()
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r5
            char r0 = r0.nextClean()
            r6 = r0
            r0 = r6
            r1 = 58
            if (r0 == r1) goto L80
            r0 = r5
            java.lang.String r1 = "Expected a ':' after a key"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        L80:
            r0 = r7
            if (r0 == 0) goto Lbc
            r0 = r4
            r1 = r7
            java.lang.Object r0 = r0.opt(r1)
            if (r0 == 0) goto La9
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Duplicate key \""
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        La9:
            r0 = r5
            java.lang.Object r0 = r0.nextValue()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Lbc
            r0 = r4
            r1 = r7
            r2 = r9
            org.json.JSONObject r0 = r0.put(r1, r2)
        Lbc:
            r0 = r5
            char r0 = r0.nextClean()
            switch(r0) {
                case 44: goto Le4;
                case 59: goto Le4;
                case 125: goto Lf5;
                default: goto Lf6;
            }
        Le4:
            r0 = r5
            char r0 = r0.nextClean()
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto Lee
            return
        Lee:
            r0 = r5
            r0.back()
            goto Lfd
        Lf5:
            return
        Lf6:
            r0 = r5
            java.lang.String r1 = "Expected a ',' or '}'"
            org.json.JSONException r0 = r0.syntaxError(r1)
            throw r0
        Lfd:
            goto L14
    }

    public JSONObject(java.util.Map<?, ?> r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            if (r0 != 0) goto L16
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.map = r1
            goto L81
        L16:
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r3 = r6
            int r3 = r3.size()
            r2.<init>(r3)
            r0.map = r1
            r0 = r6
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L33:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L81
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.getKey()
            if (r0 != 0) goto L59
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "Null key."
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r8
            java.lang.Object r0 = r0.getValue()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L7e
            r0 = r5
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            r1 = r8
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = r9
            java.lang.Object r2 = wrap(r2)
            java.lang.Object r0 = r0.put(r1, r2)
        L7e:
            goto L33
        L81:
            return
    }

    public JSONObject(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.populateMap(r1)
            return
    }

    private JSONObject(java.lang.Object r5, java.util.Set<java.lang.Object> r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r2 = r6
            r0.populateMap(r1, r2)
            return
    }

    public JSONObject(java.lang.Object r6, java.lang.String... r7) {
            r5 = this;
            r0 = r5
            r1 = r7
            int r1 = r1.length
            r0.<init>(r1)
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r8 = r0
            r0 = 0
            r9 = r0
        Le:
            r0 = r9
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L37
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r5
            r1 = r10
            r2 = r8
            r3 = r10
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch: java.lang.Exception -> L2f
            r3 = r6
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L2f
            org.json.JSONObject r0 = r0.putOpt(r1, r2)     // Catch: java.lang.Exception -> L2f
            goto L31
        L2f:
            r11 = move-exception
        L31:
            int r9 = r9 + 1
            goto Le
        L37:
            return
    }

    public JSONObject(java.lang.String r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            org.json.JSONTokener r1 = new org.json.JSONTokener
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.<init>(r1)
            return
    }

    public JSONObject(java.lang.String r6, java.util.Locale r7) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            r1 = r7
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r2 = r2.getContextClassLoader()
            java.util.ResourceBundle r0 = java.util.ResourceBundle.getBundle(r0, r1, r2)
            r8 = r0
            r0 = r8
            java.util.Enumeration r0 = r0.getKeys()
            r9 = r0
        L16:
            r0 = r9
            boolean r0 = r0.hasMoreElements()
            if (r0 == 0) goto L97
            r0 = r9
            java.lang.Object r0 = r0.nextElement()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L94
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
            r0 = r5
            r13 = r0
            r0 = 0
            r14 = r0
        L47:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto L80
            r0 = r11
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r13
            r1 = r15
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            r16 = r0
            r0 = r16
            if (r0 != 0) goto L76
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r13
            r1 = r15
            r2 = r16
            org.json.JSONObject r0 = r0.put(r1, r2)
        L76:
            r0 = r16
            r13 = r0
            int r14 = r14 + 1
            goto L47
        L80:
            r0 = r13
            r1 = r11
            r2 = r12
            r1 = r1[r2]
            r2 = r8
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = r2.getString(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
        L94:
            goto L16
        L97:
            return
    }

    protected JSONObject(int r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.map = r1
            return
    }

    public org.json.JSONObject accumulate(java.lang.String r6, java.lang.Object r7) throws org.json.JSONException {
            r5 = this;
            r0 = r7
            testValidity(r0)
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.opt(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2d
            r0 = r5
            r1 = r6
            r2 = r7
            boolean r2 = r2 instanceof org.json.JSONArray
            if (r2 == 0) goto L25
            org.json.JSONArray r2 = new org.json.JSONArray
            r3 = r2
            r3.<init>()
            r3 = r7
            org.json.JSONArray r2 = r2.put(r3)
            goto L26
        L25:
            r2 = r7
        L26:
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto L55
        L2d:
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L40
            r0 = r8
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r1 = r7
            org.json.JSONArray r0 = r0.put(r1)
            goto L55
        L40:
            r0 = r5
            r1 = r6
            org.json.JSONArray r2 = new org.json.JSONArray
            r3 = r2
            r3.<init>()
            r3 = r8
            org.json.JSONArray r2 = r2.put(r3)
            r3 = r7
            org.json.JSONArray r2 = r2.put(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
        L55:
            r0 = r5
            return r0
    }

    public org.json.JSONObject append(java.lang.String r6, java.lang.Object r7) throws org.json.JSONException {
            r5 = this;
            r0 = r7
            testValidity(r0)
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.opt(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L22
            r0 = r5
            r1 = r6
            org.json.JSONArray r2 = new org.json.JSONArray
            r3 = r2
            r3.<init>()
            r3 = r7
            org.json.JSONArray r2 = r2.put(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto L43
        L22:
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L3a
            r0 = r5
            r1 = r6
            r2 = r8
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            r3 = r7
            org.json.JSONArray r2 = r2.put(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto L43
        L3a:
            r0 = r6
            java.lang.String r1 = "JSONArray"
            r2 = 0
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
        L43:
            r0 = r5
            return r0
    }

    public static java.lang.String doubleToString(double r5) {
            r0 = r5
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 != 0) goto Le
            r0 = r5
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L11
        Le:
            java.lang.String r0 = "null"
            return r0
        L11:
            r0 = r5
            java.lang.String r0 = java.lang.Double.toString(r0)
            r7 = r0
            r0 = r7
            r1 = 46
            int r0 = r0.indexOf(r1)
            if (r0 <= 0) goto L5e
            r0 = r7
            r1 = 101(0x65, float:1.42E-43)
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L5e
            r0 = r7
            r1 = 69
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L5e
        L31:
            r0 = r7
            java.lang.String r1 = "0"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L49
            r0 = r7
            r1 = 0
            r2 = r7
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r7 = r0
            goto L31
        L49:
            r0 = r7
            java.lang.String r1 = "."
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L5e
            r0 = r7
            r1 = 0
            r2 = r7
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r7 = r0
        L5e:
            r0 = r7
            return r0
    }

    public java.lang.Object get(java.lang.String r6) throws org.json.JSONException {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto Le
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Null key."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.opt(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L3b
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONObject["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = quote(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] not found."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3b:
            r0 = r7
            return r0
    }

    public <E extends java.lang.Enum<E>> E getEnum(java.lang.Class<E> r6, java.lang.String r7) throws org.json.JSONException {
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
            java.lang.String r2 = quote(r2)
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

    public boolean getBoolean(java.lang.String r6) throws org.json.JSONException {
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
            java.lang.String r1 = "Boolean"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public java.math.BigInteger getBigInteger(java.lang.String r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            r1 = 0
            java.math.BigInteger r0 = objectToBigInteger(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L12
            r0 = r8
            return r0
        L12:
            r0 = r6
            java.lang.String r1 = "BigInteger"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public java.math.BigDecimal getBigDecimal(java.lang.String r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            r1 = 0
            java.math.BigDecimal r0 = objectToBigDecimal(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L12
            r0 = r8
            return r0
        L12:
            r0 = r6
            java.lang.String r1 = "BigDecimal"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public double getDouble(java.lang.String r6) throws org.json.JSONException {
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

    public float getFloat(java.lang.String r6) throws org.json.JSONException {
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

    public java.lang.Number getNumber(java.lang.String r6) throws org.json.JSONException {
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
            java.lang.Number r0 = stringToNumber(r0)     // Catch: java.lang.Exception -> L1a
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

    public int getInt(java.lang.String r6) throws org.json.JSONException {
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

    public org.json.JSONArray getJSONArray(java.lang.String r6) throws org.json.JSONException {
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

    public org.json.JSONObject getJSONObject(java.lang.String r6) throws org.json.JSONException {
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

    public long getLong(java.lang.String r6) throws org.json.JSONException {
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

    public static java.lang.String[] getNames(org.json.JSONObject r3) {
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            java.util.Set r0 = r0.keySet()
            r1 = r3
            int r1 = r1.length()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static java.lang.String[] getNames(java.lang.Object r5) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r6 = r0
            r0 = r6
            java.lang.reflect.Field[] r0 = r0.getFields()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = r8
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        L22:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L3a
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r10
            r2 = r2[r3]
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            int r10 = r10 + 1
            goto L22
        L3a:
            r0 = r9
            return r0
    }

    public java.lang.String getString(java.lang.String r6) throws org.json.JSONException {
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
            java.lang.String r1 = "string"
            r2 = r7
            r3 = 0
            org.json.JSONException r0 = wrongValueFormatException(r0, r1, r2, r3)
            throw r0
    }

    public boolean has(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            r1 = r4
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    public org.json.JSONObject increment(java.lang.String r8) throws org.json.JSONException {
            r7 = this;
            r0 = r7
            r1 = r8
            java.lang.Object r0 = r0.opt(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L14
            r0 = r7
            r1 = r8
            r2 = 1
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto Lcf
        L14:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L2d
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1
            int r2 = r2 + r3
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto Lcf
        L2d:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto L46
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r3 = 1
            long r2 = r2 + r3
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto Lcf
        L46:
            r0 = r9
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 == 0) goto L60
            r0 = r7
            r1 = r8
            r2 = r9
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            java.math.BigInteger r2 = r2.add(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto Lcf
        L60:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L79
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r3
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto Lcf
        L79:
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L92
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r3
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto Lcf
        L92:
            r0 = r9
            boolean r0 = r0 instanceof java.math.BigDecimal
            if (r0 == 0) goto Lac
            r0 = r7
            r1 = r8
            r2 = r9
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            java.math.BigDecimal r3 = java.math.BigDecimal.ONE
            java.math.BigDecimal r2 = r2.add(r3)
            org.json.JSONObject r0 = r0.put(r1, r2)
            goto Lcf
        Lac:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unable to increment ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = quote(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lcf:
            r0 = r7
            return r0
    }

    public boolean isNull(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r4
            r2 = r5
            java.lang.Object r1 = r1.opt(r2)
            boolean r0 = r0.equals(r1)
            return r0
    }

    public java.util.Iterator<java.lang.String> keys() {
            r2 = this;
            r0 = r2
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public java.util.Set<java.lang.String> keySet() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            java.util.Set r0 = r0.keySet()
            return r0
    }

    protected java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> entrySet() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public int length() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            int r0 = r0.size()
            return r0
    }

    public void clear() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            r0.clear()
            return
    }

    public boolean isEmpty() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    public org.json.JSONArray names() {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r2 = r4
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.map
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            return r0
    }

    public static java.lang.String numberToString(java.lang.Number r5) throws org.json.JSONException {
            r0 = r5
            if (r0 != 0) goto Le
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Null pointer"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r5
            testValidity(r0)
            r0 = r5
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            r1 = 46
            int r0 = r0.indexOf(r1)
            if (r0 <= 0) goto L5f
            r0 = r6
            r1 = 101(0x65, float:1.42E-43)
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L5f
            r0 = r6
            r1 = 69
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L5f
        L32:
            r0 = r6
            java.lang.String r1 = "0"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L4a
            r0 = r6
            r1 = 0
            r2 = r6
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r6 = r0
            goto L32
        L4a:
            r0 = r6
            java.lang.String r1 = "."
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L5f
            r0 = r6
            r1 = 0
            r2 = r6
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r6 = r0
        L5f:
            r0 = r6
            return r0
    }

    public java.lang.Object opt(java.lang.String r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
        L12:
            return r0
    }

    public <E extends java.lang.Enum<E>> E optEnum(java.lang.Class<E> r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            java.lang.Enum r0 = r0.optEnum(r1, r2, r3)
            return r0
    }

    public <E extends java.lang.Enum<E>> E optEnum(java.lang.Class<E> r4, java.lang.String r5, E r6) {
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

    public boolean optBoolean(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            return r0
    }

    public boolean optBoolean(java.lang.String r4, boolean r5) {
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
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L21
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L21:
            r0 = r3
            r1 = r4
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.Exception -> L27
            return r0
        L27:
            r7 = move-exception
            r0 = r5
            return r0
    }

    public java.math.BigDecimal optBigDecimal(java.lang.String r4, java.math.BigDecimal r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            r0 = r6
            r1 = r5
            java.math.BigDecimal r0 = objectToBigDecimal(r0, r1)
            return r0
    }

    static java.math.BigDecimal objectToBigDecimal(java.lang.Object r4, java.math.BigDecimal r5) {
            r0 = r4
            r1 = r5
            r2 = 1
            java.math.BigDecimal r0 = objectToBigDecimal(r0, r1, r2)
            return r0
    }

    static java.math.BigDecimal objectToBigDecimal(java.lang.Object r5, java.math.BigDecimal r6, boolean r7) {
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            r0 = r6
            return r0
        Lc:
            r0 = r5
            boolean r0 = r0 instanceof java.math.BigDecimal
            if (r0 == 0) goto L18
            r0 = r5
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            return r0
        L18:
            r0 = r5
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 == 0) goto L2b
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = r0
            r2 = r5
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r1.<init>(r2)
            return r0
        L2b:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 != 0) goto L39
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L64
        L39:
            r0 = r5
            java.lang.Number r0 = (java.lang.Number) r0
            boolean r0 = numberIsFinite(r0)
            if (r0 != 0) goto L45
            r0 = r6
            return r0
        L45:
            r0 = r7
            if (r0 == 0) goto L58
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = r0
            r2 = r5
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            r1.<init>(r2)
            return r0
        L58:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return r0
        L64:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L80
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L80
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto L80
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L8f
        L80:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = r0
            r2 = r5
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r1.<init>(r2)
            return r0
        L8f:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L9b
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L9b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L9b
            return r0
        L9b:
            r8 = move-exception
            r0 = r6
            return r0
    }

    public java.math.BigInteger optBigInteger(java.lang.String r4, java.math.BigInteger r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            r0 = r6
            r1 = r5
            java.math.BigInteger r0 = objectToBigInteger(r0, r1)
            return r0
    }

    static java.math.BigInteger objectToBigInteger(java.lang.Object r5, java.math.BigInteger r6) {
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            r0 = r6
            return r0
        Lc:
            r0 = r5
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 == 0) goto L18
            r0 = r5
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        L18:
            r0 = r5
            boolean r0 = r0 instanceof java.math.BigDecimal
            if (r0 == 0) goto L27
            r0 = r5
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            java.math.BigInteger r0 = r0.toBigInteger()
            return r0
        L27:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 != 0) goto L35
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L53
        L35:
            r0 = r5
            java.lang.Number r0 = (java.lang.Number) r0
            boolean r0 = numberIsFinite(r0)
            if (r0 != 0) goto L41
            r0 = r6
            return r0
        L41:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = r0
            r2 = r5
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            r1.<init>(r2)
            java.math.BigInteger r0 = r0.toBigInteger()
            return r0
        L53:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L6f
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L6f
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto L6f
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L7a
        L6f:
            r0 = r5
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
        L7a:
            r0 = r5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L9b
            r7 = r0
            r0 = r7
            boolean r0 = isDecimalNotation(r0)     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L92
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L9b
            r1 = r0
            r2 = r7
            r1.<init>(r2)     // Catch: java.lang.Exception -> L9b
            java.math.BigInteger r0 = r0.toBigInteger()     // Catch: java.lang.Exception -> L9b
            return r0
        L92:
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.Exception -> L9b
            r1 = r0
            r2 = r7
            r1.<init>(r2)     // Catch: java.lang.Exception -> L9b
            return r0
        L9b:
            r7 = move-exception
            r0 = r6
            return r0
    }

    public double optDouble(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            double r0 = r0.optDouble(r1, r2)
            return r0
    }

    public double optDouble(java.lang.String r4, double r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Number r0 = r0.optNumber(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Le
            r0 = r5
            return r0
        Le:
            r0 = r7
            double r0 = r0.doubleValue()
            return r0
    }

    public float optFloat(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 2143289344(0x7fc00000, float:NaN)
            float r0 = r0.optFloat(r1, r2)
            return r0
    }

    public float optFloat(java.lang.String r4, float r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Number r0 = r0.optNumber(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lc
            r0 = r5
            return r0
        Lc:
            r0 = r6
            float r0 = r0.floatValue()
            r7 = r0
            r0 = r7
            return r0
    }

    public int optInt(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public int optInt(java.lang.String r5, int r6) {
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

    public org.json.JSONArray optJSONArray(java.lang.String r4) {
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

    public org.json.JSONObject optJSONObject(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            org.json.JSONObject r0 = r0.optJSONObject(r1, r2)
            return r0
    }

    public org.json.JSONObject optJSONObject(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.opt(r1)
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L14
            r0 = r6
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L15
        L14:
            r0 = r5
        L15:
            return r0
    }

    public long optLong(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            long r0 = r0.optLong(r1, r2)
            return r0
    }

    public long optLong(java.lang.String r5, long r6) {
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

    public java.lang.Number optNumber(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            java.lang.Number r0 = r0.optNumber(r1, r2)
            return r0
    }

    public java.lang.Number optNumber(java.lang.String r4, java.lang.Number r5) {
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
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L26
            java.lang.Number r0 = stringToNumber(r0)     // Catch: java.lang.Exception -> L26
            return r0
        L26:
            r7 = move-exception
            r0 = r5
            return r0
    }

    public java.lang.String optString(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            return r0
    }

    public java.lang.String optString(java.lang.String r4, java.lang.String r5) {
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

    private void populateMap(java.lang.Object r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r3 = r2
            r3.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            r0.populateMap(r1, r2)
            return
    }

    private void populateMap(java.lang.Object r6, java.util.Set<java.lang.Object> r7) {
            r5 = this;
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r8 = r0
            r0 = r8
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L1f
            r0 = r8
            java.lang.reflect.Method[] r0 = r0.getMethods()
            goto L23
        L1f:
            r0 = r8
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
        L23:
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r13 = r0
        L31:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L103
            r0 = r11
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            int r0 = r0.getModifiers()
            r15 = r0
            r0 = r15
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto Lfd
            r0 = r15
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto Lfd
            r0 = r14
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto Lfd
            r0 = r14
            boolean r0 = r0.isBridge()
            if (r0 != 0) goto Lfd
            r0 = r14
            java.lang.Class r0 = r0.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 == r1) goto Lfd
            r0 = r14
            java.lang.String r0 = r0.getName()
            boolean r0 = isValidMethodName(r0)
            if (r0 == 0) goto Lfd
            r0 = r14
            java.lang.String r0 = getKeyNameFromMethod(r0)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto Lfd
            r0 = r16
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lfd
            r0 = r14
            r1 = r6
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            r17 = r0
            r0 = r17
            if (r0 == 0) goto Lee
            r0 = r7
            r1 = r17
            boolean r0 = r0.contains(r1)     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            if (r0 == 0) goto Lb3
            r0 = r16
            org.json.JSONException r0 = recursivelyDefinedObjectException(r0)     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            throw r0     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
        Lb3:
            r0 = r7
            r1 = r17
            boolean r0 = r0.add(r1)     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            r0 = r5
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            r1 = r16
            r2 = r17
            r3 = r7
            java.lang.Object r2 = wrap(r2, r3)     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            r0 = r7
            r1 = r17
            boolean r0 = r0.remove(r1)     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            r0 = r17
            boolean r0 = r0 instanceof java.io.Closeable     // Catch: java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            if (r0 == 0) goto Lee
            r0 = r17
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.io.IOException -> Lec java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            r0.close()     // Catch: java.io.IOException -> Lec java.lang.IllegalAccessException -> Lf1 java.lang.IllegalArgumentException -> Lf6 java.lang.reflect.InvocationTargetException -> Lfb
            goto Lee
        Lec:
            r18 = move-exception
        Lee:
            goto Lfd
        Lf1:
            r17 = move-exception
            goto Lfd
        Lf6:
            r17 = move-exception
            goto Lfd
        Lfb:
            r17 = move-exception
        Lfd:
            int r13 = r13 + 1
            goto L31
        L103:
            return
    }

    private static boolean isValidMethodName(java.lang.String r3) {
            java.lang.String r0 = "getClass"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            java.lang.String r0 = "getDeclaringClass"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    private static java.lang.String getKeyNameFromMethod(java.lang.reflect.Method r5) {
            r0 = r5
            java.lang.Class<org.json.JSONPropertyIgnore> r1 = org.json.JSONPropertyIgnore.class
            int r0 = getAnnotationDepth(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 <= 0) goto L1d
            r0 = r5
            java.lang.Class<org.json.JSONPropertyName> r1 = org.json.JSONPropertyName.class
            int r0 = getAnnotationDepth(r0, r1)
            r7 = r0
            r0 = r7
            if (r0 < 0) goto L1b
            r0 = r6
            r1 = r7
            if (r0 > r1) goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = r5
            java.lang.Class<org.json.JSONPropertyName> r1 = org.json.JSONPropertyName.class
            java.lang.annotation.Annotation r0 = getAnnotation(r0, r1)
            org.json.JSONPropertyName r0 = (org.json.JSONPropertyName) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L47
            r0 = r7
            java.lang.String r0 = r0.value()
            if (r0 == 0) goto L47
            r0 = r7
            java.lang.String r0 = r0.value()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L47
            r0 = r7
            java.lang.String r0 = r0.value()
            return r0
        L47:
            r0 = r5
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "get"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L6a
            r0 = r9
            int r0 = r0.length()
            r1 = 3
            if (r0 <= r1) goto L6a
            r0 = r9
            r1 = 3
            java.lang.String r0 = r0.substring(r1)
            r8 = r0
            goto L89
        L6a:
            r0 = r9
            java.lang.String r1 = "is"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L87
            r0 = r9
            int r0 = r0.length()
            r1 = 2
            if (r0 <= r1) goto L87
            r0 = r9
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            r8 = r0
            goto L89
        L87:
            r0 = 0
            return r0
        L89:
            r0 = r8
            int r0 = r0.length()
            if (r0 == 0) goto L9b
            r0 = r8
            r1 = 0
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto L9d
        L9b:
            r0 = 0
            return r0
        L9d:
            r0 = r8
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto Lb0
            r0 = r8
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r8 = r0
            goto Ldd
        Lb0:
            r0 = r8
            r1 = 1
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 != 0) goto Ldd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            r2 = 0
            r3 = 1
            java.lang.String r1 = r1.substring(r2, r3)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
        Ldd:
            r0 = r8
            return r0
    }

    private static <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.reflect.Method r4, java.lang.Class<A> r5) {
            r0 = r4
            if (r0 == 0) goto L8
            r0 = r5
            if (r0 != 0) goto La
        L8:
            r0 = 0
            return r0
        La:
            r0 = r4
            r1 = r5
            boolean r0 = r0.isAnnotationPresent(r1)
            if (r0 == 0) goto L18
            r0 = r4
            r1 = r5
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            return r0
        L18:
            r0 = r4
            java.lang.Class r0 = r0.getDeclaringClass()
            r6 = r0
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            if (r0 != 0) goto L26
            r0 = 0
            return r0
        L26:
            r0 = r6
            java.lang.Class[] r0 = r0.getInterfaces()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L32:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L65
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r4
            java.lang.String r1 = r1.getName()     // Catch: java.lang.SecurityException -> L55 java.lang.NoSuchMethodException -> L5a
            r2 = r4
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.SecurityException -> L55 java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.SecurityException -> L55 java.lang.NoSuchMethodException -> L5a
            r11 = r0
            r0 = r11
            r1 = r5
            java.lang.annotation.Annotation r0 = getAnnotation(r0, r1)     // Catch: java.lang.SecurityException -> L55 java.lang.NoSuchMethodException -> L5a
            return r0
        L55:
            r11 = move-exception
            goto L5f
        L5a:
            r11 = move-exception
            goto L5f
        L5f:
            int r9 = r9 + 1
            goto L32
        L65:
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.SecurityException -> L79 java.lang.NoSuchMethodException -> L7c
            r1 = r4
            java.lang.String r1 = r1.getName()     // Catch: java.lang.SecurityException -> L79 java.lang.NoSuchMethodException -> L7c
            r2 = r4
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.SecurityException -> L79 java.lang.NoSuchMethodException -> L7c
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.SecurityException -> L79 java.lang.NoSuchMethodException -> L7c
            r1 = r5
            java.lang.annotation.Annotation r0 = getAnnotation(r0, r1)     // Catch: java.lang.SecurityException -> L79 java.lang.NoSuchMethodException -> L7c
            return r0
        L79:
            r7 = move-exception
            r0 = 0
            return r0
        L7c:
            r7 = move-exception
            r0 = 0
            return r0
    }

    private static int getAnnotationDepth(java.lang.reflect.Method r4, java.lang.Class<? extends java.lang.annotation.Annotation> r5) {
            r0 = r4
            if (r0 == 0) goto L8
            r0 = r5
            if (r0 != 0) goto La
        L8:
            r0 = -1
            return r0
        La:
            r0 = r4
            r1 = r5
            boolean r0 = r0.isAnnotationPresent(r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = r4
            java.lang.Class r0 = r0.getDeclaringClass()
            r6 = r0
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            if (r0 != 0) goto L22
            r0 = -1
            return r0
        L22:
            r0 = r6
            java.lang.Class[] r0 = r0.getInterfaces()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L2e:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L6f
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r4
            java.lang.String r1 = r1.getName()     // Catch: java.lang.SecurityException -> L5f java.lang.NoSuchMethodException -> L64
            r2 = r4
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.SecurityException -> L5f java.lang.NoSuchMethodException -> L64
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.SecurityException -> L5f java.lang.NoSuchMethodException -> L64
            r11 = r0
            r0 = r11
            r1 = r5
            int r0 = getAnnotationDepth(r0, r1)     // Catch: java.lang.SecurityException -> L5f java.lang.NoSuchMethodException -> L64
            r12 = r0
            r0 = r12
            if (r0 <= 0) goto L5c
            r0 = r12
            r1 = 1
            int r0 = r0 + r1
            return r0
        L5c:
            goto L69
        L5f:
            r11 = move-exception
            goto L69
        L64:
            r11 = move-exception
            goto L69
        L69:
            int r9 = r9 + 1
            goto L2e
        L6f:
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.SecurityException -> L8d java.lang.NoSuchMethodException -> L90
            r1 = r4
            java.lang.String r1 = r1.getName()     // Catch: java.lang.SecurityException -> L8d java.lang.NoSuchMethodException -> L90
            r2 = r4
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.SecurityException -> L8d java.lang.NoSuchMethodException -> L90
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.SecurityException -> L8d java.lang.NoSuchMethodException -> L90
            r1 = r5
            int r0 = getAnnotationDepth(r0, r1)     // Catch: java.lang.SecurityException -> L8d java.lang.NoSuchMethodException -> L90
            r7 = r0
            r0 = r7
            if (r0 <= 0) goto L8b
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            return r0
        L8b:
            r0 = -1
            return r0
        L8d:
            r7 = move-exception
            r0 = -1
            return r0
        L90:
            r7 = move-exception
            r0 = -1
            return r0
    }

    public org.json.JSONObject put(java.lang.String r5, boolean r6) throws org.json.JSONException {
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
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONObject put(java.lang.String r7, java.util.Collection<?> r8) throws org.json.JSONException {
            r6 = this;
            r0 = r6
            r1 = r7
            org.json.JSONArray r2 = new org.json.JSONArray
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONObject put(java.lang.String r6, double r7) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONObject put(java.lang.String r5, float r6) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONObject put(java.lang.String r5, int r6) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONObject put(java.lang.String r6, long r7) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONObject put(java.lang.String r7, java.util.Map<?, ?> r8) throws org.json.JSONException {
            r6 = this;
            r0 = r6
            r1 = r7
            org.json.JSONObject r2 = new org.json.JSONObject
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
    }

    public org.json.JSONObject put(java.lang.String r5, java.lang.Object r6) throws org.json.JSONException {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto Le
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "Null key."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r6
            if (r0 == 0) goto L25
            r0 = r6
            testValidity(r0)
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            goto L2b
        L25:
            r0 = r4
            r1 = r5
            java.lang.Object r0 = r0.remove(r1)
        L2b:
            r0 = r4
            return r0
    }

    public org.json.JSONObject putOnce(java.lang.String r6, java.lang.Object r7) throws org.json.JSONException {
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L37
            r0 = r7
            if (r0 == 0) goto L37
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.opt(r1)
            if (r0 == 0) goto L30
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Duplicate key \""
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L30:
            r0 = r5
            r1 = r6
            r2 = r7
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
        L37:
            r0 = r5
            return r0
    }

    public org.json.JSONObject putOpt(java.lang.String r5, java.lang.Object r6) throws org.json.JSONException {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto Lf
            r0 = r6
            if (r0 == 0) goto Lf
            r0 = r4
            r1 = r5
            r2 = r6
            org.json.JSONObject r0 = r0.put(r1, r2)
            return r0
        Lf:
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

    public static java.lang.String quote(java.lang.String r3) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.StringBuffer r0 = r0.getBuffer()
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = r4
            java.io.Writer r0 = quote(r0, r1)     // Catch: java.io.IOException -> L1a java.lang.Throwable -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L1a java.lang.Throwable -> L20
            r1 = r5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            return r0
        L1a:
            r6 = move-exception
            java.lang.String r0 = ""
            r1 = r5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            return r0
        L20:
            r7 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r7
            throw r0
    }

    public static java.io.Writer quote(java.lang.String r6, java.io.Writer r7) throws java.io.IOException {
            r0 = r6
            if (r0 == 0) goto Lb
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
        Lb:
            r0 = r7
            java.lang.String r1 = "\"\""
            r0.write(r1)
            r0 = r7
            return r0
        L13:
            r0 = 0
            r9 = r0
            r0 = r6
            int r0 = r0.length()
            r12 = r0
            r0 = r7
            r1 = 34
            r0.write(r1)
            r0 = 0
            r11 = r0
        L24:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L126
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = r11
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            switch(r0) {
                case 8: goto La2;
                case 9: goto Lac;
                case 10: goto Lb6;
                case 12: goto Lc0;
                case 13: goto Lca;
                case 34: goto L80;
                case 47: goto L8e;
                case 92: goto L80;
                default: goto Ld4;
            }
        L80:
            r0 = r7
            r1 = 92
            r0.write(r1)
            r0 = r7
            r1 = r9
            r0.write(r1)
            goto L120
        L8e:
            r0 = r8
            r1 = 60
            if (r0 != r1) goto L9a
            r0 = r7
            r1 = 92
            r0.write(r1)
        L9a:
            r0 = r7
            r1 = r9
            r0.write(r1)
            goto L120
        La2:
            r0 = r7
            java.lang.String r1 = "\\b"
            r0.write(r1)
            goto L120
        Lac:
            r0 = r7
            java.lang.String r1 = "\\t"
            r0.write(r1)
            goto L120
        Lb6:
            r0 = r7
            java.lang.String r1 = "\\n"
            r0.write(r1)
            goto L120
        Lc0:
            r0 = r7
            java.lang.String r1 = "\\f"
            r0.write(r1)
            goto L120
        Lca:
            r0 = r7
            java.lang.String r1 = "\\r"
            r0.write(r1)
            goto L120
        Ld4:
            r0 = r9
            r1 = 32
            if (r0 < r1) goto Lf6
            r0 = r9
            r1 = 128(0x80, float:1.8E-43)
            if (r0 < r1) goto Le8
            r0 = r9
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 < r1) goto Lf6
        Le8:
            r0 = r9
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 < r1) goto L11b
            r0 = r9
            r1 = 8448(0x2100, float:1.1838E-41)
            if (r0 >= r1) goto L11b
        Lf6:
            r0 = r7
            java.lang.String r1 = "\\u"
            r0.write(r1)
            r0 = r9
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r10 = r0
            r0 = r7
            java.lang.String r1 = "0000"
            r2 = 0
            r3 = 4
            r4 = r10
            int r4 = r4.length()
            int r3 = r3 - r4
            r0.write(r1, r2, r3)
            r0 = r7
            r1 = r10
            r0.write(r1)
            goto L120
        L11b:
            r0 = r7
            r1 = r9
            r0.write(r1)
        L120:
            int r11 = r11 + 1
            goto L24
        L126:
            r0 = r7
            r1 = 34
            r0.write(r1)
            r0 = r7
            return r0
    }

    public java.lang.Object remove(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.map
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }

    public boolean similar(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> Lf7
            r1 = r4
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Lf7
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> Lf7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            r0 = r3
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lf7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lf7
            r5 = r0
        L28:
            r0 = r5
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lf5
            r0 = r5
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lf7
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Lf7
            r6 = r0
            r0 = r6
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lf7
            r7 = r0
            r0 = r6
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lf7
            r8 = r0
            r0 = r4
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lf7
            r1 = r7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lf7
            r9 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L63
            goto L28
        L63:
            r0 = r8
            if (r0 != 0) goto L6a
            r0 = 0
            return r0
        L6a:
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto L81
            r0 = r8
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lf7
            r1 = r9
            boolean r0 = r0.similar(r1)     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto Lf2
            r0 = 0
            return r0
        L81:
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto L98
            r0 = r8
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch: java.lang.Throwable -> Lf7
            r1 = r9
            boolean r0 = r0.similar(r1)     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto Lf2
            r0 = 0
            return r0
        L98:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lba
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lba
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Lf7
            r1 = r9
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> Lf7
            boolean r0 = isNumberSimilar(r0, r1)     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto Lf2
            r0 = 0
            return r0
        Lba:
            r0 = r8
            boolean r0 = r0 instanceof org.json.JSONString     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Le6
            r0 = r9
            boolean r0 = r0 instanceof org.json.JSONString     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Le6
            r0 = r8
            org.json.JSONString r0 = (org.json.JSONString) r0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = r0.toJSONString()     // Catch: java.lang.Throwable -> Lf7
            r1 = r9
            org.json.JSONString r1 = (org.json.JSONString) r1     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = r1.toJSONString()     // Catch: java.lang.Throwable -> Lf7
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto Lf2
            r0 = 0
            return r0
        Le6:
            r0 = r8
            r1 = r9
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto Lf2
            r0 = 0
            return r0
        Lf2:
            goto L28
        Lf5:
            r0 = 1
            return r0
        Lf7:
            r5 = move-exception
            r0 = 0
            return r0
    }

    static boolean isNumberSimilar(java.lang.Number r4, java.lang.Number r5) {
            r0 = r4
            boolean r0 = numberIsFinite(r0)
            if (r0 == 0) goto Le
            r0 = r5
            boolean r0 = numberIsFinite(r0)
            if (r0 != 0) goto L10
        Le:
            r0 = 0
            return r0
        L10:
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r1 = r5
            java.lang.Class r1 = r1.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Comparable
            if (r0 == 0) goto L3a
            r0 = r4
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r1 = r5
            int r0 = r0.compareTo(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L38
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            return r0
        L3a:
            r0 = r4
            r1 = 0
            r2 = 0
            java.math.BigDecimal r0 = objectToBigDecimal(r0, r1, r2)
            r6 = r0
            r0 = r5
            r1 = 0
            r2 = 0
            java.math.BigDecimal r0 = objectToBigDecimal(r0, r1, r2)
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L50
            r0 = r7
            if (r0 != 0) goto L52
        L50:
            r0 = 0
            return r0
        L52:
            r0 = r6
            r1 = r7
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L5e
            r0 = 1
            goto L5f
        L5e:
            r0 = 0
        L5f:
            return r0
    }

    private static boolean numberIsFinite(java.lang.Number r2) {
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L1d
            r0 = r2
            java.lang.Double r0 = (java.lang.Double) r0
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L1b
            r0 = r2
            java.lang.Double r0 = (java.lang.Double) r0
            boolean r0 = r0.isNaN()
            if (r0 == 0) goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto L3a
            r0 = r2
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L38
            r0 = r2
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r0 = r0.isNaN()
            if (r0 == 0) goto L3a
        L38:
            r0 = 0
            return r0
        L3a:
            r0 = 1
            return r0
    }

    protected static boolean isDecimalNotation(java.lang.String r3) {
            r0 = r3
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 > r1) goto L28
            r0 = r3
            r1 = 101(0x65, float:1.42E-43)
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 > r1) goto L28
            r0 = r3
            r1 = 69
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 > r1) goto L28
            java.lang.String r0 = "-0"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
        L28:
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    protected static java.lang.Number stringToNumber(java.lang.String r5) throws java.lang.NumberFormatException {
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r6 = r0
            r0 = r6
            r1 = 48
            if (r0 < r1) goto L12
            r0 = r6
            r1 = 57
            if (r0 <= r1) goto L18
        L12:
            r0 = r6
            r1 = 45
            if (r0 != r1) goto L15c
        L18:
            r0 = r5
            boolean r0 = isDecimalNotation(r0)
            if (r0 == 0) goto L9c
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L41
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L41
            r7 = r0
            r0 = r6
            r1 = 45
            if (r0 != r1) goto L3f
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO     // Catch: java.lang.NumberFormatException -> L41
            r1 = r7
            int r0 = r0.compareTo(r1)     // Catch: java.lang.NumberFormatException -> L41
            if (r0 != 0) goto L3f
            r0 = -9223372036854775808
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L41
            return r0
        L3f:
            r0 = r7
            return r0
        L41:
            r7 = move-exception
            r0 = r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L79
            r8 = r0
            r0 = r8
            boolean r0 = r0.isNaN()     // Catch: java.lang.NumberFormatException -> L79
            if (r0 != 0) goto L55
            r0 = r8
            boolean r0 = r0.isInfinite()     // Catch: java.lang.NumberFormatException -> L79
            if (r0 == 0) goto L77
        L55:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L79
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L79
            r3 = r2
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L79
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L79
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L79
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.NumberFormatException -> L79
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L79
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L79
            throw r0     // Catch: java.lang.NumberFormatException -> L79
        L77:
            r0 = r8
            return r0
        L79:
            r8 = move-exception
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L9c:
            r0 = r6
            r1 = 48
            if (r0 != r1) goto Le1
            r0 = r5
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto Le1
            r0 = r5
            r1 = 1
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 48
            if (r0 < r1) goto Lde
            r0 = r7
            r1 = 57
            if (r0 > r1) goto Lde
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lde:
            goto L12f
        Le1:
            r0 = r6
            r1 = 45
            if (r0 != r1) goto L12f
            r0 = r5
            int r0 = r0.length()
            r1 = 2
            if (r0 <= r1) goto L12f
            r0 = r5
            r1 = 1
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r5
            r1 = 2
            char r0 = r0.charAt(r1)
            r8 = r0
            r0 = r7
            r1 = 48
            if (r0 != r1) goto L12f
            r0 = r8
            r1 = 48
            if (r0 < r1) goto L12f
            r0 = r8
            r1 = 57
            if (r0 > r1) goto L12f
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L12f:
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            int r0 = r0.bitLength()
            r1 = 31
            if (r0 > r1) goto L149
            r0 = r7
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L149:
            r0 = r7
            int r0 = r0.bitLength()
            r1 = 63
            if (r0 > r1) goto L15a
            r0 = r7
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L15a:
            r0 = r7
            return r0
        L15c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "val ["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "] is not a valid number."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static java.lang.Object stringToValue(java.lang.String r3) {
            java.lang.String r0 = ""
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            r0 = r3
            return r0
        Lb:
            java.lang.String r0 = "true"
            r1 = r3
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L18
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L18:
            java.lang.String r0 = "false"
            r1 = r3
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L25
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L25:
            java.lang.String r0 = "null"
            r1 = r3
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L32
            java.lang.Object r0 = org.json.JSONObject.NULL
            return r0
        L32:
            r0 = r3
            r1 = 0
            char r0 = r0.charAt(r1)
            r4 = r0
            r0 = r4
            r1 = 48
            if (r0 < r1) goto L44
            r0 = r4
            r1 = 57
            if (r0 <= r1) goto L4a
        L44:
            r0 = r4
            r1 = 45
            if (r0 != r1) goto L50
        L4a:
            r0 = r3
            java.lang.Number r0 = stringToNumber(r0)     // Catch: java.lang.Exception -> L4f
            return r0
        L4f:
            r5 = move-exception
        L50:
            r0 = r3
            return r0
    }

    public static void testValidity(java.lang.Object r4) throws org.json.JSONException {
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L1c
            r0 = r4
            java.lang.Number r0 = (java.lang.Number) r0
            boolean r0 = numberIsFinite(r0)
            if (r0 != 0) goto L1c
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "JSON does not allow non-finite numbers."
            r1.<init>(r2)
            throw r0
        L1c:
            return
    }

    public org.json.JSONArray toJSONArray(org.json.JSONArray r6) throws org.json.JSONException {
            r5 = this;
            r0 = r6
            if (r0 == 0) goto Lb
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 0
            r8 = r0
        L17:
            r0 = r8
            r1 = r6
            int r1 = r1.length()
            if (r0 >= r1) goto L33
            r0 = r7
            r1 = r5
            r2 = r6
            r3 = r8
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object r1 = r1.opt(r2)
            org.json.JSONArray r0 = r0.put(r1)
            int r8 = r8 + 1
            goto L17
        L33:
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

    public static java.lang.String valueToString(java.lang.Object r2) throws org.json.JSONException {
            r0 = r2
            java.lang.String r0 = org.json.JSONWriter.valueToString(r0)
            return r0
    }

    public static java.lang.Object wrap(java.lang.Object r3) {
            r0 = r3
            r1 = 0
            java.lang.Object r0 = wrap(r0, r1)
            return r0
    }

    private static java.lang.Object wrap(java.lang.Object r5, java.util.Set<java.lang.Object> r6) {
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r1 = r5
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 == 0) goto Le
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            return r0
        Le:
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONObject     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONArray     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r1 = r5
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONString     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Byte     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Character     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Short     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Integer     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Long     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Float     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Double     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.String     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.math.BigInteger     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.math.BigDecimal     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto L81
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Enum     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 == 0) goto L83
        L81:
            r0 = r5
            return r0
        L83:
            r0 = r5
            boolean r0 = r0 instanceof java.util.Collection     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 == 0) goto L98
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r7 = r0
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r1 = r0
            r2 = r7
            r1.<init>(r2)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            return r0
        L98:
            r0 = r5
            java.lang.Class r0 = r0.getClass()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            boolean r0 = r0.isArray()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 == 0) goto Lab
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            return r0
        Lab:
            r0 = r5
            boolean r0 = r0 instanceof java.util.Map     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 == 0) goto Lc0
            r0 = r5
            java.util.Map r0 = (java.util.Map) r0     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r7 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r1 = r0
            r2 = r7
            r1.<init>(r2)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            return r0
        Lc0:
            r0 = r5
            java.lang.Class r0 = r0.getClass()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            java.lang.Package r0 = r0.getPackage()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Ld3
            r0 = r7
            java.lang.String r0 = r0.getName()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            goto Ld5
        Ld3:
            java.lang.String r0 = ""
        Ld5:
            r8 = r0
            r0 = r8
            java.lang.String r1 = "java."
            boolean r0 = r0.startsWith(r1)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto Lf4
            r0 = r8
            java.lang.String r1 = "javax."
            boolean r0 = r0.startsWith(r1)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto Lf4
            r0 = r5
            java.lang.Class r0 = r0.getClass()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            if (r0 != 0) goto Lf9
        Lf4:
            r0 = r5
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            return r0
        Lf9:
            r0 = r6
            if (r0 == 0) goto L107
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            return r0
        L107:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: org.json.JSONException -> L110 java.lang.Exception -> L113
            return r0
        L110:
            r7 = move-exception
            r0 = r7
            throw r0
        L113:
            r7 = move-exception
            r0 = 0
            return r0
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

    static final java.io.Writer writeValue(java.io.Writer r5, java.lang.Object r6, int r7, int r8) throws org.json.JSONException, java.io.IOException {
            r0 = r6
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = 0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
        Lc:
            r0 = r5
            java.lang.String r1 = "null"
            r0.write(r1)
            goto L13b
        L15:
            r0 = r6
            boolean r0 = r0 instanceof org.json.JSONString
            if (r0 == 0) goto L51
            r0 = r6
            org.json.JSONString r0 = (org.json.JSONString) r0     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = r0.toJSONString()     // Catch: java.lang.Exception -> L2a
            r9 = r0
            goto L36
        L2a:
            r10 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L36:
            r0 = r5
            r1 = r9
            if (r1 == 0) goto L44
            r1 = r9
            java.lang.String r1 = r1.toString()
            goto L4b
        L44:
            r1 = r6
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = quote(r1)
        L4b:
            r0.write(r1)
            goto L13b
        L51:
            r0 = r6
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L82
            r0 = r6
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.String r0 = numberToString(r0)
            r9 = r0
            java.util.regex.Pattern r0 = org.json.JSONObject.NUMBER_PATTERN
            r1 = r9
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L78
            r0 = r5
            r1 = r9
            r0.write(r1)
            goto L7f
        L78:
            r0 = r9
            r1 = r5
            java.io.Writer r0 = quote(r0, r1)
        L7f:
            goto L13b
        L82:
            r0 = r6
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L94
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            goto L13b
        L94:
            r0 = r6
            boolean r0 = r0 instanceof java.lang.Enum
            if (r0 == 0) goto Lac
            r0 = r5
            r1 = r6
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.String r1 = r1.name()
            java.lang.String r1 = quote(r1)
            r0.write(r1)
            goto L13b
        Lac:
            r0 = r6
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto Lc1
            r0 = r6
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r1 = r5
            r2 = r7
            r3 = r8
            java.io.Writer r0 = r0.write(r1, r2, r3)
            goto L13b
        Lc1:
            r0 = r6
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto Ld6
            r0 = r6
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r1 = r5
            r2 = r7
            r3 = r8
            java.io.Writer r0 = r0.write(r1, r2, r3)
            goto L13b
        Ld6:
            r0 = r6
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto Lf6
            r0 = r6
            java.util.Map r0 = (java.util.Map) r0
            r9 = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r1 = r5
            r2 = r7
            r3 = r8
            java.io.Writer r0 = r0.write(r1, r2, r3)
            goto L13b
        Lf6:
            r0 = r6
            boolean r0 = r0 instanceof java.util.Collection
            if (r0 == 0) goto L116
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            r9 = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r1 = r5
            r2 = r7
            r3 = r8
            java.io.Writer r0 = r0.write(r1, r2, r3)
            goto L13b
        L116:
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L132
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r1 = r5
            r2 = r7
            r3 = r8
            java.io.Writer r0 = r0.write(r1, r2, r3)
            goto L13b
        L132:
            r0 = r6
            java.lang.String r0 = r0.toString()
            r1 = r5
            java.io.Writer r0 = quote(r0, r1)
        L13b:
            r0 = r5
            return r0
    }

    static final void indent(java.io.Writer r3, int r4) throws java.io.IOException {
            r0 = 0
            r5 = r0
        L2:
            r0 = r5
            r1 = r4
            if (r0 >= r1) goto L13
            r0 = r3
            r1 = 32
            r0.write(r1)
            int r5 = r5 + 1
            goto L2
        L13:
            return
    }

    public java.io.Writer write(java.io.Writer r6, int r7, int r8) throws org.json.JSONException {
            r5 = this;
            r0 = 0
            r9 = r0
            r0 = r5
            int r0 = r0.length()     // Catch: java.io.IOException -> L13d
            r10 = r0
            r0 = r6
            r1 = 123(0x7b, float:1.72E-43)
            r0.write(r1)     // Catch: java.io.IOException -> L13d
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L82
            r0 = r5
            java.util.Set r0 = r0.entrySet()     // Catch: java.io.IOException -> L13d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L13d
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L13d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.io.IOException -> L13d
            r11 = r0
            r0 = r11
            java.lang.Object r0 = r0.getKey()     // Catch: java.io.IOException -> L13d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L13d
            r12 = r0
            r0 = r6
            r1 = r12
            java.lang.String r1 = quote(r1)     // Catch: java.io.IOException -> L13d
            r0.write(r1)     // Catch: java.io.IOException -> L13d
            r0 = r6
            r1 = 58
            r0.write(r1)     // Catch: java.io.IOException -> L13d
            r0 = r7
            if (r0 <= 0) goto L4d
            r0 = r6
            r1 = 32
            r0.write(r1)     // Catch: java.io.IOException -> L13d
        L4d:
            r0 = r6
            r1 = r11
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L5e java.io.IOException -> L13d
            r2 = r7
            r3 = r8
            java.io.Writer r0 = writeValue(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L5e java.io.IOException -> L13d
            goto L7f
        L5e:
            r13 = move-exception
            org.json.JSONException r0 = new org.json.JSONException     // Catch: java.io.IOException -> L13d
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L13d
            r3 = r2
            r3.<init>()     // Catch: java.io.IOException -> L13d
            java.lang.String r3 = "Unable to write JSONObject value for key: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L13d
            r3 = r12
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L13d
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L13d
            r3 = r13
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L13d
            throw r0     // Catch: java.io.IOException -> L13d
        L7f:
            goto L135
        L82:
            r0 = r10
            if (r0 == 0) goto L135
            r0 = r8
            r1 = r7
            int r0 = r0 + r1
            r11 = r0
            r0 = r5
            java.util.Set r0 = r0.entrySet()     // Catch: java.io.IOException -> L13d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L13d
            r12 = r0
        L97:
            r0 = r12
            boolean r0 = r0.hasNext()     // Catch: java.io.IOException -> L13d
            if (r0 == 0) goto L126
            r0 = r12
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L13d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.io.IOException -> L13d
            r13 = r0
            r0 = r9
            if (r0 == 0) goto Lb8
            r0 = r6
            r1 = 44
            r0.write(r1)     // Catch: java.io.IOException -> L13d
        Lb8:
            r0 = r7
            if (r0 <= 0) goto Lc2
            r0 = r6
            r1 = 10
            r0.write(r1)     // Catch: java.io.IOException -> L13d
        Lc2:
            r0 = r6
            r1 = r11
            indent(r0, r1)     // Catch: java.io.IOException -> L13d
            r0 = r13
            java.lang.Object r0 = r0.getKey()     // Catch: java.io.IOException -> L13d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L13d
            r14 = r0
            r0 = r6
            r1 = r14
            java.lang.String r1 = quote(r1)     // Catch: java.io.IOException -> L13d
            r0.write(r1)     // Catch: java.io.IOException -> L13d
            r0 = r6
            r1 = 58
            r0.write(r1)     // Catch: java.io.IOException -> L13d
            r0 = r7
            if (r0 <= 0) goto Led
            r0 = r6
            r1 = 32
            r0.write(r1)     // Catch: java.io.IOException -> L13d
        Led:
            r0 = r6
            r1 = r13
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> Lff java.io.IOException -> L13d
            r2 = r7
            r3 = r11
            java.io.Writer r0 = writeValue(r0, r1, r2, r3)     // Catch: java.lang.Exception -> Lff java.io.IOException -> L13d
            goto L120
        Lff:
            r15 = move-exception
            org.json.JSONException r0 = new org.json.JSONException     // Catch: java.io.IOException -> L13d
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L13d
            r3 = r2
            r3.<init>()     // Catch: java.io.IOException -> L13d
            java.lang.String r3 = "Unable to write JSONObject value for key: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L13d
            r3 = r14
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L13d
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L13d
            r3 = r15
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L13d
            throw r0     // Catch: java.io.IOException -> L13d
        L120:
            r0 = 1
            r9 = r0
            goto L97
        L126:
            r0 = r7
            if (r0 <= 0) goto L130
            r0 = r6
            r1 = 10
            r0.write(r1)     // Catch: java.io.IOException -> L13d
        L130:
            r0 = r6
            r1 = r8
            indent(r0, r1)     // Catch: java.io.IOException -> L13d
        L135:
            r0 = r6
            r1 = 125(0x7d, float:1.75E-43)
            r0.write(r1)     // Catch: java.io.IOException -> L13d
            r0 = r6
            return r0
        L13d:
            r9 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> toMap() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L12:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L97
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r7 = r0
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = org.json.JSONObject.NULL
            r1 = r7
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
        L3d:
            r0 = 0
            r8 = r0
            goto L85
        L43:
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L60
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.util.Map r0 = r0.toMap()
            r8 = r0
            goto L85
        L60:
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L7d
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            java.util.List r0 = r0.toList()
            r8 = r0
            goto L85
        L7d:
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            r8 = r0
        L85:
            r0 = r5
            r1 = r7
            java.lang.Object r1 = r1.getKey()
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            goto L12
        L97:
            r0 = r5
            return r0
    }

    private static org.json.JSONException wrongValueFormatException(java.lang.String r5, java.lang.String r6, java.lang.Object r7, java.lang.Throwable r8) {
            r0 = r7
            if (r0 != 0) goto L33
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONObject["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = quote(r3)
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
        L33:
            r0 = r7
            boolean r0 = r0 instanceof java.util.Map
            if (r0 != 0) goto L48
            r0 = r7
            boolean r0 = r0 instanceof java.lang.Iterable
            if (r0 != 0) goto L48
            r0 = r7
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 == 0) goto L84
        L48:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONObject["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = quote(r3)
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
        L84:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JSONObject["
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = quote(r3)
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

    private static org.json.JSONException recursivelyDefinedObjectException(java.lang.String r5) {
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "JavaBean object contains recursively defined member variable of key "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = quote(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return r0
    }

    static {
            java.lang.String r0 = "-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.json.JSONObject.NUMBER_PATTERN = r0
            org.json.JSONObject$Null r0 = new org.json.JSONObject$Null
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.json.JSONObject.NULL = r0
            return
    }
}
