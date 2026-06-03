package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONWriter.class */
public class JSONWriter {
    private static final int maxdepth = 200;
    private boolean comma;
    protected char mode;
    private final org.json.JSONObject[] stack;
    private int top;
    protected java.lang.Appendable writer;

    public JSONWriter(java.lang.Appendable r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.comma = r1
            r0 = r3
            r1 = 105(0x69, float:1.47E-43)
            r0.mode = r1
            r0 = r3
            r1 = 200(0xc8, float:2.8E-43)
            org.json.JSONObject[] r1 = new org.json.JSONObject[r1]
            r0.stack = r1
            r0 = r3
            r1 = 0
            r0.top = r1
            r0 = r3
            r1 = r4
            r0.writer = r1
            return
    }

    private org.json.JSONWriter append(java.lang.String r5) throws org.json.JSONException {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto Le
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Null pointer"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            char r0 = r0.mode
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 == r1) goto L20
            r0 = r4
            char r0 = r0.mode
            r1 = 97
            if (r0 != r1) goto L6a
        L20:
            r0 = r4
            boolean r0 = r0.comma     // Catch: java.io.IOException -> L4a
            if (r0 == 0) goto L3c
            r0 = r4
            char r0 = r0.mode     // Catch: java.io.IOException -> L4a
            r1 = 97
            if (r0 != r1) goto L3c
            r0 = r4
            java.lang.Appendable r0 = r0.writer     // Catch: java.io.IOException -> L4a
            r1 = 44
            java.lang.Appendable r0 = r0.append(r1)     // Catch: java.io.IOException -> L4a
        L3c:
            r0 = r4
            java.lang.Appendable r0 = r0.writer     // Catch: java.io.IOException -> L4a
            r1 = r5
            java.lang.Appendable r0 = r0.append(r1)     // Catch: java.io.IOException -> L4a
            goto L54
        L4a:
            r6 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L54:
            r0 = r4
            char r0 = r0.mode
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 != r1) goto L63
            r0 = r4
            r1 = 107(0x6b, float:1.5E-43)
            r0.mode = r1
        L63:
            r0 = r4
            r1 = 1
            r0.comma = r1
            r0 = r4
            return r0
        L6a:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Value out of sequence."
            r1.<init>(r2)
            throw r0
    }

    public org.json.JSONWriter array() throws org.json.JSONException {
            r4 = this;
            r0 = r4
            char r0 = r0.mode
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L1b
            r0 = r4
            char r0 = r0.mode
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 == r1) goto L1b
            r0 = r4
            char r0 = r0.mode
            r1 = 97
            if (r0 != r1) goto L2e
        L1b:
            r0 = r4
            r1 = 0
            r0.push(r1)
            r0 = r4
            java.lang.String r1 = "["
            org.json.JSONWriter r0 = r0.append(r1)
            r0 = r4
            r1 = 0
            r0.comma = r1
            r0 = r4
            return r0
        L2e:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Misplaced array."
            r1.<init>(r2)
            throw r0
    }

    private org.json.JSONWriter end(char r6, char r7) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            char r0 = r0.mode
            r1 = r6
            if (r0 == r1) goto L1d
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r6
            r3 = 97
            if (r2 != r3) goto L17
            java.lang.String r2 = "Misplaced endArray."
            goto L19
        L17:
            java.lang.String r2 = "Misplaced endObject."
        L19:
            r1.<init>(r2)
            throw r0
        L1d:
            r0 = r5
            r1 = r6
            r0.pop(r1)
            r0 = r5
            java.lang.Appendable r0 = r0.writer     // Catch: java.io.IOException -> L30
            r1 = r7
            java.lang.Appendable r0 = r0.append(r1)     // Catch: java.io.IOException -> L30
            goto L3a
        L30:
            r8 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        L3a:
            r0 = r5
            r1 = 1
            r0.comma = r1
            r0 = r5
            return r0
    }

    public org.json.JSONWriter endArray() throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = 97
            r2 = 93
            org.json.JSONWriter r0 = r0.end(r1, r2)
            return r0
    }

    public org.json.JSONWriter endObject() throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = 107(0x6b, float:1.5E-43)
            r2 = 125(0x7d, float:1.75E-43)
            org.json.JSONWriter r0 = r0.end(r1, r2)
            return r0
    }

    public org.json.JSONWriter key(java.lang.String r6) throws org.json.JSONException {
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
            char r0 = r0.mode
            r1 = 107(0x6b, float:1.5E-43)
            if (r0 != r1) goto L96
            r0 = r5
            org.json.JSONObject[] r0 = r0.stack     // Catch: java.io.IOException -> L8c
            r1 = r5
            int r1 = r1.top     // Catch: java.io.IOException -> L8c
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]     // Catch: java.io.IOException -> L8c
            r7 = r0
            r0 = r7
            r1 = r6
            boolean r0 = r0.has(r1)     // Catch: java.io.IOException -> L8c
            if (r0 == 0) goto L4b
            org.json.JSONException r0 = new org.json.JSONException     // Catch: java.io.IOException -> L8c
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8c
            r3 = r2
            r3.<init>()     // Catch: java.io.IOException -> L8c
            java.lang.String r3 = "Duplicate key \""
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L8c
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L8c
            java.lang.String r3 = "\""
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L8c
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L8c
            r1.<init>(r2)     // Catch: java.io.IOException -> L8c
            throw r0     // Catch: java.io.IOException -> L8c
        L4b:
            r0 = r7
            r1 = r6
            r2 = 1
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L8c
            r0 = r5
            boolean r0 = r0.comma     // Catch: java.io.IOException -> L8c
            if (r0 == 0) goto L65
            r0 = r5
            java.lang.Appendable r0 = r0.writer     // Catch: java.io.IOException -> L8c
            r1 = 44
            java.lang.Appendable r0 = r0.append(r1)     // Catch: java.io.IOException -> L8c
        L65:
            r0 = r5
            java.lang.Appendable r0 = r0.writer     // Catch: java.io.IOException -> L8c
            r1 = r6
            java.lang.String r1 = org.json.JSONObject.quote(r1)     // Catch: java.io.IOException -> L8c
            java.lang.Appendable r0 = r0.append(r1)     // Catch: java.io.IOException -> L8c
            r0 = r5
            java.lang.Appendable r0 = r0.writer     // Catch: java.io.IOException -> L8c
            r1 = 58
            java.lang.Appendable r0 = r0.append(r1)     // Catch: java.io.IOException -> L8c
            r0 = r5
            r1 = 0
            r0.comma = r1     // Catch: java.io.IOException -> L8c
            r0 = r5
            r1 = 111(0x6f, float:1.56E-43)
            r0.mode = r1     // Catch: java.io.IOException -> L8c
            r0 = r5
            return r0
        L8c:
            r7 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L96:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Misplaced key."
            r1.<init>(r2)
            throw r0
    }

    public org.json.JSONWriter object() throws org.json.JSONException {
            r4 = this;
            r0 = r4
            char r0 = r0.mode
            r1 = 105(0x69, float:1.47E-43)
            if (r0 != r1) goto Lf
            r0 = r4
            r1 = 111(0x6f, float:1.56E-43)
            r0.mode = r1
        Lf:
            r0 = r4
            char r0 = r0.mode
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 == r1) goto L21
            r0 = r4
            char r0 = r0.mode
            r1 = 97
            if (r0 != r1) goto L3a
        L21:
            r0 = r4
            java.lang.String r1 = "{"
            org.json.JSONWriter r0 = r0.append(r1)
            r0 = r4
            org.json.JSONObject r1 = new org.json.JSONObject
            r2 = r1
            r2.<init>()
            r0.push(r1)
            r0 = r4
            r1 = 0
            r0.comma = r1
            r0 = r4
            return r0
        L3a:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Misplaced object."
            r1.<init>(r2)
            throw r0
    }

    private void pop(char r6) throws org.json.JSONException {
            r5 = this;
            r0 = r5
            int r0 = r0.top
            if (r0 > 0) goto L11
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Nesting error."
            r1.<init>(r2)
            throw r0
        L11:
            r0 = r5
            org.json.JSONObject[] r0 = r0.stack
            r1 = r5
            int r1 = r1.top
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            if (r0 != 0) goto L24
            r0 = 97
            goto L26
        L24:
            r0 = 107(0x6b, float:1.5E-43)
        L26:
            r7 = r0
            r0 = r7
            r1 = r6
            if (r0 == r1) goto L36
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Nesting error."
            r1.<init>(r2)
            throw r0
        L36:
            r0 = r5
            r1 = r0
            int r1 = r1.top
            r2 = 1
            int r1 = r1 - r2
            r0.top = r1
            r0 = r5
            r1 = r5
            int r1 = r1.top
            if (r1 != 0) goto L4d
            r1 = 100
            goto L62
        L4d:
            r1 = r5
            org.json.JSONObject[] r1 = r1.stack
            r2 = r5
            int r2 = r2.top
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            if (r1 != 0) goto L60
            r1 = 97
            goto L62
        L60:
            r1 = 107(0x6b, float:1.5E-43)
        L62:
            r0.mode = r1
            return
    }

    private void push(org.json.JSONObject r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            int r0 = r0.top
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L14
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.String r2 = "Nesting too deep."
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r4
            org.json.JSONObject[] r0 = r0.stack
            r1 = r4
            int r1 = r1.top
            r2 = r5
            r0[r1] = r2
            r0 = r4
            r1 = r5
            if (r1 != 0) goto L28
            r1 = 97
            goto L2a
        L28:
            r1 = 107(0x6b, float:1.5E-43)
        L2a:
            r0.mode = r1
            r0 = r4
            r1 = r0
            int r1 = r1.top
            r2 = 1
            int r1 = r1 + r2
            r0.top = r1
            return
    }

    public static java.lang.String valueToString(java.lang.Object r5) throws org.json.JSONException {
            r0 = r5
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
        Lc:
            java.lang.String r0 = "null"
            return r0
        Lf:
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONString
            if (r0 == 0) goto L4e
            r0 = r5
            org.json.JSONString r0 = (org.json.JSONString) r0     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = r0.toJSONString()     // Catch: java.lang.Exception -> L23
            r6 = r0
            goto L2d
        L23:
            r7 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r6
            if (r0 == 0) goto L33
            r0 = r6
            return r0
        L33:
            org.json.JSONException r0 = new org.json.JSONException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Bad value from toJSONString: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L4e:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L71
            r0 = r5
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.String r0 = org.json.JSONObject.numberToString(r0)
            r6 = r0
            java.util.regex.Pattern r0 = org.json.JSONObject.NUMBER_PATTERN
            r1 = r6
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L6c
            r0 = r6
            return r0
        L6c:
            r0 = r6
            java.lang.String r0 = org.json.JSONObject.quote(r0)
            return r0
        L71:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 != 0) goto L86
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONObject
            if (r0 != 0) goto L86
            r0 = r5
            boolean r0 = r0 instanceof org.json.JSONArray
            if (r0 == 0) goto L8b
        L86:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
        L8b:
            r0 = r5
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto La3
            r0 = r5
            java.util.Map r0 = (java.util.Map) r0
            r6 = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            return r0
        La3:
            r0 = r5
            boolean r0 = r0 instanceof java.util.Collection
            if (r0 == 0) goto Lbb
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            r6 = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            return r0
        Lbb:
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Ld1
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            return r0
        Ld1:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Enum
            if (r0 == 0) goto Le3
            r0 = r5
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.String r0 = r0.name()
            java.lang.String r0 = org.json.JSONObject.quote(r0)
            return r0
        Le3:
            r0 = r5
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = org.json.JSONObject.quote(r0)
            return r0
    }

    public org.json.JSONWriter value(boolean r4) throws org.json.JSONException {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r1 == 0) goto La
            java.lang.String r1 = "true"
            goto Lc
        La:
            java.lang.String r1 = "false"
        Lc:
            org.json.JSONWriter r0 = r0.append(r1)
            return r0
    }

    public org.json.JSONWriter value(double r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            org.json.JSONWriter r0 = r0.value(r1)
            return r0
    }

    public org.json.JSONWriter value(long r5) throws org.json.JSONException {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = java.lang.Long.toString(r1)
            org.json.JSONWriter r0 = r0.append(r1)
            return r0
    }

    public org.json.JSONWriter value(java.lang.Object r4) throws org.json.JSONException {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = valueToString(r1)
            org.json.JSONWriter r0 = r0.append(r1)
            return r0
    }
}
